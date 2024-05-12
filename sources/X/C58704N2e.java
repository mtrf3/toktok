package X;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commercialize.setting.SecureSDKConfigSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.N2e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58704N2e {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ() {
        FFL.LJIIIZ().getClass();
        return TextUtils.equals(FFL.LJIILJJIL(31744, "enable_send_staging_adlog", "v3", true), "all");
    }

    public static final boolean LIZJ() {
        FFL.LJIIIZ().getClass();
        return TextUtils.equals(FFL.LJIILJJIL(31744, "enable_send_staging_adlog", "v3", true), "v1");
    }

    public static final C58655N0h LIZLLL(String tag, String label, CommonAdData commonAdData) {
        String valueOf;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(label, "label");
        if (commonAdData == null) {
            return new C58655N0h("", "", "", null, null);
        }
        Long creativeId = commonAdData.getCreativeId();
        if (creativeId == null) {
            return new C58655N0h("", "", "", null, null);
        }
        creativeId.longValue();
        if (commonAdData.getGroupId() == null) {
            valueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            valueOf = String.valueOf(commonAdData.getGroupId());
        }
        C58655N0h c58655N0h = new C58655N0h(tag, label, String.valueOf(commonAdData.getCreativeId()), valueOf, commonAdData.getLogExtra());
        c58655N0h.LIZIZ(Integer.valueOf(commonAdData.getChargeType()), "charge_type");
        c58655N0h.LIZIZ(Integer.valueOf(commonAdData.getSystemOrigin()), "system_origin");
        synchronized (C55502LqM.class) {
            List<InterfaceC55513LqX> list = C55502LqM.LIZIZ;
            if (!((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC55513LqX) it.next()).LIZ(commonAdData, c58655N0h);
                    } catch (Throwable th) {
                        C78983UzD.LJIIZILJ(th);
                    }
                }
            }
        }
        return c58655N0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.1ET] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.Usq] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1ET] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.1ET] */
    public static void LIZ(String str, String str2, String creativeId, JSONObject jSONObject) {
        final ?? r3;
        int i;
        Printer printer;
        o.LJIIIZ(creativeId, "creativeId");
        long parseLong = CastLongProtector.parseLong(creativeId);
        C62822Ol8 c62822Ol8 = SecureSDKConfigSetting.LIZJ;
        if (!((SecureSDKConfigSetting.SecureSDkConfig) c62822Ol8.getValue()).isEnableCheck) {
            return;
        }
        String LIZIZ = EF7.LIZIZ();
        if (!C04400Fg.LIZ) {
            SecureSDKConfigSetting.SecureSDkConfig secureSDkConfig = (SecureSDKConfigSetting.SecureSDkConfig) c62822Ol8.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duplicate_check_threshold", secureSDkConfig.duplicateCheckThreshold);
            jSONObject2.put("validate_skip_list", new JSONArray((Collection) secureSDkConfig.validateSkipList));
            jSONObject2.put("duplicate_filter_list", new JSONArray((Collection) secureSDkConfig.duplicateFilterList));
            final N0C n0c = new N0C();
            r3 = new C78588Usq();
            if (!C04400Fg.LIZ) {
                C04400Fg.LIZ = true;
                o.LJFF(C16880lQ.LLLLL(LIZIZ), "context.applicationContext");
                int optInt = jSONObject2.optInt("duplicate_check_threshold", 0);
                C04430Fj.LIZ = optInt;
                if (optInt > 0) {
                    C04430Fj.LIZIZ = C16880lQ.LLJJJJ();
                    C04420Fi c04420Fi = new Printer() { // from class: X.0Fi
                        @Override // android.util.Printer
                        public final void println(String str3) {
                            boolean z;
                            if (C04430Fj.LJFF.nextInt(100) < C04430Fj.LIZ) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C04430Fj.LJ = z;
                            if (z && str3 != null && str3.charAt(0) == '>') {
                                InterfaceC15090iX interfaceC15090iX = C04430Fj.LIZLLL;
                                Iterator it = ((HashSet) C04430Fj.LIZJ).iterator();
                                while (it.hasNext()) {
                                    try {
                                        interfaceC15090iX.LIZ(it.next());
                                    } catch (Exception unused) {
                                    }
                                }
                                ((HashSet) C04430Fj.LIZJ).clear();
                            }
                        }
                    };
                    if (!C04470Fn.LIZIZ) {
                        C04470Fn.LIZIZ = true;
                        C04470Fn.LIZ = new C04460Fm();
                        try {
                            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
                            declaredField.setAccessible(true);
                            printer = (Printer) declaredField.get(C16880lQ.LLJJJJ());
                        } catch (Exception unused) {
                            printer = null;
                        }
                        C04470Fn.LIZJ = printer;
                        if (C04470Fn.LIZJ != null) {
                            ((ArrayList) C04470Fn.LIZ.LJLIL).add(C04470Fn.LIZJ);
                        }
                        C16880lQ.LLJJJJ().setMessageLogging(C04470Fn.LIZ);
                    }
                    if (C04470Fn.LIZ != null && C04470Fn.LIZ.LJLJI != null && !((ArrayList) C04470Fn.LIZ.LJLJI).contains(c04420Fi)) {
                        ((ArrayList) C04470Fn.LIZ.LJLJI).add(c04420Fi);
                        C04470Fn.LIZ.LJLJJI = true;
                    }
                }
                final JSONArray optJSONArray = jSONObject2.optJSONArray("validate_skip_list");
                final JSONArray optJSONArray2 = jSONObject2.optJSONArray("duplicate_filter_list");
                C04400Fg.LIZIZ = new InterfaceC04450Fl(r3, n0c, optJSONArray2, optJSONArray) { // from class: X.1ET
                    public final InterfaceC04450Fl LJLIL;
                    public final InterfaceC04440Fk LJLILLLLZI;
                    public final JSONArray LJLJI;
                    public final JSONArray LJLJJI;

                    public static boolean LIZ(String str3, String str4, JSONArray jSONArray) {
                        if (jSONArray != null) {
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                Object obj = jSONArray.get(i2);
                                if (obj instanceof JSONArray) {
                                    JSONArray jSONArray2 = (JSONArray) obj;
                                    if (jSONArray2.length() >= 3 && ((o.LJ("event_v3", jSONArray2.get(0)) || o.LJ(jSONArray2.get(0), "*")) && ((o.LJ(str3, jSONArray2.get(1)) || o.LJ(jSONArray2.get(1), "*")) && (o.LJ(str4, jSONArray2.get(2)) || o.LJ(jSONArray2.get(2), "*"))))) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }

                    @Override // X.InterfaceC04450Fl
                    public final void LJIIL(long j, String str3, String str4) {
                        if (!LIZ(str3, str4, this.LJLJI)) {
                            this.LJLILLLLZI.onEventV3("ad_event_duplicated_monitor", new JSONObject().put("category", "event_v3").put("tag", str3).put("label", str4));
                            InterfaceC04450Fl interfaceC04450Fl = this.LJLIL;
                            if (interfaceC04450Fl != null) {
                                interfaceC04450Fl.LJIIL(j, str3, str4);
                            }
                        }
                    }

                    {
                        this.LJLIL = r3;
                        this.LJLILLLLZI = n0c;
                        this.LJLJI = optJSONArray2;
                        this.LJLJJI = optJSONArray;
                    }

                    @Override // X.InterfaceC04450Fl
                    public final void LJJIJ(int i2, String str3, String str4, long j, JSONObject jSONObject3) {
                        if (!LIZ(str3, str4, this.LJLJJI)) {
                            if (jSONObject3.has("is_ad_event")) {
                                jSONObject3.remove("is_ad_event");
                            }
                            this.LJLILLLLZI.onEventV3("ad_event_monitor", jSONObject3);
                            InterfaceC04450Fl interfaceC04450Fl = this.LJLIL;
                            if (interfaceC04450Fl != null) {
                                interfaceC04450Fl.LJJIJ(i2, str3, str4, j, jSONObject3);
                            }
                        }
                    }
                };
            }
        }
        if (!C04400Fg.LIZ) {
            return;
        }
        ?? r8 = C04400Fg.LIZIZ;
        try {
            LIZIZ = str;
            r3 = jSONObject;
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> keys = r3.keys();
            o.LJFF(keys, "extJson.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.putOpt(next, r3.opt(next));
            }
            jSONObject3.put("monitor_ad_id", parseLong).put("tag", "invalid_ad").putOpt("monitor_tag", LIZIZ).putOpt("monitor_label", str2).putOpt("category", "event_v3");
            if (parseLong <= 0 && r3.optLong("value", 0L) <= 0) {
                i = 4;
            } else {
                i = 0;
            }
            if (!r3.has("log_extra") || TextUtils.isEmpty(r3.optString("log_extra", ""))) {
                i |= 2;
            }
            if (str2 == null || str2.length() == 0) {
                i |= 8;
            }
            if (LIZIZ == 0 || LIZIZ.length() == 0) {
                i |= 16;
            }
            if (!jSONObject3.has("is_ad_event")) {
                i |= 32;
            }
            if (i > 0) {
                jSONObject3.put("err_code", i);
                if (r8 != 0) {
                    try {
                        r8.LJJIJ(i, LIZIZ, str2, parseLong, jSONObject3);
                    } catch (Exception e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        ?? r4 = C04400Fg.LIZIZ;
                        if (C04430Fj.LJ) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        ?? r42 = C04400Fg.LIZIZ;
        if (C04430Fj.LJ || (!o.LJ(C04430Fj.LIZIZ, Looper.myLooper()))) {
            return;
        }
        C1ES LIZIZ2 = C04430Fj.LIZLLL.LIZIZ();
        if (LIZIZ2 == null) {
            LIZIZ2 = new C1ES(LIZIZ, str2, r3.optString("log_extra"), parseLong);
        } else {
            LIZIZ2.LJLIL = "event_v3";
            LIZIZ2.LJLILLLLZI = LIZIZ;
            LIZIZ2.LJLJI = str2;
            LIZIZ2.LJLJJI = parseLong;
            LIZIZ2.LJLJJL = 0L;
            String optString = r3.optString("log_extra");
            if (optString == null) {
                optString = null;
            }
            LIZIZ2.LJLJJLL = optString;
        }
        HashSet hashSet = (HashSet) C04430Fj.LIZJ;
        if (!hashSet.contains(LIZIZ2)) {
            hashSet.add(LIZIZ2);
        } else {
            if (r42 == 0) {
                return;
            }
            r42.LJIIL(parseLong, LIZIZ, str2);
        }
    }

    public static final C58655N0h LJ(String tag, String label, String creativeId, String str, String str2) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(label, "label");
        o.LJIIIZ(creativeId, "creativeId");
        return new C58655N0h(tag, label, creativeId, str2, str);
    }
}
