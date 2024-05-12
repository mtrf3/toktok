package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gyb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43273Gyb extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final SY4 LJLJI;
    public final View LJLJJI;

    public C43273Gyb(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.yg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.a…rtiser_switch_item_title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.yd);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.advertiser_switch_item)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ye);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.a…tiser_switch_item_button)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = view.findViewById(R.id.yh);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.a…rtiser_switch_split_line)");
        this.LJLJJI = findViewById4;
    }
}
