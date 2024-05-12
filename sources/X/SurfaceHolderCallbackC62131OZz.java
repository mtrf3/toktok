package X;

import android.view.SurfaceHolder;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* renamed from: X.OZz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class SurfaceHolderCallbackC62131OZz implements SurfaceHolder.Callback {
    public final /* synthetic */ ScanQRCodeActivityV2 LJLIL;

    public final void LIZ() {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LJLIL;
        OX5 ox5 = scanQRCodeActivityV2.LJLL;
        if (ox5 != null) {
            IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LJLJLLL;
            ((C62114OZi) ox5).LJIIJ.LJFF();
            iQRCodeScanner.enableCameraScan(true, 65536L);
        } else {
            scanQRCodeActivityV2.LJLJLLL.enableCameraScan(true, 65536L);
        }
        this.LJLIL.LLIIIZ();
        ScanQRCodeActivityV2 scanQRCodeActivityV22 = this.LJLIL;
        scanQRCodeActivityV22.getClass();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -scanQRCodeActivityV22.LJZL.getHeight(), scanQRCodeActivityV22.LL.getHeight() - C17N.LJIILL(20.0d));
        translateAnimation.setDuration(2000L);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        scanQRCodeActivityV22.LJZL.startAnimation(translateAnimation);
        ScanQRCodeActivityV2 scanQRCodeActivityV23 = this.LJLIL;
        if (!scanQRCodeActivityV23.LLFZ) {
            C62132Oa0 c62132Oa0 = new C62132Oa0(scanQRCodeActivityV23, scanQRCodeActivityV23.LL.getLeft(), scanQRCodeActivityV23.LL.getTop(), scanQRCodeActivityV23.LL.getRight(), scanQRCodeActivityV23.LL.getBottom());
            scanQRCodeActivityV23.LLI = c62132Oa0;
            scanQRCodeActivityV23.LLD.addView(c62132Oa0, 2);
            scanQRCodeActivityV23.LLFZ = true;
        }
    }

    public SurfaceHolderCallbackC62131OZz(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.LJLIL = scanQRCodeActivityV2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2;
        synchronized (this) {
            scanQRCodeActivityV2 = this.LJLIL;
            scanQRCodeActivityV2.LJLLL = true;
        }
        if (scanQRCodeActivityV2.LJLJLLL == null) {
            scanQRCodeActivityV2.LLIIIILZ(new C30095BrX(this));
        } else {
            LIZ();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2;
        this.LJLIL.LJZL.clearAnimation();
        synchronized (this) {
            scanQRCodeActivityV2 = this.LJLIL;
            scanQRCodeActivityV2.LJLLL = false;
        }
        if (scanQRCodeActivityV2.LJLJLLL != null) {
            synchronized (scanQRCodeActivityV2) {
                IQRCodeScanner iQRCodeScanner = this.LJLIL.LJLJLLL;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.stop();
                    this.LJLIL.LJLJLLL.release();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LJLIL.LLIIII.LIZ(Integer.valueOf(i2), "surfaceChanged");
    }
}
