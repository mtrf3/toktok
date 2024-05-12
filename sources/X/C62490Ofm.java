package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62490Ofm extends RecyclerView.ViewHolder {
    public final TuxIconView LJLIL;
    public final TextView LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;

    public C62490Ofm(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.jsk);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.share_action_icon)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.jsn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.share_action_label)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ob);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.action_item)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.as2);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.boundary)");
        this.LJLJJI = findViewById4;
        View findViewById5 = view.findViewById(R.id.gm_);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.more_container)");
        this.LJLJJL = findViewById5;
        C78897Uxp.LJJJJJL(view, 0.0f);
    }
}
