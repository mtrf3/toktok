package X;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStores;

/* renamed from: X.6ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165616ej {
    public static C165626ek LIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj.getApplication() != null) {
            return new C165626ek(ViewModelStores.of(activityC45651qj), new C72561Sdp());
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static C165626ek LIZIZ(ViewModelStoreOwner viewModelStoreOwner) {
        return new C165626ek(viewModelStoreOwner.getViewModelStore(), new C72561Sdp());
    }
}
