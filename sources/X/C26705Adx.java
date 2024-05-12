package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Adx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26705Adx extends RecyclerView.ViewHolder {
    public final ConstraintLayout LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final ConstraintLayout LJLJI;
    public final TuxTextView LJLJJI;
    public final C119774mz LJLJJL;

    public C26705Adx(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mxe);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.u…ser_trust_item_container)");
        this.LJLIL = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.mxf);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.u…mit_user_trust_item_text)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mxc);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.u…user_trust_images_layout)");
        this.LJLJI = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.mxd);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.u…_user_trust_images_title)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.mxb);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.u…submit_user_trust_images)");
        this.LJLJJL = (C119774mz) findViewById5;
    }
}
