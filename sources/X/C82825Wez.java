package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.Wez, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82825Wez implements InterfaceC74398THu {
    public final /* synthetic */ C82823Wex LJLIL;

    public C82825Wez(C82823Wex c82823Wex) {
        this.LJLIL = c82823Wex;
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        C82823Wex c82823Wex = this.LJLIL;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        c82823Wex.LJII = true;
        InterfaceC46131I8p interfaceC46131I8p = c82823Wex.LIZLLL;
        if (interfaceC46131I8p != null) {
            interfaceC46131I8p.aX(true);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        C82823Wex c82823Wex = this.LJLIL;
        c82823Wex.LJII = false;
        InterfaceC46131I8p interfaceC46131I8p = c82823Wex.LIZLLL;
        if (interfaceC46131I8p != null) {
            interfaceC46131I8p.aX(false);
        }
        this.LJLIL.LIZJ.Sl(true, true);
        WRQ wrq = this.LJLIL.LJFF;
        if (wrq != null) {
            Boolean bool = Boolean.TRUE;
            wrq.cY(bool, bool);
        }
        C82823Wex c82823Wex2 = this.LJLIL;
        TEA tea = TEA.DOWNLOAD_SUCCESS;
        c82823Wex2.getClass();
        C10K.LIZJ(new TKD(effect, c82823Wex2, tea, null));
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        C82823Wex c82823Wex = this.LJLIL;
        c82823Wex.LJII = true;
        C10K.LIZJ(new TKD(effect, c82823Wex, TEA.DOWNLOADING, Integer.valueOf(i)));
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        C82823Wex c82823Wex = this.LJLIL;
        c82823Wex.LJII = false;
        InterfaceC46131I8p interfaceC46131I8p = c82823Wex.LIZLLL;
        if (interfaceC46131I8p != null) {
            interfaceC46131I8p.aX(false);
        }
    }
}
