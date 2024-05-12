package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J5P implements J4H {
    public final /* synthetic */ C72242sW LIZ;
    public final /* synthetic */ J41 LIZIZ;

    public J5P(C72242sW c72242sW, J41 j41) {
        this.LIZ = c72242sW;
        this.LIZIZ = j41;
    }

    @Override // X.J4H
    public final void LIZ(boolean z, int i, String str, java.util.Map map) {
        J52 j52;
        Float f;
        Float f2;
        J5S lastSlideSpeedFeature;
        int i2;
        float f3;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZ.element;
        o.LJIIIIZZ(C40507Fv5.LIZJ(this.LIZIZ.LIZJ), "getNameWithoutExtension(model)");
        this.LIZIZ.getClass();
        if (J51.LIZ && (j52 = J51.LIZJ) != null) {
            j52.LJFF = i;
            j52.LIZLLL = uptimeMillis;
        }
        J41 j41 = this.LIZIZ;
        j41.getClass();
        SystemClock.uptimeMillis();
        if (!z || map == null || str == null) {
            J51.LIZ(0.0f, -1, 0, SystemClock.uptimeMillis());
        } else {
            J5Q j5q = new J5Q(0);
            for (String str2 : map.keySet()) {
                if (o.LJ(str2, "left")) {
                    i2 = 1;
                } else if (o.LJ(str2, "right")) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                Float f4 = (Float) map.get(str2);
                if (f4 != null) {
                    f3 = f4.floatValue();
                } else {
                    f3 = 0.0f;
                }
                j5q.LIZ(new J5R(f3, str2, i2));
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            J5R j5r = j5q.LIZIZ;
            J51.LIZ(j5r.LJLJI, 0, j5r.LJLIL, uptimeMillis2);
            J5W j5w = j41.LIZIZ;
            if (j5w != null) {
                j5w.LIZ(j5q);
            }
        }
        if (J5V.LIZ != 0) {
            SmartOHRService smartOHRService = C48591J5f.LIZ;
            Float f5 = null;
            if (smartOHRService != null && (lastSlideSpeedFeature = smartOHRService.getLastSlideSpeedFeature()) != null) {
                f = Float.valueOf(lastSlideSpeedFeature.LJLIL);
                f2 = Float.valueOf(lastSlideSpeedFeature.LJLILLLLZI);
                f5 = Float.valueOf(lastSlideSpeedFeature.LJLJI);
            } else {
                f = null;
                f2 = null;
            }
            PitayaFeatureCenterService.Companion.getClass();
            J5T.LIZ.onSlideSpeedUpdate(f, f2, f5);
        }
    }
}
