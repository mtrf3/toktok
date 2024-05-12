package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2B implements S2H {
    public C26773Af3 LIZ;
    public TuxTextView LIZIZ;

    @Override // X.S2H
    public final int getLayoutId() {
        return R.layout.ao1;
    }

    @Override // X.S2H
    public final TuxTextView LIZ() {
        return this.LIZIZ;
    }

    @Override // X.S2H
    public final C26773Af3 LIZIZ() {
        return this.LIZ;
    }

    @Override // X.S2H
    public final void LIZJ(S2C s2c, S2E s2e) {
        int paddingEnd;
        this.LIZIZ = (TuxTextView) s2c.findViewById(R.id.dit);
        s2c.findViewById(R.id.di9);
        this.LIZ = (C26773Af3) s2c.findViewById(R.id.ckc);
        ViewGroup.LayoutParams layoutParams = s2c.getLayoutParams();
        layoutParams.height = s2e.getHeight();
        s2c.setLayoutParams(layoutParams);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        c110614Vt.LIZIZ = Integer.valueOf(s2e.getBgColor());
        c110614Vt.LJFF = Integer.valueOf(s2e.LIZIZ());
        c110614Vt.LIZLLL = Integer.valueOf(s2e.LJFF());
        Context context = s2c.getContext();
        o.LJIIIIZZ(context, "context");
        s2c.setBackground(c110614Vt.LIZ(context));
        if (s2e.LJIIJJI() == L3Y.FlashSaleViewWithCountDown) {
            paddingEnd = 0;
        } else {
            paddingEnd = s2e.getPaddingEnd();
        }
        C26338AVi.LJIIIZ(s2c, Integer.valueOf(s2e.LJII()), null, Integer.valueOf(paddingEnd), null, 26);
        TuxTextView tuxTextView = this.LIZIZ;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(s2e.LIZ());
            tuxTextView.setTuxFont(s2e.getTextFont());
        }
        C26773Af3 c26773Af3 = this.LIZ;
        if (c26773Af3 != null) {
            Integer LJIIJ = s2e.LJIIJ();
            if (LJIIJ != null) {
                c26773Af3.getLayoutParams().width = LJIIJ.intValue();
            }
            c26773Af3.setTextColorRes(s2e.LIZ());
            c26773Af3.setTuxFont(s2e.getTextFont());
        }
    }
}
