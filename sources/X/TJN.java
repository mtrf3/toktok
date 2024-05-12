package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJN<T, R> implements InterfaceC48038ItG<CategoryPageModel, TJU<?>> {
    public static final TJN LJLIL = new TJN();

    @Override // X.InterfaceC48038ItG
    public final TJU<?> apply(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffectModel;
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        o.LJIIIZ(categoryPageModel2, "categoryPageModel");
        com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel categoryEffects = categoryPageModel2.getCategoryEffects();
        CategoryEffectModel categoryEffectModel2 = null;
        if (categoryEffects != null) {
            categoryEffectModel = categoryEffects.getKCategoryEffect();
        } else {
            categoryEffectModel = null;
        }
        if (categoryEffectModel instanceof com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel) {
            categoryEffectModel2 = categoryEffectModel;
        }
        CategoryEffectModelTemplate categoryEffectModelTemplate = (CategoryEffectModelTemplate) categoryEffectModel2;
        if (categoryEffectModelTemplate != null || (categoryEffectModelTemplate = categoryPageModel2.getCategoryEffects()) != null) {
            categoryEffectModelTemplate.getEffects();
        }
        return new TJS(categoryPageModel2);
    }
}
