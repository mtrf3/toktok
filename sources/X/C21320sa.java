package X;

import Y.IDRunnableS85S0100000;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.0sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21320sa extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int LJLLJ = 0;
    public AbstractC21310sZ LJLIL;
    public Rect LJLILLLLZI;
    public Drawable LJLJI;
    public Drawable LJLJJI;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public IDRunnableS85S0100000 LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public C21300sY LJLLILLLL;
    public int LJLJJL = 255;
    public int LJLJL = -1;

    public AbstractC21310sZ LIZIZ() {
        throw null;
    }

    public void LJ(AbstractC21310sZ abstractC21310sZ) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.LJLIL.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIJJ) {
            if (!abstractC21310sZ.LJIJJLI) {
                return null;
            }
        } else {
            abstractC21310sZ.LIZJ();
            abstractC21310sZ.LJIJJ = true;
            int i = abstractC21310sZ.LJII;
            Drawable[] drawableArr = abstractC21310sZ.LJI;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    abstractC21310sZ.LJIJJLI = false;
                    return null;
                }
            }
            abstractC21310sZ.LJIJJLI = true;
        }
        this.LJLIL.LIZLLL = getChangingConfigurations();
        return this.LJLIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIIJJI) {
            if (!abstractC21310sZ.LJIIL) {
                abstractC21310sZ.LIZIZ();
            }
            return abstractC21310sZ.LJIILJJIL;
        }
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIIJJI) {
            if (!abstractC21310sZ.LJIIL) {
                abstractC21310sZ.LIZIZ();
            }
            return abstractC21310sZ.LJIILIIL;
        }
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIIJJI) {
            if (!abstractC21310sZ.LJIIL) {
                abstractC21310sZ.LIZIZ();
            }
            return abstractC21310sZ.LJIILLIIL;
        }
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIIJJI) {
            if (!abstractC21310sZ.LJIIL) {
                abstractC21310sZ.LIZIZ();
            }
            return abstractC21310sZ.LJIILL;
        }
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LJLJI;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIIZILJ) {
            return abstractC21310sZ.LJIJ;
        }
        abstractC21310sZ.LIZJ();
        int i2 = abstractC21310sZ.LJII;
        Drawable[] drawableArr = abstractC21310sZ.LJI;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        abstractC21310sZ.LJIJ = i;
        abstractC21310sZ.LJIIZILJ = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.LJLIL.LJJII;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.LJLJJI = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.LJLJI;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.LJLJJLL) {
                this.LJLJI.setAlpha(this.LJLJJL);
            }
        }
        if (this.LJLLI != 0) {
            this.LJLLI = 0L;
            z = true;
        }
        if (this.LJLL != 0) {
            this.LJLL = 0L;
        } else if (!z) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.LJLJLJ && super.mutate() == this) {
            AbstractC21310sZ LIZIZ = LIZIZ();
            LIZIZ.LJ();
            LJ(LIZIZ);
            this.LJLJLJ = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        return changingConfigurations | abstractC21310sZ.LJ | abstractC21310sZ.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLJJL;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.LJLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r14) {
        /*
            r13 = this;
            r8 = 1
            r13.LJLJJLL = r8
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r9 = r13.LJLJI
            r11 = 255(0xff, double:1.26E-321)
            r3 = 0
            r7 = 0
            if (r9 == 0) goto L6e
            long r5 = r13.LJLL
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L5a
            int r0 = r13.LJLJJL
            r9.setAlpha(r0)
            r13.LJLL = r3
        L21:
            r10 = 0
        L22:
            android.graphics.drawable.Drawable r9 = r13.LJLJJI
            if (r9 == 0) goto L57
            long r5 = r13.LJLLI
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L38
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L46
            r9.setVisible(r7, r7)
            r0 = 0
            r13.LJLJJI = r0
            r13.LJLLI = r3
        L38:
            r8 = r10
        L39:
            if (r14 == 0) goto L45
            if (r8 == 0) goto L45
            Y.IDRunnableS85S0100000 r0 = r13.LJLJLLL
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r0, r1)
        L45:
            return
        L46:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r3 = (int) r5
            X.0sZ r0 = r13.LJLIL
            int r0 = r0.LJJIFFI
            int r3 = r3 / r0
            int r0 = r13.LJLJJL
            int r3 = r3 * r0
            int r0 = r3 / 255
            r9.setAlpha(r0)
            goto L39
        L57:
            r13.LJLLI = r3
            goto L38
        L5a:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r10 = (int) r5
            X.0sZ r0 = r13.LJLIL
            int r0 = r0.LJJI
            int r10 = r10 / r0
            int r5 = 255 - r10
            int r0 = r13.LJLJJL
            int r5 = r5 * r0
            int r0 = r5 / 255
            r9.setAlpha(r0)
            r10 = 1
            goto L22
        L6e:
            r13.LJLL = r3
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21320sa.LIZ(boolean):void");
    }

    public final void LIZJ(Drawable drawable) {
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new C21300sY();
        }
        C21300sY c21300sY = this.LJLLILLLL;
        c21300sY.LJLIL = drawable.getCallback();
        drawable.setCallback(c21300sY);
        try {
            if (this.LJLIL.LJJI <= 0 && this.LJLJJLL) {
                drawable.setAlpha(this.LJLJJL);
            }
            AbstractC21310sZ abstractC21310sZ = this.LJLIL;
            if (abstractC21310sZ.LJJIIJ) {
                drawable.setColorFilter(abstractC21310sZ.LJJIII);
            } else {
                if (abstractC21310sZ.LJJIIZI) {
                    C07820Sk.LJII(drawable, abstractC21310sZ.LJJIIJZLJL);
                }
                AbstractC21310sZ abstractC21310sZ2 = this.LJLIL;
                if (abstractC21310sZ2.LJJIJ) {
                    C07820Sk.LJIIIIZZ(drawable, abstractC21310sZ2.LJJIIZ);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.LJLIL.LJIL);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C07840Sm.LIZJ(drawable, C07840Sm.LIZIZ(this));
            }
            C07810Sj.LJ(drawable, this.LJLIL.LJJII);
            Rect rect = this.LJLILLLLZI;
            if (rect != null) {
                C07820Sk.LJFF(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C21300sY c21300sY2 = this.LJLLILLLL;
            Drawable.Callback callback = c21300sY2.LJLIL;
            c21300sY2.LJLIL = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(int r9) {
        /*
            r8 = this;
            int r0 = r8.LJLJL
            r3 = 0
            if (r9 != r0) goto L6
            return r3
        L6:
            long r5 = android.os.SystemClock.uptimeMillis()
            X.0sZ r0 = r8.LJLIL
            int r0 = r0.LJJIFFI
            r7 = 0
            r1 = 0
            if (r0 <= 0) goto L7a
            android.graphics.drawable.Drawable r0 = r8.LJLJJI
            if (r0 == 0) goto L1a
            r0.setVisible(r3, r3)
        L1a:
            android.graphics.drawable.Drawable r0 = r8.LJLJI
            if (r0 == 0) goto L75
            r8.LJLJJI = r0
            X.0sZ r0 = r8.LJLIL
            int r0 = r0.LJJIFFI
            long r3 = (long) r0
            long r3 = r3 + r5
            r8.LJLLI = r3
        L28:
            if (r9 < 0) goto L6f
            X.0sZ r3 = r8.LJLIL
            int r0 = r3.LJII
            if (r9 >= r0) goto L6f
            android.graphics.drawable.Drawable r7 = r3.LIZLLL(r9)
            r8.LJLJI = r7
            r8.LJLJL = r9
            if (r7 == 0) goto L47
            X.0sZ r0 = r8.LJLIL
            int r0 = r0.LJJI
            if (r0 <= 0) goto L44
            long r3 = (long) r0
            long r5 = r5 + r3
            r8.LJLL = r5
        L44:
            r8.LIZJ(r7)
        L47:
            long r3 = r8.LJLL
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L54
            long r3 = r8.LJLLI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
        L54:
            Y.IDRunnableS85S0100000 r0 = r8.LJLJLLL
            if (r0 != 0) goto L6b
            Y.IDRunnableS85S0100000 r2 = new Y.IDRunnableS85S0100000
            r1 = r8
            X.1ZB r1 = (X.C1ZB) r1
            r0 = 99
            r2.<init>(r1, r0)
            r8.LJLJLLL = r2
        L64:
            r8.LIZ(r5)
        L67:
            r8.invalidateSelf()
            return r5
        L6b:
            r8.unscheduleSelf(r0)
            goto L64
        L6f:
            r8.LJLJI = r7
            r0 = -1
            r8.LJLJL = r0
            goto L47
        L75:
            r8.LJLJJI = r7
            r8.LJLLI = r1
            goto L28
        L7a:
            android.graphics.drawable.Drawable r0 = r8.LJLJI
            if (r0 == 0) goto L28
            r0.setVisible(r3, r3)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21320sa.LIZLLL(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (theme != null) {
            abstractC21310sZ.LIZJ();
            int i = abstractC21310sZ.LJII;
            Drawable[] drawableArr = abstractC21310sZ.LJI;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C07820Sk.LIZIZ(drawable)) {
                    C07820Sk.LIZ(drawableArr[i2], theme);
                    abstractC21310sZ.LJ |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                abstractC21310sZ.LIZIZ = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = abstractC21310sZ.LIZJ;
                abstractC21310sZ.LIZJ = i3;
                if (i4 != i3) {
                    abstractC21310sZ.LJIIL = false;
                    abstractC21310sZ.LJIIIZ = false;
                    return;
                }
                return;
            }
            return;
        }
        abstractC21310sZ.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.LJLJJI;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.LJLILLLLZI;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean z;
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        Rect rect2 = null;
        if (!abstractC21310sZ.LJIIIIZZ) {
            Rect rect3 = abstractC21310sZ.LJIIJ;
            if (rect3 == null) {
                if (!abstractC21310sZ.LJIIIZ) {
                    abstractC21310sZ.LIZJ();
                    Rect rect4 = new Rect();
                    int i = abstractC21310sZ.LJII;
                    Drawable[] drawableArr = abstractC21310sZ.LJI;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (drawableArr[i2].getPadding(rect4)) {
                            if (rect2 == null) {
                                rect2 = new Rect(0, 0, 0, 0);
                            }
                            int i3 = rect4.left;
                            if (i3 > rect2.left) {
                                rect2.left = i3;
                            }
                            int i4 = rect4.top;
                            if (i4 > rect2.top) {
                                rect2.top = i4;
                            }
                            int i5 = rect4.right;
                            if (i5 > rect2.right) {
                                rect2.right = i5;
                            }
                            int i6 = rect4.bottom;
                            if (i6 > rect2.bottom) {
                                rect2.bottom = i6;
                            }
                        }
                    }
                    abstractC21310sZ.LJIIIZ = true;
                    abstractC21310sZ.LJIIJ = rect2;
                }
            } else {
                rect2 = rect3;
            }
            if (rect2 != null) {
                rect.set(rect2);
                if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.LJLIL.LJJII && C07840Sm.LIZIZ(this) == 1) {
                    int i7 = rect.left;
                    rect.left = rect.right;
                    rect.right = i7;
                }
                return z;
            }
        }
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            z = drawable.getPadding(rect);
        } else {
            z = super.getPadding(rect);
        }
        if (this.LJLIL.LJJII) {
            int i72 = rect.left;
            rect.left = rect.right;
            rect.right = i72;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ != null) {
            abstractC21310sZ.LJIIZILJ = false;
            abstractC21310sZ.LJIJI = false;
        }
        if (drawable == this.LJLJI && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.LJLJI;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean z;
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        int i2 = this.LJLJL;
        int i3 = abstractC21310sZ.LJII;
        Drawable[] drawableArr = abstractC21310sZ.LJI;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = C07840Sm.LIZJ(drawable, i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        abstractC21310sZ.LJJ = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.LJLJI;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.LJLJI;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (!this.LJLJJLL || this.LJLJJL != i) {
            this.LJLJJLL = true;
            this.LJLJJL = i;
            Drawable drawable = this.LJLJI;
            if (drawable != null) {
                if (this.LJLL == 0) {
                    drawable.setAlpha(i);
                } else {
                    LIZ(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJJII != z) {
            abstractC21310sZ.LJJII = z;
            Drawable drawable = this.LJLJI;
            if (drawable != null) {
                C07810Sj.LJ(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        abstractC21310sZ.LJJIIJ = true;
        if (abstractC21310sZ.LJJIII != colorFilter) {
            abstractC21310sZ.LJJIII = colorFilter;
            Drawable drawable = this.LJLJI;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        if (abstractC21310sZ.LJIL != z) {
            abstractC21310sZ.LJIL = z;
            Drawable drawable = this.LJLJI;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        abstractC21310sZ.LJJIIZI = true;
        if (abstractC21310sZ.LJJIIJZLJL != colorStateList) {
            abstractC21310sZ.LJJIIJZLJL = colorStateList;
            C07820Sk.LJII(this.LJLJI, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC21310sZ abstractC21310sZ = this.LJLIL;
        abstractC21310sZ.LJJIJ = true;
        if (abstractC21310sZ.LJJIIZ != mode) {
            abstractC21310sZ.LJJIIZ = mode;
            C07820Sk.LJIIIIZZ(this.LJLJI, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            C07820Sk.LJ(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.LJLJI;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.LJLJI && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.LJLJI && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.LJLILLLLZI;
        if (rect == null) {
            this.LJLILLLLZI = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            C07820Sk.LJFF(drawable, i, i2, i3, i4);
        }
    }
}
