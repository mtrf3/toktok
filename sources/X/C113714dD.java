package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.4dD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113714dD extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    public final void LIZ() {
        removeAllViews();
        int i = this.LJLIL;
        int i2 = 1;
        if (1 > i) {
            return;
        }
        while (true) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.LJLJJLL);
            layoutParams.weight = 1.0f;
            if (i2 != this.LJLIL) {
                int i3 = this.LJLJJL;
                layoutParams.rightMargin = i3;
                layoutParams.setMarginEnd(i3);
            }
            view.setLayoutParams(layoutParams);
            if (i2 <= this.LJLILLLLZI) {
                view.setBackgroundColor(this.LJLJI);
            } else {
                view.setBackgroundColor(this.LJLJJI);
            }
            addView(view);
            if (i2 != i) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final int getDarkColor() {
        return this.LJLJJI;
    }

    public final int getLightColor() {
        return this.LJLJI;
    }

    public final int getLightStep() {
        return this.LJLILLLLZI;
    }

    public final int getTotalStep() {
        return this.LJLIL;
    }

    public final void setDarkColor(int i) {
        this.LJLJJI = i;
    }

    public final void setLightColor(int i) {
        this.LJLJI = i;
    }

    public final void setLightStep(int i) {
        if (i <= 0) {
            this.LJLILLLLZI = 0;
        } else {
            this.LJLILLLLZI = i;
        }
        LIZ();
    }

    public final void setTotalStep(int i) {
        this.LJLIL = i;
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113714dD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 3;
        this.LJLILLLLZI = 1;
        this.LJLJI = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        this.LJLJJI = AnonymousClass636.LJIIIIZZ(R.attr.cf, context);
        int LIZJ = (int) KL2.LIZJ(context, 2.0f);
        this.LJLJJL = LIZJ;
        this.LJLJJLL = LIZJ;
        setOrientation(0);
        if (isInEditMode()) {
            LIZ();
        }
    }
}
