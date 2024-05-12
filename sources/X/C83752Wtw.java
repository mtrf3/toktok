package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Wtw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83752Wtw implements IFetchCategoryEffectListener {
    public final String LIZ;
    public final IFetchCategoryEffectListener LIZIZ;
    public final C44428Hc8 LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        String str;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.LIZIZ;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
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
        if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
            str = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", str);
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        }
        c145995oB.LIZJ(num, "error_code");
        c145995oB.LIZ(0, "count");
        GXR.LIZ("tool_performance_api", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryEffectModel category_effects;
        List<Effect> category_effects2;
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.LIZIZ;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel2);
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("api_type", C78880UxY.LJJLIL(this.LIZ));
        c145995oB.LIZIZ(LIZIZ, "duration");
        int i = 0;
        c145995oB.LIZ(0, "status");
        if (categoryPageModel2 != null && (category_effects = categoryPageModel2.getCategory_effects()) != null && (category_effects2 = category_effects.getCategory_effects()) != null) {
            i = category_effects2.size();
        }
        c145995oB.LIZ(i, "count");
        GXR.LIZ("tool_performance_api", c145995oB.LIZ);
    }

    public C83752Wtw(String panel, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        o.LJIIIZ(panel, "panel");
        this.LIZ = panel;
        this.LIZIZ = iFetchCategoryEffectListener;
        this.LIZJ = C44428Hc8.LIZ();
    }
}
