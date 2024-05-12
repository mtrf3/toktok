package Y;

import X.AnonymousClass064;
import X.C32151Nz;
import X.O6R;
import X.OOL;
import X.S49;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDCListenerS257S0100000_10 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS257S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS257S0100000_10 iDCListenerS257S0100000_10, View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        OOL ool = (OOL) iDCListenerS257S0100000_10.l0;
        int measuredHeight = v.getMeasuredHeight();
        ool.getClass();
        try {
            Object parent = ((ConstraintLayout) ool.findViewById(R.id.gy9)).getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
            if (from != null) {
                from.setPeekHeight(measuredHeight);
            }
        } catch (Exception unused) {
        }
        v.removeOnLayoutChangeListener(iDCListenerS257S0100000_10);
    }

    public static final void onLayoutChange$1(IDCListenerS257S0100000_10 iDCListenerS257S0100000_10, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((S49) iDCListenerS257S0100000_10.l0).LJLJJI.removeOnLayoutChangeListener(iDCListenerS257S0100000_10);
        if (view != null) {
            S49 s49 = (S49) iDCListenerS257S0100000_10.l0;
            if (view.getMeasuredHeight() >= O6R.LJJIIZ(C32151Nz.LJIIZILJ(17)) * 2) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(s49.LJLIL);
                anonymousClass064.LJFF(R.id.i40);
                anonymousClass064.LJIIL(R.id.i40, -2);
                anonymousClass064.LJIIJ(R.id.i40, -2);
                anonymousClass064.LJIIIIZZ(R.id.i40, 6, R.id.i6k, 6);
                anonymousClass064.LJIIIZ(R.id.i40, 3, R.id.i6i, 4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                anonymousClass064.LIZIZ(s49.LJLIL);
            }
        }
    }
}
