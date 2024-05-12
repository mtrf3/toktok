package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import kotlin.jvm.internal.o;

/* renamed from: X.H2r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43429H2r implements C5SJ {
    public final /* synthetic */ C43421H2j LJLIL;
    public final /* synthetic */ SynthetiseResult LJLILLLLZI;

    public C43429H2r(C43421H2j c43421H2j, SynthetiseResult synthetiseResult) {
        this.LJLIL = c43421H2j;
        this.LJLILLLLZI = synthetiseResult;
    }

    @Override // X.C5SJ
    public final void LIZIZ(byte[] bytes, long j, int i, boolean z) {
        H37 h37 = this.LJLIL.LJJIIZ;
        if (h37 != null) {
            o.LJIIIIZZ(bytes, "bytes");
            h37.LIZIZ(bytes, j, i, z);
            try {
                C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
                C41777GaT.LIZ();
                XFL xfl = this.LJLIL.LJIILL;
                if (xfl != null) {
                    xfl.LJIIIIZZ(bytes, j, i, z);
                    return;
                }
                return;
            } catch (Exception e) {
                SynthetiseResult m157clone = this.LJLILLLLZI.m157clone();
                o.LJIIIIZZ(m157clone, "compileResult.clone()");
                if (C42991Gu3.LIZ(e)) {
                    m157clone.ret = 100101;
                } else {
                    m157clone.ret = 1001;
                }
                this.LJLIL.LJIILIIL(new C42990Gu2(e, m157clone));
                C43421H2j c43421H2j = this.LJLIL;
                c43421H2j.getClass();
                C10K.LIZJ(new ACallableS110S0100000_7(c43421H2j, 45));
                return;
            }
        }
        o.LJIJI("timeoutMonitor");
        throw null;
    }
}
