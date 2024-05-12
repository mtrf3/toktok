package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TiX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75401TiX implements ViewModelProvider.Factory {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ LifecycleOwner LIZIZ;
    public final /* synthetic */ InterfaceC24140x8 LIZJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new MultiGuestEffectViewModel(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C75401TiX(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC24140x8 interfaceC24140x8) {
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC24140x8;
    }
}
