package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: X.VgX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80373VgX extends Property<View, Rect> {
    public C80373VgX(Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final Rect get(View view) {
        return C16320kW.LIZ(view);
    }

    @Override // android.util.Property
    public final void set(View view, Rect rect) {
        C16320kW.LIZJ(view, rect);
    }
}
