package X;

import Y.ACListenerS25S0101000_7;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XXL extends XYS {
    public static final /* synthetic */ int LJLLL = 0;
    public final TextView LJLILLLLZI;
    public final ViewPager LJLJI;
    public final View LJLJJI;
    public G88 LJLJJL;
    public C0C3 LJLJJLL;
    public InterfaceC85019XYh<XYN> LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final XXI LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public boolean LJLLJ;

    public XXL(View view, int i) {
        super(view);
        this.LJLJLJ = -1;
        TextView textView = (TextView) view.findViewById(R.id.moa);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.mo9);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.nel);
        this.LJLJI = viewPager;
        this.LJLJJI = view.findViewById(R.id.cd4);
        this.LJLLI = (int) KL2.LIZJ(EF7.LIZIZ(), 84.0f);
        XXI xxi = new XXI(this);
        this.LJLL = xxi;
        viewPager.setAdapter(xxi);
        this.LJLLILLLL = i;
        C16880lQ.LJIJI(textView, new ACListenerS25S0101000_7(2, this, 0));
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(62);
        }
    }
}
