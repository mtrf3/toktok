package X;

import android.os.SystemClock;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O2C {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(X.O26 r2, X.O1M r3) {
        /*
            java.lang.String r0 = r3.LJI
            boolean r0 = X.C39927Flj.LIZLLL(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = r3.LJI
            goto L39
        Lb:
            X.Nv3 r0 = r2.LJIILIIL
            r1 = 0
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.L()
        L14:
            boolean r0 = X.C39927Flj.LIZLLL(r0)
            if (r0 == 0) goto L25
            X.Nv3 r0 = r2.LJIILIIL
            if (r0 == 0) goto L39
            java.lang.String r1 = r0.L()
            goto L39
        L23:
            r0 = r1
            goto L14
        L25:
            android.net.Uri r0 = r2.LJI
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C39927Flj.LIZLLL(r0)
            if (r0 == 0) goto L39
            android.net.Uri r1 = r2.LJI
            java.lang.String r0 = "surl"
            java.lang.String r1 = X.C79043V0l.LJIJJ(r1, r0)
        L39:
            java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L48
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L46
            goto L48
        L46:
            r0 = 0
            goto L49
        L48:
            r0 = 1
        L49:
            if (r0 == 0) goto L4d
        L4b:
            java.lang.String r1 = "unknown"
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2C.LIZ(X.O26, X.O1M):java.lang.String");
    }

    public static void LIZIZ(JSONObject performanceInfo, O26 resInfo, O1M taskConfig, boolean z) {
        boolean z2;
        String str;
        String str2;
        String str3;
        o.LJIIJ(performanceInfo, "performanceInfo");
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_url", resInfo.LJI.toString());
        jSONObject.put("res_version", resInfo.LJIIJJI);
        if (taskConfig.LJFF.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str4 = null;
        if (z2) {
            jSONObject.put("res_channel", taskConfig.LJFF);
        } else {
            C60889Nv3 c60889Nv3 = resInfo.LJIILIIL;
            if (c60889Nv3 != null && c60889Nv3.LJLJI) {
                str = c60889Nv3.LJLIL;
            } else {
                str = null;
            }
            jSONObject.put("res_channel", str);
        }
        if (C39927Flj.LIZLLL(resInfo.LJII)) {
            String str5 = resInfo.LJII;
            if (str5 != null) {
                String LLLIILIL = OR7.LLLIILIL(new File(str5));
                Locale locale = Locale.ROOT;
                o.LJFF(locale, "Locale.ROOT");
                String lowerCase = LLLIILIL.toLowerCase(locale);
                o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                jSONObject.put("res_type", lowerCase);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            jSONObject.put("res_type", LIZ(resInfo, taskConfig));
        }
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        jSONObject.put("res_state", str2);
        jSONObject.put("res_from", resInfo.LIZ());
        if (resInfo instanceof O2Z) {
            jSONObject.put("res_memory", ((O2Z) resInfo).LJIJI);
        }
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_resourceloader_performance");
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJ = performanceInfo;
        C60737Nsb c60737Nsb = taskConfig.LJIIJJI;
        if (c60737Nsb == null) {
            str3 = "hybridkit_default_bid";
        } else {
            str3 = c60737Nsb.bid;
        }
        c79605VMb.LIZIZ = str3;
        C79604VMa LIZ2 = c79605VMb.LIZ();
        C60737Nsb c60737Nsb2 = taskConfig.LJIIJJI;
        if (c60737Nsb2 != null) {
            str4 = c60737Nsb2.containerId;
        }
        FD5.LJ(str4, LIZ2);
    }

    public static void LIZJ(O1M o1m, O26 o26, String str, boolean z) {
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject = new JSONObject();
        String LIZ2 = o26.LIZ();
        jSONObject.put("res_loader_name", "resource_loader");
        jSONObject.put("res_src", o26.LJI.toString());
        jSONObject.put("res_version", o26.LJIIJJI);
        jSONObject.put("res_tag", o1m.LJIIL);
        boolean z3 = false;
        if (o1m.LJFF.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str7 = null;
        if (z2) {
            jSONObject.put("res_channel", o1m.LJFF);
        } else {
            C60889Nv3 c60889Nv3 = o26.LJIILIIL;
            if (c60889Nv3 != null && c60889Nv3.LJLJI) {
                str2 = c60889Nv3.LJLIL;
            } else {
                str2 = null;
            }
            jSONObject.put("res_channel", str2);
        }
        if (o1m.LJI.length() > 0) {
            z3 = true;
        }
        if (z3) {
            jSONObject.put("res_bundle", o1m.LJI);
        } else {
            C60889Nv3 c60889Nv32 = o26.LJIILIIL;
            if (c60889Nv32 != null) {
                str3 = c60889Nv32.L();
            } else {
                str3 = null;
            }
            jSONObject.put("res_bundle", str3);
        }
        if (C39927Flj.LIZLLL(o26.LJII)) {
            String str8 = o26.LJII;
            if (str8 != null) {
                String LLLIILIL = OR7.LLLIILIL(new File(str8));
                Locale locale = Locale.ROOT;
                o.LJFF(locale, "Locale.ROOT");
                String lowerCase = LLLIILIL.toLowerCase(locale);
                o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                jSONObject.put("res_type", lowerCase);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            jSONObject.put("res_type", LIZ(o26, o1m));
        }
        if (o26 instanceof O2Z) {
            jSONObject.put("res_memory", ((O2Z) o26).LJIJI);
        }
        jSONObject.put("res_from", LIZ2);
        if (z) {
            str4 = "success";
        } else {
            str4 = "failed";
        }
        jSONObject.put("res_state", str4);
        if (!z && str != null) {
            jSONObject.put("res_error_msg", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("res_load_start", o26.LJIILL);
        jSONObject2.put("res_load_finish", SystemClock.uptimeMillis());
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_resource_load");
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJ = jSONObject2;
        C60737Nsb c60737Nsb = o1m.LJIIJJI;
        if (c60737Nsb == null) {
            str5 = "hybridkit_default_bid";
        } else {
            str5 = c60737Nsb.bid;
        }
        c79605VMb.LIZIZ = str5;
        if (c60737Nsb != null) {
            str6 = c60737Nsb.vaid;
        } else {
            str6 = null;
        }
        c79605VMb.LJIIIZ = str6;
        C79604VMa LIZ3 = c79605VMb.LIZ();
        C60737Nsb c60737Nsb2 = o1m.LJIIJJI;
        if (c60737Nsb2 != null) {
            str7 = c60737Nsb2.containerId;
        }
        FD5.LJ(str7, LIZ3);
    }
}
