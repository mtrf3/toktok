package X;

import android.util.Property;

/* renamed from: X.Vop, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80887Vop extends Property<C80881Voj, Float> {
    public C80887Vop(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final Float get(C80881Voj c80881Voj) {
        return Float.valueOf(c80881Voj.LJIIIZ);
    }

    @Override // android.util.Property
    public final void set(C80881Voj c80881Voj, Float f) {
        c80881Voj.LJIIIZ = f.floatValue();
    }
}
