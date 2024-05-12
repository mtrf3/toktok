package X;

import Y.ARunnableS19S0110000_13;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1L<V extends View, T> implements InterfaceC76501U0r {
    public static final U1L<V, T> LIZ = new U1L<>();

    @Override // X.InterfaceC76501U0r
    public final void LIZ(View view, Object obj) {
        U1S view2 = (U1S) view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(view2, "view");
        view2.LJLJJL = Boolean.valueOf(booleanValue);
        view2.postDelayed(new ARunnableS19S0110000_13(view2, booleanValue, 1), 3800L);
    }
}
