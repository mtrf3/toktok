package X;

import Y.IDDListenerS154S0100000_15;
import android.app.AlertDialog;
import android.app.Dialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("default_notice_opt_in")
/* renamed from: X.XoS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85960XoS extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
    public final AlertDialog LJLJI;
    public final C26231ARf LJLJJI;
    public final InterfaceC85968Xoa LJLJJL;
    public final int LJLJJLL;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        Dialog LJ;
        o.LJIIIZ(context, "context");
        if (this.LJLILLLLZI) {
            LJ = this.LJLJI;
            if (LJ != null) {
                LJ.setOnDismissListener(new IDDListenerS154S0100000_15(this, 1));
                if (!new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", LJ, new Object[0], "void", new C65300Pk0(false, "()V", "2526044045222240462")).LIZ) {
                    LJ.show();
                }
            }
            LJ = null;
        } else {
            C26231ARf c26231ARf = this.LJLJJI;
            if (c26231ARf != null) {
                c26231ARf.LJLLL.setOnDismissListener(new IDDListenerS154S0100000_15(this, 2));
                LJ = c26231ARf.LJ();
            }
            LJ = null;
        }
        C85966XoY c85966XoY = (C85966XoY) this.LJLJJL;
        RunnableC85959XoR runnableC85959XoR = c85966XoY.LIZ;
        if (runnableC85959XoR.LJLILLLLZI) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "notification_setting_page");
            FMX.LJIIL("notification_setting_alert_show", c188727au.LIZ);
        } else if (runnableC85959XoR.LJLJI != null) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", c85966XoY.LIZ.LJLJI.LIZJ);
            c188727au2.LJIIIZ("enter_method", c85966XoY.LIZ.LJLJI.LIZLLL);
            c188727au2.LJIIIZ("room_id", c85966XoY.LIZ.LJLJI.LIZ);
            c188727au2.LJIIIZ("anchor_id", c85966XoY.LIZ.LJLJI.LIZIZ);
            c188727au2.LJIIIZ("enter_reason", "general");
            FMX.LJIIL("push_pre_permission_show", c188727au2.LIZ);
        } else if (runnableC85959XoR.LJLJJI) {
            C188727au c188727au3 = new C188727au();
            c188727au3.LJIIIZ("enter_from", c85966XoY.LIZ.LJLJJL);
            c188727au3.LJIIIZ("enter_method", "notification_bell");
            c188727au3.LJIIIZ("enter_reason", "general");
            FMX.LJIIL("push_pre_permission_show", c188727au3.LIZ);
        } else {
            FMX.LJIIL("push_pre_permission_show", new C188727au().LIZ);
        }
        return LJ;
    }

    public C85960XoS(ActivityC45651qj activity, boolean z, AlertDialog alertDialog, C26231ARf c26231ARf, C85966XoY c85966XoY) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = z;
        this.LJLJI = alertDialog;
        this.LJLJJI = c26231ARf;
        this.LJLJJL = c85966XoY;
        this.LJLJJLL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }
}
