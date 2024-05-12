package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54690LdG extends AbstractC54692LdI {
    public final String LJLJLJ;
    public final View LJLJLLL;
    public final W5G LJLL;
    public final W5G LJLLI;
    public final TuxTextView LJLLILLLL;
    public final View LJLLJ;
    public final TextView LJLLL;
    public final TuxTextView LJLLLL;
    public final C53873LCj LJLLLLLL;
    public final C53873LCj LJLZ;
    public final C62822Ol8 LJZ;
    public final C53887LCx LJZI;
    public final C53887LCx LJZL;
    public C53884LCu LL;
    public C53884LCu LLD;
    public final C62822Ol8 LLF;
    public FollowingInterestUser LLFF;

    public final int Y() {
        User user;
        FollowingInterestUser followingInterestUser = this.LLFF;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            int followStatus = user.getFollowStatus();
            if (followStatus != 0 && followStatus != 1 && followStatus != 2) {
                if (user.getFollowerStatus() == 0) {
                    return 0;
                }
                return 3;
            }
            return followStatus;
        }
        return -1;
    }

    public final boolean a0() {
        return ((Boolean) this.LJZ.getValue()).booleanValue();
    }

    @Override // X.AbstractC54684LdA
    public final void Q() {
        if (a0()) {
            C53884LCu c53884LCu = this.LL;
            if (c53884LCu != null) {
                c53884LCu.LJ();
            }
            C53884LCu c53884LCu2 = this.LLD;
            if (c53884LCu2 != null) {
                c53884LCu2.LJ();
                return;
            }
            return;
        }
        C53887LCx c53887LCx = this.LJZI;
        if (c53887LCx != null) {
            c53887LCx.LJ();
        }
        C53887LCx c53887LCx2 = this.LJZL;
        if (c53887LCx2 == null) {
            return;
        }
        c53887LCx2.LJ();
    }

    @Override // X.AbstractC54684LdA
    public final void T() {
        if (a0()) {
            C53884LCu c53884LCu = this.LL;
            if (c53884LCu != null) {
                c53884LCu.LJI();
            }
            C53884LCu c53884LCu2 = this.LLD;
            if (c53884LCu2 != null) {
                c53884LCu2.LJI();
                return;
            }
            return;
        }
        C53887LCx c53887LCx = this.LJZI;
        if (c53887LCx != null) {
            c53887LCx.LJI();
        }
        C53887LCx c53887LCx2 = this.LJZL;
        if (c53887LCx2 == null) {
            return;
        }
        c53887LCx2.LJI();
    }

    @Override // X.AbstractC54684LdA
    public final FollowingInterestUser N() {
        return this.LLFF;
    }

    public C54690LdG(View view) {
        super(view);
        this.LJLJLJ = "FollowLiveSkyLightDoubleBigHeaderViewHolder";
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJLLL = findViewById;
        View findViewById2 = view.findViewById(R.id.f1_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover_top)");
        W5G w5g = (W5G) findViewById2;
        this.LJLL = w5g;
        View findViewById3 = view.findViewById(R.id.f17);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_cover_bottom)");
        W5G w5g2 = (W5G) findViewById3;
        this.LJLLI = w5g2;
        View findViewById4 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.LJLLILLLL = tuxTextView;
        View findViewById5 = view.findViewById(R.id.gvz);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.name_container)");
        this.LJLLJ = findViewById5;
        View findViewById6 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.icon_tag)");
        this.LJLLL = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.me9);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.tv_plus)");
        this.LJLLLL = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.f6_);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.iv_live_circle_top)");
        C53873LCj c53873LCj = (C53873LCj) findViewById8;
        this.LJLLLLLL = c53873LCj;
        View findViewById9 = view.findViewById(R.id.f69);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.iv_live_circle_bottom)");
        C53873LCj c53873LCj2 = (C53873LCj) findViewById9;
        this.LJLZ = c53873LCj2;
        this.LJZ = C221108m2.LIZIZ(AnonymousClass956.LJLIL);
        this.LLF = C221108m2.LIZIZ(C54699LdP.LJLIL);
        if (!a0()) {
            EnumC53720L6m enumC53720L6m = EnumC53720L6m.INBOX;
            C53887LCx c53887LCx = new C53887LCx(enumC53720L6m, w5g, w5g, c53873LCj);
            this.LJZI = c53887LCx;
            C53887LCx c53887LCx2 = new C53887LCx(enumC53720L6m, w5g2, w5g2, c53873LCj2);
            this.LJZL = c53887LCx2;
            c53887LCx.LJIIJ(false);
            c53887LCx2.LJIIJ(false);
        }
        AbstractC54684LdA.M(tuxTextView);
    }

    @Override // X.AbstractC54692LdI
    public final void X(C53882LCs c53882LCs) {
        if (a0()) {
            W5G w5g = this.LJLL;
            this.LL = new C53884LCu(c53882LCs, w5g, w5g, this.LJLLLLLL);
            W5G w5g2 = this.LJLLI;
            C53884LCu c53884LCu = new C53884LCu(c53882LCs, w5g2, w5g2, this.LJLZ);
            this.LLD = c53884LCu;
            C53884LCu c53884LCu2 = this.LL;
            if (c53884LCu2 != null) {
                c53884LCu2.LJFF = false;
            }
            c53884LCu.LJFF = false;
        }
    }
}
