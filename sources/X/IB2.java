package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IB2 extends ESP {
    public Effect LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJL.invoke();
        this.LJLILLLLZI = null;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return V3N.LJJI(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJJLL.invoke();
        if (this.LJLILLLLZI != null) {
            this.LJLJJL.invoke();
        }
        if (this.LJLJI.invoke().booleanValue()) {
            this.LJLJJI.invoke(session.LIZ);
        }
        this.LJLILLLLZI = session.LIZ;
    }

    public IB2(C46198IBe shouldStartPreplay, AqS157S0100000_7 aqS157S0100000_7, AqS157S0100000_7 aqS157S0100000_72, AqS173S0100000_7 aqS173S0100000_7) {
        o.LJIIIZ(shouldStartPreplay, "shouldStartPreplay");
        this.LJLJI = shouldStartPreplay;
        this.LJLJJI = aqS173S0100000_7;
        this.LJLJJL = aqS157S0100000_7;
        this.LJLJJLL = aqS157S0100000_72;
    }
}
