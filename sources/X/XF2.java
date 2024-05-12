package X;

import Y.IDObjectS389S0100000_15;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XF2 implements ICheckChannelListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ IFetchEffectChannelListener LIZJ;
    public final /* synthetic */ boolean LIZLLL = false;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJJJJLI(this.LIZIZ, true, this.LIZLLL, new IDObjectS389S0100000_15(this, 2));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            this.LIZ.LJJJJLI(this.LIZIZ, false, this.LIZLLL, this.LIZJ);
            return;
        }
        this.LIZ.LJJJJLI(this.LIZIZ, true, this.LIZLLL, new IDObjectS389S0100000_15(this, 3));
    }

    public XF2(IFetchEffectChannelListener iFetchEffectChannelListener, InterfaceC84497XEf interfaceC84497XEf, String str) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = str;
        this.LIZJ = iFetchEffectChannelListener;
    }
}
