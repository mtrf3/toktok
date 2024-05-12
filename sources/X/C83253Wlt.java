package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83253Wlt implements IFetchEffectListener {
    public static final /* synthetic */ int LIZIZ = 0;
    public final IFetchEffectListener LIZ;

    public C83253Wlt(C83285WmP c83285WmP) {
        this.LIZ = c83285WmP;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ.onStart(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.onSuccess(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.onFail(effect, e);
    }
}
