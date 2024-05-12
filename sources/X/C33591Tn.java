package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.1Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33591Tn implements ViewModelProvider.Factory {
    public final C14410hR LIZ;
    public final DataChannel LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new BGMSongListViewModel(this.LIZ, this.LIZIZ);
    }

    public C33591Tn(C14410hR c14410hR, DataChannel dataChannel) {
        this.LIZ = c14410hR;
        this.LIZIZ = dataChannel;
    }
}
