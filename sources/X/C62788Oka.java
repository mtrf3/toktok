package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Oka, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62788Oka implements ViewModelProvider.Factory {
    public final P1V LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C62788Oka(P1V config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new FacebookMaFWidgetVM(this.LIZ);
    }
}
