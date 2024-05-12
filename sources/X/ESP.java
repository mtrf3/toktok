package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class ESP implements F4V {
    public Effect LJLIL;

    public void LJIIIZ(T4Q session) {
        o.LJIIIZ(session, "session");
    }

    public abstract boolean LJIIJ(T4Q t4q);

    public abstract void LJIIJJI();

    public abstract void LJIIL(ERS ers, T4Q t4q);

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.F4V
    public ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            if (LJIIJ(t4q)) {
                if (!(ern instanceof ESO)) {
                    LJIIIZ(t4q);
                }
                ERS LIZ = ern.LIZ(t4q);
                LJIIL(LIZ, t4q);
                this.LJLIL = t4q.LIZ;
                return LIZ;
            }
            if (this.LJLIL != null) {
                LJIIJJI();
                this.LJLIL = null;
            }
            ERS result = ern.LIZ(session);
            if (ern instanceof ESO) {
                return result;
            }
            o.LJIIIZ(result, "result");
            return result;
        }
        if (session instanceof T4R) {
            if (this.LJLIL != null) {
                LJIIJJI();
                this.LJLIL = null;
            }
            ERS result2 = ern.LIZ(session);
            if (ern instanceof ESO) {
                return result2;
            }
            o.LJIIIZ(result2, "result");
            return result2;
        }
        throw new C162476Zf();
    }
}
