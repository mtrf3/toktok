package X;

import Y.ACallableS109S0100000_6;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Wau, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82572Wau implements IEffectDownloadProgressListener {
    public final /* synthetic */ C82568Waq LIZ;
    public final /* synthetic */ IEffectDownloadProgressListener LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
        IEffectDownloadProgressListener iEffectDownloadProgressListener = this.LIZIZ;
        if (iEffectDownloadProgressListener != null) {
            iEffectDownloadProgressListener.onStart(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        this.LIZ.getClass();
        if (effect2.getUnzipPath() != null) {
            String unzipPath = effect2.getUnzipPath();
            if (C39579Fg7.LIZIZ(unzipPath) && TEVideoUtils.nativeCheckMVResourceIntegrity(unzipPath) == 0) {
                IEffectDownloadProgressListener iEffectDownloadProgressListener = this.LIZIZ;
                if (iEffectDownloadProgressListener == null) {
                    return;
                }
                iEffectDownloadProgressListener.onSuccess(effect2);
                return;
            }
        }
        C10K.LIZJ(new ACallableS109S0100000_6(effect2, 9));
        IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZIZ;
        if (iEffectDownloadProgressListener2 != null) {
            iEffectDownloadProgressListener2.onFail(effect2, new ExceptionResult(-10002));
        }
    }

    public C82572Wau(C82568Waq c82568Waq, C82557Waf c82557Waf) {
        this.LIZ = c82568Waq;
        this.LIZIZ = c82557Waf;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        IEffectDownloadProgressListener iEffectDownloadProgressListener = this.LIZIZ;
        if (iEffectDownloadProgressListener != null) {
            iEffectDownloadProgressListener.onFail(effect, e);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        o.LJIIIZ(effect, "effect");
        IEffectDownloadProgressListener iEffectDownloadProgressListener = this.LIZIZ;
        if (iEffectDownloadProgressListener != null) {
            iEffectDownloadProgressListener.onProgress(effect, i, j);
        }
    }
}
