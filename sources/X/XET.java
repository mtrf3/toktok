package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XET {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final EffectChannelResponse LIZ(EffectChannelModel effectChannelModel) {
        List<String> url_list;
        List<String> url_list2;
        List<String> url_list3;
        String str;
        List<String> url_list4;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect effect : effectChannelModel.getEffect_list()) {
            hashMap.put(effect.getEffect_id(), effect);
        }
        for (Effect effect2 : effectChannelModel.getCollection_list()) {
            hashMap2.put(effect2.getEffect_id(), effect2);
        }
        Effect effect3 = null;
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, 511, null);
        effectChannelResponse.setPanel(this.LIZ);
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAll_category_effects(effectChannelModel.getEffect_list());
        effectChannelResponse.setCollection_list(effectChannelModel.getCollection_list());
        effectChannelResponse.setUrl_prefix(effectChannelModel.getUrl_prefix());
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.getCategory_list().isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory_list()) {
                String str2 = null;
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                UrlModel icon = effectCategoryModel.getIcon();
                if (icon != null && (url_list3 = icon.getUrl_list()) != null && (!url_list3.isEmpty())) {
                    UrlModel icon2 = effectCategoryModel.getIcon();
                    if (icon2 != null && (url_list4 = icon2.getUrl_list()) != null) {
                        str = (String) ListProtector.get(url_list4, 0);
                    } else {
                        str = null;
                    }
                    effectCategoryResponse.setIcon_normal_url(str);
                }
                UrlModel icon_selected = effectCategoryModel.getIcon_selected();
                if (icon_selected != null && (url_list = icon_selected.getUrl_list()) != null && (!url_list.isEmpty())) {
                    UrlModel icon_selected2 = effectCategoryModel.getIcon_selected();
                    if (icon_selected2 != null && (url_list2 = icon_selected2.getUrl_list()) != null) {
                        str2 = (String) ListProtector.get(url_list2, 0);
                    }
                    effectCategoryResponse.setIcon_selected_url(str2);
                }
                ArrayList arrayList2 = new ArrayList();
                if (effectCategoryModel.getEffects() == null) {
                    C12310e3.LIZIZ.getClass();
                    C12310e3.LIZ("BuildEffectChannelResponse", "categoryModel is null");
                }
                List<String> effects = effectCategoryModel.getEffects();
                if (effects != null) {
                    Iterator<String> it = effects.iterator();
                    while (it.hasNext()) {
                        Object obj = hashMap.get(it.next());
                        if (obj != null) {
                            arrayList2.add(obj);
                        }
                    }
                }
                effectCategoryResponse.setTotal_effects(arrayList2);
                effectCategoryResponse.setTags(effectCategoryModel.getTags());
                effectCategoryResponse.setTags_update_time(effectCategoryModel.getTags_updated_at());
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                arrayList.add(effectCategoryResponse);
            }
        }
        effectChannelResponse.setCategory_responses(arrayList);
        for (Effect effect4 : effectChannelModel.getEffect_list()) {
            if (effect4.getEffect_type() == 1) {
                ArrayList arrayList3 = new ArrayList();
                List<String> children = effect4.getChildren();
                if (children == null) {
                    children = new ArrayList<>();
                }
                Iterator<String> it2 = children.iterator();
                while (it2.hasNext()) {
                    Object obj2 = hashMap2.get(it2.next());
                    if (obj2 != null) {
                        arrayList3.add(obj2);
                    }
                }
                effect4.setChild_effects(arrayList3);
            }
        }
        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
        String front_effect_id = effectChannelModel.getFront_effect_id();
        Effect effect5 = null;
        if (front_effect_id != null) {
            effect3 = (Effect) hashMap.get(front_effect_id);
        }
        effectChannelResponse.setFront_effect(effect3);
        String rear_effect_id = effectChannelModel.getRear_effect_id();
        if (rear_effect_id != null) {
            effect5 = (Effect) hashMap.get(rear_effect_id);
        }
        effectChannelResponse.setRear_effect(effect5);
        if (!this.LIZJ) {
            XDM xdm = XDM.LIZ;
            String str3 = this.LIZIZ;
            String str4 = this.LIZ;
            List<Effect> effect_list = effectChannelModel.getEffect_list();
            xdm.getClass();
            XDM.LJII(str3, str4, effect_list);
            XDM.LJII(this.LIZIZ, this.LIZ, effectChannelModel.getCollection_list());
        }
        return effectChannelResponse;
    }

    public XET(String panel, String fileDirectory, boolean z) {
        o.LJIIJ(panel, "panel");
        o.LJIIJ(fileDirectory, "fileDirectory");
        this.LIZ = panel;
        this.LIZIZ = fileDirectory;
        this.LIZJ = z;
    }
}
