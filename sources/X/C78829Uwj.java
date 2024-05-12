package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78829Uwj implements IFetchEffectListener {
    public final /* synthetic */ OptionCategoryViewModel LIZ;
    public final /* synthetic */ C78820Uwa LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.gv0(this.LIZIZ);
    }

    public C78829Uwj(OptionCategoryViewModel optionCategoryViewModel, C78820Uwa c78820Uwa) {
        this.LIZ = optionCategoryViewModel;
        this.LIZIZ = c78820Uwa;
    }
}
