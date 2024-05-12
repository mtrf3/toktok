package X;

import Y.ARunnableS16S0201000_13;
import Y.ARunnableS4S2100000_11;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.PsN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65819PsN {
    public static final C65819PsN LIZ = new C65819PsN();
    public static final List<String> LIZIZ;
    public static final java.util.Map<String, C65825PsT> LIZJ;
    public static final AtomicReference<EnumC65821PsP> LIZLLL;
    public static final ConcurrentLinkedQueue<InterfaceC65829PsX> LJ;
    public static boolean LJFF;

    public final synchronized void LJ() {
        EnumC65821PsP enumC65821PsP = LIZLLL.get();
        if (EnumC65821PsP.NOT_LOADED != enumC65821PsP && EnumC65821PsP.LOADING != enumC65821PsP) {
            C65825PsT c65825PsT = (C65825PsT) ((ConcurrentHashMap) LIZJ).get(u.LIZLLL());
            Handler handler = new Handler(C16880lQ.LLJJJJ());
            if (EnumC65821PsP.ERROR == enumC65821PsP) {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC65829PsX> concurrentLinkedQueue = LJ;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new IDRunnableS6S0101000(4, concurrentLinkedQueue.poll(), 4));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC65829PsX> concurrentLinkedQueue2 = LJ;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new ARunnableS16S0201000_13(2, concurrentLinkedQueue2.poll(), c65825PsT, 2));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static {
        C16880lQ.LJLLJ(C65819PsN.class);
        LIZIZ = C47261Igj.LJJIJIIJI("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
        LIZJ = new ConcurrentHashMap();
        LIZLLL = new AtomicReference<>(EnumC65821PsP.NOT_LOADED);
        LJ = new ConcurrentLinkedQueue<>();
    }

    public static JSONObject LIZ() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZIZ);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest LJI = C66388Q3s.LJI(null, "app", null);
        LJI.LJI = true;
        LJI.LIZJ = bundle;
        JSONObject jSONObject = LJI.LIZJ().LJ;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final void LIZJ() {
        Context LIZJ2 = u.LIZJ();
        String LIZLLL2 = u.LIZLLL();
        if (C66373Q3d.LJIJJ(LIZLLL2)) {
            LIZLLL.set(EnumC65821PsP.ERROR);
            LIZ.LJ();
            return;
        }
        if (((ConcurrentHashMap) LIZJ).containsKey(LIZLLL2)) {
            LIZLLL.set(EnumC65821PsP.SUCCESS);
            LIZ.LJ();
            return;
        }
        AtomicReference<EnumC65821PsP> atomicReference = LIZLLL;
        EnumC65821PsP enumC65821PsP = EnumC65821PsP.NOT_LOADED;
        EnumC65821PsP enumC65821PsP2 = EnumC65821PsP.LOADING;
        while (true) {
            if (atomicReference.compareAndSet(enumC65821PsP, enumC65821PsP2)) {
                break;
            }
            if (atomicReference.get() != enumC65821PsP) {
                AtomicReference<EnumC65821PsP> atomicReference2 = LIZLLL;
                EnumC65821PsP enumC65821PsP3 = EnumC65821PsP.ERROR;
                EnumC65821PsP enumC65821PsP4 = EnumC65821PsP.LOADING;
                while (!atomicReference2.compareAndSet(enumC65821PsP3, enumC65821PsP4)) {
                    if (atomicReference2.get() != enumC65821PsP3) {
                        LIZ.LJ();
                        return;
                    }
                }
            }
        }
        u.LJ().execute(new ARunnableS4S2100000_11(LIZJ2, Q8U.LIZIZ(new Object[]{LIZLLL2}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), LIZLLL2, 0));
    }

    public static final C65825PsT LIZIZ(String str) {
        return (C65825PsT) ((ConcurrentHashMap) LIZJ).get(str);
    }

    public static final C65825PsT LJFF(String applicationId) {
        o.LJIIIZ(applicationId, "applicationId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
        if (concurrentHashMap.containsKey(applicationId)) {
            return (C65825PsT) concurrentHashMap.get(applicationId);
        }
        C65819PsN c65819PsN = LIZ;
        c65819PsN.getClass();
        C65825PsT LIZLLL2 = LIZLLL(applicationId, LIZ());
        if (o.LJ(applicationId, u.LIZLLL())) {
            LIZLLL.set(EnumC65821PsP.SUCCESS);
            c65819PsN.LJ();
        }
        return LIZLLL2;
    }

    public static C65825PsT LIZLLL(String applicationId, JSONObject jSONObject) {
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        String str;
        String str2;
        String str3;
        C65822PsQ c65822PsQ;
        String optString;
        boolean z;
        JSONArray optJSONArray;
        int length;
        int[] iArr;
        o.LJIIIZ(applicationId, "applicationId");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        boolean z2 = true;
        if (optJSONArray2 == null) {
            c65822PsQ = C65822PsQ.LJI.LIZ();
        } else {
            int length2 = optJSONArray2.length();
            if (length2 > 0) {
                int i = 0;
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        if (ujb.o.LJJJJIZL(optString, "other", z2)) {
                            str = optJSONObject.optString("recovery_message", null);
                            map = C65820PsO.LIZJ(optJSONObject);
                        } else if (ujb.o.LJJJJIZL(optString, "transient", true)) {
                            str2 = optJSONObject.optString("recovery_message", null);
                            map2 = C65820PsO.LIZJ(optJSONObject);
                        } else if (ujb.o.LJJJJIZL(optString, "login_recoverable", true)) {
                            str3 = optJSONObject.optString("recovery_message", null);
                            map3 = C65820PsO.LIZJ(optJSONObject);
                        }
                    }
                    if (i2 >= length2) {
                        break;
                    }
                    i = i2;
                    z2 = true;
                }
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            c65822PsQ = new C65822PsQ(map, map2, map3, str, str2, str3);
        }
        if ((jSONObject.optInt("app_events_feature_bitmask", 0) & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        if (optJSONArray3 != null && o.LJ(null, Boolean.TRUE)) {
            optJSONArray3.toString();
        }
        jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString2 = jSONObject.optString("gdpv4_nux_content", "");
        o.LJIIIIZZ(optString2, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        jSONObject.optInt("app_events_session_timeout", 60);
        C65823PsR c65823PsR = EnumC65824PsS.Companion;
        long optLong = jSONObject.optLong("seamless_login");
        c65823PsR.getClass();
        EnumSet LIZ2 = C65823PsR.LIZ(optLong);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap hashMap = new HashMap();
        if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i3);
                o.LJIIIIZZ(optJSONObject3, "dialogConfigData.optJSONObject(i)");
                String dialogNameWithFeature = optJSONObject3.optString("name");
                if (!C66373Q3d.LJIJJ(dialogNameWithFeature)) {
                    o.LJIIIIZZ(dialogNameWithFeature, "dialogNameWithFeature");
                    List LJLJJL = s.LJLJJL(dialogNameWithFeature, new String[]{"|"}, 0, 6);
                    if (LJLJJL.size() == 2) {
                        String str4 = (String) ORZ.LJLLJ(LJLJJL);
                        String str5 = (String) ORZ.LLFF(LJLJJL);
                        if (!C66373Q3d.LJIJJ(str4) && !C66373Q3d.LJIJJ(str5)) {
                            String optString3 = optJSONObject3.optString("url");
                            if (!C66373Q3d.LJIJJ(optString3)) {
                                android.net.Uri.parse(optString3);
                            }
                            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("versions");
                            if (optJSONArray4 != null) {
                                int length3 = optJSONArray4.length();
                                iArr = new int[length3];
                                if (length3 > 0) {
                                    int i5 = 0;
                                    while (true) {
                                        int i6 = i5 + 1;
                                        int optInt = optJSONArray4.optInt(i5, -1);
                                        if (optInt == -1) {
                                            String versionString = optJSONArray4.optString(i5);
                                            if (!C66373Q3d.LJIJJ(versionString)) {
                                                try {
                                                    o.LJIIIIZZ(versionString, "versionString");
                                                    optInt = Integer.parseInt(versionString);
                                                } catch (NumberFormatException unused) {
                                                    optInt = -1;
                                                }
                                            }
                                        }
                                        iArr[i5] = optInt;
                                        if (i6 >= length3) {
                                            break;
                                        }
                                        i5 = i6;
                                    }
                                }
                            } else {
                                iArr = null;
                            }
                            C65826PsU c65826PsU = new C65826PsU(str4, str5, iArr);
                            String str6 = c65826PsU.LIZ;
                            java.util.Map map4 = (java.util.Map) hashMap.get(str6);
                            if (map4 == null) {
                                map4 = new HashMap();
                                hashMap.put(str6, map4);
                            }
                            map4.put(c65826PsU.LIZIZ, c65826PsU);
                        }
                    }
                }
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        String optString4 = jSONObject.optString("smart_login_bookmark_icon_url");
        o.LJIIIIZZ(optString4, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString5 = jSONObject.optString("smart_login_menu_icon_url");
        o.LJIIIIZZ(optString5, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString6 = jSONObject.optString("sdk_update_message");
        o.LJIIIIZZ(optString6, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        jSONObject.optString("aam_rules");
        jSONObject.optString("suggested_events_setting");
        jSONObject.optString("restrictive_data_filter_params");
        C65825PsT c65825PsT = new C65825PsT(optString2, optBoolean, LIZ2, hashMap, c65822PsQ, optString4, optString5, z, optString6);
        ((ConcurrentHashMap) LIZJ).put(applicationId, c65825PsT);
        return c65825PsT;
    }
}
