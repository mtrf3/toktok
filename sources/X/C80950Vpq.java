package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.Vpq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80950Vpq extends Property<View, Float> {
    public C80950Vpq(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final Float get(View view) {
        return Float.valueOf(C80951Vpr.LIZ.LJIIIIZZ(view));
    }

    @Override // android.util.Property
    public final void set(View view, Float f) {
        float floatValue = f.floatValue();
        C80951Vpr.LIZ.LJIIIZ(view, floatValue);
    }
}
