package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.Vgb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80377Vgb extends Property<View, Float> {
    public C80377Vgb(Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final Float get(View view) {
        return Float.valueOf(C16310kV.LJ(view));
    }

    @Override // android.util.Property
    public final void set(View view, Float f) {
        View view2 = view;
        C16310kV.LJIIJ(view2, C16310kV.LJFF(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
    }
}
