package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.pagination.CategoryEffectPageFragment;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS72S0201000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THB extends THE {
    @Override // X.THE, X.TH6
    public final /* bridge */ /* synthetic */ THN LIZ(ActivityC45651qj activityC45651qj, EffectCategoryModel effectCategoryModel, C80695Vlj c80695Vlj, AqS72S0201000_12 aqS72S0201000_12) {
        return LIZ(activityC45651qj, effectCategoryModel, c80695Vlj, aqS72S0201000_12);
    }

    @Override // X.THE, X.TH6
    public final InterfaceC74377TGz<Fragment> LIZIZ(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool viewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(viewPool, "viewPool");
        if (requiredDependency.LIZ.LJJIL().LJLJL.LJLIL) {
            CategoryEffectPageFragment categoryEffectPageFragment = new CategoryEffectPageFragment();
            categoryEffectPageFragment.Ll(i, requiredDependency, optionalDependency, viewPool);
            return categoryEffectPageFragment;
        }
        return super.LIZIZ(i, requiredDependency, optionalDependency, viewPool);
    }

    @Override // X.THE
    /* renamed from: LIZJ */
    public final THN LIZ(ActivityC45651qj activity, EffectCategoryModel model, C80695Vlj tabLayout, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(tabLayout, "tabLayout");
        THN LIZ = super.LIZ(activity, model, tabLayout, interfaceC65784Pro);
        LIZ.setDotColor(LIZ.getContext().getResources().getColor(R.color.x5));
        return LIZ;
    }
}
