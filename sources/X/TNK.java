package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNK implements IEffectDownloadProgressListener {
    public long LIZ = System.currentTimeMillis();
    public final /* synthetic */ AbstractC74535TNb LIZIZ;
    public final /* synthetic */ TO7 LIZJ;
    public final /* synthetic */ Effect LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7 to7 = this.LIZJ;
        Effect key = this.LIZLLL;
        this.LIZIZ.getClass();
        o.LJIIIZ(key, "key");
        if (effect2 == null) {
            effect2 = key;
        }
        AbstractC74535TNb abstractC74535TNb = this.LIZIZ;
        Effect key2 = this.LIZLLL;
        abstractC74535TNb.getClass();
        o.LJIIIZ(key2, "key");
        to7.LIZ(key, effect2, new C44371HbD(null, null), currentTimeMillis);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7 to7 = this.LIZJ;
        Effect key = this.LIZLLL;
        this.LIZIZ.getClass();
        o.LJIIIZ(key, "key");
        Exception exception = e.getException();
        AbstractC74535TNb abstractC74535TNb = this.LIZIZ;
        Effect key2 = this.LIZLLL;
        abstractC74535TNb.getClass();
        o.LJIIIZ(key2, "key");
        to7.LIZIZ(key, exception, new C44371HbD(Integer.valueOf(e.getErrorCode()), e.getMsg()), currentTimeMillis);
    }

    public TNK(AbstractC74535TNb abstractC74535TNb, TOZ toz, Effect effect) {
        this.LIZIZ = abstractC74535TNb;
        this.LIZJ = toz;
        this.LIZLLL = effect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZJ.LJII(i, this.LIZLLL);
    }
}
