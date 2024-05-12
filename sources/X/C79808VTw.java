package X;

import Y.ARunnableS33S0200000_14;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import kotlin.jvm.internal.o;

/* renamed from: X.VTw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79808VTw implements C0GL {
    public final String LIZ;
    public final /* synthetic */ LynxBytedLottieView LIZIZ;

    @Override // X.C0GL
    public final void LIZ(String msg) {
        o.LJIIJ(msg, "msg");
        String str = this.LIZ;
        if (str != null && o.LJ(str, this.LIZIZ.LJLL) && (!ujb.o.LJJJJJL(msg))) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZIZ;
            String str2 = lynxBytedLottieView.LJLL;
            if (str2 == null) {
                str2 = "";
            }
            lynxBytedLottieView.LJJI(1, msg, str2);
        }
    }

    @Override // X.C0GL
    public final void LIZIZ(C0GY composition) {
        o.LJIIJ(composition, "composition");
        String str = this.LIZ;
        if (str != null && o.LJ(str, this.LIZIZ.LJLL)) {
            C79411VEp.LIZJ(new ARunnableS33S0200000_14(composition, this, 9));
        }
    }

    public C79808VTw(LynxBytedLottieView lynxBytedLottieView, String str) {
        this.LIZIZ = lynxBytedLottieView;
        this.LIZ = str;
    }
}
