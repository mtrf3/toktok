package X;

import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZE extends JNU {
    public SearchLiveStruct LJLJL;
    public Aweme LJLJLJ;
    public final SmartImageView LJLJLLL;
    public final SmartImageView LJLL;
    public final TextView LJLLI;
    public final TextView LJLLILLLL;
    public final View LJLLJ;
    public JZF LJLLL;

    @Override // X.JNU
    public final View getView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    public JZE(View view) {
        super(view);
        this.LJLJLLL = (SmartImageView) view.findViewById(R.id.fvr);
        view.findViewById(R.id.fvs);
        this.LJLL = (SmartImageView) view.findViewById(R.id.fx5);
        this.LJLLI = (TextView) view.findViewById(R.id.fzu);
        this.LJLLILLLL = (TextView) view.findViewById(R.id.fxh);
        view.findViewById(R.id.fzp);
        this.LJLLJ = view.findViewById(R.id.ff5);
        view.findViewById(R.id.bur);
        view.findViewById(R.id.gw3);
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 101), view);
    }

    public final void P(View view) {
        view.setOutlineProvider(new C43251GyF((int) V2B.LJI(getContext(), 2.0f)));
        view.setClipToOutline(true);
    }
}
