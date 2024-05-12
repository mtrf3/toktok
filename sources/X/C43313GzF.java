package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.GzF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43313GzF implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC88473Ynt<String, Effect, Exception, C76800UCe> LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43313GzF(InterfaceC88473Ynt<? super String, ? super Effect, ? super Exception, C76800UCe> interfaceC88473Ynt) {
        this.LIZ = interfaceC88473Ynt;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        C43314GzG.LIZIZ = effect2;
        InterfaceC88473Ynt<String, Effect, Exception, C76800UCe> interfaceC88473Ynt = this.LIZ;
        if (interfaceC88473Ynt != null) {
            if (effect2 != null) {
                str = effect2.getEffectId();
            } else {
                str = null;
            }
            interfaceC88473Ynt.invoke(str, effect2, null);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        InterfaceC88473Ynt<String, Effect, Exception, C76800UCe> interfaceC88473Ynt = this.LIZ;
        if (interfaceC88473Ynt != null) {
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            interfaceC88473Ynt.invoke(str, null, e.getException());
        }
    }
}
