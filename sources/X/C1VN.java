package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1VN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VN extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final TextView LJLJJI;
    public final View LJLJJL;
    public final ImageView LJLJJLL;

    public C1VN(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.anr);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.border)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.ezb);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_bg)");
        this.LJLJI = (C47061t0) findViewById2;
        View findViewById3 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_name)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f6h);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_loading)");
        this.LJLIL = findViewById4;
        View findViewById5 = view.findViewById(R.id.eu0);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.item_filter_dot)");
        this.LJLJJL = findViewById5;
        View findViewById6 = view.findViewById(R.id.f7r);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_no_select)");
        this.LJLJJLL = (ImageView) findViewById6;
    }
}
