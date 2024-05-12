package com.ss.android.ugc.aweme.refactor.integration;

import X.AbstractC39351FcR;
import X.C40741Fyr;
import X.C40745Fyv;
import X.C40765FzF;
import X.EnumC35461Dvt;
import X.EnumC40761FzB;
import X.G04;
import X.G1X;
import X.X1D;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FlowStepMonitorServiceImpl extends ViewModel implements G1X {
    public EnumC40761FzB LJLIL;
    public EnumC40761FzB LJLILLLLZI;

    @Override // X.G1H
    public final void onStart() {
    }

    @Override // X.G1X
    public final int c60() {
        EnumC40761FzB enumC40761FzB = this.LJLIL;
        if (enumC40761FzB != null) {
            return enumC40761FzB.getId();
        }
        return -1;
    }

    @Override // X.G1H
    public final void onComplete() {
        int i;
        Keva keva = AbstractC39351FcR.LJIIJ;
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        EnumC40761FzB enumC40761FzB = this.LJLIL;
        if (enumC40761FzB != null) {
            i = enumC40761FzB.getId();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        c40765FzF.getClass();
        keva.storeString("last_step", C40765FzF.LIZIZ(valueOf));
    }

    @Override // X.G1H
    public final void Di0(G04<?> nujComponent) {
        o.LJIIIZ(nujComponent, "nujComponent");
        if (nujComponent.LIZJ()) {
            this.LJLIL = this.LJLILLLLZI;
            this.LJLILLLLZI = nujComponent.type();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onComponentExecute lastShownPage:");
        LIZ.append(this.LJLIL);
        LIZ.append(",currentShowingPage:");
        LIZ.append(this.LJLILLLLZI);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.G1H
    public final void OS(EnumC35461Dvt error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.G1H
    public final void gb0(G04<?> nujComponent, C40745Fyv c40745Fyv) {
        o.LJIIIZ(nujComponent, "nujComponent");
    }
}
