package com.ss.android.ugc.effectmanager.knadapt;

import X.C84418XBe;
import X.XCX;
import X.XDR;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$toKNListener$15 implements XDR<PanelInfoModel> {
    public final /* synthetic */ IFetchPanelInfoListener $oldListener;
    public final /* synthetic */ XCX $taskManager;

    @Override // X.XDR
    public void preProcess(PanelInfoModel response) {
        o.LJIIJ(response, "response");
    }

    @Override // X.XDR
    public void onSuccess(PanelInfoModel response) {
        o.LJIIJ(response, "response");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(response, this.$taskManager, new AqS181S0100000_15(this, 192));
        } else {
            this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel(response));
        }
    }

    public ListenerAdaptExtKt$toKNListener$15(XCX xcx, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.$taskManager = xcx;
        this.$oldListener = iFetchPanelInfoListener;
    }

    @Override // X.XDR
    public void onFail(PanelInfoModel panelInfoModel, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
    }
}
