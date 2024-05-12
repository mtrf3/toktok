package X;

import android.graphics.Bitmap;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.VTs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79804VTs implements InterfaceC78752UvU {
    public final /* synthetic */ C68322mC LIZ;
    public final /* synthetic */ LynxBytedLottieView LIZIZ;
    public final /* synthetic */ C0GV LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC78752UvU
    public final void onFailed(String msg) {
        o.LJIIJ(msg, "msg");
        this.LIZIZ.LJLLL = false;
        if (!ujb.o.LJJJJJL(msg)) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("use mSrcDir, mSrcUrl: ");
            LIZ.append(this.LIZIZ.LJLJLLL);
            LIZ.append(", path: ");
            lynxBytedLottieView.LJJI(1, C025908h.LIZIZ(LIZ, (String) this.LIZ.element, ", msg: ", msg, LIZ), (String) this.LIZ.element);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("request resource from ");
        String LJFF = JBR.LJFF(LIZ2, (String) this.LIZ.element, " failed", LIZ2);
        LynxBytedLottieView lynxBytedLottieView2 = this.LIZIZ;
        lynxBytedLottieView2.getClass();
        lynxBytedLottieView2.LJJIIZI("error", LynxBytedLottieView.LJJ(1, LJFF));
        LynxBytedLottieView lynxBytedLottieView3 = this.LIZIZ;
        lynxBytedLottieView3.LJZL.LIZIZ(lynxBytedLottieView3.LJLL, (String) this.LIZ.element, LJFF);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fetchBitmap failed, mSrcUrl=`");
        LIZ3.append(this.LIZIZ.LJLJLLL);
        LIZ3.append("`, url=`");
        LIZ3.append((String) this.LIZ.element);
        LIZ3.append('`');
        LLog.LIZLLL(4, "byted-lottie", X1D.LIZIZ(LIZ3));
        this.LIZJ.onFailed();
    }

    @Override // X.InterfaceC78752UvU
    public final void LIZ(Bitmap bitmap, String id) {
        o.LJIIJ(id, "id");
        this.LIZJ.onSuccess(bitmap);
    }

    public C79804VTs(C68322mC c68322mC, LynxBytedLottieView lynxBytedLottieView, C29751Et c29751Et) {
        this.LIZ = c68322mC;
        this.LIZIZ = lynxBytedLottieView;
        this.LIZJ = c29751Et;
    }
}
