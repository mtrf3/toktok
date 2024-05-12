package X;

import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Y7U implements Y7Q {
    public final /* synthetic */ Y7W LIZ;

    public Y7U(Y7W y7w) {
        this.LIZ = y7w;
    }

    @Override // X.Y7Q
    public final void LIZ(C39867Fkl c39867Fkl) {
        JSONObject jSONObject;
        Iterator<InterfaceC86859Y7b> it = this.LIZ.LJFF.iterator();
        while (it.hasNext()) {
            InterfaceC86859Y7b next = it.next();
            String str = null;
            if (c39867Fkl == null) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = c39867Fkl.LIZ;
                    str = c39867Fkl.LIZIZ;
                } catch (Throwable th) {
                    C39048FUe.LIZIZ.LIZ(C25620zW.LIZ("onInit callback failed ", th), EnumC39866Fkk.E, "HybridSettings");
                }
            }
            next.LIZIZ(str, jSONObject);
        }
    }

    @Override // X.Y7Q
    public final void LIZIZ(C39867Fkl c39867Fkl) {
        Iterator<InterfaceC86859Y7b> it = this.LIZ.LJFF.iterator();
        while (it.hasNext()) {
            InterfaceC86859Y7b next = it.next();
            try {
                next.LIZJ(c39867Fkl.LIZIZ, c39867Fkl.LIZ);
            } catch (Throwable th) {
                C39048FUe.LIZIZ.LIZ(C25620zW.LIZ("onConfigUpdate callback failed ", th), EnumC39866Fkk.E, "HybridSettings");
            }
        }
        this.LIZ.LIZLLL.set(false);
        this.LIZ.LIZLLL(true);
    }
}
