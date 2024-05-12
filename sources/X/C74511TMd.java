package X;

import Y.IDObjectS387S0100000_12;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: X.TMd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74511TMd implements IFetchEffectChannelListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ IFetchEffectChannelListener LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ boolean LIZLLL = false;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.LJJJJLI(this.LIZJ, true, this.LIZLLL, this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        this.LIZIZ.onSuccess(effectChannelResponse);
    }

    public C74511TMd(IDObjectS387S0100000_12 iDObjectS387S0100000_12, InterfaceC84497XEf interfaceC84497XEf, String str) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = iDObjectS387S0100000_12;
        this.LIZJ = str;
    }
}
