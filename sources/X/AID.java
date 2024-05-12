package X;

import Y.ACListenerS24S0100000_4;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AID extends AI9 {
    public final View LIZIZ;
    public final TuxIconView LIZJ;
    public AIE LIZLLL;
    public boolean LJ;
    public final CharSequence LJFF;
    public final CharSequence LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    @Override // X.AI9
    public final void LIZJ() {
        ((Animation) this.LJII.getValue()).cancel();
        ((Animation) this.LJIIIIZZ.getValue()).cancel();
    }

    @Override // X.AI9
    public final void LJIIIZ() {
        C26338AVi.LJI(this.LIZJ, null, AnonymousClass391.LIZJ(18), null, null, false, 29);
    }

    @Override // X.AI9
    public final AI4 LIZ() {
        return AIB.LIZIZ;
    }

    @Override // X.AI9
    public final View LJ() {
        return this.LIZJ;
    }

    @Override // X.AI9
    public final void LJIIIIZZ(boolean z) {
        this.LIZJ.setEnabled(z);
    }

    @Override // X.AI9
    public final void LJI(ConstraintLayout constraintLayout, C17760mq info) {
        o.LJIIIZ(info, "info");
        info.LJIILJJIL(Button.class.getName());
        if (this.LJ) {
            info.LIZIZ(new C17720mm(16, this.LJI));
        } else {
            info.LIZIZ(new C17720mm(16, this.LJFF));
        }
    }

    public AID(Context context, TuxTextView tuxTextView, AttributeSet attributeSet) {
        super(context);
        this.LIZIZ = tuxTextView;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LIZJ = tuxIconView;
        this.LJII = C221108m2.LIZIZ(C197337on.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C197327om.LJLIL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        int color = obtainStyledAttributes.getColor(12, 0);
        int resourceId = obtainStyledAttributes.getResourceId(11, 0);
        this.LJFF = C16880lQ.LLLZLZ(obtainStyledAttributes, 10);
        this.LJI = C16880lQ.LLLZLZ(obtainStyledAttributes, 8);
        obtainStyledAttributes.recycle();
        tuxIconView.setIconRes(resourceId);
        tuxIconView.setTintColor(color);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 295));
    }
}
