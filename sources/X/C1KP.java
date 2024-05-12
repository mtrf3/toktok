package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;

/* renamed from: X.1KP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KP implements ICheckChannelListener {
    public final /* synthetic */ IFetchEffectChannelListener LIZ;

    public C1KP(C43441nA c43441nA) {
        this.LIZ = c43441nA;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        C1KJ.LIZIZ.fetchEffectList("navi", false, this.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            C1KJ.LIZIZ.fetchEffectList("navi", false, this.LIZ);
        } else {
            C1KJ.LIZIZ.fetchEffectListFromCache("navi", this.LIZ);
        }
    }
}
