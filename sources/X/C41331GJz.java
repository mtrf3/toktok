package X;

import Y.IDFactoryS409S0100000_7;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.GJz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41331GJz {
    public static final /* synthetic */ int LIZ = 0;

    public static ViewModel LIZ(Class cls, ViewModelStoreOwner viewModelStoreOwner, InterfaceC65784Pro interfaceC65784Pro) {
        ViewModelProvider.Factory newInstanceFactory;
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        if (interfaceC65784Pro != null) {
            newInstanceFactory = new IDFactoryS409S0100000_7(interfaceC65784Pro, 0);
        } else {
            newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
        }
        return new ViewModelProvider(viewModelStoreOwner, newInstanceFactory).get(cls);
    }
}
