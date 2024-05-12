package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BMI extends RecyclerView.ViewHolder {
    public final C47061t0 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;

    public BMI(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.fvr);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.live_cover)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.d7u);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.feed_live_title)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.a9q);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.audience_count)");
        this.LJLJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.gex);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.mask_top)");
        this.LJLJJI = findViewById4;
        View findViewById5 = view.findViewById(R.id.gel);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.mask_bottom)");
        this.LJLJJL = findViewById5;
    }
}
