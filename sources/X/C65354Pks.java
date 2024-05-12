package X;

import android.app.Application;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import okhttp3.Request;
import org.json.JSONObject;

/* renamed from: X.Pks, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65354Pks {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static HybridSettingInitConfig LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final String LIZLLL;
    public static final java.util.Map<String, String> LJ;
    public static final C65354Pks LJFF;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        TBT tbt = new TBT(C65352Pkq.LIZ(C65354Pks.class), "client", "getClient()Lokhttp3/OkHttpClient;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
        LJFF = new C65354Pks();
        LIZJ = C221108m2.LIZIZ(C48017Isv.LJLIL);
        LIZLLL = "/monitor/data/validation";
        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
        o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
        Application application = hybridMultiMonitor.getApplication();
        OSZ[] oszArr = new OSZ[10];
        String name = EnumC65356Pku.EVENT_CREATE.name();
        String str10 = null;
        if (application != null) {
            str = application.getString(R.string.g62);
        } else {
            str = null;
        }
        oszArr[0] = new OSZ(name, str);
        String name2 = EnumC65356Pku.EVENT_UPLOAD.name();
        if (application != null) {
            str2 = application.getString(R.string.g6g);
        } else {
            str2 = null;
        }
        oszArr[1] = new OSZ(name2, str2);
        String name3 = EnumC65356Pku.SAMPLE_THROW.name();
        if (application != null) {
            str3 = application.getString(R.string.q8e);
        } else {
            str3 = null;
        }
        oszArr[2] = new OSZ(name3, str3);
        String name4 = EnumC65356Pku.EVENT_TERMINATED.name();
        if (application != null) {
            str4 = application.getString(R.string.g6c);
        } else {
            str4 = null;
        }
        oszArr[3] = new OSZ(name4, str4);
        String name5 = EnumC65355Pkt.SWITCH_OFF.name();
        if (application != null) {
            str5 = application.getString(R.string.rz4);
        } else {
            str5 = null;
        }
        oszArr[4] = new OSZ(name5, str5);
        String name6 = EnumC65355Pkt.PARAM_EXCEPTION.name();
        if (application != null) {
            str6 = application.getString(R.string.jec);
        } else {
            str6 = null;
        }
        oszArr[5] = new OSZ(name6, str6);
        String name7 = EnumC65355Pkt.CATCH_EXCEPTION.name();
        if (application != null) {
            str7 = application.getString(R.string.chu);
        } else {
            str7 = null;
        }
        oszArr[6] = new OSZ(name7, str7);
        String name8 = EnumC65355Pkt.EVENT_REPEATED.name();
        if (application != null) {
            str8 = application.getString(R.string.g6b);
        } else {
            str8 = null;
        }
        oszArr[7] = new OSZ(name8, str8);
        String name9 = EnumC65355Pkt.INVALID_CASE.name();
        if (application != null) {
            str9 = application.getString(R.string.hil);
        } else {
            str9 = null;
        }
        oszArr[8] = new OSZ(name9, str9);
        String name10 = EnumC65355Pkt.BLOCK_LIST.name();
        if (application != null) {
            str10 = application.getString(R.string.hil);
        }
        oszArr[9] = new OSZ(name10, str10);
        LJ = C113554cx.LJJJLZIJ(oszArr);
    }

    public static C64598PWw LIZ(C64587PWl c64587PWl) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", c64587PWl, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-7604648455833477896"));
        return LIZJ2.LIZ ? (C64598PWw) LIZJ2.LIZIZ : c64587PWl.execute();
    }

    public static void LIZIZ(String str) {
        String str2;
        PVJ LIZJ2 = PVP.LIZJ(C39745Fin.LIZJ("application/json"), str);
        C64618PXq c64618PXq = new C64618PXq();
        HybridSettingInitConfig hybridSettingInitConfig = LIZIZ;
        if (hybridSettingInitConfig != null) {
            str2 = hybridSettingInitConfig.LIZIZ;
        } else {
            str2 = null;
        }
        c64618PXq.LJII(o.LJIILLIIL(LIZLLL, str2));
        c64618PXq.LJ("POST", LIZJ2);
        c64618PXq.LIZJ.LIZ("Content-Type", "application/json");
        Request LIZIZ2 = c64618PXq.LIZIZ();
        try {
            C64600PWy c64600PWy = (C64600PWy) LIZJ.getValue();
            c64600PWy.getClass();
            int i = LIZ(C64587PWl.LIZJ(c64600PWy, LIZIZ2, false)).LJLJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("report code ");
            LIZ2.append(i);
            X1D.LIZIZ(LIZ2);
        } catch (IOException e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    public static void LIZLLL(VMM event) {
        JSONObject jSONObject;
        boolean z;
        String str;
        String str2;
        String str3;
        o.LJIIJ(event, "event");
        String str4 = null;
        if (event instanceof VM4) {
            jSONObject = VMV.LIZ((VM4) event);
        } else if (event instanceof VM5) {
            jSONObject = VMV.LIZIZ((VM5) event);
        } else {
            jSONObject = null;
        }
        JSONObject body = new JSONObject().put("extra", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C77123UOp.LJJJJZI("module", "monitor", jSONObject2);
        EnumC65356Pku enumC65356Pku = EnumC65356Pku.EVENT_UPLOAD;
        EnumC65356Pku enumC65356Pku2 = event.LIZJ.LIZ;
        if (enumC65356Pku == enumC65356Pku2 || EnumC65356Pku.SAMPLE_THROW == enumC65356Pku2) {
            C77123UOp.LJJJLIIL(jSONObject2, "body", body);
        } else {
            C77123UOp.LJJJLIIL(jSONObject2, "body", new JSONObject());
        }
        C77123UOp.LJJJJZI("ev_type", event.LJIIJ, jSONObject2);
        C77123UOp.LJJJJZ("timestamp", System.currentTimeMillis(), jSONObject2);
        int i = 1;
        if (EnumC65356Pku.SAMPLE_THROW != event.LIZJ.LIZ) {
            z = true;
        } else {
            z = false;
        }
        C77123UOp.LJJJLIIL(jSONObject2, "hit_sample", Boolean.valueOf(z));
        HybridSettingInitConfig hybridSettingInitConfig = LIZIZ;
        if (hybridSettingInitConfig != null) {
            str = hybridSettingInitConfig.LJ;
        } else {
            str = null;
        }
        C77123UOp.LJJJJZI("device_id", str, jSONObject2);
        HybridSettingInitConfig hybridSettingInitConfig2 = LIZIZ;
        if (hybridSettingInitConfig2 != null) {
            str2 = hybridSettingInitConfig2.LIZJ;
        } else {
            str2 = null;
        }
        C77123UOp.LJJJJZI("os", str2, jSONObject2);
        String str5 = event.LJIIJ;
        o.LJFF(body, "body");
        C77123UOp.LJJJJZI("container_name", LIZJ("container_name", str5, body), jSONObject2);
        C77123UOp.LJJJJZI("container_type", event.LJ.LJLJI, jSONObject2);
        C77123UOp.LJJJJZI("url", LIZJ("url", event.LJIIJ, body), jSONObject2);
        C77123UOp.LJJJJZI("bid", VMV.LIZJ(event), jSONObject2);
        HybridSettingInitConfig hybridSettingInitConfig3 = LIZIZ;
        if (hybridSettingInitConfig3 != null) {
            str3 = hybridSettingInitConfig3.LIZ;
        } else {
            str3 = null;
        }
        C77123UOp.LJJJJZI("aid", str3, jSONObject2);
        C77123UOp.LJJJJZI("sdk_version", "1.5.14-rc.16-oversea", jSONObject2);
        C77123UOp.LJJJJZI("sdk_name", "Android Hybrid Monitor", jSONObject2);
        C77123UOp.LJJJLIIL(jSONObject2, "trace_id", event.LIZ());
        EnumC65356Pku enumC65356Pku3 = event.LIZJ.LIZ;
        if (enumC65356Pku != enumC65356Pku3 && EnumC65356Pku.EVENT_CREATE != enumC65356Pku3) {
            i = 0;
        }
        C77123UOp.LJJJJLL(i, "trace_type", jSONObject2);
        EnumC65356Pku enumC65356Pku4 = EnumC65356Pku.EVENT_TERMINATED;
        C65357Pkv c65357Pkv = event.LIZJ;
        EnumC65356Pku enumC65356Pku5 = c65357Pkv.LIZ;
        if (enumC65356Pku4 == enumC65356Pku5) {
            EnumC65355Pkt enumC65355Pkt = c65357Pkv.LIZIZ;
            if (enumC65355Pkt != null) {
                str4 = enumC65355Pkt.name();
            }
        } else if (enumC65356Pku5 != null) {
            str4 = enumC65356Pku5.name();
        }
        String str6 = (String) ((HashMap) LJ).get(str4);
        if (str6 != null) {
            str4 = str6;
        }
        C77123UOp.LJJJJZI("trace_content", str4, jSONObject2);
        String jSONObject3 = jSONObject2.toString();
        o.LJFF(jSONObject3, "jsonObject.toString()");
        LIZIZ(jSONObject3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r4, java.lang.String r5, org.json.JSONObject r6) {
        /*
            java.lang.String r3 = "url"
            java.lang.String r2 = ""
            boolean r0 = android.text.TextUtils.equals(r3, r4)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "extra"
            if (r0 == 0) goto L32
            java.lang.String r0 = "custom"
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L1f
            org.json.JSONObject r0 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.optString(r3)     // Catch: org.json.JSONException -> L4f
            goto L54
        L1f:
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto L4d
            java.lang.String r0 = "nativeBase"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> L4f
            goto L54
        L32:
            java.lang.String r0 = "container_name"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L53
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto L4d
            java.lang.String r0 = "containerBase"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> L4f
            goto L54
        L4d:
            r0 = 0
            goto L54
        L4f:
            r0 = move-exception
            X.C77117UOj.LJIIZILJ(r0)
        L53:
            r0 = r2
        L54:
            if (r0 == 0) goto L57
            r2 = r0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65354Pks.LIZJ(java.lang.String, java.lang.String, org.json.JSONObject):java.lang.String");
    }
}
