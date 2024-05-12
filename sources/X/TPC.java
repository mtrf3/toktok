package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* loaded from: classes13.dex */
public final class TPC implements IFetchPanelInfoListener {
    public final /* synthetic */ InterfaceC65052gv LIZ;

    public TPC(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        ((C73578SuE) this.LIZ).tryOnError(C84499XEh.LJIIIZ(exceptionResult));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        CategoryEffectModel categoryEffectModel;
        PanelInfoModel panelInfoModel2 = panelInfoModel;
        InterfaceC65052gv interfaceC65052gv = this.LIZ;
        if (panelInfoModel2 != null) {
            categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
        } else {
            categoryEffectModel = null;
        }
        ((C73578SuE) interfaceC65052gv).onSuccess(C1XY.LJJIIJ(categoryEffectModel));
    }
}
