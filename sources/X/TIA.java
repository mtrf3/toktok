package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIA implements InterfaceC46204IBk {
    public final TIJ LIZ;
    public final List<TGR> LIZIZ;
    public final List<TII> LIZJ;
    public final TEZ LIZLLL;
    public final InterfaceC88471Ynr<Effect, String, C76800UCe> LJ;

    @Override // X.InterfaceC46204IBk
    public final void LIZ(TGR tgr) {
        ((ArrayList) this.LIZIZ).remove(tgr);
    }

    @Override // X.InterfaceC46204IBk
    public final void LIZIZ(TGR tgr) {
        if (!((ArrayList) this.LIZIZ).contains(tgr)) {
            ((ArrayList) this.LIZIZ).add(tgr);
        }
    }

    @Override // X.InterfaceC46204IBk
    public final <T> void LIZJ(InterfaceC46243ICx<T> request) {
        InterfaceC88471Ynr<Effect, String, C76800UCe> interfaceC88471Ynr;
        o.LJIIIZ(request, "request");
        TIH LJ = LJ(this.LIZJ, request);
        if (!LJ.LJLIL) {
            if (request instanceof TIF) {
                this.LIZLLL.LJIIIIZZ().LJIIIIZZ(null);
                TIF tif = (TIF) request;
                Effect effect = tif.LIZ;
                this.LIZLLL.LJIIIIZZ().LJIILJJIL(null);
                if (!this.LIZLLL.LJIIIIZZ().LIZIZ(effect)) {
                    Iterator it = ((ArrayList) this.LIZIZ).iterator();
                    while (it.hasNext()) {
                        ((TGR) it.next()).LIZIZ(new T4R(effect, tif.LIZIZ, tif.LIZJ, false, tif.LIZLLL));
                    }
                    return;
                }
                return;
            }
            if (request instanceof TID) {
                TID tid = (TID) request;
                this.LIZLLL.LJIIIIZZ().LJIIIIZZ(tid.LIZIZ);
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DefaultStickerSelectedController#downloadSticker:effectId:");
                LIZ.append(tid.LIZIZ.getEffectId());
                LIZLLL.i(X1D.LIZIZ(LIZ));
                TI2 ti2 = new TI2(this, tid);
                Effect effect2 = tid.LIZIZ;
                if (effect2.getEffectType() == 1 || effect2.getEffectType() == 2 || effect2.getEffectType() == -1) {
                    C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DefaultStickerSelectedController#downloadSticker:shouldNotDownloadEffect:effectId:");
                    LIZ2.append(tid.LIZIZ.getEffectId());
                    LIZLLL2.i(X1D.LIZIZ(LIZ2));
                    ti2.onSuccess(tid.LIZIZ);
                    return;
                }
                this.LIZLLL.LJJIIJ(new C74397THt(tid.LIZIZ, false, tid, 2), ti2);
                return;
            }
            return;
        }
        Effect LIZJ = request.LIZJ();
        if (!(LIZJ instanceof Effect) || LIZJ == null || (interfaceC88471Ynr = this.LJ) == null) {
            return;
        }
        interfaceC88471Ynr.invoke(LIZJ, LJ.LJLILLLLZI);
    }

    @Override // X.InterfaceC46204IBk
    public final void LIZLLL(TII tii) {
        if (!((ArrayList) this.LIZJ).contains(tii)) {
            ((ArrayList) this.LIZJ).add(tii);
        }
    }

    public final void LJFF(TID tid) {
        if (!tid.LJIIIZ) {
            return;
        }
        TIB tib = new TIB(this, tid);
        Effect effect = tid.LIZIZ;
        if (effect.getEffectType() != 1 && effect.getEffectType() != 2 && effect.getEffectType() != -1) {
            this.LIZLLL.LIZLLL(tid.LIZIZ);
        }
        tib.LJJJJI();
    }

    public static TIH LJ(List list, InterfaceC46243ICx interfaceC46243ICx) {
        Iterator it = ((ArrayList) list).iterator();
        String str = "";
        boolean z = false;
        while (it.hasNext()) {
            TIH LIZ = ((TII) it.next()).LIZ(interfaceC46243ICx);
            if (z || LIZ.LJLIL) {
                z = true;
            } else {
                z = false;
            }
            String str2 = LIZ.LJLILLLLZI;
            if (str2 != null) {
                str = C0F0.LIZLLL(str, str2, '|');
            }
        }
        return new TIH(z, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TIA(TEZ stickerDataManager, TIJ tij, InterfaceC88471Ynr<? super Effect, ? super String, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LIZLLL = stickerDataManager;
        this.LJ = interfaceC88471Ynr;
        this.LIZ = tij == null ? TIC.LIZ : tij;
        this.LIZIZ = new ArrayList();
        this.LIZJ = new ArrayList();
    }
}
