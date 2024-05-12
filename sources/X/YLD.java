package X;

import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes16.dex */
public class YLD {
    public final C87699YbP LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final Paint LIZLLL;
    public final Paint LJ;
    public VU6 LJFF;
    public VU6 LJI;

    public YLD() {
        Paint paint = new Paint();
        this.LIZLLL = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.LJ = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(Typeface.DEFAULT);
        this.LIZ = C87699YbP.LIZ();
    }

    public YLD(YLD yld) {
        this.LIZIZ = yld.LIZIZ;
        this.LIZJ = yld.LIZJ;
        this.LIZLLL = new Paint(yld.LIZLLL);
        this.LJ = new Paint(yld.LJ);
        VU6 vu6 = yld.LJFF;
        if (vu6 != null) {
            this.LJFF = new VU6(vu6);
        }
        VU6 vu62 = yld.LJI;
        if (vu62 != null) {
            this.LJI = new VU6(vu62);
        }
        try {
            this.LIZ = (C87699YbP) yld.LIZ.clone();
        } catch (CloneNotSupportedException unused) {
            this.LIZ = C87699YbP.LIZ();
        }
    }
}
