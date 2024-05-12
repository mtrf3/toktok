package Y;

import X.C09L;
import X.C0VK;
import X.C62822Ol8;
import X.C84343Ss;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDFactoryS64S0000000_9 implements ViewModelProvider.Factory {
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

    public IDFactoryS64S0000000_9(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(IDFactoryS64S0000000_9 iDFactoryS64S0000000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new AdHomePageDataVM();
    }

    public static final ViewModel create$1(IDFactoryS64S0000000_9 iDFactoryS64S0000000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new InboxFollowGuideViewModel();
    }

    public static final ViewModel create$2(IDFactoryS64S0000000_9 iDFactoryS64S0000000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new MainPageDataViewModel();
    }

    public static final ViewModel create$3(IDFactoryS64S0000000_9 iDFactoryS64S0000000_9, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        C62822Ol8 c62822Ol8 = MultiViewModel.LLJ;
        ((C84343Ss) c62822Ol8.getValue()).LIZLLL();
        Object remove = ((C84343Ss) c62822Ol8.getValue()).LIZIZ().remove("BUFFER_VM");
        if (remove == null) {
            remove = null;
        }
        ViewModel viewModel = (ViewModel) remove;
        if (viewModel == null) {
            return new MultiViewModel();
        }
        return viewModel;
    }
}
