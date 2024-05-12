package X;

import android.graphics.Typeface;

/* loaded from: classes15.dex */
public final class VED {
    public final Typeface LIZ;
    public final Typeface[] LIZIZ;

    public VED(Typeface typeface) {
        Typeface[] typefaceArr = new Typeface[4];
        this.LIZIZ = typefaceArr;
        this.LIZ = typeface;
        typefaceArr[0] = typeface;
    }

    public final Typeface LIZ(int i) {
        if (i < 0 || i > 3) {
            i = 0;
        }
        Typeface[] typefaceArr = this.LIZIZ;
        if (typefaceArr[i] == null) {
            typefaceArr[i] = Typeface.create(this.LIZ, i);
        }
        return this.LIZIZ[i];
    }
}
