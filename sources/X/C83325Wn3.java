package X;

import Y.ACListenerS34S0100000_14;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wn3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83325Wn3 extends AbstractC83322Wn0 {
    public final View LJLIL;
    public final InterfaceC83334WnC LJLILLLLZI;
    public final TuxTextView LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83325Wn3(View view, InterfaceC83334WnC onItemClickListener) {
        super(view);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = view;
        this.LJLILLLLZI = onItemClickListener;
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 111), view);
        this.LJLJI = (TuxTextView) view.findViewById(R.id.mbf);
        this.LJLJJI = -1;
    }

    @Override // X.AbstractC83322Wn0
    public final void L(AbstractC83320Wmy option, boolean z, boolean z2, int i) {
        Drawable LIZ;
        o.LJIIIZ(option, "option");
        if (!(option instanceof C83326Wn4)) {
            return;
        }
        this.LJLJJI = i;
        this.LJLJI.setText(((C83326Wn4) option).LIZ);
        TuxTextView tuxTextView = this.LJLJI;
        if (z) {
            LIZ = C20110qd.LIZ(this.LJLIL.getContext(), R.drawable.a0i);
        } else {
            LIZ = C20110qd.LIZ(this.LJLIL.getContext(), R.drawable.a0h);
        }
        tuxTextView.setBackground(LIZ);
    }
}
