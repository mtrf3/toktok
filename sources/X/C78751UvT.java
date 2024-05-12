package X;

import android.graphics.Bitmap;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.UvT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78751UvT extends AbstractC78760Uvc {
    public final /* synthetic */ LynxBytedLottieView LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC78752UvU LIZJ;
    public final /* synthetic */ C04750Gp LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ W4W LJFF;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        String str;
        String str2 = null;
        if (w4w != null) {
            Throwable LJFF = w4w.LJFF();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("requestBitmap failed! url: ");
            LIZ.append(this.LIZIZ);
            LIZ.append(" Reason: ");
            if (LJFF != null) {
                str = LJFF.getMessage();
            } else {
                str = null;
            }
            C13870gZ.LIZJ(LIZ, str, LIZ, 2, "byted-lottie");
            InterfaceC78752UvU interfaceC78752UvU = this.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" error msg is ");
            if (LJFF != null) {
                str2 = LJFF.getMessage();
            }
            LIZ2.append(str2);
            LIZ2.append('}');
            interfaceC78752UvU.onFailed(X1D.LIZIZ(LIZ2));
            w4w.close();
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC78760Uvc
    public final void LJI(C81392Vwy<Bitmap> c81392Vwy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestBitmap success. url: ");
        C13870gZ.LIZJ(LIZ, this.LIZIZ, LIZ, 2, "byted-lottie");
        if (c81392Vwy != null) {
            synchronized (this.LIZ) {
                if (this.LIZ.LLIFFJFJJ) {
                    this.LIZJ.onFailed("the lottie-view is destroyed already.");
                    return;
                }
                LynxBytedLottieView lynxBytedLottieView = this.LIZ;
                C04750Gp c04750Gp = this.LIZLLL;
                int i = c04750Gp.LIZ;
                int i2 = c04750Gp.LIZIZ;
                String redirectUrl = this.LIZIZ;
                o.LJFF(redirectUrl, "redirectUrl");
                C81392Vwy<Bitmap> LJJIIZ = lynxBytedLottieView.LJJIIZ(c81392Vwy, i, i2, redirectUrl);
                if (LJJIIZ != null) {
                    this.LIZ.LLFF.add(LJJIIZ);
                    try {
                        Bitmap LJI = LJJIIZ.LJI();
                        if (LJI != null) {
                            this.LIZJ.LIZ(LJI, this.LJ);
                        } else {
                            LLog.LIZLLL(4, "byted-lottie", "requestBitmapSync, onNewResultImpl");
                            this.LIZJ.onFailed(this.LJ);
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("requestBitmapSync, onNewResultImpl, error is ");
                        LIZ2.append(e);
                        LLog.LIZLLL(4, "byted-lottie", X1D.LIZIZ(LIZ2));
                        this.LIZJ.onFailed(this.LJ);
                    }
                } else {
                    this.LIZJ.onFailed("failed when scaleBitmap");
                }
            }
        }
        this.LJFF.close();
    }

    public C78751UvT(LynxBytedLottieView lynxBytedLottieView, String str, InterfaceC78752UvU interfaceC78752UvU, C04750Gp c04750Gp, String str2, W4W w4w) {
        this.LIZ = lynxBytedLottieView;
        this.LIZIZ = str;
        this.LIZJ = interfaceC78752UvU;
        this.LIZLLL = c04750Gp;
        this.LJ = str2;
        this.LJFF = w4w;
    }
}
