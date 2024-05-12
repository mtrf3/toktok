package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASD extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final View LJLJI;

    public ASD(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.jjr);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…condary_reason_container)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.ipg);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.reason_single_choice)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        o.LJIIIIZZ(view.findViewById(R.id.ay9), "itemView.findViewById(R.id.btn_radio)");
        View findViewById3 = view.findViewById(R.id.as2);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.boundary)");
        this.LJLJI = findViewById3;
    }
}
