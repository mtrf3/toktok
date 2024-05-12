package X;

import Y.ACListenerS39S0300000_14;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFV extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final TextView LJLJI;
    public final TuxIconView LJLJJI;

    public WFV(WFT wft, View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f51);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_icon)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f_u);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_selected)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.m8o);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_icon_desc)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f_u);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_selected)");
        this.LJLJJI = (TuxIconView) findViewById4;
        C16880lQ.LJIIJ(new ACListenerS39S0300000_14(this, wft, view, 0), view);
    }
}
