package X;

import android.util.Property;

/* renamed from: X.WGj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82005WGj extends Property<C82003WGh, float[]> {
    public C82005WGj() {
        super(float[].class, "nonTranslations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ float[] get(C82003WGh c82003WGh) {
        return null;
    }

    @Override // android.util.Property
    public final void set(C82003WGh c82003WGh, float[] fArr) {
        C82003WGh c82003WGh2 = c82003WGh;
        float[] fArr2 = fArr;
        System.arraycopy(fArr2, 0, c82003WGh2.LJ, 0, fArr2.length);
        c82003WGh2.LIZ();
    }
}
