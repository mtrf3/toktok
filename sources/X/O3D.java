package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O3D implements InterfaceC88472Yns<C61259O2l, C76800UCe> {
    public final WeakReference<LynxAlphaVideo> LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61259O2l c61259O2l) {
        LynxAlphaVideo lynxAlphaVideo;
        String str;
        LynxAlphaVideo lynxAlphaVideo2;
        C61259O2l c61259O2l2 = c61259O2l;
        this.LJLIL.get();
        this.LJLIL.get();
        if (c61259O2l2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("load resource success: ");
            LIZ.append(c61259O2l2.LJLILLLLZI);
            LIZ.append(", ");
            LIZ.append(c61259O2l2.LJLJI);
            LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
            O39 o39 = c61259O2l2.LJLJJI;
            if (o39 != null) {
                int i = O3C.LIZ[o39.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3 && (str = c61259O2l2.LJLILLLLZI) != null && (lynxAlphaVideo2 = this.LJLIL.get()) != null) {
                        lynxAlphaVideo2.LJJIFFI(str);
                    }
                } else {
                    String str2 = c61259O2l2.LJLILLLLZI;
                    if (str2 != null && (lynxAlphaVideo = this.LJLIL.get()) != null) {
                        lynxAlphaVideo.LJJIII(str2, this.LJLILLLLZI);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public O3D(LynxAlphaVideo view, String str) {
        o.LJIIJ(view, "view");
        this.LJLILLLLZI = str;
        this.LJLIL = new WeakReference<>(view);
    }
}
