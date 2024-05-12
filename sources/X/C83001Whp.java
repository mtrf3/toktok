package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Whp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83001Whp {
    public final /* synthetic */ C83004Whs LIZ;
    public final /* synthetic */ InterfaceC40311Frv LIZIZ;
    public final /* synthetic */ C83003Whr LIZJ;

    public final void LIZ(String str) {
        C83004Whs c83004Whs = this.LIZ;
        InterfaceC40311Frv interfaceC40311Frv = this.LIZIZ;
        String str2 = this.LIZJ.LIZ;
        if (str2 != null) {
            c83004Whs.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("status", "failed");
            hashMap.put("message", str);
            hashMap.put("socketTaskID", str2);
            C78529Urt c78529Urt = new C78529Urt(new JSONObject(hashMap));
            if (interfaceC40311Frv != null) {
                interfaceC40311Frv.LIZ(c78529Urt, "x.socketStatusChanged");
                return;
            }
            return;
        }
        o.LJIJI("socketTaskID");
        throw null;
    }

    public C83001Whp(C83004Whs c83004Whs, InterfaceC40311Frv interfaceC40311Frv, C83003Whr c83003Whr) {
        this.LIZ = c83004Whs;
        this.LIZIZ = interfaceC40311Frv;
        this.LIZJ = c83003Whr;
    }
}
