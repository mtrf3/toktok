package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G7J {
    public static GBZ LIZ;

    public static void LIZ(Context context, G7K titleSensitivityChecker, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        PostPrompts postPrompts;
        String goBack;
        PostPrompts postPrompts2;
        String text;
        PostPrompts postPrompts3;
        String postAnyway;
        String str;
        String dialogTitle;
        PostPrompts postPrompts4;
        o.LJIIIZ(titleSensitivityChecker, "titleSensitivityChecker");
        if (context == null || LIZ == GBZ.PRIVACY_DIALOG || LIZ == GBZ.POST_FREQUENCY_LIMIT_DIALOG || !o.LJ(titleSensitivityChecker.LIZIZ, Boolean.TRUE)) {
            return;
        }
        CheckTitleSensitivityResult checkTitleSensitivityResult = titleSensitivityChecker.LIZJ;
        String str2 = null;
        if (checkTitleSensitivityResult == null || checkTitleSensitivityResult.getPostPrompts() == null || (postPrompts = checkTitleSensitivityResult.getPostPrompts()) == null || (goBack = postPrompts.getGoBack()) == null || goBack.length() == 0 || (postPrompts2 = checkTitleSensitivityResult.getPostPrompts()) == null || (text = postPrompts2.getText()) == null || text.length() == 0 || (postPrompts3 = checkTitleSensitivityResult.getPostPrompts()) == null || (postAnyway = postPrompts3.getPostAnyway()) == null || postAnyway.length() == 0 || C44172HVg.LJIJ.isChildrenMode()) {
            return;
        }
        CheckTitleSensitivityResult checkTitleSensitivityResult2 = titleSensitivityChecker.LIZJ;
        if (checkTitleSensitivityResult2 != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            PostPrompts postPrompts5 = checkTitleSensitivityResult2.getPostPrompts();
            if (postPrompts5 != null) {
                str = postPrompts5.getText();
            } else {
                str = null;
            }
            c26227ARb.LIZIZ(str);
            PostPrompts postPrompts6 = checkTitleSensitivityResult2.getPostPrompts();
            if (postPrompts6 != null && (dialogTitle = postPrompts6.getDialogTitle()) != null && dialogTitle.length() != 0 && (postPrompts4 = checkTitleSensitivityResult2.getPostPrompts()) != null) {
                str2 = postPrompts4.getDialogTitle();
            }
            c26227ARb.LJFF(str2);
            UC0.LIZJ(c26227ARb, new AqS111S0300000_7(checkTitleSensitivityResult2, (CheckTitleSensitivityResult) interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 26));
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
        }
        LIZ = GBZ.SENSITIVE_TITLE_DIALOG;
    }
}
