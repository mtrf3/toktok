package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Hb9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44367Hb9 implements IFetchEffectListener {
    public final IFetchEffectListener LIZIZ;
    public final String LIZ = "edit_effect";
    public final C44428Hc8 LIZJ = C44428Hc8.LIZ();

    public C44367Hb9(IFetchEffectListener iFetchEffectListener) {
        this.LIZIZ = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", C45804HyK.LJJJJLL(this.LIZ));
        c145995oB.LIZIZ(LIZIZ, "duration");
        c145995oB.LIZ(0, "status");
        String str2 = null;
        if (effect2 != null) {
            str = effect2.getEffectId();
        } else {
            str = null;
        }
        c145995oB.LJI("resource_id", str);
        if (effect2 != null) {
            str2 = effect2.getUnzipPath();
        }
        c145995oB.LIZIZ(XBM.LJI(str2), "source_file_size");
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, e);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", C45804HyK.LJJJJLL(this.LIZ));
        c145995oB.LIZIZ(LIZIZ, "duration");
        c145995oB.LIZ(1, "status");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        c145995oB.LJI("resource_id", str);
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        c145995oB.LIZ(e.getErrorCode(), "error_code");
        String msg = e.getMsg();
        if (msg == null) {
            msg = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", msg);
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }
}
