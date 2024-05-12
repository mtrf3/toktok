package X;

import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44655Hfn {
    public static final /* synthetic */ int LIZ = 0;

    public static int[] LIZIZ(int i) {
        HJG defaultValueGetter = HJG.INSTANCE;
        o.LJIIIZ(defaultValueGetter, "defaultValueGetter");
        if (i == 2) {
            InterfaceC44798Hi6.LJFF.getClass();
            PreviewSize LIZIZ = C44740HhA.LIZIZ();
            if (LIZIZ == null) {
                int[] iArr = (int[]) defaultValueGetter.invoke();
                if (iArr.length == 2) {
                    return new int[]{iArr[0], (int) (iArr[0] / 0.75f)};
                }
                return new int[]{720, 960};
            }
            return new int[]{LIZIZ.getWidth(), LIZIZ.getHeight()};
        }
        return (int[]) defaultValueGetter.invoke();
    }

    public static int[] LIZJ(int i) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        int[] LJIIIZ = C44739Hh9.LJIIIZ(z);
        if (LJIIIZ == null || !e1.LIZ(31744, "render_use_videosize_index", true, false)) {
            LJIIIZ = new int[]{720, 1280};
        }
        if (z) {
            return new int[]{LJIIIZ[0], (int) (LJIIIZ[0] / 0.75f)};
        }
        return LJIIIZ;
    }

    public static int[] LIZ(int i, CameraComponentModel cameraComponentModel) {
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        if (i == 2) {
            C44735Hh5 c44735Hh5 = C44172HVg.LJIILJJIL;
            c44735Hh5.LIZ();
            int i2 = c44735Hh5.LIZ;
            return new int[]{i2, (int) (i2 / 0.75f)};
        }
        return new int[]{cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight};
    }
}
