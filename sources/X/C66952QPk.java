package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.QPk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66952QPk {
    public static volatile boolean LIZ = false;
    public static volatile boolean LIZIZ = true;
    public static java.util.Set<String> LIZJ = Q4K.LIZLLL();

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(12:7|(1:9)(1:117)|10|(6:12|(3:14|(1:16)(1:18)|17)|19|(1:21)(3:95|(1:97)|98)|22|(2:24|(1:26)))(6:99|(1:101)(1:116)|102|(1:104)|105|(4:107|(1:109)(2:113|(1:115))|110|(1:112)))|27|(1:29)(2:86|(6:94|(2:81|82)|32|33|(7:40|(4:43|(3:54|55|56)|57|41)|62|63|(3:65|(2:68|66)|69)|70|(3:72|(1:74)(1:77)|75))|78))|30|(0)|32|33|(9:35|38|40|(1:41)|62|63|(0)|70|(0))|78))|118|32|33|(0)|78) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:33:0x0121, B:35:0x0127, B:38:0x0131, B:40:0x0137, B:41:0x0151, B:43:0x0157, B:46:0x0168, B:49:0x016c, B:52:0x017e, B:55:0x0188, B:63:0x0192, B:65:0x0198, B:66:0x019c, B:68:0x01a2, B:70:0x01ac, B:72:0x01b2, B:75:0x01bd), top: B:32:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:33:0x0121, B:35:0x0127, B:38:0x0131, B:40:0x0137, B:41:0x0151, B:43:0x0157, B:46:0x0168, B:49:0x016c, B:52:0x017e, B:55:0x0188, B:63:0x0192, B:65:0x0198, B:66:0x019c, B:68:0x01a2, B:70:0x01ac, B:72:0x01b2, B:75:0x01bd), top: B:32:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:33:0x0121, B:35:0x0127, B:38:0x0131, B:40:0x0137, B:41:0x0151, B:43:0x0157, B:46:0x0168, B:49:0x016c, B:52:0x017e, B:55:0x0188, B:63:0x0192, B:65:0x0198, B:66:0x019c, B:68:0x01a2, B:70:0x01ac, B:72:0x01b2, B:75:0x01bd), top: B:32:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:33:0x0121, B:35:0x0127, B:38:0x0131, B:40:0x0137, B:41:0x0151, B:43:0x0157, B:46:0x0168, B:49:0x016c, B:52:0x017e, B:55:0x0188, B:63:0x0192, B:65:0x0198, B:66:0x019c, B:68:0x01a2, B:70:0x01ac, B:72:0x01b2, B:75:0x01bd), top: B:32:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66952QPk.LIZ(java.lang.String):java.util.Map");
    }

    public static void LIZIZ(String str, List<FBY> list) {
        C66953QPl c66953QPl;
        String str2;
        boolean z;
        if (LIZ) {
            C66953QPl c66953QPl2 = C66953QPl.LJZL;
            c66953QPl2.getClass();
            if (!C66953QPl.LLD || (c66953QPl = C66953QPl.LJZL) == null || !c66953QPl.LIZLLL(str)) {
                return;
            }
            C66953QPl c66953QPl3 = C66953QPl.LJZL;
            if (str != null) {
                c66953QPl3.LJLJJLL.getClass();
            } else {
                c66953QPl3.getClass();
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            String str3 = null;
            for (FBY fby : list) {
                if ("X-Tt-Token".equalsIgnoreCase(fby.LIZ)) {
                    str3 = fby.LIZIZ;
                }
                if (!TextUtils.isEmpty(str3)) {
                    Iterator<FBY> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            FBY next = it.next();
                            if ("X-Tt-Logid".equalsIgnoreCase(next.LIZ)) {
                                str2 = next.LIZIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("processResponseHeader logid = ");
                                LIZ2.append(str2);
                                FXA.LIZ("TokenFactory", X1D.LIZIZ(LIZ2));
                                break;
                            }
                        } else {
                            str2 = "";
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, c66953QPl2.LJLJJI)) {
                        c66953QPl2.LJFF(str3);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("token", C66953QPl.LIZIZ(str3));
                            jSONObject.put("logid", str2);
                            C79146V4k.LJJLI("tt_token_change", jSONObject);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        C66857QLt c66857QLt = c66953QPl2.LJZI;
                        c66857QLt.getClass();
                        C66856QLs c66856QLs = new C66856QLs(c66857QLt.LIZ);
                        c66856QLs.LIZIZ.put("X-Tt-Token", str3);
                        c66856QLs.LIZ();
                        if (!"change.token".equals(c66953QPl2.LJLJJI) && !TextUtils.isEmpty(c66953QPl2.LJLJJI)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c66953QPl2.LJLILLLLZI = z;
                    }
                    for (FBY fby2 : list) {
                        if ("x-tt-multi-sids".equalsIgnoreCase(fby2.LIZ)) {
                            String str4 = fby2.LIZIZ;
                            c66953QPl2.LJLJJL = str4;
                            C66857QLt c66857QLt2 = c66953QPl2.LJZI;
                            if (c66857QLt2 != null) {
                                C66856QLs c66856QLs2 = new C66856QLs(c66857QLt2.LIZ);
                                c66856QLs2.LIZIZ.put("x-tt-multi-sids", str4);
                                c66856QLs2.LIZ();
                            }
                        }
                    }
                    return;
                }
            }
        }
    }
}
