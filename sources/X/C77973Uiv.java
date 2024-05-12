package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uiv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77973Uiv extends RecyclerView.ViewHolder {
    public final C41081jM LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public CountDownTimerC77998UjK LJLJJLL;

    public C77973Uiv(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f9i);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…rank_league_locked_stage)");
        this.LJLIL = (C41081jM) findViewById;
        View findViewById2 = view.findViewById(R.id.mgb);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…eague_locked_stage_title)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mga);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…ue_locked_stage_subtitle)");
        this.LJLJI = (TextView) findViewById3;
    }
}
