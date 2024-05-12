package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C30581Hy;
import X.C47261Igj;
import X.C61878OQg;
import X.C78866UxK;
import X.InterfaceC46204IBk;
import X.InterfaceC73367Sqp;
import X.TE8;
import X.TEF;
import X.TEZ;
import X.TJV;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SharedPoolStickerListViewModel extends StickerListViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final List<Effect> gv0(TE8 request, int i) {
        List<Effect> effects;
        o.LJIIIZ(request, "request");
        int i2 = request.LJLILLLLZI;
        int i3 = request.LJLJI;
        TJV LIZ = this.LJLJLLL.LJJJJLL().LIZ();
        List LJIILJJIL = C30581Hy.LJIILJJIL(LIZ);
        if (i3 > 0 && LJIILJJIL.size() > i3) {
            String key = ((EffectCategoryModel) ListProtector.get(LJIILJJIL, i3)).getKey();
            if (key != null) {
                CategoryEffectModel LJI = C30581Hy.LJI(LIZ, key);
                if (LJI == null || (effects = LJI.getEffects()) == null || effects.isEmpty()) {
                    return C61878OQg.INSTANCE;
                }
                if (i == 1) {
                    return C47261Igj.LJJIJ(C78866UxK.LJJIIZI(this.LJLJLLL, effects, i2));
                }
                return C78866UxK.LJJIJIIJI(this.LJLJLLL, effects, i2, i);
            }
            return C61878OQg.INSTANCE;
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPoolStickerListViewModel(StickerCategoryFragment lifecycleOwner, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC73367Sqp interfaceC73367Sqp) {
        super(lifecycleOwner, tez, clickController, tagHandler, interfaceC73367Sqp, false, 32);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
    }
}
