package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gyc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43274Gyc extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final View LJLJJI;

    public C43274Gyc(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.rf);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ad_explain_title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.rc);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ad_explain_text)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.rd);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.ad_explain_text_small_ltr)");
        this.LJLJI = (TuxIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.r9);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ad_explain_line)");
        this.LJLJJI = findViewById4;
    }
}
