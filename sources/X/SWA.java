package X;

/* loaded from: classes13.dex */
public enum SWA {
    SHOW,
    CLICK,
    AUTH,
    SAVE;

    public static SWA valueOf(String str) {
        return (SWA) V0N.LJJJ(SWA.class, str);
    }

    public final int getValue() {
        return ordinal() + 1;
    }
}
