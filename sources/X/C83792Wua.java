package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Wua, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83792Wua implements InterfaceC82309WSb {
    public final /* synthetic */ C83623Wrr LIZ;

    @Override // X.InterfaceC82309WSb
    public final int LIZIZ() {
        return this.LIZ.getCkCameraViewLikeFunction().LIZIZ();
    }

    @Override // X.InterfaceC82309WSb
    public final int LIZJ() {
        return this.LIZ.getCkCameraViewLikeFunction().LIZJ();
    }

    @Override // X.InterfaceC82309WSb
    public final View getView() {
        return this.LIZ.getCkCameraViewLikeFunction().getView();
    }

    public C83792Wua(C83623Wrr c83623Wrr) {
        this.LIZ = c83623Wrr;
    }

    @Override // X.InterfaceC82309WSb
    public final void LJZI(View child) {
        o.LJIIIZ(child, "child");
        this.LIZ.getCkCameraViewLikeFunction().LJZI(child);
    }

    @Override // X.InterfaceC82309WSb
    public final void removeView(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ.getCkCameraViewLikeFunction().removeView(view);
    }

    @Override // X.InterfaceC82309WSb
    public final void LIZ(C83643WsB c83643WsB, ViewGroup.LayoutParams layoutParams) {
        this.LIZ.getCkCameraViewLikeFunction().LIZ(c83643WsB, layoutParams);
    }
}
