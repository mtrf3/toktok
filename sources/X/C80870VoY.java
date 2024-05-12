package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VoY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80870VoY extends AbstractC80871VoZ<C80602VkE> {
    public static final /* synthetic */ int LJLLJ = 0;

    public int getIndeterminateAnimationType() {
        return ((C80602VkE) this.LJLIL).LJI;
    }

    public int getIndicatorDirection() {
        return ((C80602VkE) this.LJLIL).LJII;
    }

    public void setIndeterminateAnimationType(int i) {
        if (((C80602VkE) this.LJLIL).LJI == i) {
            return;
        }
        if (!LIZJ() || !isIndeterminate()) {
            S s = this.LJLIL;
            ((C80602VkE) s).LJI = i;
            s.LIZ();
            if (i == 0) {
                C80873Vob<C80602VkE> indeterminateDrawable = getIndeterminateDrawable();
                C80883Vol c80883Vol = new C80883Vol((C80602VkE) this.LJLIL);
                indeterminateDrawable.LJLLJ = c80883Vol;
                c80883Vol.LIZ = indeterminateDrawable;
            } else {
                C80873Vob<C80602VkE> indeterminateDrawable2 = getIndeterminateDrawable();
                C80884Vom c80884Vom = new C80884Vom(getContext(), (C80602VkE) this.LJLIL);
                indeterminateDrawable2.LJLLJ = c80884Vom;
                c80884Vom.LIZ = indeterminateDrawable2;
            }
            invalidate();
            return;
        }
        throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
    }

    @Override // X.AbstractC80871VoZ
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.LJLIL.LIZ();
    }

    public void setIndicatorDirection(int i) {
        S s = this.LJLIL;
        ((C80602VkE) s).LJII = i;
        C80602VkE c80602VkE = (C80602VkE) s;
        boolean z = true;
        if (i != 1 && ((C16310kV.LIZLLL(this) != 1 || ((C80602VkE) this.LJLIL).LJII != 2) && (C16310kV.LIZLLL(this) != 0 || i != 3))) {
            z = false;
        }
        c80602VkE.LJIIIIZZ = z;
        invalidate();
    }

    @Override // X.AbstractC80871VoZ
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.LJLIL.LIZ();
        invalidate();
    }

    public C80870VoY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.aoq, R.style.a0q);
        AbstractC261710z c80884Vom;
        Context context2 = getContext();
        C80602VkE c80602VkE = (C80602VkE) this.LJLIL;
        C80867VoV c80867VoV = new C80867VoV(c80602VkE);
        if (c80602VkE.LJI == 0) {
            c80884Vom = new C80883Vol(c80602VkE);
        } else {
            c80884Vom = new C80884Vom(context2, c80602VkE);
        }
        setIndeterminateDrawable(new C80873Vob(context2, c80602VkE, c80867VoV, c80884Vom));
        Context context3 = getContext();
        C80602VkE c80602VkE2 = (C80602VkE) this.LJLIL;
        setProgressDrawable(new C80874Voc(context3, c80602VkE2, new C80867VoV(c80602VkE2)));
    }

    @Override // X.AbstractC80871VoZ
    public final C80602VkE LIZ(Context context, AttributeSet attributeSet) {
        return new C80602VkE(context, attributeSet);
    }

    @Override // X.AbstractC80871VoZ
    public final void LIZIZ(int i, boolean z) {
        S s = this.LJLIL;
        if (s != 0 && ((C80602VkE) s).LJI == 0 && isIndeterminate()) {
            return;
        }
        super.LIZIZ(i, z);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        C80873Vob<C80602VkE> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        C80874Voc<C80602VkE> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.LJLIL;
        C80602VkE c80602VkE = (C80602VkE) s;
        boolean z2 = true;
        if (((C80602VkE) s).LJII != 1 && ((C16310kV.LIZLLL(this) != 1 || ((C80602VkE) this.LJLIL).LJII != 2) && (C16310kV.LIZLLL(this) != 0 || ((C80602VkE) this.LJLIL).LJII != 3))) {
            z2 = false;
        }
        c80602VkE.LJIIIIZZ = z2;
    }
}
