package X;

import android.graphics.Bitmap;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.VTu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79806VTu implements InterfaceC78752UvU {
    public final /* synthetic */ LynxBytedLottieView LIZ;
    public final /* synthetic */ C0GV LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC78752UvU
    public final void onFailed(String msg) {
        o.LJIIJ(msg, "msg");
        this.LIZ.LJLLL = false;
        if (!ujb.o.LJJJJJL(msg)) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("useXResourceFrom: ");
            LIZ.append(this.LIZ.LJLLI);
            LIZ.append(", mSrcUrl: ");
            LIZ.append(this.LIZ.LJLJLLL);
            LIZ.append(", path: ");
            lynxBytedLottieView.LJJI(1, C025908h.LIZIZ(LIZ, this.LIZJ, ", msg: ", msg, LIZ), this.LIZJ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fetch bitmap failed, useXResourceFrom: ");
        LIZ2.append(this.LIZ.LJLLI);
        LIZ2.append(", path: ");
        LIZ2.append(this.LIZJ);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LynxBytedLottieView lynxBytedLottieView2 = this.LIZ;
        lynxBytedLottieView2.getClass();
        lynxBytedLottieView2.LJJIIZI("error", LynxBytedLottieView.LJJ(1, LIZIZ));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fetchBitmap mSrcUrl=`");
        LIZ3.append(this.LIZ.LJLJLLL);
        LIZ3.append("`, filePath=`");
        LIZ3.append(this.LIZJ);
        LIZ3.append("` not exists.");
        LLog.LIZLLL(4, "byted-lottie", X1D.LIZIZ(LIZ3));
        this.LIZIZ.onFailed();
    }

    @Override // X.InterfaceC78752UvU
    public final void LIZ(Bitmap bitmap, String id) {
        o.LJIIJ(id, "id");
        this.LIZIZ.onSuccess(bitmap);
    }

    public C79806VTu(LynxBytedLottieView lynxBytedLottieView, C29751Et c29751Et, String str) {
        this.LIZ = lynxBytedLottieView;
        this.LIZIZ = c29751Et;
        this.LIZJ = str;
    }
}
