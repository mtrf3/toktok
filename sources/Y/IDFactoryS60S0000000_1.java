package Y;

import X.C09L;
import X.C0VK;
import X.C3NC;
import X.C62822Ol8;
import X.C84343Ss;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDFactoryS60S0000000_1 implements ViewModelProvider.Factory {
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

    public IDFactoryS60S0000000_1(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ComplianceVM();
    }

    public static final ViewModel create$1(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ShakeEggVM();
    }

    public static final ViewModel create$2(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new HomePageDataViewModel();
    }

    public static final ViewModel create$3(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ScrollSwitchStateManager();
    }

    public static final ViewModel create$4(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        FocusedSessionListViewModelImpl focusedSessionListViewModelImpl;
        o.LJIIIZ(modelClass, "modelClass");
        synchronized (C3NC.class) {
            C62822Ol8 c62822Ol8 = FocusedSessionListViewModelImpl.LJLLJ;
            ((C84343Ss) c62822Ol8.getValue()).LIZLLL();
            Object remove = ((C84343Ss) c62822Ol8.getValue()).LIZIZ().remove("BUFFER__FOCUSED_SESSION_LIST_VM");
            if (remove == null) {
                remove = null;
            }
            focusedSessionListViewModelImpl = (FocusedSessionListViewModelImpl) remove;
            if (focusedSessionListViewModelImpl == null) {
                focusedSessionListViewModelImpl = new FocusedSessionListViewModelImpl(null);
            }
        }
        return focusedSessionListViewModelImpl;
    }

    public static final ViewModel create$5(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ChatInviteViewModelImpl(0);
    }

    public static final ViewModel create$6(IDFactoryS60S0000000_1 iDFactoryS60S0000000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new TabChangeManager();
    }
}
