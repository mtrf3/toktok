package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractViewOnClickListenerC54731Ldv extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final View LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final SY4 LJLJJI;
    public FollowingInterestUser LJLJJL;
    public final TuxIconView LJLJJLL;
    public final TuxTextView LJLJL;
    public final ImageView LJLJLJ;
    public final View LJLJLLL;
    public final View LJLL;
    public final TuxTextView LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;

    public abstract void M();

    public AbstractViewOnClickListenerC54731Ldv(View view) {
        super(view);
        View findViewById = this.itemView.findViewById(R.id.e37);
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.dkl);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.follow_name)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dk8);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.follow_content)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.nh4);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.watch_button)");
        SY4 sy4 = (SY4) findViewById4;
        this.LJLJJI = sy4;
        View findViewById5 = view.findViewById(R.id.ff7);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.label_icon)");
        this.LJLJJLL = (TuxIconView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ffa);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.label_text)");
        this.LJLJL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.n37);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.verified_icon)");
        this.LJLJLJ = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.fx9);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.live_label)");
        this.LJLJLLL = findViewById8;
        View findViewById9 = view.findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.content_container)");
        this.LJLL = findViewById9;
        View findViewById10 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.icon_tag)");
        this.LJLLI = (TuxTextView) findViewById10;
        this.LJLLILLLL = 1;
        this.LJLLJ = 2;
        if (findViewById != null) {
            C16880lQ.LJIIJ(this, findViewById);
        }
        C16880lQ.LJJIZ(sy4, this);
        C16880lQ.LJIIJ(this, findViewById9);
    }

    public static final String L(Context context) {
        try {
            LiveOuterService.LJJJLL().LJJIJIL().LJJIJIIJI().getClass();
            String LIZ = C30039Bqd.LIZ(context);
            o.LJIIIIZZ(LIZ, "{\n            ServiceMan…              )\n        }");
            return LIZ;
        } catch (Exception unused) {
            return "LIVE";
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SY4 sy4;
        View view2;
        if (view != null) {
            int id = view.getId();
            View view3 = this.LJLIL;
            if ((view3 != null && id == view3.getId()) || (((sy4 = this.LJLJJI) != null && id == sy4.getId()) || ((view2 = this.LJLL) != null && id == view2.getId()))) {
                M();
            }
        }
    }
}
