package X;

import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.4i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116684i0 {
    public ViewOnClickListenerC252769w0 LIZ;

    public final void LIZ() {
        ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0 = this.LIZ;
        if (viewOnClickListenerC252769w0 != null) {
            viewOnClickListenerC252769w0.setVisibility(8);
            ViewParent parent = viewOnClickListenerC252769w0.getParent();
            if (parent != null) {
                C16880lQ.LJLLL(viewOnClickListenerC252769w0, (ViewGroup) parent);
            }
        }
        this.LIZ = null;
    }
}
