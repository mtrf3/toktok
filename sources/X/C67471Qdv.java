package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.Qdv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67471Qdv implements InterfaceC67483Qe7 {
    public final C39119FWx LIZ;
    public final C67470Qdu LIZIZ;
    public final java.util.Map<String, InterfaceC67412Qcy> LIZJ;

    @Override // X.InterfaceC67483Qe7
    public final synchronized InterfaceC67412Qcy get(String str) {
        if (((HashMap) this.LIZJ).containsKey(str)) {
            return (InterfaceC67412Qcy) ((HashMap) this.LIZJ).get(str);
        }
        InterfaceC67474Qdy LIZ = this.LIZ.LIZ(str);
        if (LIZ == null) {
            return null;
        }
        C67470Qdu c67470Qdu = this.LIZIZ;
        InterfaceC67412Qcy create = LIZ.create(new C67472Qdw(c67470Qdu.LIZ, c67470Qdu.LIZIZ, c67470Qdu.LIZJ, str));
        ((HashMap) this.LIZJ).put(str, create);
        return create;
    }

    public C67471Qdv(Context context, C67470Qdu c67470Qdu) {
        C39119FWx c39119FWx = new C39119FWx(context);
        this.LIZJ = new HashMap();
        this.LIZ = c39119FWx;
        this.LIZIZ = c67470Qdu;
    }
}
