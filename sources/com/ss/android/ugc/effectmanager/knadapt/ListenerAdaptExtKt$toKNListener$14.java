package com.ss.android.ugc.effectmanager.knadapt;

import X.C84418XBe;
import X.XCX;
import X.XDR;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$toKNListener$14 implements XDR<CategoryPageModel> {
    public final /* synthetic */ IFetchCategoryEffectListener $oldListener;
    public final /* synthetic */ XCX $taskManager;

    @Override // X.XDR
    public void preProcess(CategoryPageModel response) {
        o.LJIIJ(response, "response");
    }

    @Override // X.XDR
    public void onSuccess(CategoryPageModel response) {
        o.LJIIJ(response, "response");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(response, this.$taskManager, new AqS181S0100000_15(this, 191));
        } else {
            this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel(response));
        }
    }

    public ListenerAdaptExtKt$toKNListener$14(XCX xcx, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.$taskManager = xcx;
        this.$oldListener = iFetchCategoryEffectListener;
    }

    @Override // X.XDR
    public void onFail(CategoryPageModel categoryPageModel, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
    }
}
