package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSL implements InterfaceC82309WSb {
    public final /* synthetic */ C83861Wvh LIZ;

    @Override // X.InterfaceC82309WSb
    public final int LIZIZ() {
        return this.LIZ.getPresentView().getHeight();
    }

    @Override // X.InterfaceC82309WSb
    public final int LIZJ() {
        return this.LIZ.getPresentView().getWidth();
    }

    @Override // X.InterfaceC82309WSb
    public final View getView() {
        return this.LIZ;
    }

    public WSL(C83861Wvh c83861Wvh) {
        this.LIZ = c83861Wvh;
    }

    @Override // X.InterfaceC82309WSb
    public final void LJZI(View child) {
        o.LJIIIZ(child, "child");
        this.LIZ.addView(child);
    }

    @Override // X.InterfaceC82309WSb
    public final void removeView(View view) {
        o.LJIIIZ(view, "view");
        C83861Wvh c83861Wvh = this.LIZ;
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c83861Wvh.removeView(view);
    }

    @Override // X.InterfaceC82309WSb
    public final void LIZ(C83643WsB c83643WsB, ViewGroup.LayoutParams layoutParams) {
        this.LIZ.addView(c83643WsB, layoutParams);
    }
}
