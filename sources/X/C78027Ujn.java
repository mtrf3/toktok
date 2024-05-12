package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ujn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78027Ujn extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final ImageView LJLJJI;
    public final ImageView LJLJJL;
    public final C47061t0 LJLJJLL;
    public final ConstraintLayout LJLJL;
    public final TextView LJLJLJ;
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public final TextView LJLLI;
    public final TextView LJLLILLLL;
    public final TextView LJLLJ;
    public final TextView LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public long LJZL;
    public CountDownTimerC77998UjK LL;

    public final void M() {
        this.LJLJJL.setVisibility(8);
        this.LJLJJI.setVisibility(0);
        this.LJLJI.setVisibility(8);
    }

    public final void P() {
        this.LJLJJL.setVisibility(0);
        this.LJLJJI.setVisibility(8);
        this.LJLJI.setVisibility(0);
    }

    public C78027Ujn(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mg_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…_rank_league_description)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.mgf);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…k_league_sub_description)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mge);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_rank_league_rule)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f1r);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…_description_opening_btn)");
        this.LJLJJI = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f1p);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…_description_closing_btn)");
        this.LJLJJL = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.f1q);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_description_icon)");
        this.LJLJJLL = (C47061t0) findViewById6;
        View findViewById7 = view.findViewById(R.id.imq);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.rank_league_countdown)");
        this.LJLJL = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.m3h);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.tv_countdown_day)");
        this.LJLJLJ = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.m3i);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.…ountdown_day_measurement)");
        this.LJLJLLL = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.m3j);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.tv_countdown_hour)");
        this.LJLL = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.m3l);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.tv_countdown_minute)");
        this.LJLLI = (TextView) findViewById11;
        View findViewById12 = view.findViewById(R.id.m3m);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.tv_countdown_second)");
        this.LJLLILLLL = (TextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.m3f);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.id.tv_countdown_colon_1)");
        this.LJLLJ = (TextView) findViewById13;
        View findViewById14 = view.findViewById(R.id.m3g);
        o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.id.tv_countdown_colon_2)");
        this.LJLLL = (TextView) findViewById14;
        this.LJZI = true;
    }

    public static String L(long j) {
        if (j < 10) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('0');
            LIZ.append(j);
            return X1D.LIZIZ(LIZ);
        }
        return String.valueOf(j);
    }

    public static final boolean N(int i, long j) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.E2;
                Long LIZJ = c48459J0d.LIZJ();
                if (LIZJ == null || j != LIZJ.longValue()) {
                    c48459J0d.LIZ(Long.valueOf(j));
                    return false;
                }
            } else {
                C48459J0d<Long> c48459J0d2 = InterfaceC30442Bx8.D2;
                Long LIZJ2 = c48459J0d2.LIZJ();
                if (LIZJ2 == null || j != LIZJ2.longValue()) {
                    c48459J0d2.LIZ(Long.valueOf(j));
                    return false;
                }
            }
        } else {
            C48459J0d<Long> c48459J0d3 = InterfaceC30442Bx8.C2;
            Long LIZJ3 = c48459J0d3.LIZJ();
            if (LIZJ3 == null || j != LIZJ3.longValue()) {
                c48459J0d3.LIZ(Long.valueOf(j));
                return false;
            }
        }
        return true;
    }
}
