package X;

/* loaded from: classes13.dex */
public enum SWO {
    UNKNOWN,
    BIG,
    SMALL;

    public static final SWN Companion = new SWN();

    public static SWO valueOf(String str) {
        return (SWO) V0N.LJJJ(SWO.class, str);
    }
}
