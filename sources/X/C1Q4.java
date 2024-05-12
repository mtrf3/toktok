package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.StateSet;

/* renamed from: X.1Q4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q4 extends C04530Ft implements InterfaceC04540Fu {
    public boolean LJLILLLLZI;
    public Drawable LJLJI;
    public ColorStateList LJLJJI;
    public int LJLJJL;
    public ColorFilter LJLJJLL;
    public PorterDuff.Mode LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public RectF LJLLILLLL;
    public Paint LJLLJ;
    public Bitmap LJLLL;
    public final C28H LJLLLL;
    public final C532227a<C1Q4> LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public boolean LJZI;
    public Paint LJZL;
    public boolean LL;

    @Override // X.InterfaceC04540Fu
    public final void LIZ() {
    }

    public final void LJ() {
        if (this.LJLJLJ != 0) {
            if (this.LJLLILLLL == null) {
                this.LJLLILLLL = new RectF();
            }
            this.LJLLILLLL.set(getBounds());
            RectF rectF = this.LJLLILLLL;
            float f = rectF.left;
            float f2 = this.LJLJLLL;
            rectF.left = f + f2;
            float f3 = rectF.top;
            float f4 = this.LJLL;
            rectF.top = f3 + f4;
            rectF.right += f2;
            rectF.bottom += f4;
            return;
        }
        this.LJLLILLLL = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.LJLJJI;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        C28I c28i = this.LJLLLL.LJLILLLLZI;
        if (c28i.LJLIL != 1.0f || c28i.LJLILLLLZI != 1.0f) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * this.LJLZ);
        int height = (int) (bounds.height() * this.LJZ);
        int width2 = (bounds.width() - width) / 2;
        int height2 = (bounds.height() - height) / 2;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setBounds(width2, height2, width + width2, height + height2);
        }
        this.LJLLL = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.LJLILLLLZI;
    }

    public C1Q4(Drawable drawable) {
        super(drawable);
        this.LJLJL = PorterDuff.Mode.SRC_IN;
        this.LJLZ = 1.0f;
        this.LJZ = 1.0f;
        this.LJLLLL = new C28H(this);
        this.LJLLLLLL = new C532227a<>(this);
    }

    public final void LIZIZ(Canvas canvas) {
        if (this.LJLJI != null) {
            C532327b c532327b = this.LJLLLLLL.LJLIL;
            if (c532327b.LJZL) {
                C0EL.LIZ(canvas, c532327b.LLD.width(), c532327b.LLD.height(), null);
            }
            this.LJLLLLLL.LJLIL.getClass();
            this.LJLJI.draw(canvas);
            this.LJLLLLLL.LJLIL.LLLLZLLIL(canvas);
            C532327b c532327b2 = this.LJLLLLLL.LJLIL;
            if (c532327b2.LJZL) {
                canvas.drawPath(c532327b2.LJLJL, c532327b2.LJLJLLL);
                canvas.restore();
            }
        }
    }

    public final void LIZJ(Drawable drawable) {
        Drawable drawable2 = this.LJLJI;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.LJLJI = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable3 = this.LJLJI;
        if (drawable3 != null) {
            drawable3.setBounds(getBounds());
        }
        invalidateSelf();
    }

    public final void LIZLLL(float f) {
        if (this.LJLZ != f) {
            this.LJLZ = f;
            LJI();
            invalidateSelf();
        }
    }

    public final boolean LJFF(int[] iArr) {
        ColorStateList colorStateList = this.LJLJJI;
        if (colorStateList != null && this.LJLJL != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState == this.LJLJJL) {
                return false;
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(colorForState, this.LJLJL);
            this.LJLJJLL = porterDuffColorFilter;
            setColorFilter(porterDuffColorFilter);
            this.LJLJJL = colorForState;
            return true;
        }
        clearColorFilter();
        this.LJLJJL = 0;
        this.LJLJJLL = null;
        return true;
    }

    @Override // X.C04530Ft, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        if (this.LL) {
            ColorFilter colorFilter = getColorFilter();
            ColorFilter colorFilter2 = this.LJLJJLL;
            if (colorFilter != colorFilter2) {
                setColorFilter(colorFilter2);
            }
        }
        if (this.LJLILLLLZI && C07840Sm.LIZIZ(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJZI) {
            if (this.LJZL == null) {
                Paint paint = new Paint();
                this.LJZL = paint;
                paint.setColor(-16777216);
                this.LJZL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            Rect bounds = getBounds();
            int saveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, null);
            if (z) {
                canvas.save();
                canvas.translate(getBounds().width(), 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            LIZIZ(canvas);
            Rect bounds2 = this.LJLIL.getBounds();
            canvas.saveLayer(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom, this.LJZL);
            super.draw(canvas);
            if (z) {
                canvas.restore();
            }
            canvas.restoreToCount(saveLayer);
            return;
        }
        if (z) {
            canvas.save();
            canvas.translate(getBounds().width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        LIZIZ(canvas);
        if (this.LJLJLJ != 0 && this.LJLLI > 0.0f) {
            C259810g c259810g = C259710f.LIZ;
            if (c259810g.LIZIZ != null) {
                Bitmap bitmap = this.LJLLL;
                if (bitmap == null || bitmap.getWidth() != getBounds().width() || this.LJLLL.getHeight() != getBounds().height()) {
                    this.LJLLL = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ALPHA_8);
                    super.draw(new Canvas(this.LJLLL));
                    Bitmap copy = this.LJLLL.copy(Bitmap.Config.ALPHA_8, true);
                    Context context = c259810g.LIZIZ;
                    Bitmap bitmap2 = this.LJLLL;
                    float f = this.LJLLI;
                    try {
                        RenderScript create = RenderScript.create(context);
                        try {
                            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8(create));
                            Allocation createFromBitmap = Allocation.createFromBitmap(create, copy);
                            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, bitmap2);
                            create2.setRadius(C78609UtB.LJJIIJZLJL(f, 0.0f, 25.0f));
                            create2.setInput(createFromBitmap);
                            create2.forEach(createFromBitmap2);
                            createFromBitmap2.copyTo(bitmap2);
                            if (create != null) {
                                create.destroy();
                            }
                        } catch (Throwable th) {
                            if (create != null) {
                                create.destroy();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                canvas.drawBitmap(this.LJLLL, (Rect) null, this.LJLLILLLL, this.LJLLJ);
            }
        }
        boolean LLLLZIL = this.LJLLLL.LJLILLLLZI.LLLLZIL(canvas);
        super.draw(canvas);
        this.LJLLLL.LJLILLLLZI.getClass();
        if (LLLLZIL) {
            canvas.restore();
        }
        if (!z) {
            return;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C532227a<C1Q4> c532227a = this.LJLLLLLL;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C532327b c532327b = c532227a.LJLIL;
        c532327b.LLD.set(i, i2, i3, i4);
        c532327b.LLLLZLLLI();
        C35661ac c35661ac = c532327b.LLF;
        if (c35661ac != null) {
            Rect rect2 = c35661ac.LJLJJL;
            if (rect2.left != i || rect2.top != i2 || rect2.right != i3 || rect2.bottom != i4) {
                rect2.set(i, i2, i3, i4);
                c35661ac.LIZ();
                InterfaceC24200xE interfaceC24200xE = c35661ac.LJLJJLL;
                if (interfaceC24200xE != null) {
                    interfaceC24200xE.invalidate();
                }
            }
        }
        c532327b.LL.invalidate();
        LJ();
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        LJI();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.LJLILLLLZI != z) {
            this.LJLILLLLZI = z;
            invalidateSelf();
        }
    }

    @Override // X.C04530Ft, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        boolean z;
        boolean state = super.setState(iArr);
        Drawable drawable = this.LJLJI;
        boolean z2 = true;
        if (drawable != null && drawable.setState(iArr)) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = state | z;
        C28H c28h = this.LJLLLL;
        c28h.getClass();
        boolean z4 = !StateSet.stateSetMatches(C28H.LJLJJL, iArr);
        boolean stateSetMatches = StateSet.stateSetMatches(C28H.LJLJJLL, iArr);
        if (z4 != c28h.LJLJI || stateSetMatches != c28h.LJLJJI) {
            c28h.LJLJI = z4;
            c28h.LJLJJI = stateSetMatches;
        } else {
            z2 = false;
        }
        return LJFF(iArr) | z3 | z2;
    }

    @Override // X.C04530Ft, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.LJLJJI = colorStateList;
        if (LJFF(getState())) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.LJLJL = mode;
        if (LJFF(getState())) {
            invalidateSelf();
        }
    }
}
