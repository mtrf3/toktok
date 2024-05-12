package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vr1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81023Vr1 extends ViewGroup implements C0RR {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public C0RP LJLJL;
    public int LJLJLJ;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJLJ++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        C0RP c0rp = this.LJLJL;
        if (c0rp == null) {
            C0RP c0rp2 = new C0RP();
            this.LJLJL = c0rp2;
            return c0rp2;
        }
        return c0rp;
    }

    public View getLabelEnd() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-labelEnd>(...)");
        return (View) value;
    }

    public View getLabelStart() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-labelStart>(...)");
        return (View) value;
    }

    public View getName() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-name>(...)");
        return (View) value;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJLJ;
    }

    public int getGap() {
        return this.LJLJJI;
    }

    public int getNameMinWidth() {
        return this.LJLJJL;
    }

    public int getTopSpace() {
        return this.LJLJJLL;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setGap(int i) {
        this.LJLJJI = i;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public void setNameMinWidth(int i) {
        this.LJLJJL = i;
    }

    public void setTopSpace(int i) {
        this.LJLJJLL = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC81023Vr1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int gap;
        int gap2;
        int gap3;
        if (View.MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        measureChild(getName(), ViewGroup.getChildMeasureSpec(i, 0, getName().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getName().getLayoutParams().height));
        if (getName().getMeasuredWidth() <= getNameMinWidth()) {
            if (getLabelStart().getVisibility() != 8) {
                measureChild(getLabelStart(), ViewGroup.getChildMeasureSpec(i, getName().getMeasuredWidth() + getGap(), getLabelStart().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelStart().getLayoutParams().height));
            }
            if (getLabelEnd().getVisibility() != 8) {
                View labelEnd = getLabelEnd();
                if (getLabelStart().getVisibility() == 8) {
                    gap3 = 0;
                } else {
                    gap3 = getGap() + getLabelStart().getMeasuredWidth();
                }
                measureChild(labelEnd, ViewGroup.getChildMeasureSpec(i, getGap() + getName().getMeasuredWidth() + gap3, getLabelEnd().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelEnd().getLayoutParams().height));
            }
        } else {
            if (getLabelStart().getVisibility() != 8) {
                measureChild(getLabelStart(), ViewGroup.getChildMeasureSpec(i, getNameMinWidth() + getGap(), getLabelStart().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelStart().getLayoutParams().height));
            }
            if (getLabelEnd().getVisibility() != 8) {
                View labelEnd2 = getLabelEnd();
                if (getLabelStart().getVisibility() == 8) {
                    gap = 0;
                } else {
                    gap = getGap() + getLabelStart().getMeasuredWidth();
                }
                measureChild(labelEnd2, ViewGroup.getChildMeasureSpec(i, getGap() + getNameMinWidth() + gap, getLabelEnd().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelEnd().getLayoutParams().height));
            }
            if (getLabelStart().getVisibility() != 8) {
                i3 = getGap() + getLabelStart().getMeasuredWidth();
            } else {
                i3 = 0;
            }
            if (getLabelEnd().getVisibility() != 8) {
                i3 += getGap() + getLabelEnd().getMeasuredWidth();
            }
            measureChild(getName(), ViewGroup.getChildMeasureSpec(i, i3, getName().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getName().getLayoutParams().height));
        }
        if (getLabelStart().getVisibility() == 8) {
            gap2 = 0;
        } else {
            gap2 = getGap() + getLabelStart().getMeasuredWidth();
        }
        int measuredWidth = getName().getMeasuredWidth() + gap2;
        if (getLabelEnd().getVisibility() != 8) {
            i4 = getLabelEnd().getMeasuredWidth() + getGap();
        }
        int i5 = measuredWidth + i4;
        int max = Math.max(getName().getMeasuredHeight(), Math.max(getLabelEnd().getMeasuredHeight(), getLabelStart().getMeasuredHeight()));
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, size2);
        }
        setMeasuredDimension(Math.min(i5, size), max);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC81023Vr1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 318));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 316));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 317));
        this.LJLJJI = C15380j0.LIZ(2.0f);
        this.LJLJJL = C15380j0.LIZ(68.0f);
        this.LJLJJLL = C15380j0.LIZ(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2 = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z2 = false;
        }
        if (getLabelStart().getVisibility() == 0) {
            i5 = getGap() + getLabelStart().getMeasuredWidth();
        } else {
            i5 = 0;
        }
        int measuredWidth = getName().getMeasuredWidth() + i5;
        if (getLabelEnd().getVisibility() == 0) {
            measuredWidth += getGap();
        }
        if (z2) {
            getLabelStart().layout(getWidth() - getLabelStart().getMeasuredWidth(), ((getHeight() - getLabelStart().getMeasuredHeight()) / 2) + getTopSpace(), getWidth(), ((getLabelStart().getMeasuredHeight() + getHeight()) / 2) + getTopSpace());
            getName().layout((getWidth() - getName().getMeasuredWidth()) - i5, (getHeight() - getName().getMeasuredHeight()) / 2, getWidth() - i5, (getName().getMeasuredHeight() + getHeight()) / 2);
            getLabelEnd().layout((getWidth() - getLabelEnd().getMeasuredWidth()) - measuredWidth, ((getHeight() - getLabelEnd().getMeasuredHeight()) / 2) + getTopSpace(), getWidth() - measuredWidth, ((getLabelEnd().getMeasuredHeight() + getHeight()) / 2) + getTopSpace());
            return;
        }
        getLabelStart().layout(0, ((getHeight() - getLabelStart().getMeasuredHeight()) / 2) + getTopSpace(), getLabelStart().getMeasuredWidth(), ((getLabelStart().getMeasuredHeight() + getHeight()) / 2) + getTopSpace());
        getName().layout(i5, (getHeight() - getName().getMeasuredHeight()) / 2, getName().getMeasuredWidth() + i5, (getName().getMeasuredHeight() + getHeight()) / 2);
        getLabelEnd().layout(measuredWidth, ((getHeight() - getLabelEnd().getMeasuredHeight()) / 2) + getTopSpace(), getLabelEnd().getMeasuredWidth() + measuredWidth, ((getLabelEnd().getMeasuredHeight() + getHeight()) / 2) + getTopSpace());
    }
}
