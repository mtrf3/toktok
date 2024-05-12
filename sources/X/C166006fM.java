package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166006fM implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC166016fN LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C166006fM(InterfaceC166016fN interfaceC166016fN) {
        this.LIZ = interfaceC166016fN;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        InterfaceC166016fN interfaceC166016fN = this.LIZ;
        if (interfaceC166016fN != null) {
            interfaceC166016fN.onSuccess(effect2);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC166016fN interfaceC166016fN = this.LIZ;
        if (interfaceC166016fN != null) {
            interfaceC166016fN.onFail(effect, e);
        }
    }
}
