package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.TEd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74303TEd implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC65784Pro LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C74303TEd(AqS96S0300000_7 aqS96S0300000_7) {
        this.LIZ = aqS96S0300000_7;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.invoke();
    }
}
