package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AIF extends AI9 {
    public final AIG LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    @Override // X.AI9
    public final int LIZIZ() {
        if (this.LIZIZ.getWithIcon$tux_theme_release()) {
            return C7MY.LIZIZ(16);
        }
        return 0;
    }

    @Override // X.AI9
    public final void LJIIIZ() {
        int i;
        AIG aig = this.LIZIZ;
        if (aig.getCustomView$tux_theme_release() == null) {
            i = 17;
        } else {
            i = 15;
        }
        C26338AVi.LJI(aig, null, AnonymousClass391.LIZJ(i), null, null, false, 29);
    }

    public final CharSequence LJIIJJI() {
        return this.LIZIZ.getLabel();
    }

    @Override // X.AI9
    public final CharSequence LIZLLL() {
        return LJIIJJI();
    }

    @Override // X.AI9
    public final AI4 LIZ() {
        return AI5.LIZIZ;
    }

    @Override // X.AI9
    public final View LJ() {
        return this.LIZIZ;
    }

    @Override // X.AI9
    public final void LJIIIIZZ(boolean z) {
        if (z) {
            this.LIZIZ.setTextColor(this.LIZJ);
            this.LIZIZ.setIconColor(this.LJ);
        } else {
            this.LIZIZ.setTextColor(this.LIZLLL);
            this.LIZIZ.setIconColor(this.LIZLLL);
        }
        this.LIZIZ.setEnabled(z);
    }

    public final void LJIIL(View view) {
        this.LIZIZ.setCustomView(view);
    }

    public final void LJIILIIL(CharSequence charSequence) {
        this.LIZIZ.setLabel(charSequence);
    }

    public final void LJIILJJIL(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZIZ.setOnClickListener(new ViewOnClickListenerC13880ga(listener));
    }

    public final void LJIILL(boolean z) {
        this.LIZIZ.setShowArrow(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIF(Context context, AttributeSet attributeSet) {
        super(context);
        o.LJIIIZ(context, "context");
        AIG aig = new AIG(context);
        this.LIZIZ = aig;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        int color = obtainStyledAttributes.getColor(18, 0);
        this.LIZJ = color;
        this.LIZLLL = obtainStyledAttributes.getColor(26, 0);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        this.LJ = color2;
        int resourceId = obtainStyledAttributes.getResourceId(9, 0);
        LJIILIIL(C16880lQ.LLLZLZ(obtainStyledAttributes, 37));
        int i = obtainStyledAttributes.getInt(19, 0);
        obtainStyledAttributes.recycle();
        aig.setFont(i);
        aig.setTextColor(color);
        aig.setIconRes(resourceId);
        aig.setIconColor(color2);
    }

    @Override // X.AI9
    public final void LJI(ConstraintLayout constraintLayout, C17760mq info) {
        o.LJIIIZ(info, "info");
        if (this.LIZIZ.hasOnClickListeners()) {
            info.LJIILJJIL(Button.class.getName());
        }
    }
}
