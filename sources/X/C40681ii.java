package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40681ii extends C1EB {
    public static final PorterDuff.Mode LJLL = PorterDuff.Mode.SRC_IN;
    public C0FQ LJLILLLLZI;
    public PorterDuffColorFilter LJLJI;
    public ColorFilter LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final float[] LJLJL;
    public final Matrix LJLJLJ;
    public final Rect LJLJLLL;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LIZIZ(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return C07810Sj.LIZ(drawable);
        }
        return this.LJLILLLLZI.LIZIZ.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.LJLILLLLZI.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return C07820Sk.LIZJ(drawable);
        }
        return this.LJLJJI;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.LJLIL != null && Build.VERSION.SDK_INT >= 24) {
            return new C0FR(this.LJLIL.getConstantState());
        }
        this.LJLILLLLZI.LIZ = getChangingConfigurations();
        return this.LJLILLLLZI;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.LJLILLLLZI.LIZIZ.LJIIIIZZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.LJLILLLLZI.LIZIZ.LJII;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return C07810Sj.LIZLLL(drawable);
        }
        return this.LJLILLLLZI.LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0FQ c0fq = this.LJLILLLLZI;
            if (c0fq != null) {
                C0FP c0fp = c0fq.LIZIZ;
                if (c0fp.LJIILIIL == null) {
                    c0fp.LJIILIIL = Boolean.valueOf(c0fp.LJI.LIZ());
                }
                if (c0fp.LJIILIIL.booleanValue() || ((colorStateList = this.LJLILLLLZI.LIZJ) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.LJLJJL && super.mutate() == this) {
            this.LJLILLLLZI = new C0FQ(this.LJLILLLLZI);
            this.LJLJJL = true;
        }
        return this;
    }

    public C40681ii() {
        this.LJLJJLL = true;
        this.LJLJL = new float[9];
        this.LJLJLJ = new Matrix();
        this.LJLJLLL = new Rect();
        this.LJLILLLLZI = new C0FQ();
    }

    public C40681ii(C0FQ c0fq) {
        this.LJLJJLL = true;
        this.LJLJL = new float[9];
        this.LJLJLJ = new Matrix();
        this.LJLJLLL = new Rect();
        this.LJLILLLLZI = c0fq;
        this.LJLJI = LIZIZ(c0fq.LIZJ, c0fq.LIZLLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.LJLJLLL);
        if (this.LJLJLLL.width() <= 0 || this.LJLJLLL.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.LJLJJI;
        if (colorFilter == null) {
            colorFilter = this.LJLJI;
        }
        canvas.getMatrix(this.LJLJLJ);
        this.LJLJLJ.getValues(this.LJLJL);
        boolean z = false;
        float abs = Math.abs(this.LJLJL[0]);
        float abs2 = Math.abs(this.LJLJL[4]);
        float abs3 = Math.abs(this.LJLJL[1]);
        float abs4 = Math.abs(this.LJLJL[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.LJLJLLL.width() * abs));
        int min2 = Math.min(2048, (int) (this.LJLJLLL.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.LJLJLLL;
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C07840Sm.LIZIZ(this) == 1) {
            canvas.translate(this.LJLJLLL.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.LJLJLLL.offsetTo(0, 0);
        C0FQ c0fq = this.LJLILLLLZI;
        Bitmap bitmap = c0fq.LJFF;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0fq.LJFF.getHeight()) {
            c0fq.LJFF = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0fq.LJIIJ = true;
        }
        if (!this.LJLJJLL) {
            C0FQ c0fq2 = this.LJLILLLLZI;
            c0fq2.LJFF.eraseColor(0);
            Canvas canvas2 = new Canvas(c0fq2.LJFF);
            C0FP c0fp = c0fq2.LIZIZ;
            c0fp.LIZ(c0fp.LJI, C0FP.LJIILL, canvas2, min, min2);
        } else {
            C0FQ c0fq3 = this.LJLILLLLZI;
            if (c0fq3.LJIIJ || c0fq3.LJI != c0fq3.LIZJ || c0fq3.LJII != c0fq3.LIZLLL || c0fq3.LJIIIZ != c0fq3.LJ || c0fq3.LJIIIIZZ != c0fq3.LIZIZ.getRootAlpha()) {
                C0FQ c0fq4 = this.LJLILLLLZI;
                c0fq4.LJFF.eraseColor(0);
                Canvas canvas3 = new Canvas(c0fq4.LJFF);
                C0FP c0fp2 = c0fq4.LIZIZ;
                c0fp2.LIZ(c0fp2.LJI, C0FP.LJIILL, canvas3, min, min2);
                C0FQ c0fq5 = this.LJLILLLLZI;
                c0fq5.LJI = c0fq5.LIZJ;
                c0fq5.LJII = c0fq5.LIZLLL;
                c0fq5.LJIIIIZZ = c0fq5.LIZIZ.getRootAlpha();
                c0fq5.LJIIIZ = c0fq5.LJ;
                c0fq5.LJIIJ = false;
            }
        }
        C0FQ c0fq6 = this.LJLILLLLZI;
        Rect rect2 = this.LJLJLLL;
        if (c0fq6.LIZIZ.getRootAlpha() < 255) {
            z = true;
        }
        if (!z && colorFilter == null) {
            paint = null;
        } else {
            if (c0fq6.LJIIJJI == null) {
                Paint paint2 = new Paint();
                c0fq6.LJIIJJI = paint2;
                paint2.setFilterBitmap(true);
            }
            c0fq6.LJIIJJI.setAlpha(c0fq6.LIZIZ.getRootAlpha());
            c0fq6.LJIIJJI.setColorFilter(colorFilter);
            paint = c0fq6.LJIIJJI;
        }
        canvas.drawBitmap(c0fq6.LJFF, (Rect) null, rect2, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0FQ c0fq = this.LJLILLLLZI;
        ColorStateList colorStateList = c0fq.LIZJ;
        if (colorStateList != null && (mode = c0fq.LIZLLL) != null) {
            this.LJLJI = LIZIZ(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        C0FP c0fp = c0fq.LIZIZ;
        if (c0fp.LJIILIIL == null) {
            c0fp.LJIILIIL = Boolean.valueOf(c0fp.LJI.LIZ());
        }
        if (c0fp.LJIILIIL.booleanValue()) {
            boolean LIZIZ = c0fq.LIZIZ.LJI.LIZIZ(iArr);
            c0fq.LJIIJ |= LIZIZ;
            if (LIZIZ) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.LJLILLLLZI.LIZIZ.getRootAlpha() != i) {
            this.LJLILLLLZI.LIZIZ.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07810Sj.LJ(drawable, z);
        } else {
            this.LJLILLLLZI.LJ = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.LJLJJI = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJI(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJII(drawable, colorStateList);
            return;
        }
        C0FQ c0fq = this.LJLILLLLZI;
        if (c0fq.LIZJ != colorStateList) {
            c0fq.LIZJ = colorStateList;
            this.LJLJI = LIZIZ(colorStateList, c0fq.LIZLLL);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJIIIIZZ(drawable, mode);
            return;
        }
        C0FQ c0fq = this.LJLILLLLZI;
        if (c0fq.LIZLLL != mode) {
            c0fq.LIZLLL = mode;
            this.LJLJI = LIZIZ(c0fq.LIZJ, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final PorterDuffColorFilter LIZIZ(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public static C40681ii LIZ(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C40681ii c40681ii = new C40681ii();
            c40681ii.LJLIL = C0OW.LIZ(resources, i, theme);
            new C0FR(c40681ii.LJLIL.getConstantState());
            return c40681ii;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    C40681ii c40681ii2 = new C40681ii();
                    c40681ii2.inflate(resources, xml, asAttributeSet, theme);
                    return c40681ii2;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LIZLLL(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0FQ c0fq = this.LJLILLLLZI;
        c0fq.LIZIZ = new C0FP();
        TypedArray LJI = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LIZ);
        C0FQ c0fq2 = this.LJLILLLLZI;
        C0FP c0fp = c0fq2.LIZIZ;
        int LIZLLL = C06720Oe.LIZLLL(LJI, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (LIZLLL != 3) {
            if (LIZLLL != 5) {
                if (LIZLLL != 9) {
                    switch (LIZLLL) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        c0fq2.LIZLLL = mode;
        ColorStateList LIZ = C06720Oe.LIZ(LJI, xmlPullParser, theme);
        if (LIZ != null) {
            c0fq2.LIZJ = LIZ;
        }
        boolean z = c0fq2.LJ;
        if (C06720Oe.LJFF(xmlPullParser, "autoMirrored")) {
            z = LJI.getBoolean(5, z);
        }
        c0fq2.LJ = z;
        c0fp.LJIIIZ = C06720Oe.LIZJ(LJI, xmlPullParser, "viewportWidth", 7, c0fp.LJIIIZ);
        float LIZJ = C06720Oe.LIZJ(LJI, xmlPullParser, "viewportHeight", 8, c0fp.LJIIJ);
        c0fp.LJIIJ = LIZJ;
        if (c0fp.LJIIIZ > 0.0f) {
            if (LIZJ > 0.0f) {
                c0fp.LJII = LJI.getDimension(3, c0fp.LJII);
                int i = 2;
                float dimension = LJI.getDimension(2, c0fp.LJIIIIZZ);
                c0fp.LJIIIIZZ = dimension;
                if (c0fp.LJII > 0.0f) {
                    if (dimension > 0.0f) {
                        c0fp.setAlpha(C06720Oe.LIZJ(LJI, xmlPullParser, "alpha", 4, c0fp.getAlpha()));
                        String LLLZLZ = C16880lQ.LLLZLZ(LJI, 0);
                        if (LLLZLZ != null) {
                            c0fp.LJIIL = LLLZLZ;
                            c0fp.LJIILJJIL.put(LLLZLZ, c0fp);
                        }
                        LJI.recycle();
                        c0fq.LIZ = getChangingConfigurations();
                        int i2 = 1;
                        c0fq.LJIIJ = true;
                        C0FQ c0fq3 = this.LJLILLLLZI;
                        C0FP c0fp2 = c0fq3.LIZIZ;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        arrayDeque.push(c0fp2.LJI);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
                            if (eventType == i) {
                                String name = xmlPullParser.getName();
                                C1EC c1ec = (C1EC) arrayDeque.peek();
                                if ("path".equals(name)) {
                                    C40671ih c40671ih = new C40671ih();
                                    TypedArray LJI2 = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LIZJ);
                                    if (C06720Oe.LJFF(xmlPullParser, "pathData")) {
                                        String LLLZLZ2 = C16880lQ.LLLZLZ(LJI2, 0);
                                        if (LLLZLZ2 != null) {
                                            c40671ih.LIZIZ = LLLZLZ2;
                                        }
                                        String LLLZLZ3 = C16880lQ.LLLZLZ(LJI2, 2);
                                        if (LLLZLZ3 != null) {
                                            c40671ih.LIZ = C07360Qq.LIZJ(LLLZLZ3);
                                        }
                                        c40671ih.LJI = C06720Oe.LIZIZ(LJI2, xmlPullParser, theme, "fillColor", 1);
                                        c40671ih.LJIIIIZZ = C06720Oe.LIZJ(LJI2, xmlPullParser, "fillAlpha", 12, c40671ih.LJIIIIZZ);
                                        int LIZLLL2 = C06720Oe.LIZLLL(LJI2, xmlPullParser, "strokeLineCap", 8, -1);
                                        Paint.Cap cap = c40671ih.LJIIL;
                                        if (LIZLLL2 != 0) {
                                            if (LIZLLL2 != 1) {
                                                if (LIZLLL2 == 2) {
                                                    cap = Paint.Cap.SQUARE;
                                                }
                                            } else {
                                                cap = Paint.Cap.ROUND;
                                            }
                                        } else {
                                            cap = Paint.Cap.BUTT;
                                        }
                                        c40671ih.LJIIL = cap;
                                        int LIZLLL3 = C06720Oe.LIZLLL(LJI2, xmlPullParser, "strokeLineJoin", 9, -1);
                                        Paint.Join join = c40671ih.LJIILIIL;
                                        if (LIZLLL3 != 0) {
                                            if (LIZLLL3 != 1) {
                                                if (LIZLLL3 == 2) {
                                                    join = Paint.Join.BEVEL;
                                                }
                                            } else {
                                                join = Paint.Join.ROUND;
                                            }
                                        } else {
                                            join = Paint.Join.MITER;
                                        }
                                        c40671ih.LJIILIIL = join;
                                        c40671ih.LJIILJJIL = C06720Oe.LIZJ(LJI2, xmlPullParser, "strokeMiterLimit", 10, c40671ih.LJIILJJIL);
                                        c40671ih.LJ = C06720Oe.LIZIZ(LJI2, xmlPullParser, theme, "strokeColor", 3);
                                        c40671ih.LJII = C06720Oe.LIZJ(LJI2, xmlPullParser, "strokeAlpha", 11, c40671ih.LJII);
                                        c40671ih.LJFF = C06720Oe.LIZJ(LJI2, xmlPullParser, "strokeWidth", 4, c40671ih.LJFF);
                                        c40671ih.LJIIJ = C06720Oe.LIZJ(LJI2, xmlPullParser, "trimPathEnd", 6, c40671ih.LJIIJ);
                                        c40671ih.LJIIJJI = C06720Oe.LIZJ(LJI2, xmlPullParser, "trimPathOffset", 7, c40671ih.LJIIJJI);
                                        c40671ih.LJIIIZ = C06720Oe.LIZJ(LJI2, xmlPullParser, "trimPathStart", 5, c40671ih.LJIIIZ);
                                        c40671ih.LIZJ = C06720Oe.LIZLLL(LJI2, xmlPullParser, "fillType", 13, c40671ih.LIZJ);
                                    }
                                    LJI2.recycle();
                                    c1ec.LIZIZ.add(c40671ih);
                                    if (c40671ih.getPathName() != null) {
                                        c0fp2.LJIILJJIL.put(c40671ih.getPathName(), c40671ih);
                                    }
                                    c0fq3.LIZ = c40671ih.LIZLLL | c0fq3.LIZ;
                                    z2 = false;
                                } else if ("clip-path".equals(name)) {
                                    C40661ig c40661ig = new C40661ig();
                                    if (C06720Oe.LJFF(xmlPullParser, "pathData")) {
                                        TypedArray LJI3 = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LIZLLL);
                                        String LLLZLZ4 = C16880lQ.LLLZLZ(LJI3, 0);
                                        if (LLLZLZ4 != null) {
                                            c40661ig.LIZIZ = LLLZLZ4;
                                        }
                                        String LLLZLZ5 = C16880lQ.LLLZLZ(LJI3, 1);
                                        if (LLLZLZ5 != null) {
                                            c40661ig.LIZ = C07360Qq.LIZJ(LLLZLZ5);
                                        }
                                        c40661ig.LIZJ = C06720Oe.LIZLLL(LJI3, xmlPullParser, "fillType", 2, 0);
                                        LJI3.recycle();
                                    }
                                    c1ec.LIZIZ.add(c40661ig);
                                    if (c40661ig.getPathName() != null) {
                                        c0fp2.LJIILJJIL.put(c40661ig.getPathName(), c40661ig);
                                    }
                                    c0fq3.LIZ |= c40661ig.LIZLLL;
                                } else if ("group".equals(name)) {
                                    C1EC c1ec2 = new C1EC();
                                    TypedArray LJI4 = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LIZIZ);
                                    c1ec2.LIZJ = C06720Oe.LIZJ(LJI4, xmlPullParser, "rotation", 5, c1ec2.LIZJ);
                                    c1ec2.LIZLLL = LJI4.getFloat(1, c1ec2.LIZLLL);
                                    c1ec2.LJ = LJI4.getFloat(2, c1ec2.LJ);
                                    c1ec2.LJFF = C06720Oe.LIZJ(LJI4, xmlPullParser, "scaleX", 3, c1ec2.LJFF);
                                    c1ec2.LJI = C06720Oe.LIZJ(LJI4, xmlPullParser, "scaleY", 4, c1ec2.LJI);
                                    c1ec2.LJII = C06720Oe.LIZJ(LJI4, xmlPullParser, "translateX", 6, c1ec2.LJII);
                                    c1ec2.LJIIIIZZ = C06720Oe.LIZJ(LJI4, xmlPullParser, "translateY", 7, c1ec2.LJIIIIZZ);
                                    String LLLZLZ6 = C16880lQ.LLLZLZ(LJI4, 0);
                                    if (LLLZLZ6 != null) {
                                        c1ec2.LJIIJJI = LLLZLZ6;
                                    }
                                    c1ec2.LIZJ();
                                    LJI4.recycle();
                                    c1ec.LIZIZ.add(c1ec2);
                                    arrayDeque.push(c1ec2);
                                    if (c1ec2.getGroupName() != null) {
                                        c0fp2.LJIILJJIL.put(c1ec2.getGroupName(), c1ec2);
                                    }
                                    c0fq3.LIZ = c1ec2.LJIIJ | c0fq3.LIZ;
                                }
                            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                            eventType = xmlPullParser.next();
                            i2 = 1;
                            i = 2;
                        }
                        if (!z2) {
                            this.LJLJI = LIZIZ(c0fq.LIZJ, c0fq.LIZLLL);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJI.getPositionDescription());
                    LIZ2.append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(X1D.LIZIZ(LIZ2));
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LJI.getPositionDescription());
                LIZ3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(X1D.LIZIZ(LIZ3));
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LJI.getPositionDescription());
            LIZ4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(X1D.LIZIZ(LIZ4));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LJI.getPositionDescription());
        LIZ5.append("<vector> tag requires viewportWidth > 0");
        throw new XmlPullParserException(X1D.LIZIZ(LIZ5));
    }
}
