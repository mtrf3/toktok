package Y;

import X.MVR;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDCListenerS256S0100000_9 implements View.OnLayoutChangeListener {
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

    public IDCListenerS256S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS256S0100000_9 iDCListenerS256S0100000_9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS256S0100000_9);
        ((TopWarnComponent) iDCListenerS256S0100000_9.l0).r4();
    }

    public static final void onLayoutChange$1(IDCListenerS256S0100000_9 iDCListenerS256S0100000_9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = MVR.LIZ;
        if (i2 > i9) {
            ((View) iDCListenerS256S0100000_9.l0).setTop(i9);
        }
    }
}
