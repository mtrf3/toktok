package Y;

import X.AMQ;
import X.C09L;
import X.C0VK;
import X.C16880lQ;
import X.X1D;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDFactoryS62S0000000_4 implements ViewModelProvider.Factory {
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
            default:
                return null;
        }
    }

    public IDFactoryS62S0000000_4(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(IDFactoryS62S0000000_4 iDFactoryS62S0000000_4, Class modelClass) {
        o.LJIIJ(modelClass, "modelClass");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(modelClass));
        LIZ.append(" should be created in the host before being used.");
        throw new AMQ(X1D.LIZIZ(LIZ));
    }

    public static final ViewModel create$1(IDFactoryS62S0000000_4 iDFactoryS62S0000000_4, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new FeedPromptViewModel();
    }

    public static final ViewModel create$2(IDFactoryS62S0000000_4 iDFactoryS62S0000000_4, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ProfileViewModel();
    }
}
