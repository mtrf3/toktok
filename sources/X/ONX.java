package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONX extends RecyclerView.ViewHolder {
    public final ConstraintLayout LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final TuxIconView LJLJJI;

    public ONX(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.etn);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_container)");
        this.LJLIL = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.mc_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_normal_choice)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ec4);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.icon_notice)");
        this.LJLJI = (TuxIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.icon_tag)");
        this.LJLJJI = (TuxIconView) findViewById4;
    }
}
