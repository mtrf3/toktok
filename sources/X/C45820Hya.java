package X;

/* renamed from: X.Hya, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45820Hya {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        C78963Uyt.LIZJ(c188727au);
        c188727au.LJI("action_type", str2);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        C78963Uyt.LIZJ(c188727au);
        c188727au.LJIIIZ("action_type", str2);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LIZJ(long j, long j2, boolean z, int i, long j3) {
        int i2;
        C188727au c188727au = new C188727au();
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c188727au.LIZLLL(i2, "status");
        c188727au.LIZLLL(i, "error_code");
        c188727au.LJ(j, "time");
        c188727au.LJ(j2, "audio_file_size");
        c188727au.LJ(j3, "thumb_file_size");
        FMX.LJIIL("av_performance_local_music_scan", c188727au.LIZ);
    }
}
