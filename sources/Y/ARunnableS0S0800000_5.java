package Y;

import X.C0NB;
import X.C15380j0;
import X.C15490jB;
import X.C29306Beo;
import X.C29701Eo;
import X.C32334CmY;
import X.C32654Cri;
import X.C32655Crj;
import X.C47061t0;
import X.C47121t6;
import X.CFX;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class ARunnableS0S0800000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        View view = (View) this.l0;
        C29701Eo c29701Eo = (C29701Eo) this.l1;
        C47061t0 c47061t0 = (C47061t0) this.l2;
        C47061t0 c47061t02 = (C47061t0) this.l3;
        C47061t0 c47061t03 = (C47061t0) this.l4;
        C32334CmY c32334CmY = (C32334CmY) this.l5;
        C47121t6 c47121t6 = (C47121t6) this.l6;
        View view2 = (View) this.l7;
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", "playOnlineOpenPackAnimation");
        C29306Beo.LJI(c29701Eo);
        view.setClickable(false);
        C29306Beo.LJI(view2);
        C29306Beo.LJJLJLI(c32334CmY);
        c32334CmY.LIZIZ();
        C29306Beo.LJI(c47061t0);
        C29306Beo.LJI(c47061t02);
        C29306Beo.LJJLJLI(c47061t03);
        c47061t03.setScaleX(c47061t0.getScaleX());
        c47061t03.setScaleY(c47061t0.getScaleY());
        C29306Beo.LJJLJLI(c47121t6);
        c47121t6.setText(C15380j0.LJIILJJIL(R.string.mhd));
        C15490jB.LJFF(c47061t03, "tiktok_live_revenue_demand_1", "ttlive_opened_pack_v2.webp", ImageView.ScaleType.CENTER_CROP, new C32654Cri(c29701Eo, view, view2, c32334CmY, c47061t02, c47121t6, c47061t03));
    }

    public final void LIZ$1() {
        View view = (View) this.l0;
        C29701Eo c29701Eo = (C29701Eo) this.l1;
        C47061t0 c47061t0 = (C47061t0) this.l2;
        C47061t0 c47061t02 = (C47061t0) this.l3;
        C47061t0 c47061t03 = (C47061t0) this.l4;
        C32334CmY c32334CmY = (C32334CmY) this.l5;
        C47121t6 c47121t6 = (C47121t6) this.l6;
        View view2 = (View) this.l7;
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", "playOnlineOpenPackAnimation");
        C29306Beo.LJJLJLI(c29701Eo);
        c29701Eo.loop(false);
        view.setClickable(false);
        C29306Beo.LJI(view2);
        C29306Beo.LJJLJLI(c32334CmY);
        c32334CmY.LIZIZ();
        C29306Beo.LJI(c47061t0);
        C29306Beo.LJI(c47061t02);
        C29306Beo.LJI(c47061t03);
        C29306Beo.LJJLJLI(c47121t6);
        c47121t6.setText(C15380j0.LJIILJJIL(R.string.mhd));
        C15490jB.LJFF(c29701Eo, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_opened_pack.webp", ImageView.ScaleType.CENTER_CROP, new C32655Crj(c29701Eo, view, view2, c32334CmY, c47061t02, c47121t6));
    }

    public static final void run$0(ARunnableS0S0800000_5 aRunnableS0S0800000_5) {
        boolean LIZ;
        try {
            aRunnableS0S0800000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0800000_5 aRunnableS0S0800000_5) {
        boolean LIZ;
        try {
            aRunnableS0S0800000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0800000_5(View view, C29701Eo c29701Eo, C47061t0 c47061t0, C47061t0 c47061t02, C47061t0 c47061t03, C32334CmY c32334CmY, C47121t6 c47121t6, View view2, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = c29701Eo;
        this.l2 = c47061t0;
        this.l3 = c47061t02;
        this.l4 = c47061t03;
        this.l5 = c32334CmY;
        this.l6 = c47121t6;
        this.l7 = view2;
    }
}
