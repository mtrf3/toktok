package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("underage_recovery_flow")
/* renamed from: X.FuP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40465FuP extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI = 105;

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
        return this.LJLJI;
    }

    public C40465FuP(ActivityC45651qj activityC45651qj, AqS156S0100000_6 aqS156S0100000_6) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = aqS156S0100000_6;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.invoke();
    }
}
