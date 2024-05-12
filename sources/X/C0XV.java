package X;

import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* renamed from: X.0XV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XV {
    public static final C44021o6 LIZ = C24410xZ.LIZJ(C50581yg.LJLIL);

    public static ViewModelStoreOwner LIZ(InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(-420916950);
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) interfaceC24520xk.LJIILLIIL(LIZ);
        if (viewModelStoreOwner == null) {
            interfaceC24520xk.LJJIIJ(-420916866);
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get((View) interfaceC24520xk.LJIILLIIL(C04Q.LJI));
            interfaceC24520xk.LJJIJIIJIL();
        } else {
            interfaceC24520xk.LJJIIJ(-420916942);
            interfaceC24520xk.LJJIJIIJIL();
        }
        interfaceC24520xk.LJJIJIIJIL();
        return viewModelStoreOwner;
    }
}
