package X;

import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.akC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94636akC extends AbstractC94465ahR<AssetsLibData> {
    @Override // X.AbstractC94465ahR
    public final Object LJFF(EffectChannelResponse response) {
        o.LJIIIZ(response, "response");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EffectCategoryResponse effectCategoryResponse : response.getCategory_responses()) {
            ArrayList arrayList = new ArrayList();
            for (Effect effect : effectCategoryResponse.getTotal_effects()) {
                arrayList.add(new AssetsLibData.AssetsItemData(effect.getEffect_id(), effectCategoryResponse.getKey(), AbstractC94197ad7.LIZLLL(effect.getIcon_url().getUrl_list()), effect.getName(), effect.getEffect_id(), AbstractC94197ad7.LJ(this, effect.getExtra(), "capabilities")));
            }
            linkedHashMap.put(effectCategoryResponse.getName(), arrayList);
        }
        return new AssetsLibData(linkedHashMap);
    }
}
