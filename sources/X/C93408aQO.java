package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aQO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93408aQO {
    public static final ViewModelLazy LIZ(Fragment createViewModelLazy, C65776Prg c65776Prg, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        o.LJIIJ(createViewModelLazy, "$this$createViewModelLazy");
        if (interfaceC65784Pro2 == null) {
            interfaceC65784Pro2 = new IDqS423S0100000_42(createViewModelLazy, 0);
        }
        return new ViewModelLazy(c65776Prg, interfaceC65784Pro, interfaceC65784Pro2);
    }
}
