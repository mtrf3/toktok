package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54695LdL extends AbstractC54684LdA {
    public final String LJLJJI;
    public final View LJLJJL;
    public final C51588KMm LJLJJLL;
    public final TuxTextView LJLJL;
    public final C53873LCj LJLJLJ;
    public final C53873LCj LJLJLLL;
    public final View LJLL;
    public FollowingInterestUser LJLLI;

    public C54695LdL(View view) {
        super(view);
        this.LJLJJI = "FollowLiveSkyLightNewAnimViewHolder";
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJJL = findViewById;
        View findViewById2 = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover)");
        this.LJLJJLL = (C51588KMm) findViewById2;
        View findViewById3 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLJL = tuxTextView;
        View findViewById4 = view.findViewById(R.id.f68);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_live_circle)");
        this.LJLJLJ = (C53873LCj) findViewById4;
        View findViewById5 = view.findViewById(R.id.fv4);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.live_anim_stroke)");
        this.LJLJLLL = (C53873LCj) findViewById5;
        View findViewById6 = view.findViewById(R.id.fv2);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.live_anim)");
        this.LJLL = findViewById6;
        AbstractC54684LdA.M(tuxTextView);
    }
}
