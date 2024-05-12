package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.3as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86783as extends LinearLayout {
    public int LJLIL;

    public final void LIZ(int i) {
        if (i >= getChildCount()) {
            return;
        }
        Iterator<View> it = C78924UyG.LIZLLL(this).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                ((View) iDObjectS0S0101000.next()).setSelected(false);
            } else {
                View childAt = getChildAt(i);
                o.LJIIIIZZ(childAt, "this.getChildAt(index)");
                childAt.setSelected(true);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86783as(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), 0);
        setLayoutParams(layoutParams);
    }
}
