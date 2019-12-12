package meeting.meetingv1;

import meeting.meetingv1.exception.ParameterException;
import meeting.meetingv1.pojo.*;
import meeting.meetingv1.service.UserMeetingService;
import meeting.meetingv1.MQ.KafkaSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
//    @Autowired
//    GuestMapper guestMapper;
//    @Autowired
//    GuestService guestService;
//    @Autowired
//    MeetingService meetingService;
//    @Autowired
//    MeetingMapper meetingMapper;
//    @Autowired
//    VoluntService voluntService;
//
//    @Test
//    public void guesttest() {
//        Guest guest = new Guest();
//        guest.setAvatarUrl("/jd.com");
//        guest.setIntroduction("介绍");
//        guest.setGuestid(5);
//        guest.setMeetingid(5);
////        guestMapper.insert(guest);
//        guestService.addguest(guest);
//        List<Guest> byMeetingId = guestService.findByMeetingId(1);
//        System.out.println(byMeetingId.get(0));
//
//    }
//
//    @Test
//    public  void meeetingtest() {
//        Meeting meeting = new Meeting();
//        meeting.setMeetingid(12);
//        meeting.setCloseTime(new Date());
//        meeting.setStartTime(new Date());
//        meeting.setIntroduction("meeting 介绍");
//        meeting.setmName("会议1");
//        meeting.setLocation("地点");
//        meeting.setNeedvolunteer(1);
//        meetingService.addMeeting(meeting);
//        Meeting byId = meetingService.findById(12);
//        System.out.println(byId);
//        List<Meeting> meetings = meetingService.findMeetings(3, 2);
//        int i = meetingMapper.selectMeetingRows();
//        System.out.println(i);
//        System.out.println(meetings);
//    }
//    @Test
//    public  void  volunt(){
//        Volunt volunt = new Volunt();
//        volunt.setNumber(2);
//        volunt.setIntroduction("介绍");
//        volunt.setIsproof(1);
//        volunt.setMeetid(2);
//        volunt.setVolunt(3);
//        voluntService.addVolunt(volunt);
//        Volunt volunt1 = voluntService.selectByMeetingId(1);
//        System.out.println(volunt1);
//    }
    @Autowired
    UserMeetingService userMeetingService;
    @Test
    void name() throws ParameterException {
        UserMeeting userMeeting = new UserMeeting();
        userMeeting.setUserid(1);
        userMeeting.setMeetingid(1);
        Byte b = 2;
        userMeeting.setType(b);
        userMeetingService.addRelation(userMeeting);

        System.out.println(userMeeting.getId());
    }

    @Autowired
    KafkaSender kafkaSender;
    @Test
    void kafkaSender() {
        //kafkaSender.sendMsg("test2 ","测试消息1111111");
        System.out.println("发送完成");
    }

}


