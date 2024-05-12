package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.VTm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79798VTm implements InterfaceC88471Ynr<Throwable, Boolean, C76800UCe> {
    public final WeakReference<LynxBytedLottieView> LJLIL;
    public final String LJLILLLLZI;

    public C79798VTm(LynxBytedLottieView lynxBytedLottieView, String str) {
        this.LJLILLLLZI = str;
        this.LJLIL = new WeakReference<>(lynxBytedLottieView);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Throwable th, Boolean bool) {
        Throwable throwable = th;
        boolean booleanValue = bool.booleanValue();
        o.LJIIJ(throwable, "throwable");
        LynxBytedLottieView lynxBytedLottieView = this.LJLIL.get();
        if (lynxBytedLottieView != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request resource failed, errorMsg is \n ");
            LIZ.append(String.valueOf(throwable.getMessage()));
            String LIZIZ = X1D.LIZIZ(LIZ);
            String str = "";
            if (lynxBytedLottieView.LLFZ) {
                String str2 = lynxBytedLottieView.LJLL;
                if (str2 != null) {
                    str = str2;
                }
                lynxBytedLottieView.LJJI(4, LIZIZ, str);
            } else if (booleanValue) {
                lynxBytedLottieView.LJJII(this.LJLILLLLZI);
            } else {
                String str3 = lynxBytedLottieView.LJLL;
                if (str3 != null) {
                    str = str3;
                }
                lynxBytedLottieView.LJJI(1, LIZIZ, str);
            }
        }
        return C76800UCe.LIZ;
    }
}
