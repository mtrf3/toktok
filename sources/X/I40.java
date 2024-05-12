package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I40 {
    public static C46127I8l LIZ(C29S c29s, LifecycleOwner owner, View view, boolean z, I0N i0n, C82622Wbi diContainer, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        ViewGroup viewGroup;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(diContainer, "diContainer");
        if (L1D.LIZIZ() || L1D.LIZ()) {
            viewGroup = (ViewGroup) view.findViewById(R.id.crk);
        } else {
            viewGroup = (ViewGroup) view.findViewById(R.id.crm);
        }
        return new C46127I8l(c29s, owner, z, i0n, interfaceC88472Yns, viewGroup, (C164106cI) view.findViewById(R.id.fbj), (C164106cI) view.findViewById(R.id.fbm), (C164106cI) view.findViewById(R.id.fbk), (FrameLayout) view.findViewById(R.id.lcb), diContainer, interfaceC65784Pro);
    }
}
