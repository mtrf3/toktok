package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MEp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56479MEp extends RecyclerView.ViewHolder {
    public final RecyclerView LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final TextView LJLJJI;
    public final TuxTextView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56479MEp(ActivityC45651qj activity, View view) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI = activity;
        View findViewById = view.findViewById(R.id.bqm);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.complete_you_profile)");
        this.LJLJJL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.eu3);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.item_guide_user_card)");
        this.LJLJI = (FrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.b5o);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.card_list)");
        this.LJLIL = (RecyclerView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bql);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.complete)");
        this.LJLJJI = (TextView) findViewById4;
        C255199zv.LIZJ = true;
    }
}
