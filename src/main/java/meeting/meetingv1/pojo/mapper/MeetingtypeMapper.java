package meeting.meetingv1.pojo.mapper;

import meeting.meetingv1.pojo.Meetingtype;
import meeting.meetingv1.pojo.MeetingtypeExample;

import java.util.List;

public interface MeetingtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    int insert(Meetingtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    int insertSelective(Meetingtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    List<Meetingtype> selectByExample(MeetingtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    Meetingtype selectByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Meetingtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetingtype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Meetingtype record);
}