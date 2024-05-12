package X;

/* renamed from: X.Ihd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC47317Ihd {
    VideoCache("com.ss.android.ugc.aweme.video.preload.VideoCachePreloader", "cache"),
    MediaLoader("com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader", "cachev2");

    public final String LJLIL;
    public final String LJLILLLLZI;

    public String getCacheDirName() {
        return this.LJLILLLLZI;
    }

    public String getType() {
        return this.LJLIL;
    }

    public static EnumC47317Ihd valueOf(String str) {
        return (EnumC47317Ihd) V0N.LJJJ(EnumC47317Ihd.class, str);
    }

    EnumC47317Ihd(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
