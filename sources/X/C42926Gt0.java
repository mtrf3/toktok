package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gt0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42926Gt0 extends RecyclerView.ViewHolder {
    public final LifecycleOwner LJLIL;
    public final C62846OlW LJLILLLLZI;
    public final TextView LJLJI;
    public final ConstraintLayout LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;
    public final View LJLJLJ;
    public final View LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42926Gt0(View view, LifecycleOwner lifecycleOwner) {
        super(view);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        View findViewById = this.itemView.findViewById(R.id.exn);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_anchor)");
        this.LJLILLLLZI = (C62846OlW) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.lzl);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_anchor)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.a2h);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.anchor_item_container)");
        this.LJLJJI = (ConstraintLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.mlu);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_subtitle)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ait);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.beta_anchor)");
        this.LJLJJLL = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.esv);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.is_new_anchor)");
        this.LJLJL = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.frt);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.line)");
        this.LJLJLJ = findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.a2q);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.anchor_item_mask)");
        this.LJLJLLL = findViewById8;
    }
}
