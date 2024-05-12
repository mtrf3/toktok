package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54691LdH extends AbstractC54692LdI {
    public final String LJLJLJ;
    public final View LJLJLLL;
    public final C51588KMm LJLL;
    public final TuxTextView LJLLI;
    public final TextView LJLLILLLL;
    public final C53873LCj LJLLJ;
    public FollowingInterestUser LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C53887LCx LJLZ;
    public C53884LCu LJZ;

    public final boolean Y() {
        return ((Boolean) this.LJLLLLLL.getValue()).booleanValue();
    }

    @Override // X.AbstractC54684LdA
    public final void Q() {
        if (Y()) {
            C53884LCu c53884LCu = this.LJZ;
            if (c53884LCu != null) {
                c53884LCu.LJ();
                return;
            }
            return;
        }
        C53887LCx c53887LCx = this.LJLZ;
        if (c53887LCx == null) {
            return;
        }
        c53887LCx.LJ();
    }

    @Override // X.AbstractC54684LdA
    public final void T() {
        if (Y()) {
            C53884LCu c53884LCu = this.LJZ;
            if (c53884LCu != null) {
                c53884LCu.LJI();
                return;
            }
            return;
        }
        C53887LCx c53887LCx = this.LJLZ;
        if (c53887LCx == null) {
            return;
        }
        c53887LCx.LJI();
    }

    @Override // X.AbstractC54684LdA
    public final FollowingInterestUser N() {
        return this.LJLLL;
    }

    public C54691LdH(View view) {
        super(view);
        this.LJLJLJ = "FollowLiveSkyLightBigHeaderViewHolder";
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJLLL = findViewById;
        View findViewById2 = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover)");
        C51588KMm c51588KMm = (C51588KMm) findViewById2;
        this.LJLL = c51588KMm;
        View findViewById3 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLLI = tuxTextView;
        View findViewById4 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.icon_tag)");
        this.LJLLILLLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f68);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_live_circle)");
        C53873LCj c53873LCj = (C53873LCj) findViewById5;
        this.LJLLJ = c53873LCj;
        this.LJLLLL = C221108m2.LIZIZ(C54697LdN.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(AnonymousClass955.LJLIL);
        if (!Y()) {
            C53887LCx c53887LCx = new C53887LCx(EnumC53720L6m.INBOX, c51588KMm, c51588KMm, c53873LCj);
            this.LJLZ = c53887LCx;
            c53887LCx.LJIIJ(false);
        }
        AbstractC54684LdA.M(tuxTextView);
    }

    @Override // X.AbstractC54692LdI
    public final void X(C53882LCs c53882LCs) {
        if (Y()) {
            C51588KMm c51588KMm = this.LJLL;
            C53884LCu c53884LCu = new C53884LCu(c53882LCs, c51588KMm, c51588KMm, this.LJLLJ);
            this.LJZ = c53884LCu;
            c53884LCu.LJFF = false;
        }
    }
}
