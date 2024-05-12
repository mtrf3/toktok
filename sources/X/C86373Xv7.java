package X;

import com.ss.android.ugc.aweme.ab.SurfaceViewConfig;

/* renamed from: X.Xv7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86373Xv7 {
    public static final SurfaceViewConfig LIZ = new SurfaceViewConfig(false, null, 3, null);
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(C86374Xv8.LJLIL);
    public static final C5H3 LIZJ = C78996UzQ.LJJIJIIJI(C28243B6p.LJLIL);

    public static boolean LIZ(String str) {
        Boolean bool;
        C5H3 c5h3 = LIZIZ;
        if (!((SurfaceViewConfig) c5h3.getValue()).enable || str == null || (bool = ((SurfaceViewConfig) c5h3.getValue()).settings.get(str)) == null || !bool.booleanValue() || !((Boolean) LIZJ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }
}
