package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fgn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39621Fgn implements F4V, InterfaceC81397Vx3 {
    public final List<AbstractC39622Fgo> LJLIL = new ArrayList();

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        return ern.LIZ(session);
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i != 41) {
            return;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("EffectChannelListener INTERACTION msg: ", i, " , ", i2, " , ");
        LIZJ.append(i3);
        LIZJ.append(" , ");
        LIZJ.append(str);
        H7B.LJ(X1D.LIZIZ(LIZJ));
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            AbstractC39622Fgo abstractC39622Fgo = (AbstractC39622Fgo) it.next();
            if (str == null) {
                abstractC39622Fgo.getClass();
            } else if (abstractC39622Fgo.LIZ() || !C1DG.LJIIIIZZ()) {
                if (o.LJ(abstractC39622Fgo.LIZIZ(), new JSONObject(str).optString("interface"))) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Effect interface: ");
                    LIZ.append(abstractC39622Fgo.LIZIZ());
                    LIZ.append(" handle msg: ");
                    LIZ.append(i);
                    C1EU.LIZJ(LIZ, " , ", i2, " , ", i3);
                    LIZ.append(" , ");
                    LIZ.append(str);
                    H7B.LJ(X1D.LIZIZ(LIZ));
                    abstractC39622Fgo.LIZJ(i3, str);
                }
            }
        }
    }
}
