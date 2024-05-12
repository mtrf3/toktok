package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189847ci {
    public static StoryFeedViewModel LIZ(final Fragment fragment, Fragment viewModelStoreOwner, final M89 param) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(param, "param");
        ViewModelProvider.Factory factory = new ViewModelProvider.Factory(fragment, param) { // from class: X.7cj
            public final LifecycleOwner LIZ;
            public final M89 LIZIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                return C09L.LIZIZ(this, cls, c0vk);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> modelClass) {
                o.LJIIIZ(modelClass, "modelClass");
                return new StoryFeedViewModel(this.LIZ, this.LIZIZ);
            }

            {
                o.LJIIIZ(fragment, "lifecycleOwner");
                o.LJIIIZ(param, "params");
                this.LIZ = fragment;
                this.LIZIZ = param;
            }
        };
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            if (mo49getActivity.getApplication() != null) {
                ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), factory);
                String eventType = param.getEventType();
                o.LJI(eventType);
                return (StoryFeedViewModel) viewModelProvider.get(eventType, StoryFeedViewModel.class);
            }
            throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
}
