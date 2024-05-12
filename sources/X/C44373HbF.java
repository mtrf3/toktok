package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HbF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44373HbF implements IEffectDownloadProgressListener {
    public final /* synthetic */ IFetchEffectListener LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
    }

    public C44373HbF(IFetchEffectListener iFetchEffectListener) {
        this.LIZ = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ.onStart(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.onSuccess(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.onFail(effect, e);
    }
}
