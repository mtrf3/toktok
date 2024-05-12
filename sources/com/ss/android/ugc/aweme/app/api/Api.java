package com.ss.android.ugc.aweme.app.api;

import X.C2NU;
import X.C38300F1k;
import X.C38303F1n;
import X.C38307F1r;
import X.C38333F2r;
import X.C38341F2z;
import X.C38354F3m;
import X.C66619QCp;
import X.C76L;
import X.E8L;
import X.EF7;
import X.EFJ;
import X.EJ6;
import X.F30;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC38301F1l;
import X.InterfaceC61858OPm;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import defpackage.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Api {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static NetApi LJ;

    /* loaded from: classes4.dex */
    public interface NetApi {
        @E8L
        C76L<String> doGet(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);
    }

    static {
        String str = EF7.LJI.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("https://");
        LIZ3.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        LIZ = LIZIZ2;
        LIZIZ = i0.LJFF(LIZIZ2, "/aweme/v1/upload/image/");
        LIZJ = i0.LJFF(LIZIZ2, "/aweme/v1/upload/image/");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LIZIZ2);
        LIZ4.append("/aweme/v1/weibo/bind/");
        X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ2);
        LIZ5.append("/aweme/v1/friend/register/notice/");
        LIZLLL = X1D.LIZIZ(LIZ5);
    }

    public static boolean LJI(JSONObject jSONObject) {
        if (jSONObject.has("statusCode") && jSONObject.optInt("statusCode") == 0) {
            return true;
        }
        if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
            return true;
        }
        if (jSONObject.has("message") && TextUtils.equals("success", jSONObject.optString("message"))) {
            return true;
        }
        return false;
    }

    public static void LIZ(String str, String str2) {
        JSONObject optJSONObject;
        if (!C38354F3m.LJ(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (!LJI(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    C38333F2r c38333F2r = new C38333F2r(optJSONObject.optInt("error_code"));
                    c38333F2r.setErrorMsg(optJSONObject.optString("description", ""));
                    c38333F2r.setResponse(str);
                    c38333F2r.setUrl(str2);
                    throw c38333F2r;
                }
                C38333F2r c38333F2r2 = new C38333F2r(jSONObject.optInt("status_code"));
                c38333F2r2.setErrorMsg(jSONObject.optString("message", ""));
                c38333F2r2.setErrorMsg(jSONObject.optString("status_msg", ""));
                c38333F2r2.setPrompt(jSONObject.optString("prompts", ""));
                c38333F2r2.setResponse(str);
                c38333F2r2.setUrl(str2);
                c38333F2r2.setBlockCode(jSONObject.optInt("block_code"));
                throw c38333F2r2;
            }
            return;
        }
        throw new C38307F1r();
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!C38354F3m.LJ(str)) {
            if (!LJI(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    C38333F2r c38333F2r = new C38333F2r(optJSONObject.optInt("error_code"));
                    c38333F2r.setErrorMsg(optJSONObject.optString("description", ""));
                    c38333F2r.setResponse(str);
                    c38333F2r.setUrl(str2);
                    throw c38333F2r;
                }
                C38333F2r c38333F2r2 = new C38333F2r(jSONObject.optInt("status_code"));
                c38333F2r2.setErrorMsg(jSONObject.optString("message", ""));
                c38333F2r2.setErrorMsg(jSONObject.optString("status_msg", ""));
                c38333F2r2.setPrompt(jSONObject.optString("prompts", ""));
                c38333F2r2.setResponse(str);
                c38333F2r2.setUrl(str2);
                c38333F2r2.setBlockCode(jSONObject.optInt("block_code"));
                throw c38333F2r2;
            }
            return;
        }
        throw new C38307F1r();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [org.json.JSONObject, T] */
    public static <T> T LJII(String str, InterfaceC38301F1l<T> interfaceC38301F1l, String str2, String str3) {
        JSONObject optJSONObject;
        if (!C38354F3m.LJ(str)) {
            ?? r1 = (T) new JSONObject(str);
            if (!LJI(r1)) {
                if (r1.has("message") && TextUtils.equals(r1.optString("message"), "error") && (optJSONObject = r1.optJSONObject("data")) != null) {
                    ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                    C38333F2r c38333F2r = new C38333F2r(optJSONObject.optInt("error_code"));
                    c38333F2r.setErrorMsg(optJSONObject.optString("description", ""));
                    c38333F2r.setResponse(str);
                    c38333F2r.setUrl(str3);
                    throw c38333F2r;
                }
                C38333F2r c38333F2r2 = new C38333F2r(r1.optInt("status_code"));
                c38333F2r2.setErrorMsg(r1.optString("message", ""));
                c38333F2r2.setErrorMsg(r1.optString("status_msg", ""));
                c38333F2r2.setPrompt(r1.optString("prompts", ""));
                c38333F2r2.setResponse(str);
                c38333F2r2.setUrl(str3);
                c38333F2r2.setBlockCode(r1.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw c38333F2r2;
            }
            try {
                if (TextUtils.isEmpty(str2)) {
                    if ((interfaceC38301F1l instanceof C38341F2z) && ((C38341F2z) interfaceC38301F1l).LIZ == null) {
                        return r1;
                    }
                    if (interfaceC38301F1l instanceof C38303F1n) {
                        return r1;
                    }
                    return interfaceC38301F1l.LIZ(str);
                }
                return interfaceC38301F1l.LIZ(r1.opt(str2));
            } catch (Exception unused) {
                return null;
            }
        }
        throw new C38307F1r();
    }

    public static Object LIZJ(String str, InterfaceC38301F1l interfaceC38301F1l, String str2, F30 f30, Object obj) {
        boolean z;
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z || (!TextUtils.isEmpty(str) && str.contains("/aweme/v1/feed/?type=0"))) {
            if (LJ == null) {
                LJ = (NetApi) RetrofitFactory.LIZLLL().LIZ(EFJ.LIZJ).LJFF().LIZ.LIZ(NetApi.class);
            }
            ArrayList arrayList = new ArrayList();
            if (f30 != null) {
                ArrayList arrayList2 = (ArrayList) f30.LJLIL;
                for (InterfaceC61858OPm interfaceC61858OPm : (InterfaceC61858OPm[]) arrayList2.toArray(new InterfaceC61858OPm[arrayList2.size()])) {
                    arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
                }
            }
            try {
                return LJII(LJ.doGet(str, arrayList, obj).get(), interfaceC38301F1l, str2, str);
            } catch (ExecutionException e) {
                throw e.getCause();
            }
        }
        throw new IOException();
    }

    public static <T> T LJ(String str, int i, String str2, InterfaceC38301F1l<T> interfaceC38301F1l, String str3) {
        boolean z;
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            return (T) LJII(NetworkUtils.postFile(i, str, "file", str2), interfaceC38301F1l, str3, str);
        }
        throw new IOException();
    }

    public static <T> T LIZLLL(int i, String str, Class<T> cls, String str2, F30 f30, Object obj) {
        if (String.class.equals(cls)) {
            return (T) LIZJ(str, C38300F1k.LIZ, str2, f30, null);
        }
        return (T) LIZJ(str, new C38341F2z(cls), str2, f30, obj);
    }

    public static <T> T LJFF(String str, int i, String str2, Class<T> cls, String str3, List<C66619QCp> list) {
        boolean z;
        if (String.class.equals(cls)) {
            return (T) LJ(str, i, str2, C38300F1k.LIZ, str3);
        }
        C38341F2z c38341F2z = new C38341F2z(cls);
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            return (T) LJII(NetworkUtils.postFile(i, str, "file", str2, list), c38341F2z, str3, str);
        }
        throw new IOException();
    }
}
