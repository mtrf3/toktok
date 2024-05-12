package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WbN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82601WbN implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC82603WbP LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C82601WbN(C82592WbE c82592WbE) {
        this.LIZ = c82592WbE;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        InterfaceC82603WbP interfaceC82603WbP = this.LIZ;
        if (interfaceC82603WbP != null) {
            interfaceC82603WbP.onSuccess(effect2);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC82603WbP interfaceC82603WbP = this.LIZ;
        if (interfaceC82603WbP != null) {
            interfaceC82603WbP.onFail(effect, e);
        }
    }
}
