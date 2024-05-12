package com.ss.android.ugc.effectmanager.knadapt;

import X.C84418XBe;
import X.InterfaceC84406XAs;
import X.XDR;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelListenerAdaptKt {
    public static final InterfaceC84406XAs toKNListener(final ModelEventListener modelEventListener) {
        if (modelEventListener != null) {
            return new InterfaceC84406XAs() { // from class: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt$toKNListener$2
                public void onModelDownloadStart(Effect effect, ModelInfo info) {
                    o.LJIIJ(effect, "effect");
                    o.LJIIJ(info, "info");
                    ModelEventListener.this.onModelDownloadStart(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.ss.android.ugc.effectmanager.model.ModelInfo(info));
                }

                @Override // X.InterfaceC84406XAs
                public void onModelNotFound(Effect effect, Exception e) {
                    o.LJIIJ(e, "e");
                    ModelEventListener.this.onModelNotFound(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), e);
                }

                public void onModelDownloadError(Effect effect, ModelInfo info, Exception e) {
                    o.LJIIJ(effect, "effect");
                    o.LJIIJ(info, "info");
                    o.LJIIJ(e, "e");
                    ModelEventListener.this.onModelDownloadError(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.ss.android.ugc.effectmanager.model.ModelInfo(info), e);
                }

                public void onModelDownloadSuccess(Effect effect, ModelInfo info, long j) {
                    o.LJIIJ(effect, "effect");
                    o.LJIIJ(info, "info");
                    ModelEventListener.this.onModelDownloadSuccess(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.ss.android.ugc.effectmanager.model.ModelInfo(info), j);
                }

                public void onFetchModelList(boolean z, String str, long j, String str2) {
                    ModelEventListener.this.onFetchModelList(z, str, j, str2);
                }
            };
        }
        return null;
    }

    public static final XDR<String[]> toKNListener(final IFetchModelListener iFetchModelListener) {
        if (iFetchModelListener != null) {
            return new XDR<String[]>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt$toKNListener$1
                @Override // X.XDR
                public void preProcess(String[] response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(String[] response) {
                    o.LJIIJ(response, "response");
                    IFetchModelListener.this.onSuccess(response);
                }

                @Override // X.XDR
                public void onFail(String[] strArr, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchModelListener.this.onFailed(ListenerAdaptExtKt.toOldExceptionResult(exception).getException());
                }
            };
        }
        return null;
    }
}
