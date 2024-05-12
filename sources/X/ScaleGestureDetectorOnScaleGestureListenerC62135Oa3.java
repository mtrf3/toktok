package X;

import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;

/* renamed from: X.Oa3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC62135Oa3 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ ScanQRCodeActivityV2 LJLIL;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC62135Oa3(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.LJLIL = scanQRCodeActivityV2;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.LJLIL.LJLJLLL == null || scaleGestureDetector == null) {
            return false;
        }
        if (scaleGestureDetector.getScaleFactor() >= 1.0f) {
            ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LJLIL;
            float f = scanQRCodeActivityV2.LLFII;
            if (f <= 3.0f) {
                scanQRCodeActivityV2.LLFII = f + 0.05f;
                ScanQRCodeActivityV2 scanQRCodeActivityV22 = this.LJLIL;
                scanQRCodeActivityV22.LJLJLLL.zoomByRatio(scanQRCodeActivityV22.LLFII);
                return false;
            }
        }
        ScanQRCodeActivityV2 scanQRCodeActivityV23 = this.LJLIL;
        float f2 = scanQRCodeActivityV23.LLFII;
        if (f2 >= 1.0f) {
            scanQRCodeActivityV23.LLFII = f2 - 0.05f;
        }
        ScanQRCodeActivityV2 scanQRCodeActivityV222 = this.LJLIL;
        scanQRCodeActivityV222.LJLJLLL.zoomByRatio(scanQRCodeActivityV222.LLFII);
        return false;
    }
}
