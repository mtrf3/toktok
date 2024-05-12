package X;

import Y.IDDListenerS149S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class NAW {
    public static WeakReference<WebView> LJ;
    public static JSONObject LJI;
    public static boolean LJII;
    public static N8D LJIIJ;
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static final HashMap<String, Boolean> LIZIZ = new HashMap<>();
    public static final HashMap<String, Boolean> LIZJ = new HashMap<>();
    public static List<String> LIZLLL = new ArrayList();
    public static String LJFF = "";
    public static final HashMap<String, String> LJIIIIZZ = new HashMap<>();
    public static long LJIIIZ = System.currentTimeMillis();

    /* JADX WARN: Removed duplicated region for block: B:43:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[Catch: Exception -> 0x0082, TRY_ENTER, TryCatch #0 {Exception -> 0x0082, blocks: (B:34:0x005f, B:36:0x0076, B:46:0x0086, B:48:0x009c, B:52:0x00a6), top: B:33:0x005f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJI() {
        /*
            r10 = 0
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r10)
            r7 = 0
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            if (r0 == 0) goto L19
            java.lang.String r5 = r0.getUid()
        L12:
            boolean r0 = X.C6D8.LIZLLL()
            if (r0 == 0) goto L1b
            return r7
        L19:
            r5 = r7
            goto L12
        L1b:
            if (r5 == 0) goto L23
            int r0 = r5.length()
            if (r0 != 0) goto L27
        L23:
            r0 = 1
        L24:
            if (r0 == 0) goto L29
            return r7
        L27:
            r0 = 0
            goto L24
        L29:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = X.NAW.LJIIIIZZ
            java.lang.Object r0 = r1.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L39
            int r0 = r0.length()
            if (r0 != 0) goto L43
        L39:
            r0 = 1
        L3a:
            if (r0 != 0) goto L45
            java.lang.Object r0 = r1.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L43:
            r0 = 0
            goto L3a
        L45:
            java.lang.String r0 = "autofill_info"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            byte[] r8 = r0.getBytes(r5, r7)
            if (r8 != 0) goto L52
            return r7
        L52:
            int r0 = r8.length
            if (r0 != 0) goto L59
            r0 = 1
        L56:
            if (r0 == 0) goto L5b
            return r7
        L59:
            r0 = 0
            goto L56
        L5b:
            java.lang.String r9 = "this as java.lang.String).getBytes(charset)"
            java.lang.String r2 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r2)     // Catch: java.lang.Exception -> L82
            r0 = 256(0x100, float:3.59E-43)
            r1.init(r0)     // Catch: java.lang.Exception -> L82
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Exception -> L82
            com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings$AdAutofillConfig r0 = com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings.LIZ()     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = r0.autofillKey     // Catch: java.lang.Exception -> L82
            if (r1 == 0) goto L7f
            int r0 = r1.length()     // Catch: java.lang.Exception -> L82
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = 0
            goto L80
        L7f:
            r0 = 1
        L80:
            if (r0 == 0) goto L86
        L82:
            r3 = r7
        L83:
            if (r3 != 0) goto Lbb
            return r7
        L86:
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L82
            java.nio.charset.Charset r3 = X.PVC.LIZ     // Catch: java.lang.Exception -> L82
            byte[] r0 = r1.getBytes(r3)     // Catch: java.lang.Exception -> L82
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)     // Catch: java.lang.Exception -> L82
            r4.<init>(r0, r2)     // Catch: java.lang.Exception -> L82
            com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings$AdAutofillConfig r0 = com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings.LIZ()     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = r0.autofillIv     // Catch: java.lang.Exception -> L82
            if (r2 == 0) goto La2
            int r0 = r2.length()     // Catch: java.lang.Exception -> L82
            if (r0 != 0) goto La3
        La2:
            r10 = 1
        La3:
            if (r10 == 0) goto La6
            goto L82
        La6:
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L82
            byte[] r0 = r2.getBytes(r3)     // Catch: java.lang.Exception -> L82
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)     // Catch: java.lang.Exception -> L82
            r1.<init>(r0)     // Catch: java.lang.Exception -> L82
            r0 = 2
            r6.init(r0, r4, r1)     // Catch: java.lang.Exception -> L82
            byte[] r3 = r6.doFinal(r8)     // Catch: java.lang.Exception -> L82
            goto L83
        Lbb:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = X.NAW.LJIIIIZZ
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = X.PVC.LIZ
            r1.<init>(r3, r0)
            r2.put(r5, r1)
            java.lang.Object r0 = r2.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NAW.LJI():java.lang.String");
    }

    static {
        System.currentTimeMillis();
    }

    public static boolean LJFF() {
        List<String> list = AdAutofillConfigSettings.LIZ().channelList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        while (true) {
            boolean z = false;
            for (String str : list) {
                if (s.LJJJLZIJ(AdAutofillConfigSettings.LIZ().autofillPopupSchema, str, false)) {
                    C58909NAb.LIZ.getClass();
                    if (NH3.LIZIZ() != null) {
                        z = O3U.LIZ(AdLandPagePreloadServiceImpl.LJJI().LJIIL("global"), str);
                    }
                }
            }
            return z;
        }
    }

    public static final JSONArray LJIIIIZZ() {
        boolean z;
        JSONObject jSONObject;
        JSONArray names;
        String LJI2 = LJI();
        if (LJI2 == null || LJI2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (names = (jSONObject = new JSONObject(LJI2)).names()) == null || names.length() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = names.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONObject.optString(names.optString(i));
            if (optString != null && optString.length() != 0) {
                jSONArray.put(names.optString(i));
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    public static JSONObject LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String LJI2 = LJI();
        if (LJI2 == null || LJI2.length() == 0) {
            jSONObject2 = new JSONObject();
        } else {
            String LJI3 = LJI();
            if (LJI3 == null) {
                LJI3 = "";
            }
            jSONObject2 = new JSONObject(LJI3);
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            return jSONObject2;
        }
        if (names.length() == 0) {
            return jSONObject2;
        }
        int length = names.length();
        for (int i = 0; i < length; i++) {
            if (!TextUtils.equals(jSONObject2.optString(names.optString(i)), jSONObject.optString(names.optString(i)))) {
                jSONObject2.put(names.optString(i), jSONObject.optString(names.optString(i)));
            }
        }
        if (jSONObject2.length() != 0) {
            return jSONObject2;
        }
        return null;
    }

    public static final void LIZIZ(boolean z) {
        WebView webView;
        String str;
        String str2;
        String str3;
        String LJI2;
        WeakReference<WebView> weakReference = LJ;
        if (weakReference != null && (webView = weakReference.get()) != null) {
            if (z) {
                JSONObject jSONObject = LJI;
                String str4 = null;
                if (jSONObject == null || (str = jSONObject.optString("cid")) == null) {
                    str = "";
                }
                JSONObject jSONObject2 = LJI;
                if (jSONObject2 == null || (str2 = jSONObject2.optString("log_extra")) == null) {
                    str2 = "";
                }
                C58655N0h LJ2 = C58704N2e.LJ("ad_wap_stat", "autofill_agree", str, str2, null);
                LJ2.LIZJ("autofill", "refer");
                LJ2.LIZIZ(LJFF, "url");
                List<String> list = LIZLLL;
                if (list != null) {
                    str3 = list.toString();
                } else {
                    str3 = null;
                }
                LJ2.LIZIZ(str3, "autofill_fields");
                LJ2.LJI();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("window.__autoFillCallback__(");
                List<String> list2 = LIZLLL;
                if (list2 != null && !list2.isEmpty() && (LJI2 = LJI()) != null) {
                    JSONObject jSONObject3 = new JSONObject(LJI2);
                    JSONObject jSONObject4 = new JSONObject();
                    List<String> list3 = LIZLLL;
                    if (list3 != null) {
                        synchronized (list3) {
                            for (String str5 : list3) {
                                jSONObject4.put(str5, jSONObject3.optString(str5));
                            }
                        }
                    }
                    str4 = jSONObject4.toString();
                }
                webView.evaluateJavascript(JBR.LJFF(LIZ2, str4, ",true)", LIZ2), NAZ.LIZ);
            }
            webView.evaluateJavascript("window.__AutoFillPopupClose__()", C58908NAa.LIZ);
        }
    }

    public static boolean LIZJ(boolean z) {
        if (LIZLLL(z) == -1) {
            return true;
        }
        return false;
    }

    public static int LIZLLL(boolean z) {
        User currentUser;
        if (!C53201KuL.LIZ()) {
            return 0;
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getUid() == null) {
            return 1;
        }
        if (C6D8.LIZLLL()) {
            return 2;
        }
        if (!z) {
            return 3;
        }
        return -1;
    }

    public static JSONObject LJ(JSONObject autofill) {
        JSONObject jSONObject;
        o.LJIIIZ(autofill, "autofill");
        String LJI2 = LJI();
        if (LJI2 == null || LJI2.length() == 0) {
            jSONObject = new JSONObject();
        } else {
            String LJI3 = LJI();
            if (LJI3 == null) {
                LJI3 = "";
            }
            jSONObject = new JSONObject(LJI3);
        }
        JSONArray names = autofill.names();
        if (names == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        int length = names.length();
        for (int i = 0; i < length; i++) {
            if (!TextUtils.equals(jSONObject.optString(names.optString(i)), autofill.optString(names.optString(i)))) {
                jSONObject2.put(names.optString(i), autofill.optString(names.optString(i)));
            }
        }
        if (jSONObject2.length() == 0) {
            return null;
        }
        return jSONObject2;
    }

    public static final void LJII(boolean z) {
        IUserService createIUserServicebyMonsterPlugin;
        User currentUser;
        String uid;
        if (!LIZJ(z) || (createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false)) == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || o.LJ(LIZ.get(uid), Boolean.TRUE)) {
            return;
        }
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/identity/get_fields/", E2C.LIZJ("fields", "[3]"), new N8P(uid));
    }

    public static final void LJIILIIL(String str) {
        String str2;
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        byte[] bArr = null;
        if (createIUserServicebyMonsterPlugin != null && (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) != null) {
            str2 = currentUser.getUid();
        } else {
            str2 = null;
        }
        if (C6D8.LIZLLL() || str2 == null || str2.length() == 0) {
            return;
        }
        LJIIIIZZ.put(str2, str);
        if (str == null) {
            return;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            String str3 = AdAutofillConfigSettings.LIZ().autofillKey;
            if (str3 != null && str3.length() != 0) {
                Charset charset = PVC.LIZ;
                byte[] bytes = str3.getBytes(charset);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                String str4 = AdAutofillConfigSettings.LIZ().autofillIv;
                if (str4 != null && str4.length() != 0) {
                    byte[] bytes2 = str4.getBytes(charset);
                    o.LJIIIIZZ(bytes2, "this as java.lang.String).getBytes(charset)");
                    cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
                    byte[] bytes3 = str.getBytes(charset);
                    o.LJIIIIZZ(bytes3, "this as java.lang.String).getBytes(charset)");
                    bArr = cipher.doFinal(bytes3);
                }
            }
        } catch (Exception unused) {
        }
        Keva.getRepo("autofill_info").storeBytes(str2, bArr);
    }

    public static final void LJIIL(Integer num, String str) {
        if (str != null && str.length() != 0 && num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    return;
                }
                LIZJ.put(str, Boolean.TRUE);
                return;
            }
            LIZIZ.put(str, Boolean.TRUE);
        }
    }

    public static final void LJIIJ(int i, int i2, int i3, JSONObject jSONObject) {
        String str;
        JSONArray names;
        String optString;
        JSONObject jSONObject2 = LJI;
        String str2 = null;
        if (jSONObject2 != null) {
            str = jSONObject2.optString("cid");
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        JSONObject jSONObject3 = LJI;
        if (jSONObject3 != null && (optString = jSONObject3.optString("log_extra")) != null) {
            str3 = optString;
        }
        C58655N0h LJ2 = C58704N2e.LJ("ad_wap_stat", "popup_show", str, str3, null);
        LJ2.LIZJ("autofill_popup_window", "refer");
        LJ2.LIZIZ(LJFF, "url");
        LJ2.LIZIZ(Integer.valueOf(i), "popup_type");
        if (i == 0) {
            str2 = String.valueOf(LIZLLL);
        } else if (jSONObject != null && (names = jSONObject.names()) != null) {
            str2 = names.toString();
        }
        LJ2.LIZIZ(str2, "autofill_fields");
        LJ2.LIZIZ(Integer.valueOf(i2), "is_success");
        if (i2 == 1) {
            i3 = -1;
        }
        C0JU.LIZJ(i3, LJ2, "fail_reason");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [org.json.JSONArray] */
    public static final void LJIIIZ(WebView webView, JSONObject jSONObject, String str, String str2, InterfaceC59138NIw interfaceC59138NIw) {
        o.LJIIIZ(webView, "webView");
        if (str == null) {
            return;
        }
        if (str2 != null && ujb.o.LJJJLIIL(str2, "about:blank", false)) {
            return;
        }
        LJFF = str2;
        LJI = jSONObject;
        String str3 = "";
        String string = Keva.getRepo("autofill_info").getString("autofill_js", "");
        o.LJIIIIZZ(string, "getRepo(AUTOFILL_INFO).getString(AUTOFILL_JS, \"\")");
        Object LJIIIIZZ2 = LJIIIIZZ();
        String str4 = "[]";
        if (LJIIIIZZ2 == null) {
            LJIIIIZZ2 = "[]";
        }
        int LIZLLL2 = LIZLLL(interfaceC59138NIw.LIZ());
        boolean LIZJ2 = LIZJ(interfaceC59138NIw.LIZ());
        if (string.length() == 0 || LIZJ2) {
            LIZLLL2 = -1;
        }
        String optString = jSONObject.optString("cid");
        if (optString == null) {
            optString = "";
        }
        String optString2 = jSONObject.optString("log_extra");
        if (optString2 != null) {
            str3 = optString2;
        }
        C58655N0h LJ2 = C58704N2e.LJ("ad_wap_stat", "inject_js", optString, str3, null);
        LJ2.LIZJ("autofill", "refer");
        LJ2.LIZIZ(str2, "url");
        LJ2.LIZIZ(LJIIIIZZ2.toString(), "autofill_fields");
        LJ2.LIZIZ(Integer.valueOf(LIZJ2 ? 1 : 0), "autofill_enable");
        LJ2.LIZIZ(Integer.valueOf(LIZLLL2), "fail_reason");
        LJ2.LJI();
        if (!LIZJ(interfaceC59138NIw.LIZ()) || string.length() == 0) {
            return;
        }
        boolean LIZ2 = interfaceC59138NIw.LIZ();
        ?? LJIIIIZZ3 = LJIIIIZZ();
        if (LJIIIIZZ3 != null) {
            str4 = LJIIIIZZ3;
        }
        boolean LIZJ3 = LIZJ(LIZ2);
        jSONObject.put("url", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("autoFillField", str4);
        jSONObject2.put("canAutoFill", LIZJ3);
        String LJJJJZ = ujb.o.LJJJJZ(string, "\"/** adInfo **/\"", String.valueOf(jSONObject), true);
        String jSONObject3 = jSONObject2.toString();
        o.LJIIIIZZ(jSONObject3, "autofillInfoJsonObject.toString()");
        String LJJJJZ2 = ujb.o.LJJJJZ(LJJJJZ, "\"/** autoFillInfo **/\"", jSONObject3, true);
        LJ = new WeakReference<>(webView);
        webView.evaluateJavascript(LJJJJZ2, EAQ.LIZ);
    }

    public static final void LJIILJJIL(View view, JSONObject jSONObject, boolean z, boolean z2, boolean z3, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        String str;
        JSONArray names;
        JSONObject LJ2;
        JSONArray names2;
        o.LJIIIZ(view, "view");
        HashMap hashMap = new HashMap();
        String jSONObject2 = new JSONObject().put("3", jSONObject).toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        hashMap.put("fields", jSONObject2);
        if (jSONObject == null || jSONObject.names() == null || (((names = jSONObject.names()) != null && names.length() == 0) || (LJ2 = LJ(jSONObject)) == null || (names2 = LJ2.names()) == null || (str = names2.toString()) == null)) {
            str = "[]";
        }
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/identity/set_fields/", hashMap, new N8G(z, z2, z3, str, jSONObject, view, interfaceC88472Yns));
    }

    public static final void LJIIJJI(Context context, boolean z, Integer num, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) {
        String str3;
        ActivityC45651qj LJJIFFI;
        boolean z2;
        String string;
        JSONObject jSONObject3;
        String str4;
        if (context == null) {
            return;
        }
        if (z) {
            HashMap LIZJ2 = C03660Ck.LIZJ("enter_from", "user_information_page");
            if (LJFF()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ2.put("lynx_gecko_ready_status", str4);
            FMX.LJIIL("enter_contact_info_edit_page", LIZJ2);
            str3 = AdAutofillConfigSettings.LIZ().settingLynxSchema;
        } else {
            if (num == null) {
                return;
            }
            if (num.intValue() == 0) {
                str3 = AdAutofillConfigSettings.LIZ().autofillPopupSchema;
            } else if (num.intValue() != 1) {
                return;
            } else {
                str3 = AdAutofillConfigSettings.LIZ().savePopupSchema;
            }
        }
        if (str3 == null) {
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        if (!z) {
            jSONObject4.put("url", LJFF);
            jSONObject4.put("adInfo", jSONObject);
            jSONObject4.put("requestId", str);
        }
        if ((num != null && num.intValue() == 0) || z) {
            if (LJI() == null) {
                jSONObject3 = new JSONObject();
            } else {
                String LJI2 = LJI();
                if (LJI2 == null) {
                    LJI2 = "";
                }
                jSONObject3 = new JSONObject(LJI2);
            }
            jSONObject4.put("autofillInfo", jSONObject3);
        }
        if (num != null && num.intValue() == 1) {
            jSONObject4.put("autofillInfo", LIZ(jSONObject2));
            if (C78857UxB.LJJJIL(str2)) {
                jSONObject4.put("extraInfo", str2);
            }
        }
        if (!z) {
            jSONObject4.put("learnMoreLink", AdAutofillConfigSettings.LIZ().learnMoreLink);
        }
        android.net.Uri parse = UriProtector.parse(str3);
        if (!z) {
            try {
                FFL.LJIIIZ().getClass();
                if (FFL.LJIIJ(31744, 0, "ad_autofill_content_type", true) == 1) {
                    Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ2 != null && (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ2)) != null) {
                        if (num == null || num.intValue() != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        N8D n8d = new N8D(LJJIFFI, z2, jSONObject4);
                        LJIIJ = n8d;
                        ASL asl = new ASL();
                        if (z2) {
                            string = LJJIFFI.getString(R.string.by7);
                        } else if (LJIIIIZZ() == null) {
                            string = LJJIFFI.getString(R.string.q_f);
                        } else {
                            string = LJJIFFI.getString(R.string.q_h);
                        }
                        C2068389v LIZ2 = C251929ue.LIZ(string, "if (isAutofill) activity…_window_update_next_time)");
                        LIZ2.LIZ = R.raw.icon_color_tiktok_logo_dark;
                        C235119Kp c235119Kp = new C235119Kp();
                        C234529Ii c234529Ii = new C234529Ii();
                        c234529Ii.LIZ(LIZ2);
                        c235119Kp.LIZLLL(c234529Ii);
                        C234529Ii LIZJ3 = s1.LIZJ();
                        LIZJ3.LIZJ = R.raw.icon_x_mark_small;
                        LIZJ3.LIZIZ(new AqS160S0100000_10(n8d, 499));
                        c235119Kp.LIZIZ(LIZJ3);
                        C9KF c9kf = new C9KF();
                        c9kf.LIZJ = string;
                        c235119Kp.LIZJ = c9kf;
                        c235119Kp.LIZLLL = true;
                        asl.LIZ.LJLLL = c235119Kp;
                        asl.LIZ(n8d.LIZJ);
                        asl.LJI(0);
                        TuxSheet tuxSheet = asl.LIZ;
                        tuxSheet.LJZI = false;
                        tuxSheet.LJLILLLLZI = new IDDListenerS149S0100000_10(n8d, 4);
                        tuxSheet.showNow(LJJIFFI.getSupportFragmentManager(), null);
                        return;
                    }
                    return;
                }
            } catch (Exception unused) {
            }
            LJIIIZ = System.currentTimeMillis();
            if (s.LJJJLZIJ(str3, "lynxview_popup", false)) {
                IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
                if (LJFF2 != null) {
                    String uri = parse.buildUpon().appendQueryParameter("initialData", jSONObject4.toString()).appendQueryParameter("target_handler", "ad_autofill").build().toString();
                    o.LJIIIIZZ(uri, "uri.buildUpon().appendQu…              .toString()");
                    LJFF2.LIZLLL(context, uri, null, AdLandPagePreloadServiceImpl.LJJI().LJIIL("global"), C59209NLp.LIZIZ(), false);
                    return;
                }
                return;
            }
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            NAX nax = new NAX();
            c40342FsQ.getClass();
            C40342FsQ.LJI(nax);
            SmartRouter.buildRoute(context, parse.buildUpon().appendQueryParameter("initialData", jSONObject4.toString()).appendQueryParameter("target_handler", "ad_autofill").build().toString()).open();
            return;
        }
        SmartRouter.buildRoute(context, parse.buildUpon().appendQueryParameter("initialData", jSONObject4.toString()).build().toString()).open();
    }
}
