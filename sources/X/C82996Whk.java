package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Whk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82996Whk {
    public final /* synthetic */ C82998Whm LIZ;
    public final /* synthetic */ VJ0 LIZIZ;
    public final /* synthetic */ InterfaceC40311Frv LIZJ;
    public final /* synthetic */ C82997Whl LIZLLL;

    public final void LIZ() {
        this.LIZIZ.onSuccess(new C61335O5j(), "");
        C82998Whm c82998Whm = this.LIZ;
        InterfaceC40311Frv interfaceC40311Frv = this.LIZJ;
        String str = this.LIZLLL.LIZIZ;
        c82998Whm.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("status", "closed");
        if (str != null) {
            hashMap.put("socketTaskID", str);
        }
        C78529Urt c78529Urt = new C78529Urt(new JSONObject(hashMap));
        if (interfaceC40311Frv != null) {
            interfaceC40311Frv.LIZ(c78529Urt, "x.socketStatusChanged");
        }
    }

    public C82996Whk(C82998Whm c82998Whm, C82994Whi c82994Whi, InterfaceC40311Frv interfaceC40311Frv, C82997Whl c82997Whl) {
        this.LIZ = c82998Whm;
        this.LIZIZ = c82994Whi;
        this.LIZJ = interfaceC40311Frv;
        this.LIZLLL = c82997Whl;
    }
}
