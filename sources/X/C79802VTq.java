package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VTq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79802VTq implements C0GM {
    public final /* synthetic */ LynxBytedLottieView LIZ;
    public final /* synthetic */ C77919Ui3 LIZIZ;

    public C79802VTq(LynxBytedLottieView lynxBytedLottieView, C77919Ui3 c77919Ui3) {
        this.LIZ = lynxBytedLottieView;
        this.LIZIZ = c77919Ui3;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY composition) {
        C0GY composition2;
        C0GY composition3;
        ReadableMap readableMap;
        this.LIZ.LL = composition;
        C04640Ge performanceTracker = this.LIZIZ.getPerformanceTracker();
        if (performanceTracker != null) {
            performanceTracker.LIZ = true;
        }
        C04640Ge performanceTracker2 = this.LIZIZ.getPerformanceTracker();
        if (performanceTracker2 != null) {
            performanceTracker2.LIZJ.add(new C79809VTx(this));
        }
        o.LJFF(composition, "composition");
        if (composition.LJIILIIL) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZ;
            C0GY c0gy = lynxBytedLottieView.LL;
            if (c0gy != null && (readableMap = lynxBytedLottieView.LJLLLLLL) != null) {
                new C79873VWj(new CallableC79805VTt(lynxBytedLottieView, readableMap, new C79803VTr(lynxBytedLottieView), c0gy));
                return;
            }
            return;
        }
        float f = 0.0f;
        int i = 0;
        if (composition.LJIIL) {
            LynxBytedLottieView lynxBytedLottieView2 = this.LIZ;
            C29701Eo c29701Eo = (C29701Eo) lynxBytedLottieView2.mView;
            if (c29701Eo != null) {
                i = c29701Eo.getFrame();
            }
            C29701Eo c29701Eo2 = (C29701Eo) this.LIZ.mView;
            if (c29701Eo2 != null && (composition3 = c29701Eo2.getComposition()) != null) {
                f = composition3.LJIIJ - composition3.LJIIIZ;
            }
            LynxBytedLottieView lynxBytedLottieView3 = this.LIZ;
            lynxBytedLottieView2.LJJIIZI("ready", LynxBytedLottieView.LJIL(i, (int) f, lynxBytedLottieView3.LJLJL, lynxBytedLottieView3.LJLLLL));
            LynxBytedLottieView lynxBytedLottieView4 = this.LIZ;
            lynxBytedLottieView4.LJZL.LIZ(lynxBytedLottieView4.LJLL);
            LynxBytedLottieView lynxBytedLottieView5 = this.LIZ;
            if (lynxBytedLottieView5.LJLILLLLZI && lynxBytedLottieView5.LJLLL) {
                lynxBytedLottieView5.LJJIII();
                return;
            }
            return;
        }
        LynxBytedLottieView lynxBytedLottieView6 = this.LIZ;
        C29701Eo c29701Eo3 = (C29701Eo) lynxBytedLottieView6.mView;
        if (c29701Eo3 != null) {
            i = c29701Eo3.getFrame();
        }
        C29701Eo c29701Eo4 = (C29701Eo) this.LIZ.mView;
        if (c29701Eo4 != null && (composition2 = c29701Eo4.getComposition()) != null) {
            f = composition2.LJIIJ - composition2.LJIIIZ;
        }
        LynxBytedLottieView lynxBytedLottieView7 = this.LIZ;
        lynxBytedLottieView6.LJJIIZI("error", LynxBytedLottieView.LJIL(i, (int) f, lynxBytedLottieView7.LJLJL, lynxBytedLottieView7.LJLLLL));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lottieComposition Loaded, but bitmap is not ready, lottieUrl is ");
        LIZ.append(this.LIZ.LJLL);
        LIZ.append(", mSrcDir is ");
        C13870gZ.LIZJ(LIZ, this.LIZ.LJLJLLL, LIZ, 4, "byted-lottie");
    }
}
