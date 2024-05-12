package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;

/* loaded from: classes16.dex */
public final class XE0 implements ICheckChannelListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ IFetchEffectChannelListener LIZJ;
    public final /* synthetic */ C84467XDb LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        C84467XDb c84467XDb = this.LIZLLL;
        String str = this.LIZ;
        boolean z = this.LIZIZ;
        IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZJ;
        c84467XDb.getClass();
        XE1 xe1 = new XE1(c84467XDb, str, z, iFetchEffectChannelListener);
        if (!c84467XDb.LIZ) {
            xe1.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectListFromCache(str, xe1);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            this.LIZLLL.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ);
            return;
        }
        C84467XDb c84467XDb = this.LIZLLL;
        String str = this.LIZ;
        boolean z2 = this.LIZIZ;
        IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZJ;
        c84467XDb.getClass();
        XE1 xe1 = new XE1(c84467XDb, str, z2, iFetchEffectChannelListener);
        if (!c84467XDb.LIZ) {
            xe1.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectListFromCache(str, xe1);
        }
    }

    public XE0(C84467XDb c84467XDb, String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.LIZLLL = c84467XDb;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = iFetchEffectChannelListener;
    }
}
