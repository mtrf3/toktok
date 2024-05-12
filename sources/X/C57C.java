package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.57C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57C extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final C5CJ LJLILLLLZI;
    public final View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57C(View view, C53W callback) {
        super(view);
        float f;
        o.LJIIIZ(callback, "callback");
        View findViewById = view.findViewById(R.id.mrl);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.txt)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.eiq);
        C5CJ c5cj = (C5CJ) findViewById2;
        if (C58B.LIZ()) {
            f = 6.0f;
        } else {
            f = 2.0f;
        }
        c5cj.setCornerRadius(C134855Qz.LIZ(f));
        o.LJIIIIZZ(findViewById2, "itemView.findViewById<Ro…\n            )\n\n        }");
        this.LJLILLLLZI = (C5CJ) findViewById2;
        View findViewById3 = view.findViewById(R.id.n_c);
        if (C58B.LIZ()) {
            findViewById3.setBackgroundResource(R.drawable.ar0);
        }
        o.LJIIIIZZ(findViewById3, "itemView.findViewById<Vi…)\n            }\n        }");
        this.LJLJI = findViewById3;
    }
}
