package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.AqS72S0201000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TH5 extends TH3<THN> {
    @Override // X.TH3
    public final View LIZ(ActivityC45651qj activity, EffectCategoryModel category, int i, C74358TGg c74358TGg) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(category, "category");
        THN LIZ = this.LJLLILLLL.get(category.getKey()).LIZ(activity, category, this.LJLJJL, new AqS72S0201000_12(c74358TGg, category, i, 2));
        if (category.getTags().isEmpty()) {
            LIZ.LIZ(false);
        } else {
            this.LJLL.LJ.LIZJ(category, new TH8(LIZ));
        }
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TH5(C80700Vlo tabLayout, ActivityC45651qj activity, LifecycleOwner lifecycleOwner, TGD stickerViewConfigure, TH1 th1, TF5 requiredDependency, TGS listViewModel, TH7 customCategoryProvider) {
        super(tabLayout, activity, lifecycleOwner, stickerViewConfigure, th1, requiredDependency, listViewModel, customCategoryProvider);
        o.LJIIIZ(tabLayout, "tabLayout");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(customCategoryProvider, "customCategoryProvider");
    }
}
