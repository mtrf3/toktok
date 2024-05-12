package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Vd9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80163Vd9 extends FrameLayout implements InterfaceC80161Vd7 {
    @Override // X.InterfaceC80185VdV
    public final void LIZIZ(InterfaceC78979Uz9 refreshLayout, EnumC80174VdK oldState, EnumC80174VdK newState) {
        o.LJIIJ(refreshLayout, "refreshLayout");
        o.LJIIJ(oldState, "oldState");
        o.LJIIJ(newState, "newState");
    }

    @Override // X.InterfaceC80178VdO
    public final void LJII(C80165VdB kernel, int i, int i2) {
        o.LJIIJ(kernel, "kernel");
    }

    @Override // X.InterfaceC80178VdO
    public final int LJIIIIZZ(C80164VdA refreshLayout, boolean z) {
        o.LJIIJ(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // X.InterfaceC80178VdO
    public final void LJIILL(float f, int i, int i2) {
    }

    @Override // X.InterfaceC80178VdO
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.InterfaceC80178VdO
    public final void LJIJ(InterfaceC78979Uz9 refreshLayout, int i, int i2) {
        o.LJIIJ(refreshLayout, "refreshLayout");
    }

    @Override // X.InterfaceC80178VdO
    public final void LJJI(InterfaceC78979Uz9 refreshLayout, int i, int i2) {
        o.LJIIJ(refreshLayout, "refreshLayout");
    }

    @Override // X.InterfaceC80178VdO
    public final void LJJIFFI(boolean z, float f, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC80178VdO
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC80178VdO
    public void setPrimaryColors(int... colors) {
        o.LJIIJ(colors, "colors");
    }

    @Override // X.InterfaceC80178VdO
    public C80182VdS getSpinnerStyle() {
        return C80182VdS.LIZJ;
    }

    public C80163Vd9(VNU vnu) {
        super(vnu, null, 0);
    }
}
