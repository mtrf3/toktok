package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class A14 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public boolean LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final SmartImageView LJLJJLL;
    public final TuxIconView LJLJL;
    public final TuxIconView LJLJLJ;
    public final TuxIconView LJLJLLL;
    public final TuxIconView LJLL;
    public final TuxTextView LJLLI;
    public final FrameLayout LJLLILLLL;
    public final /* synthetic */ A13 LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A14(A13 a13, View view) {
        super(view);
        this.LJLLJ = a13;
        this.LJLIL = view;
        this.LJLJI = (TuxTextView) view.findViewById(R.id.gdj);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.gdn);
        this.LJLJJL = (TuxTextView) view.findViewById(R.id.gdk);
        this.LJLJJLL = (SmartImageView) view.findViewById(R.id.gdl);
        this.LJLJL = (TuxIconView) view.findViewById(R.id.gdp);
        this.LJLJLJ = (TuxIconView) view.findViewById(R.id.gd4);
        this.LJLJLLL = (TuxIconView) view.findViewById(R.id.gdu);
        this.LJLL = (TuxIconView) view.findViewById(R.id.ge0);
        this.LJLLI = (TuxTextView) view.findViewById(R.id.gdd);
        this.LJLLILLLL = (FrameLayout) view.findViewById(R.id.gdo);
    }
}
