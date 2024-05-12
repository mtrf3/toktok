package X;

import android.text.TextUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMU {
    public static final Method LIZ;

    static {
        try {
            LIZ = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class);
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public static void LIZ(String eventName, String str) {
        o.LJIIJ(eventName, "eventName");
        if (TextUtils.isEmpty(eventName) || !VMX.LIZLLL(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("event_name", eventName, jSONObject);
        C77123UOp.LJJJJZI("bid", str, jSONObject);
        LJ("hybridmonitor_report_all", jSONObject);
        try {
            C09900aA.LJI("bd_hybrid_monitor_service_all_in_one", null, null, new JSONObject(UPJ.LIZIZ("{\"extra\":{\"client_category\":{\"bid\":\"", str, "\",\"event_type\":\"", eventName, "\"},\"client_extra\":{\"event_name\":\"hybridmonitor_report_all\"},\"ev_type\":\"custom\"}}")));
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.VM4 r14, java.lang.String r15) {
        /*
            X.VMS r0 = X.VMS.teaReport
            boolean r0 = r0.not()
            if (r0 == 0) goto L9
            return
        L9:
            X.E6w r0 = r14.LJI
            if (r0 == 0) goto L19
            java.lang.String r1 = "jsbPv"
            java.lang.String r0 = r14.LJIIJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
        L19:
            return
        L1a:
            X.VMG r0 = r14.LJ
            org.json.JSONObject r2 = r0.LLLLLLLZIL()
            java.lang.String r0 = "container_type"
            java.lang.String r3 = X.C77123UOp.LJJJJLI(r0, r2)
            r6 = 0
            if (r3 != 0) goto Lae
        L29:
            r11 = r6
        L2a:
            X.E6w r0 = r14.LJI
            if (r0 == 0) goto Lac
            org.json.JSONObject r13 = r0.LLLLLLLZIL()
        L32:
            X.EzQ r0 = r14.LJIIL
            if (r0 == 0) goto Laa
            org.json.JSONObject r1 = r0.LLLLLLLZIL()
        L3a:
            com.bytedance.android.monitorV2.HybridMultiMonitor r4 = com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance()
            java.lang.String r0 = "HybridMultiMonitor.getInstance()"
            kotlin.jvm.internal.o.LJFF(r4, r0)
            X.Fo1 r4 = r4.getHybridSettingManager()
            java.lang.String r0 = "HybridMultiMonitor.getIn…ce().hybridSettingManager"
            kotlin.jvm.internal.o.LJFF(r4, r0)
            com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig r4 = r4.LIZJ()
            java.lang.String r0 = ""
            if (r4 == 0) goto La8
            java.lang.String r10 = r4.LIZ
        L56:
            java.lang.String r12 = "url"
            java.lang.String r0 = X.C77123UOp.LJJJJL(r12, r0, r2)
            java.lang.String r9 = "container_name"
            java.lang.String r2 = "other"
            java.lang.String r8 = X.C77123UOp.LJJJJL(r9, r2, r13)
            java.lang.String r7 = "schema"
            java.lang.String r5 = X.C77123UOp.LJJJJL(r7, r6, r13)
            java.lang.String r4 = "container_version"
            java.lang.String r2 = X.C77123UOp.LJJJJL(r4, r6, r13)
            org.json.JSONObject r1 = X.C77123UOp.LJJIJLIJ(r6, r1)
            X.C77123UOp.LJJJ(r1, r12, r0)
            java.lang.String r0 = "engine_version"
            X.C77123UOp.LJJJ(r1, r0, r11)
            java.lang.String r0 = "engine_type"
            X.C77123UOp.LJJJ(r1, r0, r3)
            X.C77123UOp.LJJJ(r1, r7, r5)
            X.C77123UOp.LJJJ(r1, r4, r2)
            X.C77123UOp.LJJJ(r1, r9, r8)
            java.lang.String r0 = "bid"
            X.C77123UOp.LJJJ(r1, r0, r15)
            java.lang.String r0 = "origin_appid"
            X.C77123UOp.LJJJ(r1, r0, r10)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.String r0 = "bd_hybrid_monitor_jsb_pv"
            LJ(r0, r1)
            X.VMS r0 = X.VMS.eventStream
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Lde
            goto L19
        La8:
            r10 = r0
            goto L56
        Laa:
            r1 = r6
            goto L3a
        Lac:
            r13 = r6
            goto L32
        Lae:
            int r1 = r3.hashCode()
            r0 = 117588(0x1cb54, float:1.64776E-40)
            if (r1 == r0) goto Lce
            r0 = 3337239(0x32ec17, float:4.676468E-39)
            if (r1 == r0) goto Lbe
            goto L29
        Lbe:
            java.lang.String r0 = "lynx"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "lynx_version"
            java.lang.String r11 = r2.optString(r0, r6)
            goto L2a
        Lce:
            java.lang.String r0 = "web"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "web_version"
            java.lang.String r11 = r2.optString(r0, r6)
            goto L2a
        Lde:
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 264(0x108, float:3.7E-43)
            r1.<init>(r14, r0)
            X.C38045EwT.LIZ(r1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMU.LIZIZ(X.VM4, java.lang.String):void");
    }

    public static void LIZLLL(String eventName, String str) {
        o.LJIIJ(eventName, "eventName");
        if (TextUtils.isEmpty(eventName) || !VMX.LIZLLL(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("event_name", eventName, jSONObject);
        C77123UOp.LJJJJZI("bid", str, jSONObject);
        LJ("hybridmonitor_report_sample", jSONObject);
    }

    public static void LJ(String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        Method method = LIZ;
        if (method != null) {
            try {
                method.invoke(null, eventName, jSONObject);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.VM4 r5, java.lang.String r6, boolean r7) {
        /*
            X.VMS r0 = X.VMS.teaReport
            boolean r0 = r0.not()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r1 = "navigationStart"
            java.lang.String r0 = r5.LJIIJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L20
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            X.VMG r1 = r5.LJ
            if (r1 == 0) goto L20
            X.E6w r0 = r5.LJI
            if (r0 != 0) goto L21
        L20:
            return
        L21:
            org.json.JSONObject r3 = r1.LLLLLLLZIL()
            java.lang.String r1 = "url"
            java.lang.String r0 = X.C77123UOp.LJJJJLI(r1, r3)
            X.C77123UOp.LJJJJZI(r1, r0, r2)
            java.lang.String r0 = "container_type"
            java.lang.String r1 = X.C77123UOp.LJJJJLI(r0, r3)
            java.lang.String r0 = "engine_type"
            X.C77123UOp.LJJJJZI(r0, r1, r2)
            java.lang.String r0 = "lynx"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            r4 = 0
            if (r0 == 0) goto Lc1
            java.lang.String r0 = "lynx_version"
            java.lang.String r1 = r3.optString(r0, r4)
        L48:
            if (r1 == 0) goto L4f
            java.lang.String r0 = "engine_version"
            X.C77123UOp.LJJJJZI(r0, r1, r2)
        L4f:
            java.lang.String r1 = "native_page"
            java.lang.String r0 = r3.optString(r1, r4)
            if (r0 == 0) goto L5a
            X.C77123UOp.LJJJJZI(r1, r0, r2)
        L5a:
            java.lang.String r1 = "sdk_version"
            java.lang.String r0 = X.C77123UOp.LJJJJLI(r1, r3)
            X.C77123UOp.LJJJJZI(r1, r0, r2)
            X.E6w r0 = r5.LJI
            if (r0 == 0) goto L8e
            org.json.JSONObject r3 = r0.LLLLLLLZIL()
            if (r3 == 0) goto L8e
            java.lang.String r1 = "schema"
            java.lang.String r0 = r3.optString(r1, r4)
            if (r0 == 0) goto L78
            X.C77123UOp.LJJJJZI(r1, r0, r2)
        L78:
            java.lang.String r1 = "container_name"
            java.lang.String r0 = "other"
            java.lang.String r0 = r3.optString(r1, r0)
            X.C77123UOp.LJJJJZI(r1, r0, r2)
            java.lang.String r1 = "container_version"
            java.lang.String r0 = r3.optString(r1, r4)
            if (r0 == 0) goto L8e
            X.C77123UOp.LJJJJZI(r1, r0, r2)
        L8e:
            java.lang.String r0 = "bid"
            X.C77123UOp.LJJJJZI(r0, r6, r2)
            java.lang.String r0 = "is_hybrid_sample"
            X.C77123UOp.LJJJJLL(r7, r0, r2)
            com.bytedance.android.monitorV2.HybridMultiMonitor r1 = com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance()
            java.lang.String r0 = "HybridMultiMonitor.getInstance()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            X.Fo1 r1 = r1.getHybridSettingManager()
            java.lang.String r0 = "HybridMultiMonitor.getIn…ce().hybridSettingManager"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig r0 = r1.LIZJ()
            if (r0 == 0) goto Lbe
            java.lang.String r1 = r0.LIZ
        Lb2:
            java.lang.String r0 = "origin_appid"
            X.C77123UOp.LJJJJZI(r0, r1, r2)
            java.lang.String r0 = "bd_hybrid_monitor_pv"
            LJ(r0, r2)
            goto L20
        Lbe:
            java.lang.String r1 = ""
            goto Lb2
        Lc1:
            java.lang.String r0 = "web"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "web_version"
            java.lang.String r1 = r3.optString(r0, r4)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMU.LIZJ(X.VM4, java.lang.String, boolean):void");
    }
}
