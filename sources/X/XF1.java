package X;

import Y.IDObjectS389S0100000_15;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;

/* loaded from: classes16.dex */
public final class XF1 implements ICheckChannelListener {
    public final /* synthetic */ XDU LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ IFetchEffectChannelListener LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        this.LIZ.LJJJJLI(this.LIZIZ, true, this.LIZJ, new IDObjectS389S0100000_15(this, 0));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            this.LIZ.LJJJJLI(this.LIZIZ, false, this.LIZJ, this.LIZLLL);
        } else {
            this.LIZ.LJJJJLI(this.LIZIZ, true, this.LIZJ, new IDObjectS389S0100000_15(this, 1));
        }
    }

    public XF1(XDU xdu, String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.LIZ = xdu;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = iFetchEffectChannelListener;
    }
}
