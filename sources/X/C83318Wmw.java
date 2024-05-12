package X;

import Y.ACListenerS34S0100000_14;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83318Wmw extends AbstractC83322Wn0 {
    public final InterfaceC83334WnC LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxIconView LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83318Wmw(View view, InterfaceC83334WnC onItemClickListener) {
        super(view);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = onItemClickListener;
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 108), view);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(view, 430));
        this.LJLJI = (TuxTextView) view.findViewById(R.id.hcc);
        this.LJLJJI = (TuxIconView) view.findViewById(R.id.e9q);
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 429));
        this.LJLJJLL = -1;
    }

    @Override // X.AbstractC83322Wn0
    public final void L(AbstractC83320Wmy option, boolean z, boolean z2, int i) {
        o.LJIIIZ(option, "option");
        if (!(option instanceof C83319Wmx)) {
            return;
        }
        this.LJLJJLL = i;
        C83319Wmx c83319Wmx = (C83319Wmx) option;
        this.LJLJI.setText(c83319Wmx.LIZ);
        if (this.LJLJI.getPaint().measureText(c83319Wmx.LIZ) > C7MY.LIZIZ(60)) {
            TuxTextView title = this.LJLJI;
            o.LJIIIIZZ(title, "title");
            C26338AVi.LJIIIZ(title, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), 0, 0, 0, 16);
        } else {
            TuxTextView title2 = this.LJLJI;
            o.LJIIIIZZ(title2, "title");
            C26338AVi.LJIIIZ(title2, 0, 0, 0, 0, 16);
        }
        if (c83319Wmx.LIZIZ != null) {
            C78764Uvg.LJIIIZ((W5G) this.itemView.findViewById(R.id.hc5), c83319Wmx.LIZIZ, -1, -1);
        }
        if (z2) {
            this.LJLJJI.setVisibility(0);
            ((ObjectAnimator) this.LJLJJL.getValue()).start();
        } else {
            ((ValueAnimator) this.LJLJJL.getValue()).cancel();
            this.LJLJJI.setVisibility(8);
        }
        if (z) {
            ((View) this.LJLILLLLZI.getValue()).setVisibility(0);
            this.LJLJI.setSelected(false);
            this.LJLJI.setSelected(true);
        } else {
            ((View) this.LJLILLLLZI.getValue()).setVisibility(8);
            this.LJLJI.setSelected(true);
            this.LJLJI.setSelected(false);
        }
    }
}
