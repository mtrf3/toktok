package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class ERM implements F4V, InterfaceC81397Vx3, ERP {
    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.ERP
    public final FaceStickerBean LIZ(Effect effect) {
        return ((ERD) this).LJLLJ;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        ERB erb;
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            ERS LIZ = ern.LIZ(session);
            Effect effect = ((T4Q) session).LIZ;
            ERD erd = (ERD) this;
            o.LJIIIZ(effect, "effect");
            erd.LIZIZ();
            erd.LJLL = effect;
            Iterator<ERO> it = erd.LJLJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    ERO next = it.next();
                    if (next.LIZIZ(effect)) {
                        erb = next.LIZ(effect);
                        break;
                    }
                } else {
                    erb = null;
                    break;
                }
            }
            erd.LJLLI = erb;
            if (erb != null) {
                ((ArrayList) erd.LJLJL).add(XKX.LIZLLL(erd.LJLJJLL, null, null, new EGK(erd, null), 3));
                return LIZ;
            }
            return LIZ;
        }
        if (session instanceof T4R) {
            if (session.LIZ() != null) {
                ((ERD) this).LIZIZ();
            }
            return ern.LIZ(session);
        }
        throw new C162476Zf();
    }
}
