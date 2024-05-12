package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import kotlin.jvm.internal.o;

/* renamed from: X.H2s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43430H2s implements C5SJ {
    public final /* synthetic */ C43422H2k LJLIL;
    public final /* synthetic */ SynthetiseResult LJLILLLLZI;
    public final /* synthetic */ InterfaceC153045zY LJLJI;

    public C43430H2s(C43422H2k c43422H2k, SynthetiseResult synthetiseResult, InterfaceC153045zY interfaceC153045zY) {
        this.LJLIL = c43422H2k;
        this.LJLILLLLZI = synthetiseResult;
        this.LJLJI = interfaceC153045zY;
    }

    @Override // X.C5SJ
    public final void LIZIZ(byte[] bytes, long j, int i, boolean z) {
        o.LJIIIZ(bytes, "bytes");
        try {
            XFL xfl = this.LJLIL.LJIILIIL;
            if (xfl != null) {
                xfl.LJIIIIZZ(bytes, j, i, z);
            } else {
                o.LJIJI("uploadStrategy");
                throw null;
            }
        } catch (Exception e) {
            SynthetiseResult m157clone = this.LJLILLLLZI.m157clone();
            o.LJIIIIZZ(m157clone, "compileResult.clone()");
            if (C42991Gu3.LIZ(e)) {
                m157clone.ret = 100101;
            } else {
                m157clone.ret = 1001;
            }
            this.LJLIL.LJIILJJIL(new C42990Gu2(e, m157clone));
            this.LJLIL.LJII().LIZLLL().LIZJ();
            C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7(this.LJLJI, 95), 37));
        }
    }
}
