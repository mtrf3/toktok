package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.discover.settings.SearchTransferSettingConfig;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Eg2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37026Eg2 {
    public static final C37026Eg2 LIZ = new C37026Eg2();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, C37027Eg3.LJLIL);
    public static final java.util.Set<String> LIZJ = C77275UUl.LJ("disable_hot_spot", "show_sort_and_filter", "use_profile_collection_tab", "use_profile_collection_tab_new_syle");
    public static JSONObject LIZLLL;

    public static java.util.Set LIZ() {
        String[] strArr;
        SearchTransferSettingConfig searchTransferSettingConfig;
        String[] strArr2 = null;
        try {
            SettingsManager.LIZLLL().getClass();
            String[] strArr3 = (String[]) SettingsManager.LJII("hybrid_get_ab_test", String[].class);
            try {
                SettingsManager.LIZLLL().getClass();
                searchTransferSettingConfig = (SearchTransferSettingConfig) SettingsManager.LJII("search_transfer_settings", SearchTransferSettingConfig.class);
            } catch (Throwable unused) {
                searchTransferSettingConfig = null;
            }
            if (searchTransferSettingConfig != null) {
                try {
                    strArr2 = searchTransferSettingConfig.abParams;
                } catch (Throwable unused2) {
                }
            }
            strArr = strArr2;
            strArr2 = strArr3;
        } catch (Throwable unused3) {
            strArr = null;
        }
        if (strArr2 != null) {
            ORS.LJJLIIIJJIZ(LIZJ, strArr2);
        }
        if (strArr != null) {
            ORS.LJJLIIIJJIZ(LIZJ, strArr);
        }
        return LIZJ;
    }

    public final synchronized JSONObject LIZIZ() {
        JSONObject jSONObject = LIZLLL;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            Object value = LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-KEVA_REPO>(...)");
            return new JSONObject(((Keva) value).getString("hybrid_abtest", ""));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return new JSONObject();
        }
    }

    public final void LIZJ(JSONObject jSONObject, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns2) {
        JSONArray optJSONArray;
        Object opt;
        if (jSONObject == null) {
            optJSONArray = null;
        } else {
            try {
                optJSONArray = jSONObject.optJSONArray("ab_test_names");
            } catch (Exception e) {
                interfaceC88472Yns2.invoke(e);
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        JSONObject LIZIZ2 = LIZIZ();
        if (optJSONArray == null) {
            String jSONObject2 = LIZIZ2.toString();
            o.LJIIIIZZ(jSONObject2, "pickedAbTestsJson.toString()");
            interfaceC88472Yns.invoke(jSONObject2);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (optString != null && (opt = LIZIZ2.opt(optString)) != null) {
                jSONObject3.put(optString, opt);
            }
        }
        String jSONObject4 = jSONObject3.toString();
        o.LJIIIIZZ(jSONObject4, "resultJson.toString()");
        interfaceC88472Yns.invoke(jSONObject4);
    }
}
