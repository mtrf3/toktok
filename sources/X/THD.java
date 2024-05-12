package X;

import Y.ACListenerS46S0200000_12;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS72S0201000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THD implements TH6<THN, Fragment> {
    public final C5H3 LIZ;
    public final MutableLiveData<C76800UCe> LIZIZ;
    public final C5H3 LIZJ;
    public final TF1 LIZLLL;
    public final TGD LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final LifecycleOwner LJI;

    @Override // X.TH6
    public final THN LIZ(ActivityC45651qj activity, EffectCategoryModel model, C80695Vlj tabLayout, AqS72S0201000_12 aqS72S0201000_12) {
        int i;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(tabLayout, "tabLayout");
        THN LIZ = C163486bI.LIZ(activity);
        LIZ.setTextVisibility(false);
        if (this.LJ.LJLLI.LJLZ) {
            i = R.drawable.b9d;
        } else {
            i = R.drawable.b9c;
        }
        LIZ.setImage(i);
        C16880lQ.LJJ(LIZ, new ACListenerS46S0200000_12(this, aqS72S0201000_12, 59));
        return LIZ;
    }

    @Override // X.TH6
    public final InterfaceC74377TGz<Fragment> LIZIZ(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool viewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(viewPool, "viewPool");
        TF1 searchStickerViewModel = this.LIZLLL;
        InterfaceC65784Pro<C76800UCe> showSearchPanel = this.LJFF;
        SearchStickerViewContainer searchViewContainer = (SearchStickerViewContainer) this.LIZJ.getValue();
        MutableLiveData<C76800UCe> tabClickLiveData = this.LIZIZ;
        o.LJIIIZ(searchStickerViewModel, "searchStickerViewModel");
        o.LJIIIZ(showSearchPanel, "showSearchPanel");
        o.LJIIIZ(searchViewContainer, "searchViewContainer");
        o.LJIIIZ(tabClickLiveData, "tabClickLiveData");
        SearchStickerFragment searchStickerFragment = new SearchStickerFragment();
        searchStickerFragment.Ll(i, requiredDependency, optionalDependency, viewPool);
        searchStickerFragment.LJLLLLLL = showSearchPanel;
        searchStickerFragment.LJLLL = searchStickerViewModel;
        searchStickerFragment.LJLLJ = searchViewContainer;
        searchStickerFragment.LJLLLL = tabClickLiveData;
        return searchStickerFragment;
    }

    public THD(ActivityC45651qj activityC45651qj, TF1 tf1, TF5 tf5, TGD tgd, InterfaceC65784Pro interfaceC65784Pro, WMH lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZLLL = tf1;
        this.LJ = tgd;
        this.LJFF = interfaceC65784Pro;
        this.LJI = lifecycleOwner;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LIZ = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(activityC45651qj, 997));
        this.LIZIZ = new MutableLiveData<>();
        this.LIZJ = C221108m2.LIZ(enumC221088m0, new AqS101S0300000_12(this, activityC45651qj, tf5, 10));
    }
}
