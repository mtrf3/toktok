package X;

import android.graphics.BitmapFactory;
import com.aweme.storage.StorageCleanServiceImpl;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.GZv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41743GZv {
    public static final boolean LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;

    static {
        FFL.LJIIIZ().getClass();
        boolean z = false;
        if (FFL.LJIIJ(31744, 0, "enable_cache_optimize", true) > 0) {
            z = true;
        }
        LIZ = z;
        LIZIZ = StorageCleanServiceImpl.LIZJ().LIZ();
        LIZJ = 540;
    }

    public static boolean LIZ(long j, String path) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(path, "path");
        if (LIZ) {
            boolean z5 = false;
            if (path.length() != 0) {
                if (!C44687HgJ.LJIIJJI(path)) {
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(path);
                    if (videoFileInfo == null) {
                        return true;
                    }
                    int i = videoFileInfo.width;
                    int i2 = videoFileInfo.height;
                    int i3 = LIZJ;
                    if (i < i3 || i2 < i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (j >= LIZIZ) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 || !z4) {
                        z5 = true;
                    }
                    return !z5;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(path, options);
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                int i6 = LIZJ;
                if (i4 < i6 || i5 < i6) {
                    z = true;
                } else {
                    z = false;
                }
                if (j >= LIZIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || !z2) {
                    z5 = true;
                }
                return !z5;
            }
        }
        return true;
    }
}
