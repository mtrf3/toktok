package com.ss.android.ugc.effectmanager.knadapt;

import X.C84418XBe;
import X.XCX;
import X.XDR;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$toKNListener$2 implements XDR<EffectChannelResponse> {
    public final /* synthetic */ IFetchEffectChannelListener $oldListener;
    public final /* synthetic */ XCX $taskManager;

    @Override // X.XDR
    public void onSuccess(EffectChannelResponse response) {
        o.LJIIJ(response, "response");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(response, this.$taskManager, new AqS181S0100000_15(this, 193));
        } else {
            this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(response));
        }
    }

    @Override // X.XDR
    public void preProcess(EffectChannelResponse response) {
        o.LJIIJ(response, "response");
        if (!DataPreProcess.enableOptimize) {
            EPLog.d("EFFECT_CALLBACK", "do preProcess close");
        } else {
            EPLog.d("EFFECT_CALLBACK", "do preProcess");
            new com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(response).getAllCategoryEffects();
        }
    }

    public ListenerAdaptExtKt$toKNListener$2(XCX xcx, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.$taskManager = xcx;
        this.$oldListener = iFetchEffectChannelListener;
    }

    @Override // X.XDR
    public void onFail(EffectChannelResponse effectChannelResponse, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
    }
}
