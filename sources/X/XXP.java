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
public abstract class XXP extends XYS {
    public final Context LJLILLLLZI;
    public final List<C84987XXb> LJLJI;
    public final LinearLayout LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final LinearLayout LJLJL;
    public final View LJLJLJ;
    public final int LJLJLLL;
    public final XVG LJLL;

    public XXP(View view, int i) {
        super(view);
        this.LJLILLLLZI = view.getContext();
        this.LJLJJI = (LinearLayout) view.findViewById(R.id.g27);
        this.LJLJJL = (TextView) view.findViewById(R.id.mqu);
        this.LJLJJLL = (TextView) view.findViewById(R.id.m8d);
        this.LJLJL = (LinearLayout) view.findViewById(R.id.g28);
        this.LJLJLJ = view.findViewById(R.id.ngi);
        this.LJLJI = new ArrayList();
        this.LJLJLLL = i;
        float LIZJ = KL2.LIZJ(this.LJLILLLLZI, 16.0f);
        this.LJLJJI.setPadding(0, 0, 0, 0);
        this.LJLJJI.setBackgroundColor(0);
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.LJLJJI.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = this.LJLJLJ.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) LIZJ;
        this.LJLJLJ.setVisibility(0);
        this.LJLL = new XVG("change_music_page", "attached_song", "", XVF.LIZ);
    }
}
