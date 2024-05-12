package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ShM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72780ShM {
    public static final /* synthetic */ int LJ = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C72780ShM(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.bth, R.attr.btj, R.attr.btl, R.attr.btm}, R.attr.ki, 0);
        this.LIZ = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        C1E4.LJI(obtainStyledAttributes, 1);
        int color = obtainStyledAttributes.getColor(1, 0);
        this.LIZIZ = color;
        this.LIZJ = obtainStyledAttributes.getColor(2, color);
        this.LIZLLL = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
