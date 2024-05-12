package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;

/* loaded from: classes6.dex */
public final class BO1 implements ViewModelProvider.Factory {
    public final BMM LIZ;
    public long LIZIZ;
    public BMN LIZJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public BO1(FeedRepository feedRepository) {
        this.LIZ = feedRepository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(BaseFeedDataViewModel.class)) {
            return new BaseFeedDataViewModel(this.LIZ, this.LIZJ);
        }
        if (cls.isAssignableFrom(TabFeedViewModel.class)) {
            return new TabFeedViewModel(this.LIZ, this.LIZJ, this.LIZIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        throw new IllegalArgumentException(AnonymousClass028.LIZLLL(LIZ, "unknown model ", cls, LIZ));
    }
}
