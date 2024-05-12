package X;

import Y.ACListenerS39S0200000_4;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class AEY extends AI9 {
    public final AEX<CompoundButton> LIZIZ;
    public InterfaceC65784Pro<Boolean> LIZJ;

    public abstract CompoundButton LJIIJJI(Context context, AttributeSet attributeSet);

    @Override // X.AI9
    public final View LJ() {
        return this.LIZIZ.LIZIZ;
    }

    public final boolean LJIIL() {
        return this.LIZIZ.LIZ.isChecked();
    }

    @Override // X.AI9
    public final void LJIIIIZZ(boolean z) {
        this.LIZIZ.LIZ.setEnabled(z);
    }

    @Override // X.AI9
    public final void LJIIJ(boolean z) {
        int i;
        AEX<CompoundButton> aex = this.LIZIZ;
        CompoundButton compoundButton = aex.LIZ;
        int i2 = 0;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        compoundButton.setVisibility(i);
        C116414hZ c116414hZ = aex.LIZJ;
        if (!z) {
            i2 = 8;
        }
        c116414hZ.setVisibility(i2);
    }

    public final void LJIILIIL(boolean z) {
        this.LIZIZ.LIZ.setChecked(z);
    }

    public final void LJIILJJIL(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        KeyEvent.Callback callback = (CompoundButton) this.LIZIZ.LIZ;
        if (callback instanceof AEZ) {
            ((AEZ) callback).setInterceptToggleListener(interfaceC65784Pro);
        }
        this.LIZJ = interfaceC65784Pro;
    }

    public final void LJIILL(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.LIZIZ.LIZ.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS39S0200000_4(onCheckedChangeListener, this, 100)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AEY(Context context, AttributeSet attributeSet) {
        super(context);
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.checked, com.zhiliaoapp.musically.R.attr.sa, com.zhiliaoapp.musically.R.attr.sb, com.zhiliaoapp.musically.R.attr.sc, com.zhiliaoapp.musically.R.attr.sd, com.zhiliaoapp.musically.R.attr.se, com.zhiliaoapp.musically.R.attr.sf, com.zhiliaoapp.musically.R.attr.sg, com.zhiliaoapp.musically.R.attr.sh, com.zhiliaoapp.musically.R.attr.si, com.zhiliaoapp.musically.R.attr.sj, com.zhiliaoapp.musically.R.attr.sk, com.zhiliaoapp.musically.R.attr.sl, com.zhiliaoapp.musically.R.attr.sm, com.zhiliaoapp.musically.R.attr.sn, com.zhiliaoapp.musically.R.attr.so, com.zhiliaoapp.musically.R.attr.sp, com.zhiliaoapp.musically.R.attr.sq, com.zhiliaoapp.musically.R.attr.sr, com.zhiliaoapp.musically.R.attr.ss, com.zhiliaoapp.musically.R.attr.st, com.zhiliaoapp.musically.R.attr.su, com.zhiliaoapp.musically.R.attr.sv, com.zhiliaoapp.musically.R.attr.sw, com.zhiliaoapp.musically.R.attr.sx, com.zhiliaoapp.musically.R.attr.sy, com.zhiliaoapp.musically.R.attr.sz, com.zhiliaoapp.musically.R.attr.t0, com.zhiliaoapp.musically.R.attr.t1, com.zhiliaoapp.musically.R.attr.t2, com.zhiliaoapp.musically.R.attr.bq_, com.zhiliaoapp.musically.R.attr.bqa, com.zhiliaoapp.musically.R.attr.bqb, com.zhiliaoapp.musically.R.attr.bqc, com.zhiliaoapp.musically.R.attr.bqf, com.zhiliaoapp.musically.R.attr.brm, com.zhiliaoapp.musically.R.attr.bs7, com.zhiliaoapp.musically.R.attr.btc, com.zhiliaoapp.musically.R.attr.btv, com.zhiliaoapp.musically.R.attr.buj, com.zhiliaoapp.musically.R.attr.buk}, com.zhiliaoapp.musically.R.attr.ks, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.LIZIZ = new AEX<>(context, attributeSet, new AqS93S0300000_4(this, context, attributeSet, 194));
        LJIILIIL(z);
    }
}
