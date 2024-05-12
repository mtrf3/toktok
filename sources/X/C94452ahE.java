package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ahE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94452ahE extends ViewModelProvider.NewInstanceFactory {
    public final long LIZ;

    public C94452ahE(long j) {
        this.LIZ = j;
    }

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new PrefabEditViewModel(this.LIZ);
    }
}
