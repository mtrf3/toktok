package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1O2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1O2 implements ViewModelProvider.Factory {
    public final C1O0 LIZ;
    public final C42181l8 LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(VoiceEffectViewModel.class)) {
            return new VoiceEffectViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C1O2(C1O0 c1o0, C42181l8 c42181l8) {
        this.LIZ = c1o0;
        this.LIZIZ = c42181l8;
    }
}
