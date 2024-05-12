package Y;

import android.view.animation.Animation;
import com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;

/* loaded from: classes11.dex */
public class IDAListenerS235S0100000_10 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(IDAListenerS235S0100000_10 iDAListenerS235S0100000_10, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS235S0100000_10 iDAListenerS235S0100000_10, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS235S0100000_10 iDAListenerS235S0100000_10, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS235S0100000_10 iDAListenerS235S0100000_10, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS235S0100000_10(ReportWebPageDialogActivity reportWebPageDialogActivity, int i) {
        this.$t = i;
        this.l0 = reportWebPageDialogActivity;
    }

    public static final void onAnimationEnd$0(IDAListenerS235S0100000_10 iDAListenerS235S0100000_10, Animation animation) {
        ReportWebPageDialogActivity reportWebPageDialogActivity = (ReportWebPageDialogActivity) iDAListenerS235S0100000_10.l0;
        reportWebPageDialogActivity.LJLJJL = null;
        reportWebPageDialogActivity.LJLJJLL = 4;
        if (!reportWebPageDialogActivity.isFinishing()) {
            super/*X.Xqz*/.finish();
            ((ReportWebPageDialogActivity) iDAListenerS235S0100000_10.l0).overridePendingTransition(0, 0);
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS235S0100000_10 iDAListenerS235S0100000_10, Animation animation) {
        ReportWebPageDialogActivity reportWebPageDialogActivity = (ReportWebPageDialogActivity) iDAListenerS235S0100000_10.l0;
        reportWebPageDialogActivity.LJLJJL = null;
        reportWebPageDialogActivity.LJLJJLL = 2;
    }
}
