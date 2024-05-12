package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2D implements S2H {
    public TuxIconView LIZ;
    public C26773Af3 LIZIZ;
    public TuxTextView LIZJ;

    @Override // X.S2H
    public final int getLayoutId() {
        return R.layout.ao0;
    }

    @Override // X.S2H
    public final TuxTextView LIZ() {
        return this.LIZJ;
    }

    @Override // X.S2H
    public final C26773Af3 LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.S2H
    public final void LIZJ(S2C s2c, S2E s2e) {
        Drawable LIZIZ;
        this.LIZJ = (TuxTextView) s2c.findViewById(R.id.dit);
        this.LIZ = (TuxIconView) s2c.findViewById(R.id.di9);
        this.LIZIZ = (C26773Af3) s2c.findViewById(R.id.ckc);
        Context context = s2c.getContext();
        o.LJIIIIZZ(context, "parent.context");
        if (C26338AVi.LIZJ(context)) {
            LIZIZ = C04270Et.LIZIZ(context, R.drawable.aoo);
        } else {
            LIZIZ = C04270Et.LIZIZ(context, R.drawable.aon);
        }
        TuxIconView tuxIconView = this.LIZ;
        if (tuxIconView != null) {
            tuxIconView.setImageDrawable(LIZIZ);
        }
        TuxTextView tuxTextView = this.LIZJ;
        if (tuxTextView == null) {
            return;
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJIIIIZZ = C61328O5c.LIZJ(4);
        c110614Vt.LJIIJ = C61328O5c.LIZJ(4);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.j9);
        tuxTextView.setBackground(c110614Vt.LIZ(context));
    }
}
