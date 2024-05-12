package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Cnh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32405Cnh {
    public static final String LIZ(long j) {
        String str;
        AssetsModel LIZJ = C32366Cn4.LIZJ(j);
        C32420Cnw LIZJ2 = C32366Cn4.LJFF().LIZJ(LIZJ, 0);
        if (LIZJ != null) {
            if (LIZJ2 != null) {
                str = LIZJ2.LJ;
            } else {
                str = null;
            }
            String resourceFormat = LIZJ.getResourceFormat(str);
            if (resourceFormat != null) {
                return resourceFormat;
            }
        }
        return "unknown";
    }

    public static final String LIZIZ(long j) {
        C32420Cnw LIZJ = C32366Cn4.LJFF().LIZJ(C32366Cn4.LIZJ(j), 0);
        if (LIZJ == null) {
            return "";
        }
        String LIZIZ = PU0.LJI().LIZIZ.LIZ.LIZIZ(LIZJ);
        o.LJIIIIZZ(LIZIZ, "inst().fileCacheFactory.getFileCachePath(request)");
        return LIZIZ;
    }
}
