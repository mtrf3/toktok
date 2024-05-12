package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TO6 implements IDownloadProviderEffectProgressListener {
    public final long LIZ = System.currentTimeMillis();
    public final /* synthetic */ TO5 LIZIZ;
    public final /* synthetic */ TO7 LIZJ;
    public final /* synthetic */ ProviderEffect LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffect providerEffect) {
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7 to7 = this.LIZJ;
        ProviderEffect key = this.LIZLLL;
        this.LIZIZ.getClass();
        o.LJIIIZ(key, "key");
        TO5 to5 = this.LIZIZ;
        ProviderEffect key2 = this.LIZLLL;
        to5.getClass();
        o.LJIIIZ(key2, "key");
        to7.LIZ(key, null, C76800UCe.LIZ, currentTimeMillis);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener
    public final void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
        Exception exc;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7 to7 = this.LIZJ;
        ProviderEffect key = this.LIZLLL;
        this.LIZIZ.getClass();
        o.LJIIIZ(key, "key");
        if (exceptionResult != null) {
            exc = exceptionResult.getException();
        } else {
            exc = null;
        }
        TO5 to5 = this.LIZIZ;
        ProviderEffect key2 = this.LIZLLL;
        to5.getClass();
        o.LJIIIZ(key2, "key");
        to7.LIZIZ(key, exc, C76800UCe.LIZ, currentTimeMillis);
    }

    public TO6(TO5 to5, C74534TNa c74534TNa, ProviderEffect providerEffect) {
        this.LIZIZ = to5;
        this.LIZJ = c74534TNa;
        this.LIZLLL = providerEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener
    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
        this.LIZJ.LJII(i, this.LIZLLL);
    }
}
