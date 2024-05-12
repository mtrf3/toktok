package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ON7 extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final C63044Ooi LJLILLLLZI;

    public ON7(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mkd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_single_choice)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ay9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.btn_radio)");
        this.LJLILLLLZI = (C63044Ooi) findViewById2;
    }
}
