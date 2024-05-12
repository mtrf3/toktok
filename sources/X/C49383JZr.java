package X;

import Y.ACListenerS43S0200000_8;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;

/* renamed from: X.JZr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49383JZr extends JNU {
    public static final /* synthetic */ int LJLZ = 0;
    public final TextView LJLJL;
    public final TextView LJLJLJ;
    public Challenge LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public Boolean LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public final int LJLLLL;
    public C49448Jau LJLLLLLL;

    @Override // X.JNU
    public final View getView() {
        return this.itemView;
    }

    public C49383JZr(View view) {
        super(view);
        this.LJLLILLLL = Boolean.FALSE;
        this.LJLLJ = "";
        this.LJLLL = "";
        this.LJLLLL = -1;
        this.LJLLLLLL = null;
        this.LJLJL = (TextView) view.findViewById(R.id.m1x);
        this.LJLJLJ = (TextView) view.findViewById(R.id.mdb);
        view.findViewById(R.id.jek);
        C16880lQ.LJIIJ(new ACListenerS43S0200000_8(view, this, 15), view);
    }
}
