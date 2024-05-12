package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Moe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57944Moe implements ViewModelProvider.Factory {
    public final C57859MnH LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        C57859MnH c57859MnH = this.LIZ;
        String str = this.LIZIZ;
        C58029Mq1 c58029Mq1 = null;
        if (this.LIZJ) {
            c58029Mq1 = new C58029Mq1(0);
        }
        return new UserCardListViewModel(c57859MnH, str, c58029Mq1);
    }

    public C57944Moe(C57859MnH userCardConfig, String abilityTag, boolean z) {
        o.LJIIIZ(userCardConfig, "userCardConfig");
        o.LJIIIZ(abilityTag, "abilityTag");
        this.LIZ = userCardConfig;
        this.LIZIZ = abilityTag;
        this.LIZJ = z;
    }
}
