package X;

/* loaded from: classes8.dex */
public enum GPI {
    DEFAULT(1),
    STORY_LIGHTENING(2),
    PHOTO_MODE(4),
    TTN(8);

    public final int LJLIL;

    public static GPI valueOf(String str) {
        return (GPI) V0N.LJJJ(GPI.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    GPI(int i) {
        this.LJLIL = i;
    }
}
