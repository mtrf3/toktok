package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.Vgc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80378Vgc extends Property<View, Float> {
    public C80378Vgc(Class cls) {
        super(cls, "width");
    }

    @Override // android.util.Property
    public final Float get(View view) {
        return Float.valueOf(view.getLayoutParams().width);
    }

    @Override // android.util.Property
    public final void set(View view, Float f) {
        View view2 = view;
        view2.getLayoutParams().width = f.intValue();
        view2.requestLayout();
    }
}
