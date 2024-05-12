package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182677Ex extends RecyclerView.ViewHolder {
    public final FrameLayout LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;

    public C182677Ex(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.hmx);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…phl_cell_cover_container)");
        this.LJLIL = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.hmz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.phl_cell_iv_cover)");
        this.LJLILLLLZI = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.hn0);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.phl_cell_title)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.hmy);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.phl_cell_duration)");
        this.LJLJJI = (TextView) findViewById4;
    }
}
