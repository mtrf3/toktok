package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A5C extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final FrameLayout LJLJJL;
    public final FrameLayout LJLJJLL;
    public final SY4 LJLJL;
    public final TuxTextView LJLJLJ;
    public final TuxTextView LJLJLLL;
    public final TuxTextView LJLL;
    public final LinearLayout LJLLI;
    public final /* synthetic */ A5D LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5C(A5D a5d, View view) {
        super(view);
        this.LJLLILLLL = a5d;
        View findViewById = view.findViewById(R.id.fux);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.live_added_series_image)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.fv1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.live_added_series_title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fv0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.live_added_series_price)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.fuy);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.live_added_series_length)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ecc);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.icon_remove_container)");
        this.LJLJJL = (FrameLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.ect);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.icon_top_container)");
        this.LJLJJLL = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.hpl);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.pin_button)");
        this.LJLJL = (SY4) findViewById7;
        View findViewById8 = view.findViewById(R.id.jpc);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.series_list_count_number)");
        this.LJLJLJ = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.fuz);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.l…ed_series_original_price)");
        this.LJLJLLL = (TuxTextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.fym);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.l…_series_item_voucher_tag)");
        this.LJLL = (TuxTextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.led);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.top_choice_label)");
        this.LJLLI = (LinearLayout) findViewById11;
    }
}
