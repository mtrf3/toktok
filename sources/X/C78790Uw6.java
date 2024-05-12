package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uw6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78790Uw6 extends RecyclerView.ViewHolder {
    public final W5G LJLIL;
    public final TDV LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final FrameLayout LJLJJI;

    public C78790Uw6(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.hbz);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.option_candidate_image)");
        this.LJLIL = (W5G) findViewById;
        View findViewById2 = view.findViewById(R.id.iac);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.progress_bar)");
        this.LJLILLLLZI = (TDV) findViewById2;
        View findViewById3 = view.findViewById(R.id.hby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…tion_candidate_container)");
        this.LJLJI = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.hbx);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.option_candidate_bg)");
        this.LJLJJI = (FrameLayout) findViewById4;
    }
}
