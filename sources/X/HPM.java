package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import v5.n;

/* loaded from: classes8.dex */
public final class HPM implements IFetchEffectListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ n LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Bundle LIZ = C01R.LIZ("reuse_mvtheme_enter", true);
        LIZ.putString("extra_bind_mv_id", this.LIZ);
        LIZ.putParcelable("extra_mv_effect", effect);
        this.LIZIZ.LJ(LIZ);
    }

    public HPM(String str, n nVar) {
        this.LIZ = str;
        this.LIZIZ = nVar;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        Exception exception = exceptionResult.getException();
        if (exception == null) {
            exception = new Exception("downloadBindMovieEffect Failed");
        }
        C16880lQ.LLLLIIL(exception);
        this.LIZIZ.LIZLLL(exception);
    }
}
