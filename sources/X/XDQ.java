package X;

/* loaded from: classes16.dex */
public enum XDQ {
    GIPHY_STICKERS(-1),
    GIPHY_GIFS(0),
    VIDEO_CLIP(1),
    GIF(2);

    public final int LJLIL;

    public static XDQ valueOf(String str) {
        return (XDQ) V0N.LJJJ(XDQ.class, str);
    }

    public final int getTypeOrdinal() {
        return this.LJLIL;
    }

    XDQ(int i) {
        this.LJLIL = i;
    }
}
