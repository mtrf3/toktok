package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHI extends RecyclerView.ViewHolder {
    public final C2A8 LJLIL;
    public final C2A8 LJLILLLLZI;
    public final C41081jM LJLJI;
    public final C41061jK LJLJJI;

    public UHI(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.bws);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.country_index)");
        this.LJLIL = (C2A8) findViewById;
        View findViewById2 = view.findViewById(R.id.bwv);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.country_name)");
        this.LJLILLLLZI = (C2A8) findViewById2;
        View findViewById3 = view.findViewById(R.id.bww);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.country_radio_selected)");
        C41061jK c41061jK = (C41061jK) findViewById3;
        this.LJLJJI = c41061jK;
        View findViewById4 = view.findViewById(R.id.bwm);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.country_arrow_selected)");
        this.LJLJI = (C41081jM) findViewById4;
        c41061jK.setClickable(false);
        C2H3 c2h3 = c41061jK.LJLJLJ;
        if (c2h3 != null) {
            c2h3.LLLLZLLIL(R.style.a3q);
        }
        c41061jK.LJLJLLL.LLLLZLLIL(R.style.a3q);
    }
}
