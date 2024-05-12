package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.akK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94644akK extends AbstractC94464ahQ<Effect> {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    @Override // X.AbstractC94464ahQ
    public final Effect LJFF(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            return ORZ.LJLLLL(effects);
        }
        return null;
    }
}
