package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes8.dex */
public final class GTG extends FrameLayout implements InterfaceC60207Nk3 {
    public final C73305Spp LJLIL;

    @Override // X.InterfaceC60207Nk3
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC60207Nk3
    public final void hide() {
        setVisibility(4);
    }

    @Override // X.InterfaceC60207Nk3
    public final void show() {
        this.LJLIL.LJFF();
        setVisibility(0);
    }

    public final C73305Spp getStatusView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTG(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        this.LJLIL = c73305Spp;
        addView(c73305Spp, new FrameLayout.LayoutParams(-1, -1));
    }
}
