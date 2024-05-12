package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.akG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94640akG extends AbstractC94464ahQ<List<? extends C93839aXL>> {
    @Override // X.AbstractC94464ahQ
    public final List<? extends C93839aXL> LJFF(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        ArrayList arrayList = new ArrayList();
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            for (Effect effect : effects) {
                String effect_id = effect.getEffect_id();
                String name = effect.getName();
                String LIZLLL = AbstractC94197ad7.LIZLLL(effect.getIcon_url().getUrl_list());
                String extra = effect.getExtra();
                if (extra == null) {
                    extra = "";
                }
                arrayList.add(new C93839aXL(effect_id, name, LIZLLL, extra));
            }
        }
        return arrayList;
    }
}
