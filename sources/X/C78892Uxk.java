package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: X.Uxk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78892Uxk extends Property<View, Rect> {
    public C78892Uxk(Class cls) {
        super(cls, "center_bounds");
    }

    @Override // android.util.Property
    public final Rect get(View view) {
        View view2 = view;
        return new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
    }

    @Override // android.util.Property
    public final void set(View view, Rect rect) {
        Rect rect2 = rect;
        int i = rect2.left;
        int i2 = rect2.top;
        int i3 = rect2.right;
        int i4 = rect2.bottom;
        C78890Uxi.LIZ.LIZ(view, i, i2, i3, i4);
    }
}
