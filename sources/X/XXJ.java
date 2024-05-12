package X;

import Y.ACListenerS25S0101000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XXJ extends XYS {
    public final TextView LJLILLLLZI;
    public final VWE LJLJI;
    public final View LJLJJI;
    public G87 LJLJJL;
    public C0C3 LJLJJLL;
    public C72H<XYM> LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public XVG LJLL;
    public final XXH LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    public XXJ(View view, int i) {
        super(view);
        this.LJLJLJ = -1;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.moa);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.mo9);
        VWE vwe = (VWE) view.findViewById(R.id.nel);
        this.LJLJI = vwe;
        this.LJLJJI = view.findViewById(R.id.cd4);
        this.LJLLILLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 84.0f);
        XXH xxh = new XXH(this);
        this.LJLLI = xxh;
        vwe.setAdapter(xxh);
        this.LJLLJ = i;
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS25S0101000_7(0, this, 0));
        tuxTextView.setTuxFont(62);
    }
}
