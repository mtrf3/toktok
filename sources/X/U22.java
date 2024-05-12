package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U22 extends RecyclerView.ViewHolder {
    public final C47061t0 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C76217Tvh LJLJI;
    public final ConstraintLayout LJLJJI;
    public final /* synthetic */ C76534U1y LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U22(C76534U1y c76534U1y, View view) {
        super(view);
        this.LJLJJL = c76534U1y;
        View findViewById = view.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.avatar_iv)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.cc4);
        o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.display_name_tv)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.b2q);
        o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.bv_best_teammate)");
        this.LJLJI = (C76217Tvh) findViewById3;
        View findViewById4 = view.findViewById(R.id.mz2);
        o.LJIIIIZZ(findViewById4, "container.findViewById(R.id.user_info_layout)");
        this.LJLJJI = (ConstraintLayout) findViewById4;
    }
}
