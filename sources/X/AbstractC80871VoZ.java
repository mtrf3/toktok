package X;

import X.AbstractC80600VkC;
import Y.ARunnableS50S0100000_14;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.VoZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80871VoZ<S extends AbstractC80600VkC> extends ProgressBar {
    public final S LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public C80880Voi LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public final ARunnableS50S0100000_14 LJLJLLL;
    public final ARunnableS50S0100000_14 LJLL;
    public final C80878Vog LJLLI;
    public final C80879Voh LJLLILLLL;

    public abstract S LIZ(Context context, AttributeSet attributeSet);

    public int getHideAnimationBehavior() {
        return this.LJLIL.LJFF;
    }

    public int[] getIndicatorColor() {
        return this.LJLIL.LIZJ;
    }

    public int getShowAnimationBehavior() {
        return this.LJLIL.LJ;
    }

    public int getTrackColor() {
        return this.LJLIL.LIZLLL;
    }

    public int getTrackCornerRadius() {
        return this.LJLIL.LIZIZ;
    }

    public int getTrackThickness() {
        return this.LJLIL.LIZ;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LJLL);
        removeCallbacks(this.LJLJLLL);
        ((AbstractC80872Voa) getCurrentDrawable()).LJ(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().LJI(this.LJLLILLLL);
            getIndeterminateDrawable().LJLLJ.LJIIIZ();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().LJI(this.LJLLILLLL);
        }
        super.onDetachedFromWindow();
    }

    private AbstractC80875Vod<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().LJLLILLLL;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().LJLLILLLL;
    }

    public final boolean LIZJ() {
        if (!C16330kX.LIZIZ(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
            } else if (parent instanceof View) {
                view = (View) parent;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public C80873Vob<S> getIndeterminateDrawable() {
        return (C80873Vob) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C80874Voc<S> getProgressDrawable() {
        return (C80874Voc) super.getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().LJLLJ.LJI(this.LJLLI);
        }
        if (getProgressDrawable() != null) {
            C80874Voc<S> progressDrawable = getProgressDrawable();
            C80879Voh c80879Voh = this.LJLLILLLL;
            if (progressDrawable.LJLJJLL == null) {
                progressDrawable.LJLJJLL = new ArrayList();
            }
            if (!((ArrayList) progressDrawable.LJLJJLL).contains(c80879Voh)) {
                ((ArrayList) progressDrawable.LJLJJLL).add(c80879Voh);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C80873Vob<S> indeterminateDrawable = getIndeterminateDrawable();
            C80879Voh c80879Voh2 = this.LJLLILLLL;
            if (indeterminateDrawable.LJLJJLL == null) {
                indeterminateDrawable.LJLJJLL = new ArrayList();
            }
            if (!((ArrayList) indeterminateDrawable.LJLJJLL).contains(c80879Voh2)) {
                ((ArrayList) indeterminateDrawable.LJLJJLL).add(c80879Voh2);
            }
        }
        if (LIZJ()) {
            if (this.LJLJJL > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!this.LJLJJI) {
            return;
        }
        ((AbstractC80872Voa) getCurrentDrawable()).LJ(LIZJ(), false, false);
    }

    public void setAnimatorDurationScaleProvider(C80880Voi c80880Voi) {
        this.LJLJJLL = c80880Voi;
        if (getProgressDrawable() != null) {
            getProgressDrawable().LJLJI = c80880Voi;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().LJLJI = c80880Voi;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.LJLIL.LJFF = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        if (LIZJ() && z) {
            throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
        }
        AbstractC80872Voa abstractC80872Voa = (AbstractC80872Voa) getCurrentDrawable();
        if (abstractC80872Voa != null) {
            abstractC80872Voa.LJ(false, false, false);
        }
        super.setIndeterminate(z);
        AbstractC80872Voa abstractC80872Voa2 = (AbstractC80872Voa) getCurrentDrawable();
        if (abstractC80872Voa2 != null) {
            abstractC80872Voa2.LJ(LIZJ(), false, false);
        }
        this.LJLJL = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof C80873Vob) {
                ((AbstractC80872Voa) drawable).LJ(false, false, false);
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        int i;
        if (iArr.length == 0) {
            iArr = new int[1];
            TypedValue LIZ = C78972Uz2.LIZ(R.attr.a4r, getContext());
            if (LIZ != null) {
                i = LIZ.data;
            } else {
                i = -1;
            }
            iArr[0] = i;
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.LJLIL.LIZJ = iArr;
            getIndeterminateDrawable().LJLLJ.LJFF();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        LIZIZ(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof C80874Voc) {
                AbstractC80872Voa abstractC80872Voa = (AbstractC80872Voa) drawable;
                abstractC80872Voa.LJ(false, false, false);
                super.setProgressDrawable(abstractC80872Voa);
                abstractC80872Voa.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.LJLIL.LJ = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.LJLIL;
        if (s.LIZLLL != i) {
            s.LIZLLL = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.LJLIL;
        if (s.LIZIZ != i) {
            s.LIZIZ = Math.min(i, s.LIZ / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.LJLIL;
        if (s.LIZ != i) {
            s.LIZ = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.LJLJLJ = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public void LIZIZ(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.LJLILLLLZI = i;
                this.LJLJI = z;
                this.LJLJL = true;
                if (getIndeterminateDrawable().isVisible()) {
                    C80880Voi c80880Voi = this.LJLJJLL;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    c80880Voi.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().LJLLJ.LJII();
                        return;
                    }
                }
                C80878Vog c80878Vog = this.LJLLI;
                getIndeterminateDrawable();
                c80878Vog.LIZ();
                return;
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        AbstractC80875Vod<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int LJ = currentDrawingDelegate.LJ();
        int LIZLLL = currentDrawingDelegate.LIZLLL();
        if (LJ < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = LJ + getPaddingLeft() + getPaddingRight();
        }
        if (LIZLLL >= 0) {
            paddingTop = LIZLLL + getPaddingTop() + getPaddingBottom();
        } else {
            paddingTop = getMeasuredHeight();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LJLJJI) {
            return;
        }
        ((AbstractC80872Voa) getCurrentDrawable()).LJ(LIZJ(), false, z);
    }

    public AbstractC80871VoZ(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C78865UxJ.LIZ(context, attributeSet, i, R.style.a1i), attributeSet, i);
        this.LJLJL = false;
        this.LJLJLJ = 4;
        this.LJLJLLL = new ARunnableS50S0100000_14(this, 242);
        this.LJLL = new ARunnableS50S0100000_14(this, 243);
        this.LJLLI = new C80878Vog(this);
        this.LJLLILLLL = new C80879Voh(this);
        Context context2 = getContext();
        this.LJLIL = LIZ(context2, attributeSet);
        TypedArray LIZLLL = C80244VeS.LIZLLL(context2, attributeSet, new int[]{android.R.attr.indeterminate, R.attr.afl, R.attr.ahh, R.attr.b0z, R.attr.bad, R.attr.baj, R.attr.bkp, R.attr.bks, R.attr.bku}, i, i2, new int[0]);
        LIZLLL.getInt(5, -1);
        this.LJLJJL = Math.min(LIZLLL.getInt(3, -1), 1000);
        LIZLLL.recycle();
        this.LJLJJLL = new C80880Voi();
        this.LJLJJI = true;
    }
}
