package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS174S0100000_8;

/* loaded from: classes9.dex */
public final class IFY implements IFP {
    public static final IFY LJLIL = new IFY();
    public static boolean LJLILLLLZI;
    public static InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJI;

    @Override // X.IFP
    public final boolean LJJIIZI() {
        if (((Number) IFZ.LIZ.getValue()).intValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.IFP
    public final boolean LJJIJIIJIL() {
        if (((Number) IFZ.LIZ.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.IFP
    public final boolean LIZ() {
        return LJLILLLLZI;
    }

    @Override // X.IFP
    public final void LJII(boolean z) {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }

    @Override // X.IFP
    public final void LJJIJ(boolean z) {
        LJLILLLLZI = z;
    }

    @Override // X.IFP
    public final void LJJJ(AqS174S0100000_8 aqS174S0100000_8) {
        LJLJI = aqS174S0100000_8;
    }

    @Override // X.IFP
    public final boolean LJIILJJIL(float f, Aweme aweme) {
        C88545Yp3 c88545Yp3;
        int i;
        Video video;
        if (((Number) IFZ.LIZ.getValue()).intValue() != 0 && ((c88545Yp3 = C88545Yp3.LIZIZ) == null || !c88545Yp3.isConnected())) {
            if (aweme != null && (video = aweme.getVideo()) != null) {
                i = video.getDuration();
            } else {
                i = 0;
            }
            if (i > TimeUnit.MINUTES.toMillis(1L) || f != 1.0f) {
                return true;
            }
        }
        return false;
    }
}
