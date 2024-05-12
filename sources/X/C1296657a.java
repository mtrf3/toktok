package X;

import android.text.TextUtils;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.UrlModel;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.57a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1296657a {
    public static List LIZ(List list) {
        String str;
        List<String> url_list;
        if (list == null || list.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) it.next();
            String name = effectCategoryModel.getName();
            String key = effectCategoryModel.getKey();
            UrlModel icon = effectCategoryModel.getIcon();
            if (icon != null && (url_list = icon.getUrl_list()) != null) {
                str = (String) ORZ.LJLLLL(url_list);
            } else {
                str = null;
            }
            arrayList.add(new C1288653y(name, key, str));
        }
        return arrayList;
    }

    public static List LIZIZ(List list) {
        String str;
        String str2;
        boolean z;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (list == null || list.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            String str3 = null;
            if (i >= 0) {
                Effect effect = (Effect) obj;
                ResourceItem resourceItem = new ResourceItem();
                resourceItem.setOrder(i);
                resourceItem.setName(effect.getName());
                resourceItem.setIcon((String) ORZ.LJLLLL(effect.getIcon_url().getUrl_list()));
                resourceItem.setPath(effect.getUnzipPath());
                resourceItem.setStickerType("info");
                resourceItem.setResourceId(effect.getResource_id());
                resourceItem.setEffectId(effect.getEffect_id());
                String extra = effect.getExtra();
                if (extra != null && !TextUtils.isEmpty(extra)) {
                    JSONObject jSONObject = new JSONObject(extra);
                    str = jSONObject.optString("resoureType");
                    String optString = jSONObject.optString("resourceType");
                    if (!TextUtils.isEmpty(optString)) {
                        str = optString;
                    }
                } else {
                    str = null;
                }
                resourceItem.mask = str;
                String extra2 = effect.getExtra();
                if (extra2 != null) {
                    if (!o.LJJJJJL(extra2)) {
                        JSONObject jSONObject2 = new JSONObject(extra2);
                        String prefix = jSONObject2.optString("prefix", "");
                        String selectedIcon = jSONObject2.optString("selected_icon", "");
                        kotlin.jvm.internal.o.LJIIIIZZ(selectedIcon, "selectedIcon");
                        if (!o.LJJJJJL(selectedIcon)) {
                            kotlin.jvm.internal.o.LJIIIIZZ(prefix, "prefix");
                            if (!o.LJJJJJL(prefix)) {
                                str2 = i0.LJFF(prefix, selectedIcon);
                            }
                        }
                    }
                    str2 = "";
                } else {
                    str2 = null;
                }
                resourceItem.selectedIcon = str2;
                resourceItem.extra = effect.getExtra();
                String sdk_extra = effect.getSdk_extra();
                if ((!o.LJJJJJL(sdk_extra)) && (optJSONObject2 = new JSONObject(sdk_extra).optJSONObject("transition")) != null) {
                    z = optJSONObject2.optBoolean("isOverlap", false);
                } else {
                    z = false;
                }
                resourceItem.overlap = z;
                String sdk_extra2 = effect.getSdk_extra();
                double d = 1.0d;
                if ((!o.LJJJJJL(sdk_extra2)) && (optJSONObject = new JSONObject(sdk_extra2).optJSONObject("transition")) != null) {
                    d = optJSONObject.optDouble("defaultDura", 1.0d);
                }
                resourceItem.transitionDefaultDuration = Double.valueOf(d);
                String extra3 = effect.getExtra();
                if (extra3 != null) {
                    if (!(!o.LJJJJJL(extra3))) {
                        str3 = "";
                    } else {
                        str3 = new JSONObject(extra3).optString("game_play_type");
                    }
                }
                resourceItem.gameplayType = str3;
                String extra4 = effect.getExtra();
                if (extra4 != null && (!o.LJJJJJL(extra4)) && (optJSONArray = new JSONObject(extra4).optJSONArray("resource_type")) != null) {
                    int length = optJSONArray.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        String optString2 = optJSONArray.optString(i3);
                        if (optString2 != null && (!o.LJJJJJL(optString2))) {
                            resourceItem.magicResourceTypeList.add(optString2);
                        }
                    }
                }
                arrayList.add(resourceItem);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }
}
