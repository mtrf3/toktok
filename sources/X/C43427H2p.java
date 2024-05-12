package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import kotlin.jvm.internal.o;

/* renamed from: X.H2p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43427H2p implements InterfaceC133905Ni {
    public final /* synthetic */ C43422H2k LJLIL;
    public final /* synthetic */ SynthetiseResult LJLILLLLZI;
    public final /* synthetic */ InterfaceC153045zY LJLJI;

    public C43427H2p(C43422H2k c43422H2k, SynthetiseResult synthetiseResult, InterfaceC153045zY interfaceC153045zY) {
        this.LJLIL = c43422H2k;
        this.LJLILLLLZI = synthetiseResult;
        this.LJLJI = interfaceC153045zY;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String msg) {
        o.LJIIIZ(msg, "msg");
        if (this.LJLIL.LJIJJLI != H3D.CaptionSynthesis) {
            return;
        }
        SynthetiseResult m157clone = this.LJLILLLLZI.m157clone();
        o.LJIIIIZZ(m157clone, "result.clone()");
        m157clone.ret = O6R.LJJIIZ(f);
        if (i2 == -214) {
            C44739Hh9.LIZ = true;
        }
        this.LJLIL.LJII().LIZLLL().LIZJ();
        C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7(this.LJLJI, 98), 37));
        C43422H2k c43422H2k = this.LJLIL;
        C43342Gzi c43342Gzi = new C43342Gzi();
        c43342Gzi.LIZ = m157clone;
        StringBuilder LIZJ = C06460Ne.LIZJ("compile video with captions failed. type = ", i, " ext = ", i2, " f = ");
        LIZJ.append(f);
        LIZJ.append(" msg = ");
        LIZJ.append(msg);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        if (LIZIZ != null) {
            c43342Gzi.LIZJ = LIZIZ;
        }
        c43422H2k.LJIILJJIL(c43342Gzi.LIZ());
    }
}
