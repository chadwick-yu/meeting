package meeting.meetingv1.pojo;

public class Meetinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meetinfo.meetid
     *
     * @mbg.generated
     */
    private Integer meetid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meetinfo.organizer
     *
     * @mbg.generated
     */
    private String organizer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meetinfo.hostedby
     *
     * @mbg.generated
     */
    private String hostedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetinfo
     *
     * @mbg.generated
     */
    public Meetinfo(Integer meetid, String organizer, String hostedby) {
        this.meetid = meetid;
        this.organizer = organizer;
        this.hostedby = hostedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meetinfo
     *
     * @mbg.generated
     */
    public Meetinfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meetinfo.meetid
     *
     * @return the value of meetinfo.meetid
     *
     * @mbg.generated
     */
    public Integer getMeetid() {
        return meetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meetinfo.meetid
     *
     * @param meetid the value for meetinfo.meetid
     *
     * @mbg.generated
     */
    public void setMeetid(Integer meetid) {
        this.meetid = meetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meetinfo.organizer
     *
     * @return the value of meetinfo.organizer
     *
     * @mbg.generated
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meetinfo.organizer
     *
     * @param organizer the value for meetinfo.organizer
     *
     * @mbg.generated
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer == null ? null : organizer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meetinfo.hostedby
     *
     * @return the value of meetinfo.hostedby
     *
     * @mbg.generated
     */
    public String getHostedby() {
        return hostedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meetinfo.hostedby
     *
     * @param hostedby the value for meetinfo.hostedby
     *
     * @mbg.generated
     */
    public void setHostedby(String hostedby) {
        this.hostedby = hostedby == null ? null : hostedby.trim();
    }
}