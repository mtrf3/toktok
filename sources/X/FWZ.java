package X;

/* loaded from: classes7.dex */
public enum FWZ {
    LOGGED("logged"),
    MUSIC_SHARE("share"),
    STICKER_SHARE("share"),
    VIDEO_SHARE("share"),
    COMMENT("comment"),
    COLD_START("cold_start"),
    INSTALL("install");

    public final String LJLIL;

    public static FWZ valueOf(String str) {
        return (FWZ) V0N.LJJJ(FWZ.class, str);
    }

    public final String getReportName() {
        return this.LJLIL;
    }

    FWZ(String str) {
        this.LJLIL = str;
    }
}
