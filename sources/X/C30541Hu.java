package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30541Hu extends RecyclerView.ViewHolder {
    public final C47061t0 LJLIL;
    public final C05980Li LJLILLLLZI;
    public final View LJLJI;
    public final C74282TDi LJLJJI;
    public final View LJLJJL;
    public final View LJLJJLL;

    public C30541Hu(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.egd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.image)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.k9k);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.special_image)");
        this.LJLILLLLZI = (C05980Li) findViewById2;
        View findViewById3 = view.findViewById(R.id.jl2);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.select_border)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.cf5);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.dot)");
        this.LJLJJL = findViewById4;
        View findViewById5 = view.findViewById(R.id.g7r);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.loading)");
        C74282TDi c74282TDi = (C74282TDi) findViewById5;
        this.LJLJJI = c74282TDi;
        c74282TDi.setCircleRadius(C15380j0.LIZ(14.0f));
        c74282TDi.setStrokeWidth(C15380j0.LIZ(4.0f));
        c74282TDi.setMaxProgress(100);
        View findViewById6 = view.findViewById(R.id.am7);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.block_cover)");
        this.LJLJJLL = findViewById6;
        if (U4D.LIZ()) {
            findViewById3.setBackgroundResource(R.drawable.cr5);
        }
    }
}
