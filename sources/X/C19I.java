package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.19I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19I implements InterfaceC012703f {
    public final int[] LIZ = {R.drawable.nj, R.drawable.nh, R.drawable.lh};
    public final int[] LIZIZ = {R.drawable.m5, R.drawable.n3, R.drawable.mb, R.drawable.m7, R.drawable.m8, R.drawable.ma, R.drawable.m_};
    public final int[] LIZJ = {R.drawable.ng, R.drawable.ni, R.drawable.ly, R.drawable.nc, R.drawable.nd, R.drawable.ne, R.drawable.nf};
    public final int[] LIZLLL = {R.drawable.mt, R.drawable.lw, R.drawable.ms};
    public final int[] LJ = {R.drawable.na, R.drawable.nk};
    public final int[] LJFF = {R.drawable.lk, R.drawable.lq, R.drawable.ll, R.drawable.lr};

    public static boolean LIZ(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList LIZIZ(int i, Context context) {
        int LIZIZ = C014003s.LIZIZ(R.attr.a4i, context);
        return new ColorStateList(new int[][]{C014003s.LIZIZ, C014003s.LIZLLL, C014003s.LIZJ, C014003s.LJFF}, new int[]{C014003s.LIZ(R.attr.a4g, context), C07290Qj.LJIIIZ(LIZIZ, i), C07290Qj.LJIIIZ(LIZIZ, i), i});
    }

    public final ColorStateList LIZLLL(int i, Context context) {
        if (i == R.drawable.m1) {
            return C04330Ez.LIZJ(R.color.dk, context);
        }
        if (i == R.drawable.n_) {
            return C04330Ez.LIZJ(R.color.dn, context);
        }
        if (i == R.drawable.n9) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList LIZJ = C014003s.LIZJ(R.attr.a4z, context);
            if (LIZJ != null && LIZJ.isStateful()) {
                int[] iArr3 = C014003s.LIZIZ;
                iArr[0] = iArr3;
                iArr2[0] = LIZJ.getColorForState(iArr3, 0);
                iArr[1] = C014003s.LJ;
                iArr2[1] = C014003s.LIZIZ(R.attr.a4h, context);
                iArr[2] = C014003s.LJFF;
                iArr2[2] = LIZJ.getDefaultColor();
            } else {
                iArr[0] = C014003s.LIZIZ;
                iArr2[0] = C014003s.LIZ(R.attr.a4z, context);
                iArr[1] = C014003s.LJ;
                iArr2[1] = C014003s.LIZIZ(R.attr.a4h, context);
                iArr[2] = C014003s.LJFF;
                iArr2[2] = C014003s.LIZIZ(R.attr.a4z, context);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.lp) {
            return LIZIZ(C014003s.LIZIZ(R.attr.a4g, context), context);
        }
        if (i == R.drawable.lj) {
            return LIZIZ(0, context);
        }
        if (i == R.drawable.lo) {
            return LIZIZ(C014003s.LIZIZ(R.attr.a4e, context), context);
        }
        if (i == R.drawable.n5 || i == R.drawable.n6) {
            return C04330Ez.LIZJ(R.color.dm, context);
        }
        if (LIZ(i, this.LIZIZ)) {
            return C014003s.LIZJ(R.attr.a4j, context);
        }
        if (LIZ(i, this.LJ)) {
            return C04330Ez.LIZJ(R.color.dj, context);
        }
        if (LIZ(i, this.LJFF)) {
            return C04330Ez.LIZJ(R.color.di, context);
        }
        if (i == R.drawable.n2) {
            return C04330Ez.LIZJ(R.color.dl, context);
        }
        return null;
    }

    public static LayerDrawable LIZJ(C012803g c012803g, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable LJI = c012803g.LJI(context, R.drawable.n7);
        Drawable LJI2 = c012803g.LJI(context, R.drawable.n8);
        if ((LJI instanceof BitmapDrawable) && LJI.getIntrinsicWidth() == dimensionPixelSize && LJI.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) LJI;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            LJI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            LJI.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if (!(LJI2 instanceof BitmapDrawable) || LJI2.getIntrinsicWidth() != dimensionPixelSize || LJI2.getIntrinsicHeight() != dimensionPixelSize) {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            LJI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            LJI2.draw(canvas2);
            LJI2 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, LJI2, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void LJ(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C03D.LIZ(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C03R.LIZIZ;
        }
        drawable.setColorFilter(C03R.LIZJ(i, mode));
    }
}
