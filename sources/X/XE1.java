package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes16.dex */
public final class XE1 implements IFetchEffectChannelListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ IFetchEffectChannelListener LIZJ;
    public final /* synthetic */ C84467XDb LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZLLL.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ);
        C53717L6j.LIZ().LIZJ(this.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2.getAllCategoryEffects().size() == 0) {
            this.LIZLLL.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ);
            C53717L6j.LIZ().LIZJ(this.LIZ);
        } else {
            this.LIZJ.onSuccess(effectChannelResponse2);
        }
    }

    public XE1(C84467XDb c84467XDb, String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.LIZLLL = c84467XDb;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = iFetchEffectChannelListener;
    }
}
