package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54693LdJ extends AbstractC54684LdA {
    public final View LJLJJI;
    public final W5G LJLJJL;
    public final W5G LJLJJLL;
    public final TextView LJLJL;
    public final TextView LJLJLJ;
    public final TextView LJLJLLL;
    public final C53887LCx LJLL;
    public final C53887LCx LJLLI;
    public FollowingInterestUser LJLLILLLL;

    public C54693LdJ(View view) {
        super(view);
        TuxTextView tuxTextView;
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJJI = findViewById;
        View findViewById2 = view.findViewById(R.id.f1_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover_top)");
        W5G w5g = (W5G) findViewById2;
        this.LJLJJL = w5g;
        View findViewById3 = view.findViewById(R.id.f17);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_cover_bottom)");
        W5G w5g2 = (W5G) findViewById3;
        this.LJLJJLL = w5g2;
        View findViewById4 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_name)");
        TextView textView = (TextView) findViewById4;
        this.LJLJL = textView;
        View findViewById5 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.icon_tag)");
        this.LJLJLJ = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.me9);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_plus)");
        this.LJLJLLL = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.f6_);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.iv_live_circle_top)");
        View findViewById8 = view.findViewById(R.id.f69);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.iv_live_circle_bottom)");
        C53887LCx c53887LCx = new C53887LCx(w5g, w5g, (C53873LCj) findViewById7);
        this.LJLL = c53887LCx;
        C53887LCx c53887LCx2 = new C53887LCx(w5g2, w5g2, (C53873LCj) findViewById8);
        this.LJLLI = c53887LCx2;
        c53887LCx.LJIIJ(false);
        c53887LCx2.LJIIJ(false);
        if (textView instanceof TuxTextView) {
            tuxTextView = (TuxTextView) textView;
        } else {
            tuxTextView = null;
        }
        AbstractC54684LdA.M(tuxTextView);
    }
}
