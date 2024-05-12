package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hks, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44970Hks implements F4V {
    public final InterfaceC88471Ynr<Effect, Boolean, C76800UCe> LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public C44970Hks(AqS189S0100000_7 aqS189S0100000_7) {
        this.LJLIL = aqS189S0100000_7;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        ERS LIZ = ern.LIZ(session);
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            if (t4q.LIZJ != EnumC44267HYx.RECOVER) {
                this.LJLIL.invoke(t4q.LIZ, Boolean.TRUE);
            }
        } else if (session instanceof T4R) {
            this.LJLIL.invoke(session.LIZ(), Boolean.FALSE);
        }
        return LIZ;
    }
}
