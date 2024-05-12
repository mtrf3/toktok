package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XXM extends XYS {
    public final Context LJLILLLLZI;
    public final List<C85022XYk> LJLJI;
    public final LinearLayout LJLJJI;
    public final LinearLayout LJLJJL;
    public final TextView LJLJJLL;
    public final View LJLJL;
    public final int LJLJLJ;
    public final XTE LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    public XXM(View view, int i) {
        super(view);
        this.LJLILLLLZI = view.getContext();
        this.LJLJJI = (LinearLayout) view.findViewById(R.id.g27);
        this.LJLJJL = (LinearLayout) view.findViewById(R.id.g28);
        this.LJLJJLL = (TextView) view.findViewById(R.id.mqu);
        this.LJLJL = view.findViewById(R.id.ngi);
        this.LJLJI = new ArrayList();
        this.LJLJLJ = i;
        float LIZJ = KL2.LIZJ(this.LJLILLLLZI, 16.0f);
        this.LJLJJI.setPadding(0, 0, 0, 0);
        this.LJLJJI.setBackgroundColor(0);
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.LJLJJI.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = this.LJLJJLL.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i2 = (int) LIZJ;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin += i2;
        ViewGroup.LayoutParams layoutParams3 = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i2;
        this.LJLJL.setVisibility(0);
        XTE xte = new XTE("change_music_page", "attached_song", "", SFS.LJLJJI);
        this.LJLJLLL = xte;
        xte.LIZIZ = "prop";
    }
}
