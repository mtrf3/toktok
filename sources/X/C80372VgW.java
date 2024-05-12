package X;

import android.util.Property;

/* renamed from: X.VgW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80372VgW extends Property<C80371VgV, Float> {
    public C80372VgW(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final Float get(C80371VgV c80371VgV) {
        return Float.valueOf(c80371VgV.LJLILLLLZI);
    }

    @Override // android.util.Property
    public final void set(C80371VgV c80371VgV, Float f) {
        c80371VgV.setThumbPosition(f.floatValue());
    }
}
