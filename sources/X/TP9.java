package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* loaded from: classes13.dex */
public final class TP9 implements IFetchCategoryEffectListener {
    public final /* synthetic */ InterfaceC65052gv LIZ;

    public TP9(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        ((C73578SuE) this.LIZ).tryOnError(C84499XEh.LJIIIZ(exceptionResult));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffectModel;
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        InterfaceC65052gv interfaceC65052gv = this.LIZ;
        if (categoryPageModel2 != null) {
            categoryEffectModel = categoryPageModel2.getCategoryEffects();
        } else {
            categoryEffectModel = null;
        }
        ((C73578SuE) interfaceC65052gv).onSuccess(C1XY.LJJIIJ(categoryEffectModel));
    }
}
