package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.033, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass033 {
    public final Context LIZ;
    public final TypedArray LIZIZ;
    public TypedValue LIZJ;

    public final void LJIILJJIL() {
        this.LIZIZ.recycle();
    }

    public final ColorStateList LIZIZ(int i) {
        int resourceId;
        ColorStateList LIZJ;
        if (this.LIZIZ.hasValue(i) && (resourceId = this.LIZIZ.getResourceId(i, 0)) != 0 && (LIZJ = C04330Ez.LIZJ(resourceId, this.LIZ)) != null) {
            return LIZJ;
        }
        return this.LIZIZ.getColorStateList(i);
    }

    public final Drawable LJ(int i) {
        int resourceId;
        if (this.LIZIZ.hasValue(i) && (resourceId = this.LIZIZ.getResourceId(i, 0)) != 0) {
            return C20110qd.LIZ(this.LIZ, resourceId);
        }
        return this.LIZIZ.getDrawable(i);
    }

    public final Drawable LJFF(int i) {
        int resourceId;
        Drawable LJII;
        if (this.LIZIZ.hasValue(i) && (resourceId = this.LIZIZ.getResourceId(i, 0)) != 0) {
            C03R LIZ = C03R.LIZ();
            Context context = this.LIZ;
            synchronized (LIZ) {
                LJII = LIZ.LIZ.LJII(context, resourceId, true);
            }
            return LJII;
        }
        return null;
    }

    public final String LJIIIZ(int i) {
        return C16880lQ.LLLZLZ(this.LIZIZ, i);
    }

    public final CharSequence LJIIJ(int i) {
        return C16880lQ.LLLZZ(this.LIZIZ, i);
    }

    public final boolean LJIIJJI(int i) {
        return this.LIZIZ.hasValue(i);
    }

    public AnonymousClass033(Context context, TypedArray typedArray) {
        this.LIZ = context;
        this.LIZIZ = typedArray;
    }

    public final boolean LIZ(int i, boolean z) {
        return this.LIZIZ.getBoolean(i, z);
    }

    public final int LIZJ(int i, int i2) {
        return this.LIZIZ.getDimensionPixelOffset(i, i2);
    }

    public final int LIZLLL(int i, int i2) {
        return this.LIZIZ.getDimensionPixelSize(i, i2);
    }

    public final int LJII(int i, int i2) {
        return this.LIZIZ.getInt(i, i2);
    }

    public final int LJIIIIZZ(int i, int i2) {
        return this.LIZIZ.getResourceId(i, i2);
    }

    public static AnonymousClass033 LJIIL(Context context, AttributeSet attributeSet, int[] iArr) {
        return new AnonymousClass033(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final Typeface LJI(int i, int i2, C19A c19a) {
        int resourceId = this.LIZIZ.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new TypedValue();
        }
        Context context = this.LIZ;
        TypedValue typedValue = this.LIZJ;
        if (context.isRestricted()) {
            return null;
        }
        return C06690Ob.LIZJ(context, resourceId, typedValue, i2, c19a, true);
    }

    public static AnonymousClass033 LJIILIIL(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new AnonymousClass033(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
