package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97123rY {
    public static ChatRoomViewModel LIZ(Fragment fragment, final C99033ud sessionInfo) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        String conversationId = sessionInfo.getConversationId();
        if (sessionInfo.isReportPage()) {
            return (ChatRoomViewModel) ViewModelProviders.of(fragment, new ViewModelProvider.Factory(sessionInfo) { // from class: X.3rZ
                public final C99033ud LIZ;

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
                    if (modelClass.isAssignableFrom(ChatRoomViewModel.class)) {
                        return new ChatRoomViewModel(this.LIZ, C80533Eb.LIZ);
                    }
                    throw new IllegalArgumentException("ChatRoomViewModel.get(): Unknown ViewModel class");
                }
            }).get(ChatRoomViewModel.class);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) ChatRoomViewModel.LLFII;
        Object obj = linkedHashMap.get(conversationId);
        if (obj == null) {
            obj = (ChatRoomViewModel) ViewModelProviders.of(fragment, new ViewModelProvider.Factory(sessionInfo) { // from class: X.3rZ
                public final C99033ud LIZ;

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
                    if (modelClass.isAssignableFrom(ChatRoomViewModel.class)) {
                        return new ChatRoomViewModel(this.LIZ, C80533Eb.LIZ);
                    }
                    throw new IllegalArgumentException("ChatRoomViewModel.get(): Unknown ViewModel class");
                }
            }).get(ChatRoomViewModel.class);
            linkedHashMap.put(conversationId, obj);
        }
        return (ChatRoomViewModel) obj;
    }
}
