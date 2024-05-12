package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.jvm.internal.o;

/* renamed from: X.0Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09260Xy {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static ViewModel LIZ(ActivityC45651qj activity, Class cls) {
        o.LJIIIZ(activity, "activity");
        boolean z = activity instanceof InterfaceC04050Dx;
        if (z) {
            ((InterfaceC04050Dx) activity).LL();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(cls);
        if (z) {
            ((InterfaceC04050Dx) activity).LJIJJ();
        }
        return viewModel;
    }
}
