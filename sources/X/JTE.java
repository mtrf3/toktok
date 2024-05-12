package X;

import Y.ACListenerS28S0100000_8;
import Y.ACListenerS32S0101000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public abstract class JTE<T> {
    public final Context LJLIL;
    public final View LJLILLLLZI;
    public TextView LJLJI;
    public ViewGroup LJLJJI;
    public LinearLayout LJLJJL;
    public JQA LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public final JTF LJLJLLL;

    public final void LIZ(boolean z) {
        if (z) {
            View view = this.LJLJL;
            if (view != null) {
                C16880lQ.LJIIJ(new ACListenerS32S0101000_15(1, this, 12), view);
            }
            this.LJLJJI.setVisibility(0);
            return;
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C16880lQ.LJIIJ(null, view2);
        }
        this.LJLJJI.setVisibility(8);
    }

    public JTE(View view, Context context) {
        C79156V4u c79156V4u = C79156V4u.LJLJJL;
        this.LJLILLLLZI = view;
        this.LJLIL = context;
        this.LJLJLLL = c79156V4u;
        this.LJLJI = (TextView) view.findViewById(R.id.jgm);
        this.LJLJJL = (LinearLayout) view.findViewById(R.id.jgk);
        this.LJLJJI = (ViewGroup) view.findViewById(R.id.jgo);
        C49098JOs.LIZ.getClass();
        int LJFF = C49098JOs.LJFF();
        if (LJFF > 0) {
            double d = LJFF;
            C54840Lfg.LJLIIL(C74275TDb.LIZJ(d, context), this.LJLJI);
            V1B.LJLJLJ(C74275TDb.LIZJ(d, context), this.LJLJJI);
        }
        C16880lQ.LJIIL(this.LJLJJI, new ACListenerS28S0100000_8(this, 35));
        this.LJLJL = view.findViewById(R.id.gkf);
        this.LJLJLJ = view.findViewById(R.id.e3c);
        C78897Uxp.LJJJJLI(this.LJLJJI, null);
    }
}
