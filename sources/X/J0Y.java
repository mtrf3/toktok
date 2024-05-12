package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J0Y implements InterfaceC88471Ynr<Throwable, Boolean, C76800UCe> {
    public final WeakReference<LynxAlphaVideo> LJLIL;
    public final String LJLILLLLZI;

    public J0Y(LynxAlphaVideo view, String str) {
        o.LJIIJ(view, "view");
        this.LJLILLLLZI = str;
        this.LJLIL = new WeakReference<>(view);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Throwable th, Boolean bool) {
        String str;
        Throwable th2 = th;
        boolean booleanValue = bool.booleanValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed when use resource loader to load ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", and error msg ");
        if (th2 != null) {
            str = th2.getMessage();
        } else {
            str = null;
        }
        LIZ.append(String.valueOf(str));
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (booleanValue) {
            LLog.LIZLLL(2, "x-alpha-video", LIZIZ);
            LynxAlphaVideo lynxAlphaVideo = this.LJLIL.get();
            if (lynxAlphaVideo != null) {
                lynxAlphaVideo.LJJIFFI(this.LJLILLLLZI);
            }
        }
        LynxAlphaVideo lynxAlphaVideo2 = this.LJLIL.get();
        if (lynxAlphaVideo2 != null) {
            lynxAlphaVideo2.LJJI(-11, LIZIZ, this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }
}
