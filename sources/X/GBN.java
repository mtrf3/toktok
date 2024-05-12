package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GBN extends RecyclerView.ViewHolder {
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final TuxTextView LJLILLLLZI;

    public GBN(View view, AqS173S0100000_7 aqS173S0100000_7) {
        super(view);
        this.LJLIL = aqS173S0100000_7;
        View findViewById = view.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
    }
}
