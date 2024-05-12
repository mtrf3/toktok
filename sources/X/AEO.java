package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEO extends AI9 {
    public final TuxIconView LIZIZ;
    public Integer LIZJ;

    @Override // X.AI9
    public final AI4 LIZ() {
        return AEN.LIZIZ;
    }

    @Override // X.AI9
    public final View LJ() {
        return this.LIZIZ;
    }

    public AEO(Context context) {
        super(context);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LIZIZ = tuxIconView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…         0,\n            )");
        int color = obtainStyledAttributes.getColor(14, 0);
        obtainStyledAttributes.getColor(15, 0);
        obtainStyledAttributes.recycle();
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        C018905p c018905p = new C018905p(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C7MY.LIZIZ(16);
        tuxIconView.setLayoutParams(c018905p);
        Integer num = this.LIZJ;
        if (num != null) {
            tuxIconView.setIconRes(num.intValue());
        }
        tuxIconView.setTintColor(color);
    }
}
