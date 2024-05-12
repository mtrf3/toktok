package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ah0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94438ah0 implements IFetchCategoryEffectListener {
    public final /* synthetic */ XJL<Boolean> LIZ;

    public C94438ah0(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        XJL<Boolean> xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        boolean z;
        List<Effect> effects;
        CategoryPageModel response = categoryPageModel;
        o.LJIIIZ(response, "response");
        CategoryEffectModel categoryEffects = response.getCategoryEffects();
        if (categoryEffects == null || (effects = categoryEffects.getEffects()) == null || effects.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(!z);
        XJL<Boolean> xjl = this.LIZ;
        C3C5.m7constructorimpl(valueOf);
        xjl.resumeWith(valueOf);
    }
}
