package X;

import Y.ACListenerS30S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import ql1.IDbS498S0100000_10;

/* renamed from: X.NgL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59977NgL implements InterfaceC60142Nj0, InterfaceC60663NrP {
    public final SparkContext LIZ;
    public final AnchorCommonStruct LIZIZ;
    public final Aweme LIZJ;
    public final String LIZLLL;
    public C252709vu LJ;
    public long LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;

    @Override // X.InterfaceC60663NrP
    public final void destroy() {
        new C237559Tz().LJJII(this.LIZJ, Long.valueOf(System.currentTimeMillis() - this.LJFF), "ttelite_ba_video_product_anchor_9_stay", this.LIZLLL);
    }

    @Override // X.InterfaceC60142Nj0
    public final View LIZ() {
        this.LJFF = System.currentTimeMillis();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.h2, C16880lQ.LLZIL(C39849FkT.LIZ()), null);
        LLLZIIL.setLayoutParams(new ViewGroup.LayoutParams(-1, ((Number) this.LJI.getValue()).intValue()));
        OUP.LJJJJLI(LLLZIIL, null, Float.valueOf(C32151Nz.LJIIZILJ(8)), Float.valueOf(C32151Nz.LJIIZILJ(8)), 25);
        SparkContext sparkContext = this.LIZ;
        sparkContext.LJJ(new C59985NgT());
        sparkContext.LJJI(new IDbS498S0100000_10(this, 6));
        sparkContext.LJII(InterfaceC60663NrP.class, this);
        this.LJ = (C252709vu) LLLZIIL.findViewById(R.id.aeb);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ = "back_btn";
        LIZJ.LJI = true;
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZIZ = "close_all_btn";
        LIZJ2.LJI = false;
        c235119Kp.LIZLLL(LIZJ, LIZJ2);
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ3.LIZIZ = "more";
        LIZJ3.LJI = true;
        c235119Kp.LIZIZ(LIZJ3);
        C252709vu c252709vu = this.LJ;
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
            View LJI = c252709vu.LJI("back_btn");
            if (LJI != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 207), LJI);
            }
            View LJI2 = c252709vu.LJI("close_all_btn");
            if (LJI2 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 208), LJI2);
            }
            View LJI3 = c252709vu.LJI("more");
            if (LJI3 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 209), LJI3);
            }
        }
        return LLLZIIL;
    }

    public final void LIZIZ(int i) {
        new C237559Tz().LJJII(this.LIZJ, Integer.valueOf(i), "ttelite_ba_video_product_anchor_action_sheet_click", this.LIZLLL);
    }

    @Override // X.InterfaceC60663NrP
    public final void LLLLII(String str) {
        C252709vu c252709vu = this.LJ;
        if (c252709vu != null) {
            C9KF c9kf = new C9KF();
            if (str == null) {
                str = "";
            }
            c9kf.LIZJ = str;
            c252709vu.LJIILLIIL(c9kf);
        }
    }

    public C59977NgL(SparkContext sparkContext, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = sparkContext;
        this.LIZIZ = anchorCommonStruct;
        this.LIZJ = aweme;
        this.LIZLLL = enterFrom;
        this.LJI = C221108m2.LIZIZ(C59978NgM.LJLIL);
        this.LJII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 614));
    }
}
