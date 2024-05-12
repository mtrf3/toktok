package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNJ implements IEffectDownloadProgressListener {
    public long LIZ;
    public long LIZIZ;
    public final C74397THt LIZJ;
    public final TO7<C74397THt, Effect, C44368HbA> LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7<C74397THt, Effect, C44368HbA> to7 = this.LIZLLL;
        C74397THt c74397THt = this.LIZJ;
        if (effect2 == null) {
            effect2 = c74397THt.LJLIL;
        }
        to7.LIZ(c74397THt, effect2, new C44368HbA(this.LIZIZ, 3), currentTimeMillis);
    }

    public TNJ(C74397THt key, TNH tnh) {
        o.LJIIIZ(key, "key");
        this.LIZJ = key;
        this.LIZLLL = tnh;
        this.LIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        this.LIZLLL.LIZIZ(this.LIZJ, e.getException(), new C44368HbA(Integer.valueOf(e.getErrorCode()), this.LIZIZ, e.getMsg()), currentTimeMillis);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZIZ = j;
        this.LIZLLL.LJII(i, this.LIZJ);
    }
}
