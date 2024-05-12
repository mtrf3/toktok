package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.1NG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NG implements ViewModelProvider.Factory {
    public final C0VL<?>[] LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return C09L.LIZ(this, cls);
    }

    public C1NG(C0VL<?>... initializers) {
        o.LJIIIZ(initializers, "initializers");
        this.LIZ = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass, C0VK extras) {
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(extras, "extras");
        T t = null;
        for (C0VL<?> c0vl : this.LIZ) {
            if (o.LJ(c0vl.LIZ, modelClass)) {
                Object invoke = c0vl.LIZIZ.invoke(extras);
                if (invoke instanceof ViewModel) {
                    t = (T) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder LIZ = X1D.LIZ();
        throw new IllegalArgumentException(AnonymousClass028.LIZLLL(LIZ, "No initializer set for given class ", modelClass, LIZ));
    }
}
