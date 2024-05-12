package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Sjj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72927Sjj implements IFetchCategoryEffectListener {
    public final /* synthetic */ InterfaceC73573Su9 LIZ;

    public C72927Sjj(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        if (this.LIZ.isDisposed()) {
            return;
        }
        this.LIZ.onError(e.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryPageModel response = categoryPageModel;
        o.LJIIIZ(response, "response");
        if (this.LIZ.isDisposed() || response.getCategoryEffects() == null) {
            return;
        }
        this.LIZ.onNext(response);
        this.LIZ.onComplete();
    }
}
