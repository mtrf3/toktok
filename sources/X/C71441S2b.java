package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S2b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71441S2b implements InterfaceC71454S2o {
    @Override // X.InterfaceC71454S2o
    public final void LJIILIIL(TuxTextView buyBtn, boolean z) {
        o.LJIIIZ(buyBtn, "buyBtn");
        if (z) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cg);
            Context context = buyBtn.getContext();
            o.LJIIIIZZ(context, "buyBtn.context");
            buyBtn.setBackground(c110614Vt.LIZ(context));
            return;
        }
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
        Context context2 = buyBtn.getContext();
        o.LJIIIIZZ(context2, "buyBtn.context");
        buyBtn.setBackground(c110614Vt2.LIZ(context2));
    }
}
