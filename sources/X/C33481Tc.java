package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.1Tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33481Tc implements ViewModelProvider.Factory {
    public final C14320hI LIZ;
    public final DataChannel LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new BGMPlaylistViewModel(this.LIZ, this.LIZIZ);
    }

    public C33481Tc(C14320hI c14320hI, DataChannel dataChannel) {
        this.LIZ = c14320hI;
        this.LIZIZ = dataChannel;
    }
}
