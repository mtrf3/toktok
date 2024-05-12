package X;

import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class S2F implements S2H {
    public C26773Af3 LIZ;
    public TuxTextView LIZIZ;

    @Override // X.S2H
    public final int getLayoutId() {
        return R.layout.anz;
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
        this.LIZIZ = (TuxTextView) s2c.findViewById(R.id.dit);
        this.LIZ = (C26773Af3) s2c.findViewById(R.id.ckc);
        ViewGroup.LayoutParams layoutParams = s2c.getLayoutParams();
        layoutParams.height = s2e.getHeight();
        s2c.setLayoutParams(layoutParams);
        TuxTextView tuxTextView = this.LIZIZ;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(s2e.LIZ());
            tuxTextView.setTuxFont(s2e.getTextFont());
        }
        C26773Af3 c26773Af3 = this.LIZ;
        if (c26773Af3 != null) {
            c26773Af3.setTextColorRes(s2e.LIZ());
            c26773Af3.setTuxFont(s2e.getTextFont());
        }
    }
}
