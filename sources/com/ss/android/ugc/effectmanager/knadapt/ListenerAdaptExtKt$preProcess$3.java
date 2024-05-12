package com.ss.android.ugc.effectmanager.knadapt;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$preProcess$3 extends AbstractC65781Prl implements InterfaceC88472Yns<PanelInfoModel, com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel> {
    public static final ListenerAdaptExtKt$preProcess$3 INSTANCE = new ListenerAdaptExtKt$preProcess$3();

    public ListenerAdaptExtKt$preProcess$3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel invoke(PanelInfoModel it) {
        List<Effect> bindEffects;
        List<Effect> collectEffects;
        o.LJIIJ(it, "it");
        com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel panelInfoModel = new com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel(it);
        CategoryEffectModel categoryEffectModel = panelInfoModel.getCategoryEffectModel();
        if (categoryEffectModel != null && (collectEffects = categoryEffectModel.getCollectEffects()) != null) {
            ListenerAdaptExtKt.preProcess(collectEffects);
        }
        CategoryEffectModel categoryEffectModel2 = panelInfoModel.getCategoryEffectModel();
        if (categoryEffectModel2 != null && (bindEffects = categoryEffectModel2.getBindEffects()) != null) {
            ListenerAdaptExtKt.preProcess(bindEffects);
        }
        panelInfoModel.getCategoryList();
        return panelInfoModel;
    }
}
