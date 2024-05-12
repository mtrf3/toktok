package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Fb9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39271Fb9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activity, InterfaceC88472Yns setShowTime) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(setShowTime, "setShowTime");
        setShowTime.invoke(Long.valueOf(System.currentTimeMillis()));
        C16880lQ.LIZJ(activity, new Intent(activity, (Class<?>) TermsConsentCombineDialogV2.class));
    }

    public static DialogC25963AGx LIZIZ(ActivityC45651qj activity, InterfaceC88472Yns setShowTime) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(setShowTime, "setShowTime");
        setShowTime.invoke(Long.valueOf(System.currentTimeMillis()));
        DialogC25963AGx dialogC25963AGx = new DialogC25963AGx(activity);
        C39273FbB c39273FbB = new C39273FbB(dialogC25963AGx);
        dialogC25963AGx.setOnShowListener(new DialogInterfaceOnShowListenerC39274FbC(c39273FbB));
        dialogC25963AGx.setOnDismissListener(new DialogInterfaceOnDismissListenerC39272FbA(c39273FbB));
        if (C39257Fav.LIZLLL() == EnumC39259Fax.EU) {
            z = true;
        } else {
            z = false;
        }
        dialogC25963AGx.LJLIL = z;
        if (!dialogC25963AGx.isShowing()) {
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/compliance/business/consent/TpcConsentDialog", "show", dialogC25963AGx, new Object[0], "void", new C65300Pk0(false, "()V", "-4763093774534206715")).LIZ) {
                dialogC25963AGx.show();
            }
            SpecActServiceImpl.LJJJIL().LJIJI(true);
        } else {
            dialogC25963AGx.LIZ();
        }
        return dialogC25963AGx;
    }
}
