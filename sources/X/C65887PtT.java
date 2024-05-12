package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PtT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65887PtT extends AbstractC65440PmG {
    public C65887PtT(C65884PtQ c65884PtQ) {
        super(c65884PtQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65440PmG
    public final C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt<?> c64797Pbt) {
        boolean z;
        String str;
        String str2;
        C65436PmC c65436PmC;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (C52283KfX.LIZ() && (c65436PmC = c65441PmH.LIZ) != null && ((c65436PmC.LIZ == 1091 || c65436PmC.LIZ == 1092 || c65436PmC.LIZ == 1093) && c64797Pbt != null)) {
            T t = c64797Pbt.LIZIZ;
            o.LJII(t, "null cannot be cast to non-null type kotlin.String");
            try {
                str3 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject((String) t), "data"), "user_id");
                o.LJIIIIZZ(str3, "{\n        val jsonBody =…etString(\"user_id\")\n    }");
            } catch (IOException unused) {
                str3 = "";
            }
            T t2 = c64797Pbt.LIZIZ;
            o.LJII(t2, "null cannot be cast to non-null type kotlin.String");
            try {
                str4 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject((String) t2), "data"), "verify_ticket");
                o.LJIIIIZZ(str4, "{\n        val jsonBody =…ng(\"verify_ticket\")\n    }");
            } catch (IOException unused2) {
                str4 = "";
            }
            T t3 = c64797Pbt.LIZIZ;
            o.LJII(t3, "null cannot be cast to non-null type kotlin.String");
            try {
                str5 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject((String) t3), "data"), "user_nick_name");
                o.LJIIIIZZ(str5, "{\n        val jsonBody =…g(\"user_nick_name\")\n    }");
            } catch (IOException unused3) {
                str5 = "";
            }
            T t4 = c64797Pbt.LIZIZ;
            o.LJII(t4, "null cannot be cast to non-null type kotlin.String");
            try {
                String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject((String) t4), "data"), "passport_domain");
                o.LJIIIIZZ(string, "{\n        val jsonBody =…(\"passport_domain\")\n    }");
                str6 = string;
            } catch (IOException unused4) {
            }
            C2U8.LIZ(new C62950OnC(str3, str4, str5, str6));
            return new C65442PmI(true, false);
        }
        C65436PmC c65436PmC2 = c65441PmH.LIZ;
        if (c65436PmC2 != null) {
            if (c65436PmC2.LIZ == 9) {
                z = true;
            } else {
                z = false;
            }
            EJ6 ej6 = null;
            if (z) {
                C2U8.LIZ(new C62950OnC());
                try {
                    List<EJ6> headers = request.getHeaders();
                    if (headers != null) {
                        ej6 = (EJ6) OJ4.LJJJIL(OJ4.LJJJJ(ORZ.LJLIIIL(headers), EJQ.LJLIL));
                    }
                    C198517qh c198517qh = new C198517qh();
                    String path = request.getPath();
                    if (path == null) {
                        path = "";
                    }
                    c198517qh.LIZ.put("URL", path);
                    c198517qh.LIZ.put("errorCode", 8);
                    if (ej6 == null || (str2 = ej6.LIZIZ) == null) {
                        str2 = "";
                    }
                    c198517qh.LIZ.put("x-tt-logid", str2);
                    JSONObject eventJson = c198517qh.LJ();
                    o.LJIIIIZZ(eventJson, "eventJson");
                    Q13.LIZIZ("request_force_logout_log", 0, eventJson);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C198517qh c198517qh2 = new C198517qh();
                    String path2 = request.getPath();
                    if (path2 != null) {
                        str6 = path2;
                    }
                    c198517qh2.LIZ.put("URL", str6);
                    c198517qh2.LIZ.put("errorCode", 9);
                    c198517qh2.LIZ.put("error_desc", android.util.Log.getStackTraceString(e));
                    C09900aA.LJIIJJI("request_force_logout_log", 0, c198517qh2.LJ());
                }
                return new C65442PmI(true, false);
            }
            if (c65436PmC2 != null) {
                if (c65436PmC2.LIZ == 14) {
                    if (c65436PmC2 != null && (str = c65436PmC2.LIZIZ) != null) {
                        str6 = str;
                    }
                    C2U8.LIZ(new C56277M6v(str6));
                    return new C65442PmI(true, false);
                }
                if (c65436PmC2.LIZ == 3026005 && C19N.LJ("account_location_write_block", false)) {
                    C2U8.LIZ(new IK4());
                }
            }
        }
        return AbstractC65440PmG.LIZIZ;
    }
}
