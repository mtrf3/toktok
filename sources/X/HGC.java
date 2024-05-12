package X;

/* loaded from: classes8.dex */
public enum HGC {
    WATERMARK_MODERATION("watermark"),
    POST("post");

    public final String LJLIL;

    public static HGC valueOf(String str) {
        return (HGC) V0N.LJJJ(HGC.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    HGC(String str) {
        this.LJLIL = str;
    }
}
