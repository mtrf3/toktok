package X;

import Y.ACListenerS27S0100000_7;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GNv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41431GNv extends AbstractC41429GNt<C41426GNq> {
    public final GOK LJLIL;
    public final C223338pd LJLILLLLZI;
    public final TextView LJLJI;
    public final RelativeLayout LJLJJI;

    @Override // X.AbstractC41429GNt
    public final void L(C41426GNq baseDetails) {
        o.LJIIIZ(baseDetails, "baseDetails");
        int i = ((GN7) baseDetails).LJ;
        if (i != 0) {
            if (i == 1) {
                this.LJLILLLLZI.setVisibility(8);
                this.LJLILLLLZI.LIZJ();
                this.LJLJI.setVisibility(0);
            }
        } else {
            this.LJLJI.setVisibility(8);
            this.LJLILLLLZI.setVisibility(0);
            this.LJLILLLLZI.LIZIZ();
        }
        C16880lQ.LJIJ(this.LJLJJI, new ACListenerS27S0100000_7(this, 175));
    }

    public C41431GNv(View view, GOK gok) {
        super(view);
        this.LJLIL = gok;
        View findViewById = view.findViewById(R.id.kfj);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…status_view_loading_more)");
        this.LJLILLLLZI = (C223338pd) findViewById;
        View findViewById2 = view.findViewById(R.id.map);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_loading_error)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.j50);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.rl_loading_status)");
        this.LJLJJI = (RelativeLayout) findViewById3;
    }
}
