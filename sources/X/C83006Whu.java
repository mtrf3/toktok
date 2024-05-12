package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Whu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83006Whu implements InterfaceC83010Why {
    public final /* synthetic */ InterfaceC40311Frv LIZ;

    public C83006Whu(InterfaceC40311Frv interfaceC40311Frv) {
        this.LIZ = interfaceC40311Frv;
    }

    @Override // X.InterfaceC83010Why
    public final void LIZ(C83008Whw c83008Whw) {
        String str = c83008Whw.LIZ;
        switch (str.hashCode()) {
            case -1987107780:
                if (!str.equals("onMessaged")) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("socketTaskID", c83008Whw.LIZIZ);
                String str2 = c83008Whw.LIZLLL;
                if (str2 != null) {
                    hashMap.put("data", str2);
                }
                String str3 = c83008Whw.LJ;
                if (str3 != null) {
                    hashMap.put("dataType", str3);
                }
                this.LIZ.LIZ(new C78529Urt(new JSONObject(hashMap)), "x.socketDataReceived");
                return;
            case -1357520532:
                if (!str.equals("closed")) {
                    return;
                }
                HashMap LIZJ = C03660Ck.LIZJ("status", "closed");
                LIZJ.put("socketTaskID", c83008Whw.LIZIZ);
                LIZJ.put("message", c83008Whw.LIZJ);
                this.LIZ.LIZ(new C78529Urt(new JSONObject(LIZJ)), "x.socketStatusChanged");
                return;
            case -1281977283:
                if (!str.equals("failed")) {
                    return;
                }
                HashMap LIZJ2 = C03660Ck.LIZJ("status", "failed");
                LIZJ2.put("message", c83008Whw.LIZJ);
                LIZJ2.put("socketTaskID", c83008Whw.LIZIZ);
                this.LIZ.LIZ(new C78529Urt(new JSONObject(LIZJ2)), "x.socketStatusChanged");
                return;
            case -579210487:
                if (!str.equals("connected")) {
                    return;
                }
                HashMap LIZJ3 = C03660Ck.LIZJ("status", "connected");
                LIZJ3.put("socketTaskID", c83008Whw.LIZIZ);
                this.LIZ.LIZ(new C78529Urt(new JSONObject(LIZJ3)), "x.socketStatusChanged");
                return;
            default:
                return;
        }
    }
}
