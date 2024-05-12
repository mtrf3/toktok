package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ES8 extends ESP implements InterfaceC81397Vx3 {
    public final InterfaceC88472Yns<Effect, Boolean> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public boolean LJLJJI;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJI = false;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        boolean booleanValue = this.LJLILLLLZI.invoke(session.LIZ).booleanValue();
        if (booleanValue) {
            this.LJLJI.invoke();
        }
        return booleanValue;
    }

    public ES8(AqS172S0100000_6 aqS172S0100000_6, AqS156S0100000_6 aqS156S0100000_6) {
        this.LJLILLLLZI = aqS172S0100000_6;
        this.LJLJI = aqS156S0100000_6;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJJI = false;
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 32785) {
            C6QQ.LIZ(new AqS156S0100000_6(this, 114));
        }
    }
}
