package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3S0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3S0 {
    public static ChatNoticeViewModel LIZ(Fragment fragment, final C99033ud sessionInfo) {
        final int status;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        if (C40322Fs6.LIZJ(fragment.requireContext())) {
            status = TopChatNoticePushStatus.PUSH_STATUS_ON.getStatus();
        } else {
            status = TopChatNoticePushStatus.PUSH_STATUS_OFF.getStatus();
        }
        return (ChatNoticeViewModel) ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.3Rz
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                return C09L.LIZIZ(this, cls, c0vk);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> modelClass) {
                o.LJIIIZ(modelClass, "modelClass");
                return new ChatNoticeViewModel(C99033ud.this, status);
            }
        }).get(ChatNoticeViewModel.class);
    }
}
