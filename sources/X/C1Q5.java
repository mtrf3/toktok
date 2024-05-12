package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1Q5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q5 implements ViewModelProvider.Factory {
    public final C39011g1 LIZ;
    public final C44821pO LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (this.LIZ != null && this.LIZIZ != null && modelClass.isAssignableFrom(BgEffectViewModel.class)) {
            return new BgEffectViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C1Q5(C39011g1 c39011g1, C44821pO c44821pO) {
        this.LIZ = c39011g1;
        this.LIZIZ = c44821pO;
    }
}
