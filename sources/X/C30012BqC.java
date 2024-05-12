package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BqC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30012BqC extends Property<View, Integer> {
    public C30012BqC(Class cls) {
        super(cls, "width");
    }

    @Override // android.util.Property
    public final Integer get(View view) {
        return Integer.valueOf(view.getLayoutParams().width);
    }

    @Override // android.util.Property
    public final void set(View view, Integer num) {
        View view2 = view;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = num.intValue();
        view2.setLayoutParams(layoutParams);
    }
}
