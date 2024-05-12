package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGG extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final View LJLILLLLZI;
    public final View LJLJI;

    public SGG(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.kly);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…tv_center_selection_item)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.klt);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.sts_gap_left)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.klu);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.sts_gap_right)");
        this.LJLJI = findViewById3;
    }
}
