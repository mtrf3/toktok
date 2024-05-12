package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEM extends AI9 {
    public final SY4 LIZIZ;

    @Override // X.AI9
    public final void LJI(ConstraintLayout constraintLayout, C17760mq info) {
        o.LJIIIZ(info, "info");
    }

    @Override // X.AI9
    public final void LJIIIZ() {
        C26338AVi.LJI(this.LIZIZ, null, AnonymousClass391.LIZJ(12), null, null, false, 29);
    }

    @Override // X.AI9
    public final AI4 LIZ() {
        return AEN.LIZIZ;
    }

    @Override // X.AI9
    public final View LJ() {
        return this.LIZIZ;
    }

    @Override // X.AI9
    public final void LJIIIIZZ(boolean z) {
        this.LIZIZ.setEnabled(z);
    }

    @Override // X.AI9
    public final void LJIIJ(boolean z) {
        this.LIZIZ.setLoading(z);
    }

    public final void LJIIJJI(View.OnClickListener onClickListener) {
        C16880lQ.LJJIZ(this.LIZIZ, onClickListener);
    }

    public final void LJIIL(CharSequence charSequence) {
        this.LIZIZ.setText(charSequence);
    }

    public AEM(Context context, AttributeSet attributeSet) {
        super(context);
        SY4 sy4 = new SY4(context, null, 6, 0);
        this.LIZIZ = sy4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        int i = obtainStyledAttributes.getInt(33, LiveLayoutPreloadThreadPriority.DEFAULT);
        int i2 = obtainStyledAttributes.getInt(31, LiveLayoutPreloadThreadPriority.DEFAULT);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 32);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        sy4.setButtonVariant(i);
        sy4.setButtonSize(i2);
        LJIIL(LLLZLZ);
        if (dimensionPixelSize > 0) {
            sy4.setHeight(dimensionPixelSize);
        }
    }
}
