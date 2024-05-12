package X;

import Y.ACListenerS22S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152615yr extends AbstractC56012Ht<C152625ys, C152655yv> {
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (!C1280450u.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ase, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        View findViewById = viewGroup.findViewById(R.id.m1c);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 170), findViewById);
        }
        View findViewById2 = viewGroup.findViewById(R.id.mij);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 171), findViewById2);
        }
        return viewGroup;
    }
}
