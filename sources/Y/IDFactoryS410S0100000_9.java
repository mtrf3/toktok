package Y;

import X.ActivityC45651qj;
import X.C09L;
import X.C0VK;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDFactoryS410S0100000_9 implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

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
            default:
                return null;
        }
    }

    public IDFactoryS410S0100000_9(ActivityC45651qj activityC45651qj, int i) {
        this.$t = i;
        this.l0 = activityC45651qj;
    }

    public static final ViewModel create$0(IDFactoryS410S0100000_9 iDFactoryS410S0100000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new HomeTabViewModel((ActivityC45651qj) iDFactoryS410S0100000_9.l0);
    }

    public static final ViewModel create$1(IDFactoryS410S0100000_9 iDFactoryS410S0100000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ListLiveCircleItemVM((ActivityC45651qj) iDFactoryS410S0100000_9.l0);
    }

    public static final ViewModel create$2(IDFactoryS410S0100000_9 iDFactoryS410S0100000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ListLiveCircleItemVM.ListLiveCircleItemVMFollower((ActivityC45651qj) iDFactoryS410S0100000_9.l0);
    }

    public static final ViewModel create$3(IDFactoryS410S0100000_9 iDFactoryS410S0100000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ListLiveCircleItemVM.ListLiveCircleItemVMFollowing((ActivityC45651qj) iDFactoryS410S0100000_9.l0);
    }
}
