package X;

/* loaded from: classes14.dex */
public enum U44 {
    LAYOUT("Layout"),
    LINKER("Linker"),
    AVMANAGEMENT("AVManagement"),
    PERMISSION("Permission"),
    PERFORMANCE("Performance"),
    BIZ("Biz"),
    RTC("Rtc"),
    COMMON("Common");

    public final String LJLIL;

    public static U44 valueOf(String str) {
        return (U44) V0N.LJJJ(U44.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    U44(String str) {
        this.LJLIL = str;
    }
}
