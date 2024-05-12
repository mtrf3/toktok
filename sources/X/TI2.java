package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes13.dex */
public final class TI2 implements InterfaceC74400THw {
    public final /* synthetic */ TIA LJLIL;
    public final /* synthetic */ TID LJLILLLLZI;

    @Override // X.InterfaceC74400THw
    public final void LJJLIIIJILLIZJL(Effect effect) {
        String str;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultStickerSelectedController#downloadSticker:onHitCache:effectId:");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        InterfaceC74398THu interfaceC74398THu = this.LJLILLLLZI.LJI;
        if (interfaceC74398THu instanceof InterfaceC74400THw) {
            ((InterfaceC74400THw) interfaceC74398THu).LJJLIIIJILLIZJL(effect);
        } else if (interfaceC74398THu != null) {
            interfaceC74398THu.onSuccess(effect);
        }
        this.LJLIL.LJFF(this.LJLILLLLZI);
        TI3 LJJIZ = this.LJLIL.LIZLLL.LJJIZ();
        if (LJJIZ != null) {
            LJJIZ.LLJLIL(effect);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        InterfaceC74398THu interfaceC74398THu = this.LJLILLLLZI.LJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.LLILLIZIL(effect);
        }
        TI3 LJJIZ = this.LJLIL.LIZLLL.LJJIZ();
        if (LJJIZ != null) {
            LJJIZ.LLJJLIIIJLLLLLLLZ(effect);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        String str;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultStickerSelectedController#downloadSticker:onSuccess:effectId:");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        InterfaceC74398THu interfaceC74398THu = this.LJLILLLLZI.LJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.onSuccess(effect);
        }
        this.LJLIL.LJFF(this.LJLILLLLZI);
        TI3 LJJIZ = this.LJLIL.LIZLLL.LJJIZ();
        if (LJJIZ != null) {
            LJJIZ.LLJLIL(effect);
        }
    }

    public TI2(TIA tia, TID tid) {
        this.LJLIL = tia;
        this.LJLILLLLZI = tid;
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        InterfaceC74398THu interfaceC74398THu = this.LJLILLLLZI.LJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.LJFF(i, effect);
        }
        TI3 LJJIZ = this.LJLIL.LIZLLL.LJJIZ();
        if (LJJIZ != null) {
            LJJIZ.LLJL(effect);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        String str;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultStickerSelectedController#downloadSticker:onFailed:effectId:");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(":exception:");
        LIZ.append(exceptionResult.getException());
        LIZLLL.i(X1D.LIZIZ(LIZ));
        InterfaceC74398THu interfaceC74398THu = this.LJLILLLLZI.LJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.LJLIIL(effect, exceptionResult);
        }
        TI3 LJJIZ = this.LJLIL.LIZLLL.LJJIZ();
        if (LJJIZ != null) {
            LJJIZ.LLJLIL(effect);
        }
    }
}
