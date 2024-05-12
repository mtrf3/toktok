package X;

import Y.IDObjectS388S0100000_14;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: X.WkM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83158WkM implements IFetchEffectChannelListener {
    public final /* synthetic */ C83146WkA LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC83127Wjr LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        ((InterfaceC84497XEf) this.LIZ.LJIIIZ.getValue()).LJJIJL(this.LIZIZ, new IDObjectS388S0100000_14(this, 0));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C83147WkB(this, effectChannelResponse, null), 3);
    }

    public C83158WkM(C83146WkA c83146WkA, String str, C83124Wjo c83124Wjo) {
        this.LIZ = c83146WkA;
        this.LIZIZ = str;
        this.LIZJ = c83124Wjo;
    }
}
