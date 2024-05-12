package X;

import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.akD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94637akD extends AbstractC94465ahR<AssetsLibData> {
    public final String LIZ;

    public C94637akD(String str) {
        this.LIZ = str;
    }

    @Override // X.AbstractC94465ahR
    public final Object LJFF(EffectChannelResponse response) {
        o.LJIIIZ(response, "response");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LIZ;
        if (str == null) {
            str = "2d_asset_library";
        }
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryResponse effectCategoryResponse : response.getCategory_responses()) {
            if (o.LJ(effectCategoryResponse.getKey(), str)) {
                for (Effect effect : effectCategoryResponse.getTotal_effects()) {
                    arrayList.add(new AssetsLibData.AssetsItemData(effect.getEffect_id(), "2d_asset_library", AbstractC94197ad7.LIZLLL(effect.getIcon_url().getUrl_list()), effect.getName(), effect.getEffect_id(), AbstractC94197ad7.LJ(this, effect.getExtra(), "capabilities")));
                }
                linkedHashMap.put(effectCategoryResponse.getName(), arrayList);
            }
        }
        if (arrayList.isEmpty()) {
            for (EffectCategoryResponse effectCategoryResponse2 : response.getCategory_responses()) {
                if (o.LJ(effectCategoryResponse2.getKey(), "2d_asset_library")) {
                    for (Effect effect2 : effectCategoryResponse2.getTotal_effects()) {
                        arrayList.add(new AssetsLibData.AssetsItemData(effect2.getEffect_id(), "2d_asset_library", AbstractC94197ad7.LIZLLL(effect2.getIcon_url().getUrl_list()), effect2.getName(), effect2.getEffect_id(), AbstractC94197ad7.LJ(this, effect2.getExtra(), "capabilities")));
                    }
                    linkedHashMap.put(effectCategoryResponse2.getName(), arrayList);
                }
            }
        }
        return new AssetsLibData(linkedHashMap);
    }
}
