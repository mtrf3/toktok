package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVI implements ViewModelProvider.Factory {
    public final User LIZ;
    public final InterfaceC57699Mkh LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new RecUserVideoListSharedVM(this.LIZ, this.LIZIZ);
    }

    public MVI(User curUser, C57721Ml3 c57721Ml3) {
        o.LJIIIZ(curUser, "curUser");
        this.LIZ = curUser;
        this.LIZIZ = c57721Ml3;
    }
}
