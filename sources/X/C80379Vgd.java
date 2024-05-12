package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.Vgd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80379Vgd extends Property<View, Float> {
    public C80379Vgd(Class cls) {
        super(cls, "height");
    }

    @Override // android.util.Property
    public final Float get(View view) {
        return Float.valueOf(view.getLayoutParams().height);
    }

    @Override // android.util.Property
    public final void set(View view, Float f) {
        View view2 = view;
        view2.getLayoutParams().height = f.intValue();
        view2.requestLayout();
    }
}
