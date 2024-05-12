package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: X.0sZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC21310sZ extends Drawable.ConstantState {
    public final C21320sa LIZ;
    public Resources LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public SparseArray<Drawable.ConstantState> LJFF;
    public Drawable[] LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public Rect LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public ColorFilter LJJIII;
    public boolean LJJIIJ;
    public ColorStateList LJJIIJZLJL;
    public PorterDuff.Mode LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;

    public final void LIZIZ() {
        this.LJIIL = true;
        LIZJ();
        int i = this.LJII;
        Drawable[] drawableArr = this.LJI;
        this.LJIILJJIL = -1;
        this.LJIILIIL = -1;
        this.LJIILLIIL = 0;
        this.LJIILL = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.LJIILIIL) {
                this.LJIILIIL = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.LJIILJJIL) {
                this.LJIILJJIL = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.LJIILL) {
                this.LJIILL = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.LJIILLIIL) {
                this.LJIILLIIL = minimumHeight;
            }
        }
    }

    public abstract void LJ();

    public final void LIZJ() {
        SparseArray<Drawable.ConstantState> sparseArray = this.LJFF;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.LJFF.keyAt(i);
                Drawable.ConstantState valueAt = this.LJFF.valueAt(i);
                Drawable[] drawableArr = this.LJI;
                Drawable newDrawable = valueAt.newDrawable(this.LIZIZ);
                if (Build.VERSION.SDK_INT >= 23) {
                    C07840Sm.LIZJ(newDrawable, this.LJJ);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.LIZ);
                drawableArr[keyAt] = mutate;
            }
            this.LJFF = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.LJII;
        Drawable[] drawableArr = this.LJI;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (C07820Sk.LIZIZ(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = this.LJFF.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.LIZLLL | this.LJ;
    }

    public final int LIZ(Drawable drawable) {
        int i = this.LJII;
        if (i >= this.LJI.length) {
            int i2 = i + 10;
            C1ZA c1za = (C1ZA) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = c1za.LJI;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            c1za.LJI = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(c1za.LJJIJIIJI, 0, iArr, 0, i);
            c1za.LJJIJIIJI = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.LIZ);
        this.LJI[i] = drawable;
        this.LJII++;
        this.LJ = drawable.getChangingConfigurations() | this.LJ;
        this.LJIIZILJ = false;
        this.LJIJI = false;
        this.LJIIJ = null;
        this.LJIIIZ = false;
        this.LJIIL = false;
        this.LJIJJ = false;
        return i;
    }

    public final Drawable LIZLLL(int i) {
        int indexOfKey;
        Drawable drawable = this.LJI[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray<Drawable.ConstantState> sparseArray = this.LJFF;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = this.LJFF.valueAt(indexOfKey).newDrawable(this.LIZIZ);
        if (Build.VERSION.SDK_INT >= 23) {
            C07840Sm.LIZJ(newDrawable, this.LJJ);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.LIZ);
        this.LJI[i] = mutate;
        this.LJFF.removeAt(indexOfKey);
        if (this.LJFF.size() == 0) {
            this.LJFF = null;
        }
        return mutate;
    }

    public AbstractC21310sZ(AbstractC21310sZ abstractC21310sZ, C21320sa c21320sa, Resources resources) {
        Resources resources2;
        int i;
        this.LJIL = true;
        this.LIZ = c21320sa;
        if (resources != null) {
            resources2 = resources;
        } else if (abstractC21310sZ != null) {
            resources2 = abstractC21310sZ.LIZIZ;
        } else {
            resources2 = null;
        }
        this.LIZIZ = resources2;
        if (abstractC21310sZ != null) {
            i = abstractC21310sZ.LIZJ;
        } else {
            i = 0;
        }
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.LIZJ = i;
        if (abstractC21310sZ != null) {
            this.LIZLLL = abstractC21310sZ.LIZLLL;
            this.LJ = abstractC21310sZ.LJ;
            this.LJIJJ = true;
            this.LJIJJLI = true;
            this.LJIIIIZZ = abstractC21310sZ.LJIIIIZZ;
            this.LJIIJJI = abstractC21310sZ.LJIIJJI;
            this.LJIL = abstractC21310sZ.LJIL;
            this.LJJ = abstractC21310sZ.LJJ;
            this.LJJI = abstractC21310sZ.LJJI;
            this.LJJIFFI = abstractC21310sZ.LJJIFFI;
            this.LJJII = abstractC21310sZ.LJJII;
            this.LJJIII = abstractC21310sZ.LJJIII;
            this.LJJIIJ = abstractC21310sZ.LJJIIJ;
            this.LJJIIJZLJL = abstractC21310sZ.LJJIIJZLJL;
            this.LJJIIZ = abstractC21310sZ.LJJIIZ;
            this.LJJIIZI = abstractC21310sZ.LJJIIZI;
            this.LJJIJ = abstractC21310sZ.LJJIJ;
            if (abstractC21310sZ.LIZJ == i) {
                if (abstractC21310sZ.LJIIIZ) {
                    this.LJIIJ = abstractC21310sZ.LJIIJ != null ? new Rect(abstractC21310sZ.LJIIJ) : null;
                    this.LJIIIZ = true;
                }
                if (abstractC21310sZ.LJIIL) {
                    this.LJIILIIL = abstractC21310sZ.LJIILIIL;
                    this.LJIILJJIL = abstractC21310sZ.LJIILJJIL;
                    this.LJIILL = abstractC21310sZ.LJIILL;
                    this.LJIILLIIL = abstractC21310sZ.LJIILLIIL;
                    this.LJIIL = true;
                }
            }
            if (abstractC21310sZ.LJIIZILJ) {
                this.LJIJ = abstractC21310sZ.LJIJ;
                this.LJIIZILJ = true;
            }
            if (abstractC21310sZ.LJIJI) {
                this.LJIJI = true;
            }
            Drawable[] drawableArr = abstractC21310sZ.LJI;
            this.LJI = new Drawable[drawableArr.length];
            this.LJII = abstractC21310sZ.LJII;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC21310sZ.LJFF;
            if (sparseArray != null) {
                this.LJFF = sparseArray.clone();
            } else {
                this.LJFF = new SparseArray<>(this.LJII);
            }
            int i2 = this.LJII;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.LJFF.put(i3, constantState);
                    } else {
                        this.LJI[i3] = drawableArr[i3];
                    }
                }
            }
            return;
        }
        this.LJI = new Drawable[10];
        this.LJII = 0;
    }
}
