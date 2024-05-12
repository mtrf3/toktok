package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;

/* loaded from: classes11.dex */
public class OX7 extends GestureDetector.SimpleOnGestureListener {
    public long LJLIL;
    public final /* synthetic */ ScanQRCodeActivityV2 LJLILLLLZI;

    public OX7(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.LJLILLLLZI = scanQRCodeActivityV2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.LJLILLLLZI.LJLJLLL == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLIL < 500) {
            return false;
        }
        this.LJLIL = currentTimeMillis;
        if (this.LJLILLLLZI.LLFII <= 1.0f) {
            while (true) {
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LJLILLLLZI;
                float f = scanQRCodeActivityV2.LLFII;
                if (f >= 3.0f) {
                    break;
                }
                float f2 = f + 0.03f;
                scanQRCodeActivityV2.LLFII = f2;
                scanQRCodeActivityV2.LJLJLLL.zoomByRatio(f2);
            }
        } else {
            while (true) {
                ScanQRCodeActivityV2 scanQRCodeActivityV22 = this.LJLILLLLZI;
                float f3 = scanQRCodeActivityV22.LLFII;
                if (f3 <= 1.0f) {
                    break;
                }
                float f4 = f3 - 0.03f;
                scanQRCodeActivityV22.LLFII = f4;
                scanQRCodeActivityV22.LJLJLLL.zoomByRatio(f4);
            }
        }
        return false;
    }
}
