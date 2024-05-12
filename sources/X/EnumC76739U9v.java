package X;

/* renamed from: X.U9v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76739U9v {
    KICKOUT_NONE(0),
    KICKOUT_RTC_STREAM_TIMEOUT(1),
    KICKOUT_RTC_STREAM_CLOSE(2);

    public int val;

    public static EnumC76739U9v valueOf(String str) {
        return (EnumC76739U9v) V0N.LJJJ(EnumC76739U9v.class, str);
    }

    EnumC76739U9v(int i) {
        this.val = i;
    }
}
