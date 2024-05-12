package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38991fz implements ViewModelProvider.Factory {
    public final C39011g1 LIZ;
    public final C44821pO LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (this.LIZ != null && this.LIZIZ != null && modelClass.isAssignableFrom(StickerEffectViewModel.class)) {
            return new StickerEffectViewModel(this.LIZ, this.LIZIZ);
        }
        if (modelClass.isAssignableFrom(MultiGuestStickerViewModel.class)) {
            return new MultiGuestStickerViewModel();
        }
        if (modelClass.isAssignableFrom(NaviAvatarListViewModel.class)) {
            return new NaviAvatarListViewModel(new C21220sQ());
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C38991fz(C39011g1 c39011g1, C44821pO c44821pO) {
        this.LIZ = c39011g1;
        this.LIZIZ = c44821pO;
    }
}
