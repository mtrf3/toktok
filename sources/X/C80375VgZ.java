package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.VgZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80375VgZ extends Property<View, Float> {
    public C80375VgZ(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final Float get(View view) {
        return Float.valueOf(C16310kV.LJFF(view));
    }

    @Override // android.util.Property
    public final void set(View view, Float f) {
        View view2 = view;
        C16310kV.LJIIJ(view2, f.intValue(), view2.getPaddingTop(), C16310kV.LJ(view2), view2.getPaddingBottom());
    }
}
