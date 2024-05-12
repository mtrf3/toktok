package X;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.0I9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0I9 {
    public static ViewModelProvider LIZ(AbstractC40841iy groupLogicComponent) {
        o.LJIIIZ(groupLogicComponent, "groupLogicComponent");
        return new ViewModelProvider(groupLogicComponent.getViewModelStore(), new ViewModelProvider.NewInstanceFactory());
    }
}
