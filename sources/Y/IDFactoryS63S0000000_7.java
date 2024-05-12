package Y;

import X.C09L;
import X.C0VK;
import X.C16880lQ;
import X.X1D;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.AboutThisAdVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.viewmodel.InferenceCategoryVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDFactoryS63S0000000_7 implements ViewModelProvider.Factory {
    public final int $t;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            case 3:
                return (T) create$3(this, cls);
            case 4:
                return (T) create$4(this, cls);
            case 5:
                return (T) create$5(this, cls);
            case 6:
                return (T) create$6(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.$t) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            case 1:
                return C09L.LIZIZ(this, cls, c0vk);
            case 2:
                return C09L.LIZIZ(this, cls, c0vk);
            case 3:
                return C09L.LIZIZ(this, cls, c0vk);
            case 4:
                return C09L.LIZIZ(this, cls, c0vk);
            case 5:
                return C09L.LIZIZ(this, cls, c0vk);
            case 6:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return null;
        }
    }

    public IDFactoryS63S0000000_7(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new AdvertiserVM();
    }

    public static final ViewModel create$1(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new AboutThisAdVM();
    }

    public static final ViewModel create$2(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new InferenceCategoryVM();
    }

    public static final ViewModel create$3(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new SubscriptionVM();
    }

    public static final ViewModel create$4(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new KidsDraftOptionViewModel();
    }

    public static final ViewModel create$5(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new KidsDraftOptionViewModel();
    }

    public static final ViewModel create$6(IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(RecordMVViewModel.class));
        LIZ.append(" should be created in the activity before being used.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}
