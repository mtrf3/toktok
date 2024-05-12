package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VjK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80546VjK {
    public final C80339Vfz LIZ;
    public final C80339Vfz LIZIZ;
    public final C80339Vfz LIZJ;
    public final C80339Vfz LIZLLL;
    public final C80339Vfz LJ;
    public final C80339Vfz LJFF;
    public final C80339Vfz LJI;
    public final Paint LJII;

    public C80546VjK(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C78972Uz2.LIZIZ(context, R.attr.azy, C16880lQ.LJLLILLLL(MaterialCalendar.class)), new int[]{android.R.attr.windowFullscreen, R.attr.a99, R.attr.a9_, R.attr.a9a, R.attr.a9b, R.attr.b23, R.attr.b6m, R.attr.by4, R.attr.by5, R.attr.by6});
        this.LIZ = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(3, 0), context);
        this.LJI = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(1, 0), context);
        this.LIZIZ = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(2, 0), context);
        this.LIZJ = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(4, 0), context);
        ColorStateList LIZ = C80285Vf7.LIZ(context, obtainStyledAttributes, 6);
        this.LIZLLL = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(8, 0), context);
        this.LJ = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(7, 0), context);
        this.LJFF = C80339Vfz.LIZ(obtainStyledAttributes.getResourceId(9, 0), context);
        Paint paint = new Paint();
        this.LJII = paint;
        paint.setColor(LIZ.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
