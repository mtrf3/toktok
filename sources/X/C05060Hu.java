package X;

/* renamed from: X.0Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05060Hu {
    public static final C05060Hu LIZJ;
    public static final C05060Hu LIZLLL;
    public static final C05060Hu LJ;
    public static final C05060Hu LJFF;
    public static final C05060Hu LJI;
    public static final C05060Hu LJII;
    public static final C05060Hu LJIIIIZZ;
    public static final C05060Hu LJIIIZ;
    public static final C05060Hu LJIIJ;
    public static final C05060Hu LJIIJJI;
    public static final C05060Hu LJIIL;
    public static final C05060Hu LJIILIIL;
    public final String LIZ;
    public final EnumC05050Ht LIZIZ;

    static {
        EnumC05050Ht enumC05050Ht = EnumC05050Ht.FLOAT;
        LIZJ = new C05060Hu("overall_score", enumC05050Ht);
        LIZLLL = new C05060Hu("cpu_score", enumC05050Ht);
        LJ = new C05060Hu("gpu_score", enumC05050Ht);
        LJFF = new C05060Hu("memory_score", enumC05050Ht);
        LJI = new C05060Hu("video_score", enumC05050Ht);
        LJII = new C05060Hu("io_score", enumC05050Ht);
        LJIIIIZZ = new C05060Hu("video_play_scene", enumC05050Ht);
        LJIIIZ = new C05060Hu("app_launch_scene", enumC05050Ht);
        LJIIJ = new C05060Hu("video_record_scene", enumC05050Ht);
        LJIIJJI = new C05060Hu("temp", enumC05050Ht);
        LJIIL = new C05060Hu("battery", enumC05050Ht);
        LJIILIIL = new C05060Hu("remain_memory", enumC05050Ht);
    }

    public C05060Hu(String str, EnumC05050Ht enumC05050Ht) {
        this.LIZ = str;
        this.LIZIZ = enumC05050Ht;
    }
}
