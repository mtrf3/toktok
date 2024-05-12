package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XEZ implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC88472Yns<Effect, C76800UCe> LIZ;
    public final /* synthetic */ Effect LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        C84492XEa.LIZJ = effect2;
        C84492XEa.LIZIZ = C84492XEa.LIZJ;
        this.LIZ.invoke(effect2);
        C2VP.LIZ(new AqS165S0100000_15(this.LIZIZ, 863));
    }

    public XEZ(Effect effect, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = effect;
    }
}
