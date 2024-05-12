package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ONn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61807ONn extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final C63044Ooi LJLILLLLZI;
    public final C63044Ooi LJLJI;

    public C61807ONn(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mkd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_single_choice)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ay9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.btn_radio)");
        this.LJLILLLLZI = (C63044Ooi) findViewById2;
        View findViewById3 = view.findViewById(R.id.ca7);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.disable_radio)");
        this.LJLJI = (C63044Ooi) findViewById3;
    }
}
