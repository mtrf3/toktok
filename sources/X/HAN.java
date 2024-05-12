package X;

import Y.ACallableS109S0100000_6;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAN implements IEffectDownloadProgressListener {
    public final /* synthetic */ HAL LIZ;
    public final /* synthetic */ MvThemeData LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        if (!C78540Us4.LJIJJLI(effect2)) {
            this.LIZ.getClass();
            C10K.LIZJ(new ACallableS109S0100000_6(effect2, 32));
            long LIZ = this.LIZ.LIZJ.LIZ("download mv effect", "failed.");
            HAE hae = this.LIZ.LIZ;
            C43619H9z c43619H9z = hae.LIZ;
            if (c43619H9z != null) {
                c43619H9z.LIZIZ = (int) LIZ;
                c43619H9z.LJIIJ = "mv list is null";
                c43619H9z.LJIIIZ = 3;
            }
            HAZ haz = hae.LIZJ;
            if (haz != null) {
                haz.onFailed();
                return;
            }
            return;
        }
        long LIZ2 = this.LIZ.LIZJ.LIZ("download mv effect", "success");
        HAE hae2 = this.LIZ.LIZ;
        C43619H9z c43619H9z2 = hae2.LIZ;
        if (c43619H9z2 != null) {
            c43619H9z2.LIZIZ = (int) LIZ2;
        }
        HAZ haz2 = hae2.LIZJ;
        if (haz2 == null) {
            return;
        }
        haz2.LIZ(this.LIZIZ);
    }

    public HAN(HAL hal, MvThemeData mvThemeData) {
        this.LIZ = hal;
        this.LIZIZ = mvThemeData;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        long LIZ = this.LIZ.LIZJ.LIZ("download mv effect", "failed.");
        C43619H9z c43619H9z = this.LIZ.LIZ.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LIZIZ = (int) LIZ;
            c43619H9z.LJIIJ = e.getMsg();
        }
        HAE hae = this.LIZ.LIZ;
        C43619H9z c43619H9z2 = hae.LIZ;
        if (c43619H9z2 != null) {
            c43619H9z2.LJIIIZ = 3;
        }
        HAZ haz = hae.LIZJ;
        if (haz != null) {
            haz.onFailed();
        }
    }
}
