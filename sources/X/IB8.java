package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IB8 implements F4V {
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public IB8(C46229ICj openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        this.LJLIL = openUrl;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            if (t4q.LIZ.getEffectType() == 2) {
                ERS LIZ = ern.LIZ(T4Q.LIZIZ(t4q));
                this.LJLIL.invoke(t4q.LIZ);
                return LIZ;
            }
        }
        return ern.LIZ(session);
    }
}
