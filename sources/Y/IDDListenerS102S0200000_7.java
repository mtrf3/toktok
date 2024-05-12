package Y;

import X.ASQ;
import X.AST;
import X.ASU;
import X.ASW;
import X.ASX;
import X.ASY;
import X.C188727au;
import X.C41018G7y;
import X.C44172HVg;
import X.C60903NvH;
import X.F9J;
import X.FMX;
import X.G5K;
import X.G7X;
import X.GHM;
import X.GHP;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.AuthorSurveyFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDDListenerS102S0200000_7 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS102S0200000_7 iDDListenerS102S0200000_7, DialogInterface dialogInterface) {
        G5K g5k = (G5K) iDDListenerS102S0200000_7.l0;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) iDDListenerS102S0200000_7.l1;
        g5k.getClass();
        onDismissListener.onDismiss(dialogInterface);
        g5k.LIZIZ.setEnable(true);
    }

    public static final void onDismiss$1(IDDListenerS102S0200000_7 iDDListenerS102S0200000_7, DialogInterface dialogInterface) {
        PublishDefaultPermissionFragment publishDefaultPermissionFragment;
        Fragment fragment = (Fragment) iDDListenerS102S0200000_7.l0;
        if ((fragment instanceof PublishDefaultPermissionFragment) && (publishDefaultPermissionFragment = (PublishDefaultPermissionFragment) fragment) != null) {
            publishDefaultPermissionFragment.Il(false);
        }
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) iDDListenerS102S0200000_7.l1;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$2(IDDListenerS102S0200000_7 iDDListenerS102S0200000_7, DialogInterface dialogInterface) {
        ((G7X) iDDListenerS102S0200000_7.l0).LIZ((C41018G7y) iDDListenerS102S0200000_7.l1);
        DialogInterface.OnDismissListener onDismissListener = ((C41018G7y) iDDListenerS102S0200000_7.l1).LJLJL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$3(IDDListenerS102S0200000_7 iDDListenerS102S0200000_7, DialogInterface dialogInterface) {
        MvThemeData mvThemeData = (MvThemeData) iDDListenerS102S0200000_7.l0;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) iDDListenerS102S0200000_7.l1;
        String key = mvThemeData.effect.getId();
        o.LJIIIZ(key, "key");
        if (!F9J.LIZIZ(C44172HVg.LIZ, 0, "mv_template").getBoolean(key, false) && onClickListener != null) {
            onClickListener.onClick(null, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$4(IDDListenerS102S0200000_7 iDDListenerS102S0200000_7, DialogInterface it) {
        boolean LJ;
        String str;
        Integer num;
        String str2;
        GHM ghm;
        GHM ghm2;
        String str3;
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        int i = 1;
        if (o.LJ(LJIIIIZZ, ASX.LIZ)) {
            LJ = true;
        } else {
            LJ = o.LJ(LJIIIIZZ, ASW.LIZ);
        }
        if (LJ) {
            num = ((AuthorSurveyFragment) iDDListenerS102S0200000_7.l0).LJLJI;
            str = "cancel";
        } else {
            str = null;
            if (LJIIIIZZ instanceof ASU) {
                boolean z = LJIIIIZZ instanceof GHM;
                if (z && (ghm2 = (GHM) LJIIIIZZ) != null) {
                    str2 = ghm2.LIZ;
                } else {
                    str2 = null;
                }
                if (z && (ghm = (GHM) LJIIIIZZ) != null) {
                    num = ghm.LIZIZ;
                } else {
                    num = null;
                }
                str = str2;
            } else {
                o.LJ(LJIIIIZZ, ASY.LIZ);
                num = null;
            }
        }
        String string = ((Bundle) iDDListenerS102S0200000_7.l1).getString("groupId");
        String str4 = "";
        if (string == null) {
            string = "";
        }
        if (o.LJ(str, "cancel")) {
            AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().onSurveyClosedManually();
        } else if (o.LJ(str, "submit")) {
            AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().onSurveySubmit(string);
        }
        String string2 = ((Bundle) iDDListenerS102S0200000_7.l1).getString("enterFrom");
        if (string2 == null) {
            string2 = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", string2);
        c188727au.LJIIIZ("author_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        String string3 = ((Bundle) iDDListenerS102S0200000_7.l1).getString("groupId");
        if (string3 == null) {
            string3 = "";
        }
        c188727au.LJIIIZ("group_id", string3);
        if (GHP.LIZ()) {
            str3 = "most_wanted_set";
        } else {
            str3 = "most_disappointed_set";
        }
        c188727au.LJIIIZ("survey_type", str3);
        c188727au.LJFF(num, "result");
        if (str != null) {
            str4 = str;
        }
        if (!o.LJ("personal_homepage", string2) || !o.LJ("submit", str4)) {
            i = AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isCurrentTheLastTimeSurveyBannerShown();
        }
        c188727au.LIZLLL(i, "if_hit_quit");
        c188727au.LJIIIZ("exit_method", str);
        FMX.LJIIL("exit_author_survey", c188727au.LIZ);
    }

    public IDDListenerS102S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
