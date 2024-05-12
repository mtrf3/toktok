package X;

import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HpQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45252HpQ implements IFetchEffectListener {
    public final /* synthetic */ C45250HpO LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Effect LIZLLL;
    public final /* synthetic */ EpResourceCallback LJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.LIZ.LIZIZ(this.LIZLLL, this.LIZIZ, this.LIZJ);
        EpResourceCallback epResourceCallback = this.LJ;
        if (epResourceCallback != null) {
            epResourceCallback.onSuccess(this.LIZLLL.getUnzipPath());
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        EpResourceCallback epResourceCallback = this.LJ;
        if (epResourceCallback != null) {
            epResourceCallback.onFailure(e.getErrorCode(), e.getMsg());
        }
    }

    public C45252HpQ(C45250HpO c45250HpO, String str, String str2, Effect effect, EpResourceCallback epResourceCallback) {
        this.LIZ = c45250HpO;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = effect;
        this.LJ = epResourceCallback;
    }
}
