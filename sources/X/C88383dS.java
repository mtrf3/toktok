package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88383dS extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final /* synthetic */ C88393dT LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88383dS(C88393dT c88393dT, TuxTextView tuxTextView) {
        super(tuxTextView);
        this.LJLILLLLZI = c88393dT;
        this.LJLIL = tuxTextView;
        C16880lQ.LJIJI(tuxTextView, new ACListenerS21S0100000_1(this, 29));
    }

    public final void L(String str, boolean z) {
        this.LJLIL.setText(str);
        int LIZJ = (int) KL2.LIZJ(EF7.LIZIZ(), 5.5f);
        int LIZJ2 = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
        if (this.LJLILLLLZI.LJ && getAdapterPosition() == 0) {
            this.LJLIL.setBackground(new ColorDrawable(0));
            TextView textView = this.LJLIL;
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "item.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
            this.LJLIL.setPadding(0, LIZJ, 0, LIZJ);
            return;
        }
        this.LJLIL.setSelected(z);
        TextView textView2 = this.LJLIL;
        textView2.setBackground(C04270Et.LIZIZ(textView2.getContext(), R.drawable.wa));
        TextView textView3 = this.LJLIL;
        Context context2 = textView3.getContext();
        o.LJIIIIZZ(context2, "item.context");
        textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
        this.LJLIL.setPadding(LIZJ2, LIZJ, LIZJ2, LIZJ);
    }
}
