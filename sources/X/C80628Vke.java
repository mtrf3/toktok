package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Vke, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80628Vke extends Drawable implements Drawable.Callback, InterfaceC80626Vkc, InterfaceC80604VkG {
    public InterfaceC80626Vkc LJLIL;
    public final Drawable[] LJLJI;
    public final InterfaceC79080V1w[] LJLJJI;
    public final C80629Vkf LJLILLLLZI = new C80629Vkf();
    public final Rect LJLJJL = new Rect();
    public boolean LJLJJLL = false;
    public boolean LJLJL = false;
    public boolean LJLJLJ = false;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.LJLJLJ = true;
                return this;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.LJLJI.length == 0) {
            return -2;
        }
        int i = 1;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    i2 = Drawable.resolveOpacity(i2, drawable.getOpacity());
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.LJLJL) {
            this.LJLJJLL = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.LJLJI;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.LJLJJLL;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.LJLJJLL = z2 | z;
                i++;
            }
            this.LJLJL = true;
        }
        return this.LJLJJLL;
    }

    public C80628Vke(Drawable[] drawableArr) {
        int i = 0;
        this.LJLJI = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.LJLJI;
            if (i < drawableArr2.length) {
                C80603VkF.LIZJ(drawableArr2[i], this, this);
                i++;
            } else {
                this.LJLJJI = new InterfaceC79080V1w[drawableArr2.length];
                return;
            }
        }
    }

    public final Drawable LIZ(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i >= this.LJLJI.length) {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        return this.LJLJI[i];
    }

    @Override // X.InterfaceC80626Vkc
    public final void LIZLLL(RectF rectF) {
        InterfaceC80626Vkc interfaceC80626Vkc = this.LJLIL;
        if (interfaceC80626Vkc != null) {
            interfaceC80626Vkc.LIZLLL(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // X.InterfaceC80626Vkc
    public final void LJIIIZ(Matrix matrix) {
        InterfaceC80626Vkc interfaceC80626Vkc = this.LJLIL;
        if (interfaceC80626Vkc != null) {
            interfaceC80626Vkc.LJIIIZ(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // X.InterfaceC80604VkG
    public final void LJIIJ(InterfaceC80626Vkc interfaceC80626Vkc) {
        this.LJLIL = interfaceC80626Vkc;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.LJLJJL;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.getPadding(rect2);
                    rect.left = Math.max(rect.left, rect2.left);
                    rect.top = Math.max(rect.top, rect2.top);
                    rect.right = Math.max(rect.right, rect2.right);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.setLevel(i)) {
                    z = true;
                }
                i2++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null && drawable.setState(iArr)) {
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.LJLILLLLZI.LIZ = i;
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C80629Vkf c80629Vkf = this.LJLILLLLZI;
        c80629Vkf.LIZJ = colorFilter;
        c80629Vkf.LIZIZ = true;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LJLILLLLZI.LIZLLL = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LJLILLLLZI.LJ = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final Drawable LIZIZ(Drawable drawable, int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i >= this.LJLJI.length) {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        Drawable drawable2 = this.LJLJI[i];
        if (drawable != drawable2) {
            if (drawable != null && this.LJLJLJ) {
                drawable.mutate();
            }
            C80603VkF.LIZJ(this.LJLJI[i], null, null);
            C80603VkF.LIZJ(drawable, null, null);
            C80629Vkf c80629Vkf = this.LJLILLLLZI;
            if (drawable != null && c80629Vkf != null) {
                c80629Vkf.LIZ(drawable);
            }
            C80603VkF.LIZ(drawable, this);
            C80603VkF.LIZJ(drawable, this, this);
            this.LJLJL = false;
            this.LJLJI[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LJLJI;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setVisible(z, z2);
                }
                i++;
            } else {
                return visible;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
