package Y;

import X.C81019Vqx;
import android.view.View;
import com.ss.android.ugc.aweme.kids.commonfeed.panel.BaseFeedPanel;

/* loaded from: classes15.dex */
public class IDCListenerS260S0100000_14 implements View.OnLayoutChangeListener {
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
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS260S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS260S0100000_14 iDCListenerS260S0100000_14, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i4 == i8 && i3 == i7) {
            return;
        }
        ((BaseFeedPanel) iDCListenerS260S0100000_14.l0).adaptation();
    }

    public static final void onLayoutChange$1(IDCListenerS260S0100000_14 iDCListenerS260S0100000_14, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C81019Vqx) iDCListenerS260S0100000_14.l0).requestLayout();
    }

    public static final void onLayoutChange$2(IDCListenerS260S0100000_14 iDCListenerS260S0100000_14, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C81019Vqx) iDCListenerS260S0100000_14.l0).requestLayout();
    }
}
