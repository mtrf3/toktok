package X;

import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sr4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73382Sr4 extends RecyclerView.ViewHolder {
    public final C85193Vz LJLIL;
    public AqS194S0100000_12 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final C119624mk LJLJJL;
    public final C63044Ooi LJLJJLL;
    public final C62822Ol8 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73382Sr4(C85193Vz viewModel, View view) {
        super(view);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        View findViewById = view.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name_tv)");
        this.LJLJI = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.c9f);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.detail_tv)");
        this.LJLJJI = (TextView) findViewById2;
        o.LJIIIIZZ(view.findViewById(R.id.n38), "itemView.findViewById(R.id.verify_iv)");
        View findViewById3 = view.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLJJL = (C119624mk) findViewById3;
        View findViewById4 = view.findViewById(R.id.b_o);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.checkbox)");
        C63044Ooi c63044Ooi = (C63044Ooi) findViewById4;
        this.LJLJJLL = c63044Ooi;
        this.LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(view, 23));
        view.setBackground(C89953fz.LIZ(view.getContext()));
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 12), view);
        C16880lQ.LJJJJ(c63044Ooi, new ACListenerS32S0100000_12(this, 13));
    }
}
