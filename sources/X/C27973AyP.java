package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.AyP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27973AyP extends RecyclerView.ViewHolder {
    public final ConstraintLayout LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final SG3 LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final C119774mz LJLJLJ;
    public final View LJLJLLL;
    public final LinearLayout LJLL;
    public final LinkedList<C2RX> LJLLI;
    public final LinkedList<C27955Ay7> LJLLILLLL;

    public C27973AyP(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mwh);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.u…u_product_info_container)");
        this.LJLIL = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.mwg);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.u…in_order_sku_product_img)");
        this.LJLILLLLZI = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mwj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.u…_order_sku_product_title)");
        this.LJLJI = (SG3) findViewById3;
        View findViewById4 = view.findViewById(R.id.mwk);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.u…mit_main_order_sku_props)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.mwf);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.u…_order_sku_primary_price)");
        this.LJLJJL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.mwe);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.u…order_sku_original_price)");
        this.LJLJJLL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.mwd);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.u…ubmit_main_order_sku_num)");
        this.LJLJL = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.mwc);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.u…mit_main_order_sku_logos)");
        this.LJLJLJ = (C119774mz) findViewById8;
        View findViewById9 = view.findViewById(R.id.mwa);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.u…order_sku_free_gift_line)");
        this.LJLJLLL = findViewById9;
        View findViewById10 = view.findViewById(R.id.mw_);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.u…der_sku_free_gift_layout)");
        this.LJLL = (LinearLayout) findViewById10;
        this.LJLLI = new LinkedList<>();
        this.LJLLILLLL = new LinkedList<>();
    }
}
