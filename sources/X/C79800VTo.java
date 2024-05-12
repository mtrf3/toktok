package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.VTo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79800VTo implements InterfaceC88472Yns<C61259O2l, C76800UCe> {
    public final WeakReference<LynxBytedLottieView> LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61259O2l c61259O2l) {
        C61259O2l loadInfo = c61259O2l;
        o.LJIIJ(loadInfo, "loadInfo");
        LynxBytedLottieView lynxBytedLottieView = this.LJLIL.get();
        if (lynxBytedLottieView != null) {
            lynxBytedLottieView.LJJIJ(this.LJLILLLLZI);
            lynxBytedLottieView.LJLLILLLL = true;
            O39 o39 = loadInfo.LJLJJI;
            lynxBytedLottieView.LJLLI = o39;
            if (o39 != null) {
                int i = O3A.LIZ[o39.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("load resource success from cdn: ");
                            C13870gZ.LIZJ(LIZ, loadInfo.LJLILLLLZI, LIZ, 2, "byted-lottie");
                            String str = loadInfo.LJLILLLLZI;
                            if (str != null) {
                                C04650Gf.LJFF(str, lynxBytedLottieView, lynxBytedLottieView.LLII);
                            }
                        }
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("load resource success from gecko: ");
                        C13870gZ.LIZJ(LIZ2, loadInfo.LJLILLLLZI, LIZ2, 2, "byted-lottie");
                        String str2 = loadInfo.LJLILLLLZI;
                        if (str2 != null) {
                            lynxBytedLottieView.LJJIJ(str2);
                            C04650Gf.LJFF(str2, lynxBytedLottieView, lynxBytedLottieView.LLII);
                        }
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("load resource success from builtin: ");
                    C13870gZ.LIZJ(LIZ3, loadInfo.LJLILLLLZI, LIZ3, 2, "byted-lottie");
                    String str3 = loadInfo.LJLILLLLZI;
                    if (str3 != null) {
                        lynxBytedLottieView.LJJIJ(str3);
                        C04650Gf.LJ(lynxBytedLottieView.mContext, lynxBytedLottieView.LLII, lynxBytedLottieView, str3, null);
                    }
                }
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("load resource failed with unknown type: ");
            LIZ4.append(loadInfo.LJLJJI);
            LLog.LIZLLL(4, "byted-lottie", X1D.LIZIZ(LIZ4));
        }
        return C76800UCe.LIZ;
    }

    public C79800VTo(LynxBytedLottieView lynxBytedLottieView, String str) {
        this.LJLILLLLZI = str;
        this.LJLIL = new WeakReference<>(lynxBytedLottieView);
    }
}
