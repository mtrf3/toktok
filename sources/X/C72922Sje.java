package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sje, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72922Sje implements IFetchCategoryEffectListener {
    public final /* synthetic */ InterfaceC73573Su9<Effect> LIZ;
    public final /* synthetic */ C72708SgC LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.onError(new Exception("Cannot fetch panel info"));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        List<Effect> list;
        CategoryEffectModel categoryEffects;
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        if (this.LIZ.isDisposed()) {
            return;
        }
        if (categoryPageModel2 == null || (categoryEffects = categoryPageModel2.getCategoryEffects()) == null || (list = categoryEffects.getEffects()) == null) {
            list = C61878OQg.INSTANCE;
        }
        for (Effect effect : list) {
            if (o.LJ(effect.getName(), TiktokAvatarLokiConfig.LIZ().recordHeadEffectName)) {
                if (!this.LIZIZ.LIZJ.LJJIL(effect)) {
                    this.LIZIZ.LIZJ.LJJIIZI(effect, new C42448GlI(this.LIZ, effect));
                    return;
                } else {
                    this.LIZ.onNext(effect);
                    return;
                }
            }
        }
        this.LIZ.onError(new Exception("No head effect found"));
    }

    public C72922Sje(C73433Srt c73433Srt, C72708SgC c72708SgC) {
        this.LIZ = c73433Srt;
        this.LIZIZ = c72708SgC;
    }
}
