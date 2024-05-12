package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37301dG implements ViewModelProvider.Factory {
    public final C44171oL LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C37301dG(C44171oL c44171oL) {
        this.LIZ = c44171oL;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (this.LIZ != null && modelClass.isAssignableFrom(LiveSmallItemBeautyViewModel.class)) {
            return new LiveSmallItemBeautyViewModel(this.LIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }
}
