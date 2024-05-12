package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.homepage.ui.slide.XTabScrollProfileVM;
import kotlin.jvm.internal.o;

/* renamed from: X.3Sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84213Sf implements ViewModelProvider.Factory {
    public final ActivityC45651qj LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C84213Sf(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new XTabScrollProfileVM(this.LIZ);
    }
}
