package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AiS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26984AiS extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final TuxTextView LJLJI;

    public C26984AiS(View view) {
        super(view);
        o.LJIIIIZZ(view.findViewById(R.id.mwr), "view.findViewById(R.id.u…r_summary_item_container)");
        View findViewById = view.findViewById(R.id.hd7);
        ((TuxTextView) findViewById).setTuxFont(51);
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxTex…P1_REGULAR)\n            }");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.hd5);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.order_summary_item_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.hd6);
        ((TuxTextView) findViewById3).setTuxFont(51);
        o.LJIIIIZZ(findViewById3, "view.findViewById<TuxTex…P1_REGULAR)\n            }");
        this.LJLJI = (TuxTextView) findViewById3;
    }
}
