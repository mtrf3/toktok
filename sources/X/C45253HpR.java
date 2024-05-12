package X;

import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HpR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45253HpR implements IFetchEffectListener {
    public final /* synthetic */ EpResourceCallback LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C45253HpR(EpResourceCallback epResourceCallback) {
        this.LIZ = epResourceCallback;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        EpResourceCallback epResourceCallback;
        Effect effect2 = effect;
        if (effect2 != null && (epResourceCallback = this.LIZ) != null) {
            epResourceCallback.onSuccess(effect2.getUnzipPath());
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        EpResourceCallback epResourceCallback2 = this.LIZ;
        if (epResourceCallback2 != null) {
            epResourceCallback2.onFailure(10003, "");
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        EpResourceCallback epResourceCallback = this.LIZ;
        if (epResourceCallback != null) {
            epResourceCallback.onFailure(e.getErrorCode(), e.getMsg());
        }
    }
}
