package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJO<T, R> implements InterfaceC48038ItG<PanelInfoModel, TJU<?>> {
    public static final TJO LJLIL = new TJO();

    @Override // X.InterfaceC48038ItG
    public final TJU<?> apply(PanelInfoModel panelInfoModel) {
        PanelInfoModel panelInfoModel2 = panelInfoModel;
        o.LJIIIZ(panelInfoModel2, "panelInfoModel");
        CategoryEffectModel categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
        if (categoryEffectModel != null) {
            categoryEffectModel.getEffects();
        }
        return new TJS(panelInfoModel2);
    }
}
