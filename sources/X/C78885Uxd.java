package X;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uxd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78885Uxd {
    public static final Context LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;

    public static int LIZJ(int i) {
        return (i & 16777215) | LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    static {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        LIZ = application;
        LIZIZ = ColorProtector.parseColor("#FFFFFFFF");
        LIZJ = ColorProtector.parseColor("#D8000000");
        LIZLLL = ColorProtector.parseColor("#80000000");
        LJ = ColorProtector.parseColor("#99000000");
        LJFF = ColorProtector.parseColor("#26FFFFFF");
        LJI = ColorProtector.parseColor("#26000000");
    }

    public static Drawable LIZLLL(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        o.LJIIIIZZ(mutate, "drawable.mutate()");
        mutate.setColorFilter(new PorterDuffColorFilter(LIZIZ, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static Drawable LIZ(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        boolean z2 = obtainStyledAttributes.getBoolean(43, false);
        int dimension = (int) obtainStyledAttributes.getDimension(31, 0.0f);
        boolean z3 = obtainStyledAttributes.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes.getBoolean(32, false);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        boolean z6 = obtainStyledAttributes.getBoolean(36, false);
        boolean z7 = obtainStyledAttributes.getBoolean(46, false);
        int LIZIZ2 = LIZIZ(z3, z4, z5, z6);
        if (z7) {
            LIZIZ2 = LIZIZ;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            LIZIZ2 = obtainStyledAttributes.getColor(0, LIZIZ2);
        }
        obtainStyledAttributes.recycle();
        TDY tdy = new TDY();
        tdy.LIZIZ(LIZIZ2);
        tdy.LJ(LIZIZ2, 0);
        if (z) {
            tdy.LIZLLL(1);
        } else {
            tdy.LIZLLL(0);
            if (z2) {
                float f = dimension;
                tdy.LJFF = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                tdy.LIZJ(dimension);
            }
        }
        return tdy.LIZ();
    }

    public static Drawable LJ(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        o.LJIIIIZZ(mutate, "drawable.mutate()");
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static int LIZIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return LJFF;
        }
        if (z) {
            if (z2) {
                return AnonymousClass636.LJIIIIZZ(R.attr.cb, LIZ);
            }
            return AnonymousClass636.LJIIIIZZ(R.attr.ca, LIZ);
        }
        if (z2) {
            if (z3) {
                return LJI;
            }
            return LIZLLL;
        }
        if (z3) {
            return LJ;
        }
        return LIZJ;
    }
}
