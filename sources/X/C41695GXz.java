package X;

import android.app.Application;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GXz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41695GXz extends AbstractC41806Gaw<Bitmap, CanvasBackground> {
    public static final int LIZJ(int i) {
        if (i != -16777216) {
            if (i != -1) {
                return i;
            }
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            Integer LJI = C79045V0n.LJI(R.attr.dc, application);
            if (LJI == null) {
                return i;
            }
            return LJI.intValue();
        }
        Application application2 = C60903NvH.LJ;
        o.LJIIIIZZ(application2, "getApplication()");
        Integer LJI2 = C79045V0n.LJI(R.attr.cb, application2);
        if (LJI2 == null) {
            return i;
        }
        return LJI2.intValue();
    }

    @Override // X.AbstractC41806Gaw
    public final Object LIZIZ(Object obj, C41805Gav c41805Gav) {
        OSZ<Integer, Integer> LIZIZ;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            LIZIZ = new OSZ<>(new Integer(-16777216), new Integer(-16777216));
        } else {
            LIZIZ = new C57730MlC().LIZIZ(bitmap);
        }
        C142615ij c142615ij = CanvasBackground.Companion;
        int LIZJ = LIZJ(LIZIZ.getFirst().intValue());
        int LIZJ2 = LIZJ(LIZIZ.getSecond().intValue());
        c142615ij.getClass();
        return C142615ij.LIZIZ(LIZJ, LIZJ2);
    }
}
