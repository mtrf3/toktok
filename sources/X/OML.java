package X;

/* loaded from: classes11.dex */
public enum OML {
    FEED_TYPE(1),
    SOCIAL_TYPE(2),
    LIVE_TYPE(3),
    PHOTO_TYPE(4);

    public final int LJLIL;

    public static OML valueOf(String str) {
        return (OML) V0N.LJJJ(OML.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    OML(int i) {
        this.LJLIL = i;
    }
}
