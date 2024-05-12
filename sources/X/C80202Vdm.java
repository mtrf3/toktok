package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o3.h0;

/* renamed from: X.Vdm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80202Vdm implements InterfaceC17830mx {
    public final /* synthetic */ SwipeDismissBehavior LIZ;

    public C80202Vdm(SwipeDismissBehavior swipeDismissBehavior) {
        this.LIZ = swipeDismissBehavior;
    }

    @Override // X.InterfaceC17830mx
    public final boolean LIZ(View view) {
        boolean z;
        boolean z2 = false;
        if (!this.LIZ.LIZ(view)) {
            return false;
        }
        if (C16310kV.LIZLLL(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LIZ.LIZLLL;
        if (i != 0 ? !(i != 1 || z) : z) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        h0.LJIIJJI(width, view);
        view.setAlpha(0.0f);
        C80203Vdn c80203Vdn = this.LIZ.LIZIZ;
        if (c80203Vdn != null) {
            c80203Vdn.LIZ(view);
        }
        return true;
    }
}
