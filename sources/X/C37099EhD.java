package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.EhD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37099EhD {
    public static JSONObject LIZLLL(AbstractC37134Ehm abstractC37134Ehm) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : ((LinkedHashMap) abstractC37134Ehm.LJ()).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public static void LIZIZ(int i, AbstractC37134Ehm abstractC37134Ehm) {
        try {
            JSONObject LIZLLL = LIZLLL(abstractC37134Ehm);
            LIZLLL.put("status", i);
            LIZLLL.put("is_silent_install", abstractC37134Ehm.LJFF);
            LIZLLL.put("is_regain_install", abstractC37134Ehm.LIZJ);
            FMX.LJIILLIIL("df_install", LIZLLL);
            int i2 = 2;
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    if (i != 8) {
                        i2 = 4;
                    }
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 3;
            }
            C09900aA.LJIIJJI("df_install", i2, LIZLLL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZ(AbstractC37134Ehm abstractC37134Ehm, int i, String str) {
        if (abstractC37134Ehm == null) {
            return;
        }
        try {
            JSONObject LIZLLL = LIZLLL(abstractC37134Ehm);
            LIZLLL.put("operation", i);
            LIZLLL.put("is_silent_install", abstractC37134Ehm.LJFF);
            LIZLLL.put("extra_info", str);
            FMX.LJIILLIIL("df_downloader_op", LIZLLL);
            C09900aA.LJIIJJI("df_downloader_op", i, LIZLLL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.AbstractC37134Ehm r6, int r7, X.C37100EhE r8) {
        /*
            java.lang.String r3 = "df_state_change"
            org.json.JSONObject r2 = LIZLLL(r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = "pre_status"
            r2.put(r0, r7)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "status"
            int r0 = r8.LIZJ     // Catch: java.lang.Exception -> La8
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "is_silent_install"
            boolean r0 = r6.LJFF     // Catch: java.lang.Exception -> La8
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La8
            long r4 = r8.LJ     // Catch: java.lang.Exception -> La8
            long r0 = r8.LIZLLL     // Catch: java.lang.Exception -> La8
            java.lang.String r6 = "bytes_downloaded"
            r2.put(r6, r4)     // Catch: java.lang.Exception -> La8
            java.lang.String r6 = "bytes_to_download"
            r2.put(r6, r0)     // Catch: java.lang.Exception -> La8
            int r7 = r8.LIZJ     // Catch: java.lang.Exception -> La8
            r6 = 2
            if (r7 != r6) goto L38
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L9b
            java.lang.String r4 = "download_duration"
            long r0 = r8.LJFF     // Catch: java.lang.Exception -> La8
            r2.put(r4, r0)     // Catch: java.lang.Exception -> La8
            goto L9b
        L38:
            r0 = 6
            if (r7 == r0) goto L3d
            if (r7 != 0) goto L9b
        L3d:
            java.lang.String r1 = "error_code"
            int r0 = r8.LJI     // Catch: java.lang.Exception -> La8
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "error_msg"
            java.lang.Exception r0 = r8.LJIIIIZZ     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L6e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> La8
        L4e:
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r4 = "available_size"
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> La8
            long r0 = X.C268513p.LIZJ(r0)     // Catch: java.lang.Exception -> La8
            r2.put(r4, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r4 = "total_size"
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> La8
            long r0 = X.C268513p.LJ(r0)     // Catch: java.lang.Exception -> La8
            r2.put(r4, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r4 = "is_external_storage"
            goto L71
        L6e:
            java.lang.String r0 = ""
            goto L4e
        L71:
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> L82
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> L82
            int r1 = r0.flags     // Catch: java.lang.Exception -> L82
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 != r0) goto L82
            r0 = 1
            goto L83
        L82:
            r0 = 0
        L83:
            r2.put(r4, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "is_gp_install"
            X.5H3 r0 = X.EPA.LIZJ     // Catch: java.lang.Exception -> La8
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> La8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto La5
            java.lang.String r0 = "1"
        L98:
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La8
        L9b:
            X.FMX.LJIILLIIL(r3, r2)     // Catch: java.lang.Exception -> La8
            int r0 = r8.LIZJ     // Catch: java.lang.Exception -> La8
            X.C09900aA.LJIIJJI(r3, r0, r2)     // Catch: java.lang.Exception -> La8
            goto Lac
        La5:
            java.lang.String r0 = "0"
            goto L98
        La8:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37099EhD.LIZJ(X.Ehm, int, X.EhE):void");
    }
}
