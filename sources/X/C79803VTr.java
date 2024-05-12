package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.VTr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79803VTr implements C0GV<String> {
    public final /* synthetic */ LynxBytedLottieView LIZ;

    @Override // X.C0GV
    public final void onFailed() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch polyfill bitmap ");
        LIZ.append(this.LIZ.LJLLLLLL);
        LIZ.append(" failed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LynxBytedLottieView lynxBytedLottieView = this.LIZ;
        lynxBytedLottieView.getClass();
        lynxBytedLottieView.LJJIIZI("error", LynxBytedLottieView.LJJ(1, LIZIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fetch polyfill Bitmap mSrcUrl=");
        LIZ2.append(this.LIZ.LJLJLLL);
        LIZ2.append(", filePath=");
        LIZ2.append(this.LIZ.LJLLLLLL);
        LIZ2.append(" not exists.");
        LLog.LIZLLL(4, "byted-lottie", X1D.LIZIZ(LIZ2));
    }

    public C79803VTr(LynxBytedLottieView lynxBytedLottieView) {
        this.LIZ = lynxBytedLottieView;
    }

    @Override // X.C0GV
    public final void onSuccess(String t) {
        int i;
        float f;
        C0GY composition;
        o.LJIIJ(t, "t");
        LynxBytedLottieView lynxBytedLottieView = this.LIZ;
        C29701Eo c29701Eo = (C29701Eo) lynxBytedLottieView.mView;
        if (c29701Eo != null) {
            i = c29701Eo.getFrame();
        } else {
            i = 0;
        }
        C29701Eo c29701Eo2 = (C29701Eo) this.LIZ.mView;
        if (c29701Eo2 != null && (composition = c29701Eo2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        LynxBytedLottieView lynxBytedLottieView2 = this.LIZ;
        lynxBytedLottieView.LJJIIZI("ready", LynxBytedLottieView.LJIL(i, (int) f, lynxBytedLottieView2.LJLJL, lynxBytedLottieView2.LJLLLL));
        LynxBytedLottieView lynxBytedLottieView3 = this.LIZ;
        lynxBytedLottieView3.LJZL.LIZ(lynxBytedLottieView3.LJLL);
        LynxBytedLottieView lynxBytedLottieView4 = this.LIZ;
        if (lynxBytedLottieView4.LJLILLLLZI && lynxBytedLottieView4.LJLLL) {
            lynxBytedLottieView4.LJJIII();
        }
    }
}
