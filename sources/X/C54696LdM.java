package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54696LdM extends AbstractC54684LdA {
    public final View LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxIconView LJLJJLL;

    public C54696LdM(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJJI = findViewById;
        View findViewById2 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.LJLJJL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f0b);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_circle_widget)");
        this.LJLJJLL = (TuxIconView) findViewById3;
    }
}
