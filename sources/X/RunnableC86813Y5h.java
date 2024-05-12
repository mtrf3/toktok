package X;

import android.hardware.Camera;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Y5h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86813Y5h implements Runnable {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ Y60 LJLILLLLZI;

    public final void LIZ() {
        C86830Y5y c86830Y5y = this.LJLILLLLZI.LIZJ;
        float f = this.LJLIL;
        Camera.Parameters parameters = c86830Y5y.LIZ.getParameters();
        if (c86830Y5y.LIZ != null && parameters.isZoomSupported() && f > 1.0f) {
            try {
                float f2 = c86830Y5y.LJIIJJI * f;
                c86830Y5y.LJIIJJI = f2;
                double d = f2;
                List<Integer> zoomRatios = parameters.getZoomRatios();
                int maxZoom = parameters.getMaxZoom();
                if (zoomRatios != null && !zoomRatios.isEmpty() && zoomRatios.size() == maxZoom + 1) {
                    double d2 = d * 100.0d;
                    double d3 = Double.POSITIVE_INFINITY;
                    int i = 0;
                    for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
                        double abs = Math.abs(((Integer) ListProtector.get(zoomRatios, i2)).intValue() - d2);
                        if (abs < d3) {
                            i = i2;
                            d3 = abs;
                        }
                    }
                    if (i == -1) {
                        return;
                    }
                    int zoom = parameters.getZoom();
                    int maxZoom2 = parameters.getMaxZoom();
                    if (i <= zoom || maxZoom2 <= i) {
                        return;
                    }
                    parameters.setZoom(i);
                    c86830Y5y.LIZ.setParameters(parameters);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC86813Y5h(Y60 y60, float f) {
        this.LJLILLLLZI = y60;
        this.LJLIL = f;
    }
}
