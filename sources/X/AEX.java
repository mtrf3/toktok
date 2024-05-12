package X;

import Y.ACListenerS24S0100000_4;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEX<T extends View> {
    public final T LIZ;
    public final View LIZIZ;
    public final C116414hZ LIZJ;

    public AEX(Context context, AttributeSet attributeSet, AqS93S0300000_4 aqS93S0300000_4) {
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        int resourceId = obtainStyledAttributes.getResourceId(20, 0);
        int color = obtainStyledAttributes.getColor(21, 0);
        obtainStyledAttributes.recycle();
        FrameLayout frameLayout = new FrameLayout(context);
        this.LIZIZ = frameLayout;
        T t = (T) aqS93S0300000_4.invoke();
        this.LIZ = t;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        t.setLayoutParams(layoutParams);
        C116414hZ c116414hZ = new C116414hZ(context, null, 6, 0);
        this.LIZJ = c116414hZ;
        c116414hZ.LIZ(resourceId, color);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        layoutParams2.gravity = 17;
        c116414hZ.setLayoutParams(layoutParams2);
        frameLayout.addView(t);
        frameLayout.addView(c116414hZ);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 294), frameLayout);
        c116414hZ.setVisibility(8);
    }
}
