package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AyO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27972AyO extends RecyclerView.ViewHolder {
    public final ConstraintLayout LJLIL;
    public final SG3 LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final TextView LJLJJI;
    public final C119774mz LJLJJL;
    public final TextView LJLJJLL;
    public final C71096RvI LJLJL;
    public final TextView LJLJLJ;
    public final TextView LJLJLLL;
    public final C116664hy LJLL;
    public final TuxTextView LJLLI;
    public final SmartImageView LJLLILLLL;

    public C27972AyO(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.container)");
        this.LJLIL = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.i6k);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.product_title)");
        this.LJLILLLLZI = (SG3) findViewById2;
        View findViewById3 = view.findViewById(R.id.i5y);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.product_img)");
        this.LJLJI = (SmartImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.i6i);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.product_spec)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.n0b);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.user_right_layout)");
        this.LJLJJL = (C119774mz) findViewById5;
        View findViewById6 = view.findViewById(R.id.i3w);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.price)");
        this.LJLJJLL = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.bwg);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.counter)");
        this.LJLJL = (C71096RvI) findViewById7;
        View findViewById8 = view.findViewById(R.id.h48);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.notice_text)");
        this.LJLJLJ = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.euj);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.item_nums)");
        this.LJLJLLL = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.jc8);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.scribing_price_view)");
        this.LJLL = (C116664hy) findViewById10;
        o.LJIIIIZZ(view.findViewById(R.id.i42), "view.findViewById(R.id.price_layout)");
        View findViewById11 = view.findViewById(R.id.i6l);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.product_title_logo)");
        this.LJLLI = (TuxTextView) findViewById11;
        View findViewById12 = view.findViewById(R.id.geh);
        o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.mask)");
        this.LJLLILLLL = (SmartImageView) findViewById12;
    }
}
