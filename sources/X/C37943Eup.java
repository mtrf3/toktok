package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Eup, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37943Eup implements InterfaceC60617Nqf {
    public final HashMap<String, C38236EzY> LJLIL = new HashMap<>();

    public final void LIZJ() {
        for (Map.Entry<String, C38236EzY> entry : this.LJLIL.entrySet()) {
            if (entry.getValue().LJ) {
                O6R o6r = entry.getValue().LIZLLL;
                if (o6r != null) {
                    o6r.LJJIII();
                }
                entry.getValue().LIZLLL = null;
            }
        }
    }

    @Override // X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        o.LJIIJ(context, "context");
        Iterator<Map.Entry<String, C38236EzY>> it = this.LJLIL.entrySet().iterator();
        while (it.hasNext()) {
            O6R o6r = it.next().getValue().LIZLLL;
            if (o6r != null) {
                o6r.LJIJ(context);
            }
        }
    }

    public final boolean LIZIZ(C37955Ev1 call, String str, C37863EtX c37863EtX) {
        O6R o6r;
        o.LJIIJ(call, "call");
        C38236EzY c38236EzY = this.LJLIL.get(call.LIZLLL);
        if (c38236EzY != null && (o6r = c38236EzY.LIZLLL) != null) {
            C37945Eur c37945Eur = new C37945Eur(c37863EtX);
            o6r.LJJ(call.LIZLLL, str, c37945Eur);
            o6r.LJIL(call, str, c37945Eur);
            return true;
        }
        return false;
    }
}
