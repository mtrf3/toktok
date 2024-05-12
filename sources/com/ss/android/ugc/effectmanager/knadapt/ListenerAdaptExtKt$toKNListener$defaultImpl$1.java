package com.ss.android.ugc.effectmanager.knadapt;

import X.C84418XBe;
import X.XCP;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$toKNListener$defaultImpl$1 implements XCP {
    public final /* synthetic */ IFetchEffectListener $oldListener;
    public Effect oldEffect;

    @Override // X.XDR
    public void preProcess(com.ss.ugc.effectplatform.model.Effect effect) {
    }

    public ListenerAdaptExtKt$toKNListener$defaultImpl$1(IFetchEffectListener iFetchEffectListener) {
        this.$oldListener = iFetchEffectListener;
    }

    @Override // X.XCP
    public void onStart(com.ss.ugc.effectplatform.model.Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onStart(this.oldEffect);
    }

    @Override // X.XDR
    public void onSuccess(com.ss.ugc.effectplatform.model.Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onSuccess(this.oldEffect);
    }

    @Override // X.XDR
    public void onFail(com.ss.ugc.effectplatform.model.Effect effect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onFail(this.oldEffect, ListenerAdaptExtKt.toOldExceptionResult(exception));
    }

    @Override // X.XCP
    public void onProgress(com.ss.ugc.effectplatform.model.Effect effect, int i, long j) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        IFetchEffectListener iFetchEffectListener = this.$oldListener;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(this.oldEffect, i, j);
        }
    }
}
