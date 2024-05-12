package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.IDqS461S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vmd */
/* loaded from: classes15.dex */
public final class C80751Vmd extends FrameLayout {
    public InterfaceC80752Vme LJLIL;

    public final InterfaceC80752Vme getConstraints() {
        return this.LJLIL;
    }

    public final void setConstraints(InterfaceC80752Vme value) {
        o.LJIIIZ(value, "value");
        this.LJLIL = value;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80751Vmd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new C80750Vmc();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LJLIL.LIZIZ(i, i2, this, new AqS196S0100000_14(this, 8));
    }

    public static final /* synthetic */ void LIZIZ(C80751Vmd c80751Vmd, int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LJLIL.LIZ(z, i, i2, i3, i4, this, new IDqS461S0100000_14(this, 1));
    }
}
