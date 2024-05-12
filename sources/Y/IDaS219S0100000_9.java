package Y;

import X.ActivityC45651qj;
import X.C188727au;
import X.C221018lt;
import X.C54011LHr;
import X.C54024LIe;
import X.C58049MqL;
import X.C58053MqP;
import X.FMX;
import X.HandlerC56918MVm;
import X.InterfaceC29937Boz;
import X.InterfaceC73573Su9;
import X.X1D;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;

/* loaded from: classes10.dex */
public class IDaS219S0100000_9 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS219S0100000_9 iDaS219S0100000_9) {
        ((InterfaceC73573Su9) iDaS219S0100000_9.l0).onComplete();
    }

    public static final void run$1(IDaS219S0100000_9 iDaS219S0100000_9) {
        ((C58053MqP) iDaS219S0100000_9.l0).LJIILLIIL = System.nanoTime();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("build_result", ((C58053MqP) iDaS219S0100000_9.l0).LJIILIIL);
        C58053MqP c58053MqP = (C58053MqP) iDaS219S0100000_9.l0;
        c188727au.LJ(c58053MqP.LJIILL - c58053MqP.LJIILJJIL, "text_build_time");
        C58053MqP c58053MqP2 = (C58053MqP) iDaS219S0100000_9.l0;
        c188727au.LJ(c58053MqP2.LJIILLIIL - c58053MqP2.LJIILJJIL, "total_build_time");
        c188727au.LJFF(Boolean.valueOf(((C58053MqP) iDaS219S0100000_9.l0).LJIIZILJ), "has_tail_image");
        c188727au.LJFF(Boolean.valueOf(((C58053MqP) iDaS219S0100000_9.l0).LJIJ), "tail_image_has_cache");
        c188727au.LIZLLL(((C58053MqP) iDaS219S0100000_9.l0).LIZIZ.LIZ.ordinal(), "config_ext_style");
        c188727au.LJFF(Boolean.valueOf(((C58053MqP) iDaS219S0100000_9.l0).LIZIZ.LIZIZ), "config_tail_avatar");
        c188727au.LJFF(Boolean.valueOf(((C58053MqP) iDaS219S0100000_9.l0).LIZIZ.LIZJ), "config_avatar_next_line");
        c188727au.LJFF(Boolean.valueOf(((C58053MqP) iDaS219S0100000_9.l0).LIZIZ.LIZLLL), "config_name_bold");
        c188727au.LJFF(Boolean.valueOf(((C58053MqP) iDaS219S0100000_9.l0).LIZIZ.LJ), "config_name_clickable");
        c188727au.LJFF(((C58053MqP) iDaS219S0100000_9.l0).LIZIZ.LJFF, "config_ellipsis_strategy");
        FMX.LJIIL("relation_text_build", c188727au.LIZ);
    }

    public static final void run$2(IDaS219S0100000_9 iDaS219S0100000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestData finished, ");
        LIZ.append(((HandlerC56918MVm) iDaS219S0100000_9.l0).LJIIIIZZ().size());
        LIZ.append(", ");
        LIZ.append(((HandlerC56918MVm) iDaS219S0100000_9.l0).LJFF().size());
        LIZ.append(", ");
        LIZ.append(((HandlerC56918MVm) iDaS219S0100000_9.l0).LJ().size());
        LIZ.append(", ");
        LIZ.append(((HandlerC56918MVm) iDaS219S0100000_9.l0).LJI().size());
        C221018lt.LJFF("NoticeVideoManager", X1D.LIZIZ(LIZ));
    }

    public static final void run$3(IDaS219S0100000_9 iDaS219S0100000_9) {
        ((C58049MqL) iDaS219S0100000_9.l0).LJJJJL();
    }

    public static final void run$4(IDaS219S0100000_9 iDaS219S0100000_9) {
        ((IPrivacyService) iDaS219S0100000_9.l0).LJ();
    }

    public static final void run$5(IDaS219S0100000_9 iDaS219S0100000_9) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDaS219S0100000_9.l0;
        C54011LHr.LJ(C54024LIe.LJ(activityC45651qj, Hox.LJLLI.LIZ(activityC45651qj).lv0(), null));
    }

    public static final void run$6(IDaS219S0100000_9 iDaS219S0100000_9) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDaS219S0100000_9.l0;
        C54011LHr.LJ(C54024LIe.LJ(activityC45651qj, Hox.LJLLI.LIZ(activityC45651qj).lv0(), null));
    }

    public static final void run$7(IDaS219S0100000_9 iDaS219S0100000_9) {
        ((RecFeedShareComponentController) iDaS219S0100000_9.l0).LJLILLLLZI = false;
    }

    public IDaS219S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
