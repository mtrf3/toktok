package X;

import android.hardware.Camera;

/* renamed from: X.Y5g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class RunnableC86812Y5g implements Runnable {
    public int LJLIL;
    public final /* synthetic */ Y60 LJLILLLLZI;

    public final void LIZ() {
        try {
            C86830Y5y c86830Y5y = this.LJLILLLLZI.LIZJ;
            int i = this.LJLIL;
            Camera camera = c86830Y5y.LIZ;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    int zoom = parameters.getZoom();
                    c86830Y5y.LJIIJJI = 1.0f;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return;
                            }
                            if (zoom > 0) {
                                c86830Y5y.LIZLLL(0);
                                return;
                            } else {
                                c86830Y5y.LIZLLL(maxZoom / 3);
                                return;
                            }
                        }
                        if (zoom > 0) {
                            zoom--;
                        }
                    } else if (zoom < maxZoom) {
                        zoom++;
                    }
                    parameters.setZoom(zoom);
                    c86830Y5y.LIZ.setParameters(parameters);
                }
            }
        } catch (Exception e) {
            this.LJLILLLLZI.LIZ(e);
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

    public RunnableC86812Y5g(Y60 y60) {
        this.LJLILLLLZI = y60;
    }
}
