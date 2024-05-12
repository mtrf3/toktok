package X;

/* loaded from: classes11.dex */
public enum OBQ {
    ONLINE(0),
    DEFAULT(1),
    GREY_CARD(2),
    FLOATING(3),
    FORCE_VIDEO(4),
    FORCE_VIDEO_NO_COVER(5),
    BACKGROUND(6),
    BOTTOM(7);

    public final int LJLIL;

    public static OBQ valueOf(String str) {
        return (OBQ) V0N.LJJJ(OBQ.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    OBQ(int i) {
        this.LJLIL = i;
    }
}
