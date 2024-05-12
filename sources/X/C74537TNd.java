package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74537TNd implements IEffectDownloadProgressListener {
    public final /* synthetic */ IFetchEffectListener LIZ;

    public C74537TNd(IFetchEffectListener iFetchEffectListener) {
        this.LIZ = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, e);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (!(iFetchEffectListener instanceof IEffectDownloadProgressListener)) {
            iFetchEffectListener = null;
        }
        IEffectDownloadProgressListener iEffectDownloadProgressListener = (IEffectDownloadProgressListener) iFetchEffectListener;
        if (iEffectDownloadProgressListener != null) {
            iEffectDownloadProgressListener.onProgress(effect, i, j);
        }
    }
}
