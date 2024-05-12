package X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gyd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43275Gyd extends RecyclerView.ViewHolder {
    public final RelativeLayout LJLIL;
    public final TuxTextView LJLILLLLZI;

    public C43275Gyd(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.hml);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.personalized_ad_settings)");
        this.LJLIL = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.hmm);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.p…nalized_ad_settings_text)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
    }
}
