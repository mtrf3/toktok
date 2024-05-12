package X;

import android.util.Property;

/* renamed from: X.Voe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80876Voe extends Property<AbstractC80872Voa, Float> {
    public C80876Voe(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final Float get(AbstractC80872Voa abstractC80872Voa) {
        return Float.valueOf(abstractC80872Voa.LIZIZ());
    }

    @Override // android.util.Property
    public final void set(AbstractC80872Voa abstractC80872Voa, Float f) {
        AbstractC80872Voa abstractC80872Voa2 = abstractC80872Voa;
        float floatValue = f.floatValue();
        if (abstractC80872Voa2.LJLJLJ != floatValue) {
            abstractC80872Voa2.LJLJLJ = floatValue;
            abstractC80872Voa2.invalidateSelf();
        }
    }
}
