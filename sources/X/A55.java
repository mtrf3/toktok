package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A55 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final SY4 LJLJJLL;
    public final SY4 LJLJL;
    public final TuxTextView LJLJLJ;
    public final TuxTextView LJLJLLL;
    public final FrameLayout LJLL;
    public final TuxTextView LJLLI;
    public final TuxTextView LJLLILLLL;
    public final LinearLayout LJLLJ;
    public final ViewGroup LJLLL;
    public final /* synthetic */ A54 LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A55(A54 a54, View view) {
        super(view);
        this.LJLLLL = a54;
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.fux);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.live_added_series_image)");
        this.LJLILLLLZI = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.fv1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.live_added_series_title)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fv0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.live_added_series_price)");
        this.LJLJJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.fuy);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.live_added_series_length)");
        this.LJLJJL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.nx);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.action_button)");
        this.LJLJJLL = (SY4) findViewById5;
        View findViewById6 = view.findViewById(R.id.bqn);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.c…_action_secondary_button)");
        this.LJLJL = (SY4) findViewById6;
        View findViewById7 = view.findViewById(R.id.bqo);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.completed_action_text)");
        this.LJLJLJ = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.jpc);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.series_list_count_number)");
        this.LJLJLLL = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.jpd);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.s…counter_number_container)");
        this.LJLL = (FrameLayout) findViewById9;
        View findViewById10 = view.findViewById(R.id.fuz);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.l…ed_series_original_price)");
        this.LJLLI = (TuxTextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.fym);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.l…_series_item_voucher_tag)");
        this.LJLLILLLL = (TuxTextView) findViewById11;
        View findViewById12 = view.findViewById(R.id.led);
        o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.top_choice_label)");
        this.LJLLJ = (LinearLayout) findViewById12;
        View findViewById13 = view.findViewById(R.id.of);
        o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.action_list_item_container)");
        this.LJLLL = (ViewGroup) findViewById13;
    }
}
