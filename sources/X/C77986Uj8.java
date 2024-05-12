package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uj8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77986Uj8 extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;

    public C77986Uj8(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.m68);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…tv_empty_rank_list_title)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.m67);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…empty_rank_list_subtitle)");
        this.LJLILLLLZI = (TextView) findViewById2;
    }
}
