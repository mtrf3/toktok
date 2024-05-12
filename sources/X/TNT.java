package X;

import Y.ACallableS115S0100000_12;
import android.os.Looper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNT implements IEffectDownloadProgressListener, TNU {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile int LIZJ;
    public volatile int LIZLLL;
    public long LJ;
    public final Effect LJFF;
    public final IEffectDownloadProgressListener LJI;

    @Override // X.TNU
    public final void onFailed() {
        this.LIZIZ = true;
        String effectId = this.LJFF.getEffectId();
        o.LJIIIZ(effectId, "effectId");
        HXH.LIZ.put(effectId, null);
        LIZLLL();
    }

    public final void LIZLLL() {
        if (this.LIZ && this.LIZIZ) {
            LIZJ(new AqS162S0100000_12(this, 1249));
        }
    }

    public final void LJ() {
        int i;
        if (!this.LIZ && !this.LIZIZ) {
            i = (this.LIZLLL + this.LIZJ) / 2;
        } else if (!this.LIZIZ) {
            i = (this.LIZLLL + 100) / 2;
        } else if (!this.LIZ) {
            i = (this.LIZJ + 100) / 2;
        } else {
            i = 100;
        }
        LIZJ(new AqS110S0101000_12(this, i, 6));
    }

    public static void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            interfaceC65784Pro.invoke();
        } else {
            C10K.LIZIZ(new ACallableS115S0100000_12(interfaceC65784Pro, 6), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.TNU
    public final void onProgress(int i) {
        this.LIZLLL = i;
        LJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        LIZJ(new AqS159S0200000_12(this, effect, 106));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ = true;
        LIZLLL();
    }

    public TNT(Effect effect, C44373HbF c44373HbF) {
        o.LJIIIZ(effect, "effect");
        this.LJFF = effect;
        this.LJI = c44373HbF;
    }

    @Override // X.TNU
    public final void LIZ(TNW avMusic, String str) {
        o.LJIIIZ(avMusic, "avMusic");
        this.LIZIZ = true;
        String effectId = this.LJFF.getEffectId();
        o.LJIIIZ(effectId, "effectId");
        avMusic.setMusicPriority(-1);
        HXH.LIZ.put(effectId, avMusic);
        HXH.LIZIZ.put(effectId, str);
        if (str != null) {
            H9H.LIZ(avMusic.getMusicId(), str);
        }
        LIZLLL();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        LIZJ(new AqS101S0300000_12(this, effect, e, 12));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LJ = j;
        this.LIZJ = i;
        LJ();
    }
}
