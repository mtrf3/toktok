package X;

/* renamed from: X.99h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC2321799h {
    INVITE_CANCEL("initiative_cancel"),
    COUNTDOWN_CANCEL("countdown_cancel"),
    RTC_ERROR_CANCEL("rtc_error_cancel"),
    INTERRUPT_BY_MULTI_GUEST("interrupt_by_multi_guest");

    public String value;

    public static EnumC2321799h valueOf(String str) {
        return (EnumC2321799h) V0N.LJJJ(EnumC2321799h.class, str);
    }

    EnumC2321799h(String str) {
        this.value = str;
    }
}
