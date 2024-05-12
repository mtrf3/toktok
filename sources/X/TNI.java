package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNI implements IEffectDownloadProgressListener, TNU {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;
    public long LJFF;
    public long LJI;
    public final C74397THt LJII;
    public final TO7<C74397THt, Effect, C44368HbA> LJIIIIZZ;

    @Override // X.TNU
    public final void onFailed() {
        this.LIZIZ = true;
        String effectId = this.LJII.LJLIL.getEffectId();
        o.LJIIIZ(effectId, "effectId");
        HXH.LIZ.put(effectId, null);
        LIZJ();
    }

    public final void LIZJ() {
        if (this.LIZIZ) {
            if (this.LIZ) {
                long currentTimeMillis = System.currentTimeMillis() - this.LJFF;
                TO7<C74397THt, Effect, C44368HbA> to7 = this.LJIIIIZZ;
                C74397THt c74397THt = this.LJII;
                to7.LIZ(c74397THt, c74397THt.LJLIL, new C44368HbA(this.LJI, 3), currentTimeMillis);
                return;
            }
            if (!this.LIZJ) {
                return;
            }
            TO7<C74397THt, Effect, C44368HbA> to72 = this.LJIIIIZZ;
            C74397THt c74397THt2 = this.LJII;
            to72.LJIIJJI(c74397THt2, c74397THt2.LJLIL);
        }
    }

    public final void LJ() {
        int i;
        if (!this.LIZ && !this.LIZIZ) {
            i = (this.LJ + this.LIZLLL) / 2;
        } else if (!this.LIZIZ) {
            i = (this.LJ + 100) / 2;
        } else if (!this.LIZ) {
            i = (this.LIZLLL + 100) / 2;
        } else {
            i = 100;
        }
        this.LJIIIIZZ.LJII(i, this.LJII);
    }

    @Override // X.TNU
    public final void onProgress(int i) {
        this.LJ = i;
        LJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LJFF = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ = true;
        LIZJ();
    }

    public TNI(C74397THt key, TNH tnh) {
        o.LJIIIZ(key, "key");
        this.LJII = key;
        this.LJIIIIZZ = tnh;
        this.LJFF = System.currentTimeMillis();
    }

    @Override // X.TNU
    public final void LIZ(TNW avMusic, String str) {
        o.LJIIIZ(avMusic, "avMusic");
        this.LIZIZ = true;
        String effectId = this.LJII.LJLIL.getEffectId();
        o.LJIIIZ(effectId, "effectId");
        avMusic.setMusicPriority(-1);
        HXH.LIZ.put(effectId, avMusic);
        HXH.LIZIZ.put(effectId, str);
        if (str != null) {
            H9H.LIZ(avMusic.getMusicId(), str);
        }
        LIZJ();
    }

    public final void LIZLLL(C74397THt key, Effect result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        this.LIZJ = true;
        LIZJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        long currentTimeMillis = System.currentTimeMillis() - this.LJFF;
        this.LJIIIIZZ.LIZIZ(this.LJII, e.getException(), new C44368HbA(Integer.valueOf(e.getErrorCode()), this.LJI, e.getMsg()), currentTimeMillis);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LJI = j;
        this.LIZLLL = i;
        LJ();
    }
}
