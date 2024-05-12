package X;

import android.util.Property;
import kotlin.jvm.internal.o;

/* renamed from: X.UxN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78869UxN extends Property<C78870UxO, float[]> {
    public C78869UxN() {
        super(float[].class, "nonTranslations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ float[] get(C78870UxO c78870UxO) {
        return null;
    }

    @Override // android.util.Property
    public final void set(C78870UxO c78870UxO, float[] fArr) {
        C78870UxO c78870UxO2 = c78870UxO;
        float[] values = fArr;
        c78870UxO2.getClass();
        o.LJIIIZ(values, "values");
        System.arraycopy(values, 0, c78870UxO2.LJ, 0, values.length);
        c78870UxO2.LIZ();
    }
}
