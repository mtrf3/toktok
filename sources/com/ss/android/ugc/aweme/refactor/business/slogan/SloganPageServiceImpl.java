package com.ss.android.ugc.aweme.refactor.business.slogan;

import X.C40741Fyr;
import X.C40745Fyv;
import X.C40750Fz0;
import X.C40751Fz1;
import X.C76800UCe;
import X.EnumC35461Dvt;
import X.EnumC40761FzB;
import X.G04;
import X.G08;
import X.G15;
import X.G1H;
import X.InterfaceC65784Pro;
import X.X1D;
import android.os.SystemClock;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SloganPageServiceImpl extends ViewModel implements G1H, G08 {
    public InterfaceC65784Pro<C76800UCe> LJLIL = C40750Fz0.LJLIL;
    public long LJLILLLLZI = Long.MAX_VALUE;

    @Override // X.G1H
    public final void onComplete() {
    }

    @Override // X.G1H
    public final void onStart() {
    }

    @Override // X.G08
    public final long Z1() {
        return SystemClock.elapsedRealtime() - this.LJLILLLLZI;
    }

    @Override // X.G1H
    public final void Di0(G04<?> nujComponent) {
        o.LJIIIZ(nujComponent, "nujComponent");
        if (nujComponent.type() != EnumC40761FzB.JOURNEY_SLOGAN_ID && nujComponent.LIZJ()) {
            this.LJLIL.invoke();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(nujComponent.type());
            LIZ.append(" run, call onSloganScreenFinish");
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
            G15 g15 = C40751Fz1.LIZ;
            if (g15 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("unregisterListener flowListener:");
                LIZ2.append(this);
                C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
                g15.LIZLLL.remove(this);
            }
        }
    }

    @Override // X.G08
    public final void Fn0(long j) {
        this.LJLILLLLZI = j;
    }

    @Override // X.G1H
    public final void OS(EnumC35461Dvt error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.G08
    public final void zz(AqS156S0100000_6 aqS156S0100000_6) {
        this.LJLIL = aqS156S0100000_6;
        G15 g15 = C40751Fz1.LIZ;
        if (g15 != null) {
            g15.LIZLLL(this);
        }
    }

    @Override // X.G1H
    public final void gb0(G04<?> nujComponent, C40745Fyv c40745Fyv) {
        o.LJIIIZ(nujComponent, "nujComponent");
    }
}
