package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37901eE implements ViewModelProvider.Factory {
    public final C37931eH LIZ;
    public final C37951eJ LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(SoundEffectViewModel.class)) {
            return new SoundEffectViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C37901eE(C37931eH c37931eH, C37951eJ c37951eJ) {
        this.LIZ = c37931eH;
        this.LIZIZ = c37951eJ;
    }
}
