package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.MqN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC58051MqN implements View.OnLayoutChangeListener {
    public final /* synthetic */ C58049MqL LJLIL;
    public final /* synthetic */ C57749MlV LJLILLLLZI;
    public final /* synthetic */ C58055MqR LJLJI;

    public ViewOnLayoutChangeListenerC58051MqN(C58049MqL c58049MqL, C57749MlV c57749MlV, C58055MqR c58055MqR) {
        this.LJLIL = c58049MqL;
        this.LJLILLLLZI = c57749MlV;
        this.LJLJI = c58055MqR;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.LJLIL.LJZ = ((r2.getWidth() - this.LJLIL.getPaddingStart()) - this.LJLIL.getPaddingEnd()) - C32151Nz.LJIIZILJ(5);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.hashCode());
        LIZ.append(" do on next layout meas:");
        LIZ.append(this.LJLIL.getMeasuredWidth());
        LIZ.append(" tv:");
        LIZ.append(this.LJLIL.LJZ);
        LIZ.append(" len:");
        LIZ.append(this.LJLIL.getText().length());
        C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZ));
        C58049MqL c58049MqL = this.LJLIL;
        c58049MqL.LJJJIL(this.LJLILLLLZI, this.LJLJI, c58049MqL.LJZ);
    }
}
