package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Mqn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58077Mqn implements ViewModelProvider.Factory {
    public final FindFriendsPageVM LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C58077Mqn(FindFriendsPageVM findFriendsPageVM) {
        o.LJIIIZ(findFriendsPageVM, "findFriendsPageVM");
        this.LIZ = findFriendsPageVM;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new RecFriendsVM(this.LIZ);
    }
}
