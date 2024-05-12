package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ahA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94448ahA extends ViewModelProvider.NewInstanceFactory {
    public final PrefabData LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        Long l = this.LIZIZ;
        if (l != null) {
            return new PrefabViewModel(l.longValue(), this.LIZJ);
        }
        PrefabData prefabData = this.LIZ;
        o.LJI(prefabData);
        return new PrefabViewModel(prefabData);
    }

    public C94448ahA(PrefabData prefabData, Long l, boolean z) {
        this.LIZ = prefabData;
        this.LIZIZ = l;
        this.LIZJ = z;
    }
}
