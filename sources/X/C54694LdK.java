package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54694LdK extends AbstractC54684LdA {
    public final String LJLJJI;
    public final View LJLJJL;
    public final C51588KMm LJLJJLL;
    public final TextView LJLJL;
    public final TextView LJLJLJ;
    public final C53873LCj LJLJLLL;
    public FollowingInterestUser LJLL;
    public final C53887LCx LJLLI;

    public C54694LdK(View view) {
        super(view);
        TuxTextView tuxTextView;
        this.LJLJJI = "FollowLiveSkyLightViewHolder";
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJJL = findViewById;
        View findViewById2 = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover)");
        C51588KMm c51588KMm = (C51588KMm) findViewById2;
        this.LJLJJLL = c51588KMm;
        View findViewById3 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_name)");
        TextView textView = (TextView) findViewById3;
        this.LJLJL = textView;
        View findViewById4 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.icon_tag)");
        this.LJLJLJ = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f68);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_live_circle)");
        C53873LCj c53873LCj = (C53873LCj) findViewById5;
        this.LJLJLLL = c53873LCj;
        C53887LCx c53887LCx = new C53887LCx(c51588KMm, c51588KMm, c53873LCj);
        this.LJLLI = c53887LCx;
        c53887LCx.LJIIJ(false);
        if (textView instanceof TuxTextView) {
            tuxTextView = (TuxTextView) textView;
        } else {
            tuxTextView = null;
        }
        AbstractC54684LdA.M(tuxTextView);
    }
}
