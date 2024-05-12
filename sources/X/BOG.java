package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;

/* loaded from: classes6.dex */
public final class BOG implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(RoomStatsViewModel.class)) {
            return new RoomStatsViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
