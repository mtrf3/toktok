package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.HttpInstrumentation;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.RuleConfig;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.o;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class PYG implements PY9, PYA, PY8, InterfaceC62927Omp {
    public static final java.util.Set<String> LIZIZ = C77275UUl.LJIIIIZZ("/tfe/api/request_combine/v1/", "/aweme/v1/compliance/settings/", "/tiktok/v1/kids/settings/");
    public static final java.util.Set<String> LIZJ = C77275UUl.LJIIIIZZ("did", "deviceid", "device_id");
    public static final java.util.Set<String> LIZLLL = C77275UUl.LJIIIIZZ("iid", "installid", "install_id");
    public static final TypedByteArray LJ;
    public static final Object LJFF;
    public static final List<JSONObject> LJI;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58272Mtw.LJLIL);

    public static URLConnection LJIIZILJ(java.net.URL url) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-1325309805395082466"));
        return LIZJ2.LIZ ? (URLConnection) LIZJ2.LIZIZ : url.openConnection();
    }

    @Override // X.PYA
    public final PPC<Request, C64598PWw> LIZIZ(PPC<Request, C64598PWw> ppc) {
        return ppc;
    }

    @Override // X.PY9
    public final PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> LIZLLL(PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJII(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJIIIZ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    static {
        byte[] bytes = "{\"status_code\": 1001}".getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        LJ = new TypedByteArray("application/json; charset=utf-8", bytes, new String[0]);
        C16880lQ.LJLLJ(PYG.class);
        LJFF = new Object();
        LJI = new ArrayList();
    }

    public final IComplianceMonitorService LJIJ() {
        return (IComplianceMonitorService) this.LIZ.getValue();
    }

    public final boolean LJIJJLI() {
        List<InterfaceControlRule> rules;
        InterfaceControlSettings LIZIZ2 = LJIJ().LIZIZ();
        ArrayList arrayList = null;
        if (LIZIZ2 != null && (rules = LIZIZ2.getRules()) != null) {
            arrayList = new ArrayList();
            for (InterfaceControlRule interfaceControlRule : rules) {
                List<RuleConfig> ruleThens = interfaceControlRule.getRuleThens();
                if (ruleThens != null) {
                    Iterator<RuleConfig> it = ruleThens.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            RuleConfig next = it.next();
                            ConfigTypeEnum.Companion.getClass();
                            if (ORZ.LJLJJI(next.getType(), PYI.LIZ())) {
                                if (next != null) {
                                    arrayList.add(interfaceControlRule);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (AV1.LJIIJJI()) {
            return true;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.retrofit2.client.Request, Q] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Pbt, R] */
    @Override // X.PY9
    public final PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> LIZ(PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> ppc) {
        String str;
        com.bytedance.retrofit2.client.Request request;
        List<EJ6> list;
        com.bytedance.retrofit2.client.Request request2 = ppc.LIZ;
        if (request2 != null) {
            str = request2.getUrl();
        } else {
            str = null;
        }
        C58730N3e LJJ = LJJ(str);
        if (LJJ.LIZ) {
            com.bytedance.retrofit2.client.Request request3 = ppc.LIZ;
            if (request3 == null || (list = request3.getHeaders()) == null) {
                list = C61878OQg.INSTANCE;
            }
            C36910EeA c36910EeA = new C36910EeA(str, 1001, "", list, LJ);
            ?? LIZ = C64797Pbt.LIZ(c36910EeA.LJ, c36910EeA);
            ppc.LIZ(PPD.INTERCEPT);
            ppc.LIZIZ = LIZ;
            LJIL(str, "2", 0, LJJ);
        } else if (LJIJJLI() && (request = ppc.LIZ) != null) {
            C58730N3e c58730N3e = new C58730N3e(false, str, 502);
            LJIJJ(c58730N3e);
            HashMap<String, String> hashMap = new HashMap<>();
            List<EJ6> headers = request.getHeaders();
            if (headers != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(headers, 10));
                for (EJ6 ej6 : headers) {
                    String str2 = ej6.LIZ;
                    o.LJIIIIZZ(str2, "it.name");
                    String charSequence = s.LJZI(str2).toString();
                    String str3 = ej6.LIZIZ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    hashMap.put(charSequence, str3);
                    arrayList.add(C76800UCe.LIZ);
                }
            }
            HashMap<String, String> LJIJI = LJIJI(c58730N3e, hashMap, 2);
            if (c58730N3e.LIZ) {
                ArrayList arrayList2 = new ArrayList(LJIJI.size());
                for (Map.Entry<String, String> entry : LJIJI.entrySet()) {
                    arrayList2.add(new EJ6(entry.getKey(), entry.getValue()));
                }
                List<EJ6> LLJI = ORZ.LLJI(arrayList2);
                C64908Pdg newBuilder = request.newBuilder();
                newBuilder.LIZJ(c58730N3e.LIZLLL);
                newBuilder.LIZJ = LLJI;
                ppc.LIZ = newBuilder.LIZ();
                LJIL(str, "2", 1, c58730N3e);
            }
        }
        return ppc;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [R, java.lang.Integer] */
    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJ(PPC<HttpURLConnection, Integer> ppc) {
        String str;
        java.net.URL url;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        C58730N3e LJJ = LJJ(str);
        if (LJJ.LIZ) {
            ppc.LIZ(PPD.INTERCEPT);
            ppc.LIZIZ = 1001;
            LJIL(str, "3", 0, LJJ);
        }
        return ppc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.PY8
    public final PPC<java.net.URL, URLConnection> LJFF(PPC<java.net.URL, URLConnection> ppc) {
        String str;
        R r;
        Object openConnection;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        java.net.URL url = ppc.LIZ;
        if (url != null) {
            str = url.toString();
        } else {
            str = null;
        }
        if (LJIJJLI() && ppc.LIZ != null) {
            C58730N3e c58730N3e = new C58730N3e(false, str, 502);
            LJIJJ(c58730N3e);
            if (c58730N3e.LIZ) {
                java.net.URL url2 = new java.net.URL(c58730N3e.LIZLLL);
                if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
                    r = HttpInstrumentation.openConnection(LJIIZILJ(url2));
                } else {
                    PPC<java.net.URL, URLConnection> LJFF2 = PY7.LIZLLL.LJFF(new PPC<>(url2, null, null, null, null, PPD.CONTINUE));
                    PPD ppd = LJFF2.LJFF;
                    if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF2.LIZIZ) != null) {
                        URLConnection uRLConnection2 = uRLConnection;
                        if (uRLConnection2 instanceof HttpsURLConnection) {
                            openConnection = new PYT((HttpsURLConnection) uRLConnection2);
                        } else {
                            boolean z = uRLConnection2 instanceof HttpURLConnection;
                            r = uRLConnection2;
                            if (z) {
                                openConnection = new PYU((HttpURLConnection) uRLConnection2);
                            }
                        }
                        r = openConnection;
                    } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF2.LJ) == null) {
                        openConnection = HttpInstrumentation.openConnection(LJIIZILJ(url2));
                        if (openConnection instanceof HttpsURLConnection) {
                            r = new PYT((HttpsURLConnection) openConnection);
                        } else {
                            if (openConnection instanceof HttpURLConnection) {
                                r = new PYU((HttpURLConnection) openConnection);
                            }
                            r = openConnection;
                        }
                    } else {
                        throw runtimeException;
                    }
                }
                ppc.LIZIZ = r;
                ppc.LIZ(PPD.INTERCEPT);
                LJIL(str, "3", 1, c58730N3e);
            }
        }
        return ppc;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R, java.io.ByteArrayInputStream] */
    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJI(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        java.net.URL url;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        C58730N3e LJJ = LJJ(str);
        if (LJJ.LIZ) {
            byte[] bytes = "{\"status_code\": 1001}".getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            ?? byteArrayInputStream = new ByteArrayInputStream(bytes);
            ppc.LIZ(PPD.INTERCEPT);
            ppc.LIZIZ = byteArrayInputStream;
            LJIL(str, "3", 0, LJJ);
        }
        return ppc;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R, java.io.ByteArrayInputStream] */
    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        java.net.URL url;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        C58730N3e LJJ = LJJ(str);
        if (LJJ.LIZ) {
            byte[] bytes = "{\"status_code\": 1001}".getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            ?? byteArrayInputStream = new ByteArrayInputStream(bytes);
            ppc.LIZ(PPD.INTERCEPT);
            ppc.LIZIZ = byteArrayInputStream;
            LJIL(str, "3", 0, LJJ);
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILIIL(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        String str2;
        java.net.URL url;
        if (LJIJJLI()) {
            JSONObject jSONObject = ppc.LIZLLL;
            String str3 = "";
            if (jSONObject == null) {
                str = "";
                str2 = "";
            } else {
                str = jSONObject.optString("key", "");
                str2 = jSONObject.optString("value", "");
            }
            if (str != null && !ujb.o.LJJJJJL(str)) {
                String str4 = null;
                C58730N3e c58730N3e = new C58730N3e(false, null, 510);
                HashMap<String, String> hashMap = new HashMap<>();
                String charSequence = s.LJZI(str).toString();
                if (str2 != null) {
                    str3 = str2;
                }
                hashMap.put(charSequence, str3);
                HashMap<String, String> LJIJI = LJIJI(c58730N3e, hashMap, 2);
                if (c58730N3e.LIZ) {
                    HttpURLConnection httpURLConnection = ppc.LIZ;
                    if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
                        str4 = url.toString();
                    }
                    if (LJIJI.isEmpty()) {
                        ppc.LIZ(PPD.DROP);
                    } else {
                        for (Map.Entry<String, String> entry : LJIJI.entrySet()) {
                            o.LJIIIIZZ(entry, "newParamsMap.entries");
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (jSONObject != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    LJIL(str4, "3", 1, c58730N3e);
                }
            }
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILL(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        String str2;
        java.net.URL url;
        if (LJIJJLI()) {
            JSONObject jSONObject = ppc.LIZLLL;
            String str3 = "";
            if (jSONObject == null) {
                str = "";
                str2 = "";
            } else {
                str = jSONObject.optString("key", "");
                str2 = jSONObject.optString("value", "");
            }
            if (str != null && !ujb.o.LJJJJJL(str)) {
                String str4 = null;
                C58730N3e c58730N3e = new C58730N3e(false, null, 510);
                HashMap<String, String> hashMap = new HashMap<>();
                String charSequence = s.LJZI(str).toString();
                if (str2 != null) {
                    str3 = str2;
                }
                hashMap.put(charSequence, str3);
                HashMap<String, String> LJIJI = LJIJI(c58730N3e, hashMap, 2);
                if (c58730N3e.LIZ) {
                    HttpURLConnection httpURLConnection = ppc.LIZ;
                    if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
                        str4 = url.toString();
                    }
                    if (LJIJI.isEmpty()) {
                        ppc.LIZ(PPD.DROP);
                    } else {
                        for (Map.Entry<String, String> entry : LJIJI.entrySet()) {
                            o.LJIIIIZZ(entry, "newParamsMap.entries");
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (jSONObject != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    LJIL(str4, "3", 1, c58730N3e);
                }
            }
        }
        return ppc;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Q, okhttp3.Request] */
    /* JADX WARN: Type inference failed for: r1v7, types: [R, X.PWw] */
    @Override // X.PYA
    public final PPC<Request, C64598PWw> LJIILLIIL(PPC<Request, C64598PWw> ppc) {
        Request request;
        java.util.Set<String> LJFF2;
        C64626PXy url;
        Request request2 = ppc.LIZ;
        String str = null;
        if (request2 != null && (url = request2.url()) != null) {
            str = url.LJIIIIZZ;
        }
        C58730N3e LJJ = LJJ(str);
        if (LJJ.LIZ) {
            C64597PWv c64597PWv = new C64597PWv();
            c64597PWv.LIZJ = 1001;
            c64597PWv.LIZIZ = EnumC64572PVw.HTTP_2;
            c64597PWv.LIZLLL = "";
            Request request3 = ppc.LIZ;
            o.LJI(request3);
            c64597PWv.LIZ = request3;
            c64597PWv.LJI = PVM.create(C39745Fin.LIZJ("application/json; charset=utf-8"), "{\"status_code\": 1001}");
            ?? LIZ = c64597PWv.LIZ();
            ppc.LIZ(PPD.INTERCEPT);
            ppc.LIZIZ = LIZ;
            LJIL(str, "4", 0, LJJ);
        } else if (LJIJJLI() && (request = ppc.LIZ) != null) {
            C64606PXe headers = request.headers();
            C58730N3e c58730N3e = new C58730N3e(false, str, 502);
            LJIJJ(c58730N3e);
            HashMap<String, String> hashMap = new HashMap<>();
            if (headers != null && (LJFF2 = headers.LJFF()) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJFF2, 10));
                for (String it : LJFF2) {
                    o.LJIIIIZZ(it, "it");
                    String charSequence = s.LJZI(it).toString();
                    String LIZLLL2 = headers.LIZLLL(it);
                    if (LIZLLL2 == null) {
                        LIZLLL2 = "";
                    }
                    hashMap.put(charSequence, LIZLLL2);
                    arrayList.add(C76800UCe.LIZ);
                }
            }
            HashMap<String, String> LJIJI = LJIJI(c58730N3e, hashMap, 2);
            if (c58730N3e.LIZ) {
                C64605PXd c64605PXd = new C64605PXd();
                for (Map.Entry<String, String> entry : LJIJI.entrySet()) {
                    o.LJIIIIZZ(entry, "newParamsMap.entries");
                    c64605PXd.LIZ(entry.getKey(), entry.getValue());
                }
                C64618PXq newBuilder = request.newBuilder();
                String str2 = c58730N3e.LIZLLL;
                o.LJI(str2);
                newBuilder.LJII(str2);
                newBuilder.LIZJ = new C64606PXe(c64605PXd).LJI();
                ppc.LIZ = newBuilder.LIZIZ();
                LJIL(str, "4", 1, c58730N3e);
            }
        }
        return ppc;
    }

    public final void LJIJJ(C58730N3e c58730N3e) {
        android.net.Uri parse;
        java.util.Set<String> queryParameterNames;
        if (TextUtils.isEmpty(c58730N3e.LIZLLL) || (queryParameterNames = UriProtector.getQueryParameterNames((parse = UriProtector.parse(c58730N3e.LIZLLL)))) == null || queryParameterNames.isEmpty()) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
        ArrayList arrayList = new ArrayList(C32I.LJJL(queryParameterNames, 10));
        for (String it : queryParameterNames) {
            o.LJIIIIZZ(it, "it");
            String charSequence = s.LJZI(it).toString();
            String queryParameter = UriProtector.getQueryParameter(parse, it);
            if (queryParameter == null) {
                queryParameter = "";
            }
            hashMap.put(charSequence, queryParameter);
            arrayList.add(C76800UCe.LIZ);
        }
        HashMap<String, String> LJIJI = LJIJI(c58730N3e, hashMap, 0);
        if (!c58730N3e.LIZ) {
            return;
        }
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (Map.Entry<String, String> entry : LJIJI.entrySet()) {
            o.LJIIIIZZ(entry, "newParamsMap.entries");
            clearQuery.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        c58730N3e.LIZLLL = clearQuery.build().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b4, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C58730N3e LJJ(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYG.LJJ(java.lang.String):X.N3e");
    }

    @Override // X.InterfaceC62927Omp
    public final void LIZJ(String str, InterfaceControlSettings interfaceControlSettings, Exception exc) {
        boolean z;
        boolean z2;
        JSONObject LIZJ2 = C65232Piu.LIZJ("event", "init_settings");
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZJ2.put("status", 1);
        }
        int i = 2;
        if (exc != null) {
            LIZJ2.put("status", 2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLJ(exc.getClass()));
            LIZ.append(": ");
            LIZ.append(exc.getMessage());
            LIZJ2.put("reason", X1D.LIZIZ(LIZ));
        }
        if (interfaceControlSettings != null) {
            z2 = o.LJ(interfaceControlSettings.getUseNewControl(), Boolean.FALSE);
        } else {
            z2 = false;
        }
        LIZJ2.put("type", String.valueOf(!z2));
        if (interfaceControlSettings != null) {
            LIZJ2.put("version", interfaceControlSettings.getVersion());
            LIZJ2.put("user_type", interfaceControlSettings.m106getUserType());
            String uid = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid();
            if (uid == null || ujb.o.LJJJJJL(uid)) {
                i = -1;
            } else if (AV1.LJIIJJI()) {
                i = 1;
            } else if (!AV1.LJIIL()) {
                i = 0;
            }
            LIZJ2.put("current", i);
            if (!o.LJ(String.valueOf(i), interfaceControlSettings.m106getUserType())) {
                LIZJ2.put("status", 3);
            }
        }
        if (!LIZJ2.has("status")) {
            LIZJ2.put("status", 0);
        } else if (str != null && !ujb.o.LJJJJJL(str)) {
            LIZJ2.put("content", str);
        }
        ((ArrayList) LJI).add(LIZJ2);
        C75792yF.LIZJ(interfaceControlSettings);
        if (exc == null) {
            return;
        }
        C16880lQ.LJLLJ(exc.getClass());
        exc.getMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0290, code lost:
    
        if (r1 == true) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x033b, code lost:
    
        if (r1 == X.PYH.NOT_LOGIN) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00df, code lost:
    
        if (r0 == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0470 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x042a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.String> LJIJI(X.C58730N3e r18, java.util.HashMap<java.lang.String, java.lang.String> r19, int r20) {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYG.LJIJI(X.N3e, java.util.HashMap, int):java.util.HashMap");
    }

    public final void LJIL(String str, String str2, int i, C58730N3e c58730N3e) {
        ArrayList arrayList = (ArrayList) LJI;
        if (!arrayList.isEmpty()) {
            synchronized (LJFF) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C09900aA.LJ(EnumC58731N3f.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), (JSONObject) it.next());
                    }
                    ((ArrayList) LJI).clear();
                }
            }
        }
        JSONObject LIZJ2 = C65232Piu.LIZJ("event", "hit_rule");
        LIZJ2.put("flag", c58730N3e.LIZ);
        String str3 = c58730N3e.LIZLLL;
        if ((str3 != null && !ujb.o.LJJJJJL(str3)) || (str != null && !ujb.o.LJJJJJL(str))) {
            String str4 = c58730N3e.LIZLLL;
            if (str4 != null) {
                str = str4;
            }
            c58730N3e.LIZLLL = str;
            LJIJJ(c58730N3e);
            LIZJ2.put("url", c58730N3e.LIZLLL);
        }
        java.util.Set<String> set = c58730N3e.LJ;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = c58730N3e.LJ.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            LIZJ2.put("header_keys", jSONArray);
        }
        java.util.Set<String> set2 = c58730N3e.LJFF;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it3 = c58730N3e.LJFF.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
            LIZJ2.put("query_keys", jSONArray2);
        }
        java.util.Set<String> set3 = c58730N3e.LJIIIIZZ;
        if (set3 != null && !set3.isEmpty()) {
            LIZJ2.put("config", c58730N3e.LJIIIIZZ.toString());
        }
        LIZJ2.put("action", i);
        LIZJ2.put("net_type", str2);
        C09900aA.LJ(EnumC58731N3f.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), LIZJ2);
    }
}
