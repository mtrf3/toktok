package com.ss.android.ugc.effectmanager.knadapt;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$preProcess$2 extends AbstractC65781Prl implements InterfaceC88472Yns<CategoryPageModel, com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel> {
    public static final ListenerAdaptExtKt$preProcess$2 INSTANCE = new ListenerAdaptExtKt$preProcess$2();

    public ListenerAdaptExtKt$preProcess$2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel invoke(CategoryPageModel it) {
        List<Effect> effects;
        List<Effect> collectEffects;
        List<Effect> bindEffects;
        o.LJIIJ(it, "it");
        com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel categoryPageModel = new com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel(it);
        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
        if (categoryEffects != null && (bindEffects = categoryEffects.getBindEffects()) != null) {
            ListenerAdaptExtKt.preProcess(bindEffects);
        }
        CategoryEffectModel categoryEffects2 = categoryPageModel.getCategoryEffects();
        if (categoryEffects2 != null && (collectEffects = categoryEffects2.getCollectEffects()) != null) {
            ListenerAdaptExtKt.preProcess(collectEffects);
        }
        CategoryEffectModel categoryEffects3 = categoryPageModel.getCategoryEffects();
        if (categoryEffects3 != null && (effects = categoryEffects3.getEffects()) != null) {
            ListenerAdaptExtKt.preProcess(effects);
        }
        return categoryPageModel;
    }
}
