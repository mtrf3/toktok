package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OP7 extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final InterfaceC65784Pro<Boolean> LJLILLLLZI;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public OP8 LJLJJI;

    public final void L() {
        int i = OP9.LIZ[this.LJLJJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                TuxTextView tuxTextView = this.LJLIL;
                tuxTextView.setSelected(false);
                Context context = tuxTextView.getContext();
                o.LJIIIIZZ(context, "this.context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
                return;
            }
            TuxTextView tuxTextView2 = this.LJLIL;
            tuxTextView2.setSelected(false);
            Context context2 = tuxTextView2.getContext();
            o.LJIIIIZZ(context2, "this.context");
            tuxTextView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
            return;
        }
        TuxTextView tuxTextView3 = this.LJLIL;
        tuxTextView3.setSelected(true);
        Context context3 = tuxTextView3.getContext();
        o.LJIIIIZZ(context3, "this.context");
        tuxTextView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context3));
    }

    public OP7(TuxTextView tuxTextView, AqS160S0100000_10 aqS160S0100000_10, AqS176S0100000_10 aqS176S0100000_10) {
        super(tuxTextView);
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = aqS160S0100000_10;
        this.LJLJI = aqS176S0100000_10;
        this.LJLJJI = OP8.UNSELECTED;
    }
}
