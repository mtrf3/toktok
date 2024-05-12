package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PDk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64092PDk extends AbstractC64084PDc<C64062PCg> {
    public static long LLFF = 30000;
    public static boolean LLFFF;
    public int LJLJLJ;
    public volatile int LJLL;
    public volatile List<String> LJLLI;
    public List<Pattern> LJLLILLLL;
    public List<String> LJLLJ;
    public List<Pattern> LJLLL;
    public boolean LJLLLL;
    public List<String> LJLLLLLL;
    public List<String> LJLZ;
    public List<String> LJZ;
    public List<String> LJZI;
    public boolean LL;
    public double LLD;
    public boolean LJLJLLL = true;
    public final boolean LJZL = true;
    public final List<InterfaceC64095PDn> LLF = new LinkedList();

    public final boolean LJIILL() {
        if (this.LJZL && this.LLD != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC64084PDc
    public final boolean LIZIZ(C64062PCg c64062PCg) {
        C64062PCg c64062PCg2 = c64062PCg;
        if (c64062PCg2 != null && !TextUtils.isEmpty(c64062PCg2.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC64084PDc
    public final void LJFF(C64062PCg c64062PCg) {
        boolean z;
        C64062PCg c64062PCg2 = c64062PCg;
        String str = c64062PCg2.LIZLLL;
        String str2 = c64062PCg2.LIZ;
        boolean z2 = !c64062PCg2.LJII.isNull("hit_rules");
        if (!z2 && !LJIIJJI(str, c64062PCg2.LJII)) {
            return;
        }
        JSONObject LIZ = c64062PCg2.LIZ();
        JSONObject jSONObject = c64062PCg2.LJII;
        if (LIZ == null) {
            return;
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    LIZ.put(next, jSONObject.get(next));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (z2 || LJIIL(str2, str, LIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJZL) {
            String str3 = c64062PCg2.LIZ;
            try {
                if (!TextUtils.equals(str3, "api_all")) {
                    if (TextUtils.equals(str3, "api_error")) {
                        LIZ.put("net_log_type", "api_error_v2");
                    }
                } else {
                    LIZ.put("net_log_type", "api_all_v2");
                }
                if (!LJIILL() || !this.LJLJLLL) {
                    if (this.LJLJLJ == 1 && this.LJLJLLL) {
                        LIZ.put("inject_tracelog", "02");
                    }
                } else {
                    LIZ.put("inject_tracelog", "01");
                }
                double d = this.LLD;
                if (d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    LIZ.put("enable_base_api_all", d);
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        LJIILIIL("requestHeader", this.LJZ, LIZ);
        LJIILIIL("responseHeader", this.LJZI, LIZ);
        if (((LinkedList) this.LLF).size() > 0 && "api_all".equals(str2) && !c64062PCg2.LJII.optBoolean("download", false)) {
            for (InterfaceC64095PDn interfaceC64095PDn : this.LLF) {
                if (interfaceC64095PDn != null) {
                    interfaceC64095PDn.LIZ(str, c64062PCg2.LJII);
                }
            }
        }
        if (z && this.LJLLLL && V3N.LJIJJLI(str, this.LJLLLLLL, null)) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Boolean bool = Boolean.TRUE;
            if (!c03880Dg.LIZJ(400500, "com/bytedance/apm/data/pipeline/NetDataPipeline", "logSend", this, new Object[]{str2, str2, LIZ, bool, Boolean.FALSE, bool}, "void", new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ZZZ)V", "5023889681285687998")).LIZ) {
                LJIIIZ(str2, str2, LIZ, true, false, true);
            }
        }
        LJIIIIZZ(str2, str2, LIZ, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: JSONException -> 0x0068, TryCatch #0 {JSONException -> 0x0068, blocks: (B:3:0x0002, B:7:0x0018, B:9:0x0022, B:10:0x0027, B:12:0x002b, B:14:0x0037, B:19:0x003d, B:22:0x0046, B:29:0x0009), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: JSONException -> 0x0068, TryCatch #0 {JSONException -> 0x0068, blocks: (B:3:0x0002, B:7:0x0018, B:9:0x0022, B:10:0x0027, B:12:0x002b, B:14:0x0037, B:19:0x003d, B:22:0x0046, B:29:0x0009), top: B:2:0x0002 }] */
    @Override // X.AbstractC64084PDc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C64062PCg r6) {
        /*
            r5 = this;
            X.PCg r6 = (X.C64062PCg) r6
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()     // Catch: org.json.JSONException -> L68
            if (r0 != 0) goto L9
            goto L17
        L9:
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()     // Catch: org.json.JSONException -> L68
            boolean r0 = r0.isForeground()     // Catch: org.json.JSONException -> L68
            r0 = r0 ^ 1
            if (r0 != 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            org.json.JSONObject r0 = r6.LJII     // Catch: org.json.JSONException -> L68
            java.lang.String r1 = "front"
            boolean r0 = r0.isNull(r1)     // Catch: org.json.JSONException -> L68
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = r6.LJII     // Catch: org.json.JSONException -> L68
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L68
        L27:
            boolean r0 = X.C64092PDk.LLFFF     // Catch: org.json.JSONException -> L68
            if (r0 != 0) goto L3d
        L2b:
            java.lang.String r2 = "ttnet"
            org.json.JSONObject r0 = r6.LJII     // Catch: org.json.JSONException -> L68
            java.lang.String r1 = "net_consume_type"
            boolean r0 = r0.isNull(r1)     // Catch: org.json.JSONException -> L68
            if (r0 == 0) goto L68
            org.json.JSONObject r0 = r6.LJII     // Catch: org.json.JSONException -> L68
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L68
            goto L68
        L3d:
            long r3 = X.C09970aH.LJIILIIL     // Catch: org.json.JSONException -> L68
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L2b
        L46:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L68
            long r0 = X.C09970aH.LJIILIIL     // Catch: org.json.JSONException -> L68
            long r3 = r3 - r0
            long r1 = X.C64092PDk.LLFF     // Catch: org.json.JSONException -> L68
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L54
            goto L2b
        L54:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            r3.<init>()     // Catch: org.json.JSONException -> L2b
            java.lang.String r2 = "trace_base"
            long r0 = X.C09970aH.LJIILIIL     // Catch: org.json.JSONException -> L2b
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L2b
            org.json.JSONObject r1 = r6.LJII     // Catch: org.json.JSONException -> L2b
            java.lang.String r0 = "relate_start_trace"
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L2b
            goto L2b
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64092PDk.LJII(X.PDi):void");
    }

    public final void LJIIJ(InterfaceC64095PDn interfaceC64095PDn) {
        if (!((LinkedList) this.LLF).contains(interfaceC64095PDn) && interfaceC64095PDn != null) {
            ((LinkedList) this.LLF).add(interfaceC64095PDn);
        }
    }

    @Override // X.AbstractC64084PDc, X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        JSONObject optJSONObject3;
        if (jSONObject == null || TextUtils.isEmpty("network_image_modules")) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.optJSONObject("network_image_modules");
        }
        boolean z3 = true;
        if (jSONObject2 != null) {
            if (!TextUtils.isEmpty("network") && (optJSONObject2 = jSONObject2.optJSONObject("network")) != null) {
                this.LJLLI = V3N.LJJIIJZLJL("api_block_list", optJSONObject2);
                if (TextUtils.equals("api_block_list", "api_block_list") && C35044DpA.LIZIZ()) {
                    JSONArray optJSONArray = optJSONObject2.optJSONArray("api_block_list");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int length = optJSONArray.length();
                        arrayList = new ArrayList(length);
                        for (int i = 0; i < length; i++) {
                            String string = JSONArrayProtectorUtils.getString(optJSONArray, i);
                            if (!"/*.jpg".equals(string) && !TextUtils.isEmpty(string) && C38540FAq.LIZ(string)) {
                                arrayList.add(PatternProtector.compile(string));
                            }
                        }
                    }
                    arrayList = null;
                } else {
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("api_block_list");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        int length2 = optJSONArray2.length();
                        arrayList = new ArrayList(length2);
                        for (int i2 = 0; i2 < length2; i2++) {
                            String string2 = JSONArrayProtectorUtils.getString(optJSONArray2, i2);
                            if (!TextUtils.isEmpty(string2)) {
                                arrayList.add(PatternProtector.compile(string2));
                            }
                        }
                    }
                    arrayList = null;
                }
                this.LJLLILLLL = arrayList;
                this.LJLLJ = V3N.LJJIIZ("api_allow_list", optJSONObject2);
                if (TextUtils.equals("api_allow_list", "api_allow_list") && C35044DpA.LIZIZ()) {
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("api_allow_list");
                    if (!C43001GuD.LJIILIIL(optJSONObject4)) {
                        arrayList2 = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (optJSONObject4.optInt(next) == 1 && C38540FAq.LIZ(next)) {
                                String trim = next.trim();
                                if (!trim.startsWith("^/") && !trim.endsWith("/") && (!trim.startsWith("^") || trim.startsWith("^http"))) {
                                    if (!C38540FAq.LIZ.contains(trim)) {
                                        arrayList2.add(PatternProtector.compile(trim));
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else {
                    JSONObject optJSONObject5 = optJSONObject2.optJSONObject("api_allow_list");
                    if (!C64055PBz.LIZIZ(optJSONObject5)) {
                        arrayList2 = new ArrayList();
                        Iterator<String> keys2 = optJSONObject5.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            if (optJSONObject5.optInt(next2) == 1) {
                                arrayList2.add(PatternProtector.compile(next2));
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                this.LJLLL = arrayList2;
                this.LJLJLJ = optJSONObject2.optInt("enable_api_all_upload", 0);
                this.LJLJLLL = optJSONObject2.optBoolean("enable_trace_log", true);
                this.LJLL = optJSONObject2.optInt("enable_api_error_upload", 1);
                if (optJSONObject2.optInt("enable_cancel_error_report") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LL = z2;
                this.LJZ = V3N.LJJIIZ("request_allow_header", optJSONObject2);
                this.LJZI = V3N.LJJIIZ("response_allow_header", optJSONObject2);
                if (this.LJZ == null) {
                    this.LJZ = new ArrayList();
                }
                if (this.LJZI == null) {
                    this.LJZI = new ArrayList();
                }
                this.LJZ.add("traceparent");
                this.LJZI.add("x-tt-logid");
                this.LLD = optJSONObject2.optDouble("enable_base_api_all", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            }
            if (!TextUtils.isEmpty("image") && (optJSONObject3 = jSONObject2.optJSONObject("image")) != null) {
                this.LJLZ = V3N.LJJIIZ("image_allow_list", optJSONObject3);
            }
        }
        JSONObject LJIJI = C43001GuD.LJIJI("general", "slardar_api_settings", jSONObject);
        if (LJIJI == null || (optJSONObject = LJIJI.optJSONObject("network_monitor_double_upload")) == null) {
            return;
        }
        if (1 != optJSONObject.optInt("enable_open")) {
            z3 = false;
        }
        this.LJLLLL = z3;
        JSONArray optJSONArray3 = optJSONObject.optJSONArray("allow_list");
        this.LJLLLLLL = new ArrayList();
        if (optJSONArray3 == null) {
            return;
        }
        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
            String optString = optJSONArray3.optString(i3, null);
            if (!TextUtils.isEmpty(optString)) {
                ((ArrayList) this.LJLLLLLL).add(optString);
            }
        }
    }

    public final boolean LJIIJJI(String str, JSONObject jSONObject) {
        List<String> list = this.LJLZ;
        if (!C78915Uy7.LJIJJ(list) && !TextUtils.isEmpty(str)) {
            try {
                String host = UriProtector.parse(str).getHost();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (host.equalsIgnoreCase(it.next())) {
                        break;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Context context = C09970aH.LIZ;
        if (C35044DpA.LIZ() ? EnumC111394Yt.NOT_AVAILABLE != C2NU.LIZ.LIZJ : C48168IvM.LIZ(context)) {
            if (jSONObject != null) {
                try {
                    String optString = jSONObject.optString("cronet_internal_error_code");
                    if ("11".equals(jSONObject.optString("cronet_error_code"))) {
                        if ("-999".equals(optString) && !this.LL) {
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(1:42)(1:7)|8|(1:10)(1:41)|11|(3:26|27|(6:31|(2:34|35)|33|14|15|(1:21)(1:19)))|13|14|15|(1:22)(1:23)) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            boolean r0 = r7.LJIILL()
            r4 = 1
            if (r0 != 0) goto L15
            int r0 = r7.LJLJLJ
            if (r0 != 0) goto L15
            java.util.List<java.lang.String> r1 = r7.LJLLJ
            java.util.List<java.util.regex.Pattern> r0 = r7.LJLLL
            boolean r0 = X.V3N.LJIJJLI(r8, r1, r0)
            if (r0 == 0) goto L31
        L15:
            r6 = 1
        L16:
            X.PDp r1 = X.C64099PDr.LIZ
            java.lang.String r0 = "smart_traffic"
            boolean r5 = r1.getServiceSwitch(r0)
            if (r5 == 0) goto L2f
            r3 = r6 | 4
        L22:
            java.lang.String r0 = "requestHeader"
            java.lang.String r2 = r9.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L53
            goto L33
        L2f:
            r3 = r6
            goto L22
        L31:
            r6 = 0
            goto L16
        L33:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f
            r1.<init>(r2)     // Catch: org.json.JSONException -> L4f
            X.PDX r0 = r7.LJLJJL     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L53
            boolean r0 = X.PDX.LIZ(r1)     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L53
            X.PDX r0 = r7.LJLJJL     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L4b
            java.lang.String r0 = "single_point_only"
            r9.put(r0, r4)     // Catch: org.json.JSONException -> L4b
        L4b:
            r1 = 1
            r3 = r3 | 16
            goto L54
        L4f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L53:
            r1 = 0
        L54:
            java.lang.String r0 = "hit_rules"
            r9.put(r0, r3)     // Catch: org.json.JSONException -> L59
        L59:
            if (r6 != 0) goto L5f
            if (r5 != 0) goto L5f
            if (r1 == 0) goto L60
        L5f:
            return r4
        L60:
            r4 = 0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64092PDk.LJIILJJIL(java.lang.String, org.json.JSONObject):boolean");
    }

    public static void LJIILIIL(String str, List list, JSONObject jSONObject) {
        if (list != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String optString = jSONObject.optString(str);
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            JSONObject jSONObject3 = new JSONObject();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (list.contains(next)) {
                                    jSONObject3.put(next, jSONObject2.opt(next));
                                }
                            }
                            jSONObject.put(str, jSONObject3.toString());
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public final boolean LJIIL(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.equals(str, "api_all")) {
            if (LJIILL()) {
                LJIILJJIL(str2, jSONObject);
                return true;
            }
            if (!V3N.LJIJJLI(str2, this.LJLLI, this.LJLLILLLL)) {
                return LJIILJJIL(str2, jSONObject);
            }
        } else if (TextUtils.equals(str, "api_error") && this.LJLL == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIILLIIL(String str, String str2, JSONObject jSONObject) {
        if (!this.LJLILLLLZI || ((LinkedList) this.LLF).size() > 0) {
            return true;
        }
        if (LJIIJJI(str2, jSONObject)) {
            return LJIIL(str, str2, jSONObject);
        }
        return false;
    }
}
