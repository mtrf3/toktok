package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Wtx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83753Wtx implements IFetchEffectChannelListener {
    public final String LIZ;
    public final IFetchEffectChannelListener LIZIZ;
    public final C44428Hc8 LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        String str;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZIZ;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onFail(exceptionResult);
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("api_type", C78880UxY.LJJLIL(this.LIZ));
        c145995oB.LIZIZ(LIZIZ, "duration");
        c145995oB.LIZ(1, "status");
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        Integer num = null;
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        }
        c145995oB.LIZJ(num, "error_code");
        if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
            str = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZ(0, "count");
        GXR.LIZ("tool_performance_api", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        List<Effect> all_category_effects;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZIZ;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onSuccess(effectChannelResponse2);
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("api_type", C78880UxY.LJJLIL(this.LIZ));
        c145995oB.LIZIZ(LIZIZ, "duration");
        int i = 0;
        c145995oB.LIZ(0, "status");
        if (effectChannelResponse2 != null && (all_category_effects = effectChannelResponse2.getAll_category_effects()) != null) {
            i = all_category_effects.size();
        }
        c145995oB.LIZ(i, "count");
        GXR.LIZ("tool_performance_api", c145995oB.LIZ);
    }

    public C83753Wtx(String panel, IFetchEffectChannelListener iFetchEffectChannelListener) {
        o.LJIIIZ(panel, "panel");
        this.LIZ = panel;
        this.LIZIZ = iFetchEffectChannelListener;
        this.LIZJ = C44428Hc8.LIZ();
    }
}
