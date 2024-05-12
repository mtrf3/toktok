package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.KRj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51715KRj implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ShoutoutsPlayViewModel();
    }
}
