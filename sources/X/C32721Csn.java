package X;

import Y.AObserverS69S0200000_5;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Csn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32721Csn extends RecyclerView.ViewHolder {
    public final RunnableC31065CHd LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final CVT LJLJI;
    public final C32733Csz LJLJJI;
    public final View LJLJJL;
    public final C32733Csz LJLJJLL;
    public AObserverS69S0200000_5 LJLJL;
    public C32770Cta LJLJLJ;

    public final void L() {
        C29306Beo.LJI(this.LJLJI);
        C29306Beo.LJI(this.LJLILLLLZI);
        C29306Beo.LJI(this.LJLJJI);
        C29306Beo.LJI(this.LJLJJLL);
        C29306Beo.LJI(this.LJLJJL);
    }

    public C32721Csn(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.dua);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…gift_panel_recycler_view)");
        this.LJLIL = (RunnableC31065CHd) findViewById;
        View findViewById2 = view.findViewById(R.id.cvf);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.empty_list)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.du9);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.….gift_panel_loading_view)");
        this.LJLJI = (CVT) findViewById3;
        View findViewById4 = view.findViewById(R.id.du1);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.gift_panel_error_view)");
        this.LJLJJI = (C32733Csz) findViewById4;
        View findViewById5 = view.findViewById(R.id.h22);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.no_match_item)");
        this.LJLJJL = findViewById5;
        View findViewById6 = view.findViewById(R.id.gfc);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.match_item_error_view)");
        this.LJLJJLL = (C32733Csz) findViewById6;
    }
}
