package X;

/* loaded from: classes14.dex */
public enum TZJ {
    USER_CLICK("finish_with_user_click", 10001),
    ILLEGAL_LIVE("finish_with_illegal_live", 10010),
    INTERRUPT_BY_CO_HOST("finish_with_interrupt_by_co_host", 10003),
    RTC_ERROR("finish_with_rtc_error", 10011),
    MIC_ROOM("finish_with_mic_room", 10002);

    public long finishReason;
    public String value;

    public static TZJ valueOf(String str) {
        return (TZJ) V0N.LJJJ(TZJ.class, str);
    }

    TZJ(String str, long j) {
        this.value = str;
        this.finishReason = j;
    }
}
