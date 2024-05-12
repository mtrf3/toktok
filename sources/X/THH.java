package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THH implements Observer<Boolean> {
    public C80695Vlj LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final THX LJLJI;
    public final TEZ LJLJJI;
    public final InterfaceC78118UlG LJLJJL;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        int i;
        Boolean bool2 = bool;
        C80695Vlj c80695Vlj = this.LJLIL;
        if (c80695Vlj != null && bool2 != null && bool2.booleanValue()) {
            TEZ findFavoriteTabIndex = this.LJLJJI;
            o.LJIIIZ(findFavoriteTabIndex, "$this$findFavoriteTabIndex");
            if (findFavoriteTabIndex.LJJIL().LJLJJI) {
                i = 0;
                for (Object obj : C30581Hy.LJIILJJIL(findFavoriteTabIndex.LJJJJLL().LIZ())) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        EffectCategoryModel categoryModel = (EffectCategoryModel) obj;
                        o.LJIIIZ(categoryModel, "categoryModel");
                        if (o.LJ(categoryModel.getKey(), "sticker_category:favorite")) {
                            break;
                        } else {
                            i = i2;
                        }
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            i = -1;
            C164456cr LJIIJJI = c80695Vlj.LJIIJJI(i);
            if (LJIIJJI == null || LJIIJJI == c80695Vlj.getCurSelectedTab() || !this.LJLJJL.getStickerFirst(true)) {
                return;
            }
            View view = LJIIJJI.LIZLLL;
            if (view != null && (view instanceof THN)) {
                ((THN) view).LIZ(true);
            }
            this.LJLJJL.setStickerFirst(false);
        }
    }

    public THH(LifecycleOwner lifecycleOwner, THX thx, TEZ stickerDataManager, InterfaceC78118UlG interfaceC78118UlG) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = thx;
        this.LJLJJI = stickerDataManager;
        this.LJLJJL = interfaceC78118UlG;
    }
}
