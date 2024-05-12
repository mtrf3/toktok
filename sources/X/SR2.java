package X;

/* loaded from: classes13.dex */
public enum SR2 {
    DOWNLOAD_ALL_SELECTED(true),
    DOWNLOAD_NOT_ALL_SELECTED(true),
    AVATAR_CHANGE(false);

    public final boolean LJLIL;

    public static SR2 valueOf(String str) {
        return (SR2) V0N.LJJJ(SR2.class, str);
    }

    public final boolean isDownload() {
        return this.LJLIL;
    }

    SR2(boolean z) {
        this.LJLIL = z;
    }
}
