package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.09L, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C09L {
    public static ViewModelProvider.Factory LIZJ(C0VL<?>... c0vlArr) {
        return ViewModelProvider.Factory.Companion.from(c0vlArr);
    }

    public static ViewModel LIZ(ViewModelProvider.Factory factory, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static ViewModel LIZIZ(ViewModelProvider.Factory factory, Class modelClass, C0VK extras) {
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(extras, "extras");
        return factory.create(modelClass);
    }
}
