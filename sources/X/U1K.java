package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1K<V extends View, T> implements InterfaceC76501U0r {
    public static final U1K<V, T> LIZ = new U1K<>();

    @Override // X.InterfaceC76501U0r
    public final void LIZ(View view, Object obj) {
        U1S view2 = (U1S) view;
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(view2, "view");
        if (intValue <= 0) {
            view2.setAlpha(1.0f);
        }
        int measuredWidth = view2.LIZ(R.id.fj6).getMeasuredWidth();
        if (((C15380j0.LJIIL() - measuredWidth) - view2.LIZ(R.id.fl6).getMeasuredWidth()) - C15380j0.LIZ(12.0f) < intValue) {
            view2.setAlpha(0.2f);
        } else {
            view2.setAlpha(1.0f);
        }
    }
}
