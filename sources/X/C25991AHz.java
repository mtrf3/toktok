package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.AHz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25991AHz extends AEY {
    public CharSequence LIZLLL;

    @Override // X.AI9
    public final void LJIIIZ() {
        C26338AVi.LJI(this.LIZIZ.LIZIZ, null, AnonymousClass391.LIZJ(14), null, null, false, 29);
    }

    @Override // X.AI9
    public final AI4 LIZ() {
        return AI0.LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25991AHz(Context context) {
        super(context, null);
        o.LJIIIZ(context, "context");
    }

    public C25991AHz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AI9
    public final void LJI(ConstraintLayout constraintLayout, C17760mq info) {
        o.LJIIIZ(info, "info");
        info.LJIIL(true);
        info.LJIILIIL(LJIIL());
        info.LJJIFFI(this.LIZLLL);
        this.LIZIZ.LIZIZ.setImportantForAccessibility(4);
    }

    @Override // X.AEY
    public final CompoundButton LJIIJJI(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        this.LIZLLL = C16880lQ.LLLZLZ(obtainStyledAttributes, 22);
        obtainStyledAttributes.recycle();
        return new C63044Ooi(context, null, 6);
    }
}
