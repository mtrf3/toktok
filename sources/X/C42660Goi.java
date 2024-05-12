package X;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Goi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42660Goi {
    public static void LIZ(InterfaceC42661Goj interfaceC42661Goj, InterfaceC40967G5z listener) {
        o.LJIIIZ(listener, "listener");
        FragmentManager fragmentManager = interfaceC42661Goj.getFragment().getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJJLIL(new C42659Goh(listener), false);
        }
    }
}
