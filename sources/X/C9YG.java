package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9YG, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YG extends RecyclerView.ViewHolder {
    public final TuxIconView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final SY4 LJLJJL;
    public final ConstraintLayout LJLJJLL;

    public C9YG(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.e1i);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.guide_user_card_image)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.e1l);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.guide_user_edited_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.e1j);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.guide_user_card_title)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.e1h);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.guide_user_card_doc)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.e1g);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.guide_user_card_button)");
        this.LJLJJL = (SY4) findViewById5;
        View findViewById6 = view.findViewById(R.id.e1f);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.guide_user_card)");
        this.LJLJJLL = (ConstraintLayout) findViewById6;
    }
}
