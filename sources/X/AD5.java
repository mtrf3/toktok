package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AD5 extends AI9 {
    public final TuxTextView LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public /* synthetic */ AD5() {
        throw null;
    }

    @Override // X.AI9
    public final CharSequence LIZLLL() {
        return this.LIZIZ.getText();
    }

    @Override // X.AI9
    public final void LJIIIZ() {
        C26338AVi.LJI(this.LIZIZ, null, AnonymousClass391.LIZJ(17), null, null, false, 29);
    }

    @Override // X.AI9
    public final AI4 LIZ() {
        return AD6.LIZIZ;
    }

    @Override // X.AI9
    public final View LJ() {
        return this.LIZIZ;
    }

    @Override // X.AI9
    public final void LJIIIIZZ(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LIZIZ;
        if (z) {
            i = this.LIZJ;
        } else {
            i = this.LIZLLL;
        }
        tuxTextView.setTextColor(i);
        this.LIZIZ.setEnabled(z);
    }

    public AD5(Context context, AttributeSet attributeSet) {
        super(context);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LIZIZ = tuxTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        int i = obtainStyledAttributes.getInt(19, 0);
        int color = obtainStyledAttributes.getColor(18, 0);
        this.LIZJ = color;
        this.LIZLLL = obtainStyledAttributes.getColor(26, 0);
        tuxTextView.setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 37));
        obtainStyledAttributes.recycle();
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(color);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // X.AI9
    public final void LJI(ConstraintLayout constraintLayout, C17760mq info) {
        o.LJIIIZ(info, "info");
        if (this.LIZIZ.hasOnClickListeners()) {
            info.LJIILJJIL(Button.class.getName());
        }
    }
}
