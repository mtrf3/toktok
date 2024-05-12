package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_age_gate")
/* renamed from: X.FuM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40462FuM extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC40458FuI LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final int LJLJJI = 100;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = this.LJLIL;
        }
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            return C54081LKj.LIZ(LJIIIIZZ, (LifecycleOwner) LJIIIIZZ);
        }
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        FMX.onEventV3("age_gate_popup_task_executed");
        this.LJLJI.invoke();
    }

    @Override // X.M74
    public final void onPopupStateChanged(M7A fromState, M7A toState) {
        InterfaceC40458FuI interfaceC40458FuI;
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
        super.onPopupStateChanged(fromState, toState);
        if (toState == M7A.SHOWED) {
            InterfaceC40458FuI interfaceC40458FuI2 = this.LJLILLLLZI;
            if (interfaceC40458FuI2 != null) {
                interfaceC40458FuI2.LIZIZ();
                return;
            }
            return;
        }
        if (toState != M7A.DISMISSED || (interfaceC40458FuI = this.LJLILLLLZI) == null) {
            return;
        }
        interfaceC40458FuI.LIZ();
    }

    public C40462FuM(ActivityC45651qj activityC45651qj, C62967OnT c62967OnT, AqS157S0200000_10 aqS157S0200000_10) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = c62967OnT;
        this.LJLJI = aqS157S0200000_10;
    }
}
