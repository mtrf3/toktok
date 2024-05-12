package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Lv7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55797Lv7 extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLLI = 0;
    public final InterfaceC55798Lv8 LJLIL;
    public final View LJLILLLLZI;
    public final C62846OlW LJLJI;
    public final FrameLayout LJLJJI;
    public final LinearLayout LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final TuxTextView LJLJLJ;
    public final TuxTextView LJLJLLL;
    public final LinearLayout LJLL;

    public C55797Lv7(View view, InterfaceC55798Lv8 interfaceC55798Lv8) {
        super(view);
        this.LJLIL = interfaceC55798Lv8;
        View findViewById = view.findViewById(R.id.fki);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…layout_product_item_root)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.f93);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_product_icon)");
        this.LJLJI = (C62846OlW) findViewById2;
        View findViewById3 = view.findViewById(R.id.fkl);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.layout_radius)");
        this.LJLJJI = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.fnz);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.laytout_product_item)");
        this.LJLJJL = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.mez);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_product_description)");
        this.LJLJJLL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.mf4);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.….tv_product_price_prefix)");
        this.LJLJL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.mf3);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.….tv_product_price_number)");
        this.LJLJLJ = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.mf5);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.….tv_product_price_suffix)");
        this.LJLJLLL = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.fo0);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.laytout_product_more)");
        this.LJLL = (LinearLayout) findViewById9;
    }
}
