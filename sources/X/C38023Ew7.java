package X;

import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.ss.android.ugc.aweme.hybridkit.experiment.HybridJsbBtmParserInterceptorSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ew7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38023Ew7 {
    public static void LIZ(C37904EuC bridgeContext, C37955Ev1 c37955Ev1) {
        String string;
        String string2;
        View view;
        LinkedHashMap linkedHashMap;
        java.util.Map<String, String> map;
        o.LJIIIZ(bridgeContext, "bridgeContext");
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel hybridJsbBtmParserInterceptorModel = HybridJsbBtmParserInterceptorSettings.LIZ;
        HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel hybridJsbBtmParserInterceptorModel2 = (HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel) LIZLLL.LJIIIIZZ("hybrid_jsb_btm_parser_interceptor", HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel.class, hybridJsbBtmParserInterceptorModel);
        if (hybridJsbBtmParserInterceptorModel2 != null) {
            hybridJsbBtmParserInterceptorModel = hybridJsbBtmParserInterceptorModel2;
        }
        if (hybridJsbBtmParserInterceptorModel.enable) {
            try {
                Object obj = c37955Ev1.LJI;
                if (obj instanceof JSONObject) {
                    o.LJII(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    if (((JSONObject) obj).has("_btmConfig")) {
                        Object obj2 = c37955Ev1.LJI;
                        o.LJII(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject((JSONObject) obj2, "_btmConfig"), "btmC");
                        Object obj3 = c37955Ev1.LJI;
                        o.LJII(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                        string2 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject((JSONObject) obj3, "_btmConfig"), "btmD");
                        InterfaceC37958Ev4 interfaceC37958Ev4 = bridgeContext.LIZLLL;
                        if (interfaceC37958Ev4 != null) {
                            view = interfaceC37958Ev4.LIZ();
                        } else {
                            view = null;
                        }
                        Object obj4 = c37955Ev1.LJI;
                        o.LJII(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject((JSONObject) obj4, "_bcmConfig");
                        o.LJIIIIZZ(jSONObject, "call.params as JSONObjec…tJSONObject(\"_bcmConfig\")");
                        linkedHashMap = new LinkedHashMap();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String key = keys.next();
                            if (jSONObject.opt(key) instanceof String) {
                                o.LJIIIIZZ(key, "key");
                                linkedHashMap.put(key, jSONObject.optString(key));
                            }
                        }
                    } else {
                        return;
                    }
                } else if (obj instanceof ReadableMap) {
                    o.LJII(obj, "null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
                    if (((ReadableMap) obj).hasKey("_btmConfig")) {
                        Object obj5 = c37955Ev1.LJI;
                        o.LJII(obj5, "null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
                        string = ((ReadableMap) obj5).getMap("_btmConfig").getString("btmC");
                        Object obj6 = c37955Ev1.LJI;
                        o.LJII(obj6, "null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
                        string2 = ((ReadableMap) obj6).getMap("_btmConfig").getString("btmD");
                        view = bridgeContext.LJ;
                        Object obj7 = c37955Ev1.LJI;
                        o.LJII(obj7, "null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
                        ReadableMap map2 = ((ReadableMap) obj7).getMap("_bcmConfig");
                        o.LJIIIIZZ(map2, "call.params as ReadableMap).getMap(\"_bcmConfig\")");
                        linkedHashMap = new LinkedHashMap();
                        ReadableMapKeySetIterator keySetIterator = map2.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String key2 = keySetIterator.nextKey();
                            if (map2.getString(key2) != null) {
                                o.LJIIIIZZ(key2, "key");
                                linkedHashMap.put(key2, map2.getString(key2));
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                if (view != null && string != null && string2 != null) {
                    C12460eI.LJIILJJIL(view, string, string2, null, null);
                    C18080nM.LIZ.getClass();
                    C18090nN LIZLLL2 = C18080nM.LIZLLL(view, null);
                    if (LIZLLL2 != null) {
                        if (LIZLLL2.LJJIL == null) {
                            LIZLLL2.LJJIL = new LinkedHashMap();
                        }
                        if (linkedHashMap != null && (map = LIZLLL2.LJJIL) != null) {
                            map.putAll(linkedHashMap);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
