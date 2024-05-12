package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: X.ago, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94426ago implements IFetchCategoryEffectListener {
    public final /* synthetic */ XJL LIZ;

    public C94426ago(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl(categoryPageModel);
        xjl.resumeWith(categoryPageModel);
    }
}
