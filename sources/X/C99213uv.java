package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99213uv {
    public static GroupChatViewModel LIZ(Fragment fragment, final C98563ts sessionInfo) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        ViewModelProvider of = ViewModelProviders.of(fragment, new ViewModelProvider.Factory(sessionInfo) { // from class: X.3uw
            public final C98563ts LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                return C09L.LIZIZ(this, cls, c0vk);
            }

            {
                o.LJIIIZ(sessionInfo, "sessionInfo");
                this.LIZ = sessionInfo;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> modelClass) {
                o.LJIIIZ(modelClass, "modelClass");
                return new GroupChatViewModel(this.LIZ);
            }
        });
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupChatViewModel-");
        LIZ.append(sessionInfo.getConversationId());
        return (GroupChatViewModel) of.get(X1D.LIZIZ(LIZ), GroupChatViewModel.class);
    }
}
