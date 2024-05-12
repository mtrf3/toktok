package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HxY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45756HxY implements IFetchEffectListener {
    public final /* synthetic */ IAVEffectService.OnFetchResult LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C45756HxY(IAVEffectService.OnFetchResult onFetchResult) {
        this.LIZ = onFetchResult;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        IAVEffectService.OnFetchResult onFetchResult = this.LIZ;
        if (effect2 == null || (str = effect2.getUnzipPath()) == null) {
            str = "";
        }
        onFetchResult.onResult(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.onResult("");
    }
}
