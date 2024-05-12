package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AsT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27605AsT extends RecyclerView.ViewHolder {
    public final Fragment LJLIL;
    public final C73062Slu LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final IQ5 LJLJJI;
    public final C62822Ol8 LJLJJL;

    public final void L(String str) {
        if (str.length() == 0) {
            this.LJLJI.setVisibility(8);
            return;
        }
        if (this.LJLJI.getVisibility() != 0) {
            this.LJLJI.setVisibility(0);
        }
        this.LJLJI.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27605AsT(ViewGroup parent, Fragment fragment) {
        super(C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.ag4, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        View findViewById = this.itemView.findViewById(R.id.hn2);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…hl_feed_cell_player_view)");
        C73062Slu c73062Slu = (C73062Slu) findViewById;
        this.LJLILLLLZI = c73062Slu;
        View findViewById2 = this.itemView.findViewById(R.id.hn3);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.phl_feed_cell_subtitle)");
        this.LJLJI = (TuxTextView) findViewById2;
        this.LJLJJL = C221108m2.LIZIZ(C27608AsW.LJLIL);
        ((ImageView) c73062Slu.findViewById(R.id.dp9)).setVisibility(8);
        ((ImageView) c73062Slu.findViewById(R.id.hs3)).setVisibility(8);
        if (C27610AsY.LIZ == null) {
            C27610AsY.LIZ = new IWF();
        }
        IWF iwf = C27610AsY.LIZ;
        o.LJI(iwf);
        this.LJLJJI = new IQ5(this, c73062Slu, iwf);
        this.itemView.setTag(this);
    }
}
