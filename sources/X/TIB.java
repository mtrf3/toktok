package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIB implements InterfaceC43949HMr {
    public final /* synthetic */ TIA LJLIL;
    public final /* synthetic */ TID LJLILLLLZI;

    @Override // X.InterfaceC43949HMr
    public final void LJJJJI() {
        Effect LJJIIZI;
        int i;
        InterfaceC43949HMr interfaceC43949HMr = this.LJLILLLLZI.LJII;
        if (interfaceC43949HMr != null) {
            interfaceC43949HMr.LJJJJI();
        }
        TIA tia = this.LJLIL;
        TIG LIZ = tia.LIZ.LIZ(tia.LIZLLL, this.LJLILLLLZI.LIZIZ);
        if (!LIZ.LJLIL) {
            InterfaceC88471Ynr<Effect, String, C76800UCe> interfaceC88471Ynr = this.LJLIL.LJ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(this.LJLILLLLZI.LIZIZ, LIZ.LJLILLLLZI);
                return;
            }
            return;
        }
        List<TII> list = this.LJLIL.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            it.next();
        }
        TIH LJ = TIA.LJ(arrayList, this.LJLILLLLZI);
        if (LJ.LJLIL) {
            InterfaceC88471Ynr<Effect, String, C76800UCe> interfaceC88471Ynr2 = this.LJLIL.LJ;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(this.LJLILLLLZI.LIZIZ, LJ.LJLILLLLZI);
                return;
            }
            return;
        }
        TIA tia2 = this.LJLIL;
        TID tid = this.LJLILLLLZI;
        tia2.getClass();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DefaultStickerSelectedController#useEffect:effectId:");
        LIZ2.append(tid.LIZIZ.getEffectId());
        LIZLLL.i(X1D.LIZIZ(LIZ2));
        Effect effect = tid.LIZIZ;
        int i2 = tid.LIZJ;
        if (TIP.LIZ(effect) && (LJJIIZI = tia2.LIZLLL.LJJIIZI()) != null && !ID0.LJIIZILJ(LJJIIZI) && (TextUtils.isEmpty(LJJIIZI.getParentId()) || (!o.LJ(LJJIIZI.getParentId(), effect.getParentId())))) {
            tia2.LIZJ(J8V.LJFF());
            tia2.LIZLLL.LJIIIIZZ().LJIIIIZZ(effect);
        }
        if (tia2.LIZLLL.LJIIIIZZ().LIZIZ(effect)) {
            Bundle bundle = tid.LJFF;
            if (bundle != null) {
                i = bundle.getInt("order", 1);
            } else {
                i = 1;
            }
            tia2.LIZLLL.LJIIIIZZ().LJIJ(i - 1, effect);
        } else {
            tia2.LIZLLL.LJIIIIZZ().LJIILJJIL(effect);
        }
        T4Q t4q = new T4Q(effect, i2, tid.LIZLLL, false, tid.LJFF);
        tia2.LIZLLL.LJIIIIZZ().LJIIZILJ(t4q);
        Iterator it2 = ((ArrayList) tia2.LIZIZ).iterator();
        while (it2.hasNext()) {
            TGR tgr = (TGR) it2.next();
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("DefaultStickerSelectedController#useEffect:listener:");
            LIZ3.append(tgr);
            LIZLLL2.i(X1D.LIZIZ(LIZ3));
            tgr.LIZ(t4q);
        }
        List<Effect> list2 = tid.LJ;
        if (list2 != null) {
            for (Effect effect2 : list2) {
                if (effect2 != null) {
                    tia2.LIZLLL.LJJIIJ(new C74397THt(effect2, true, tid), null);
                }
            }
        }
    }

    public TIB(TIA tia, TID tid) {
        this.LJLIL = tia;
        this.LJLILLLLZI = tid;
    }
}
