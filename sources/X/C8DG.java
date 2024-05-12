package X;

import android.os.Bundle;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8DG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DG implements LLE {
    public static final C8DG LJLIL = new C8DG();
    public static ActivityC45651qj LJLILLLLZI;

    public static boolean LIZ() {
        InterfaceC36571c5 interfaceC36571c5;
        InterfaceC225058sP interfaceC225058sP;
        InterfaceC55235Lm3 ul;
        IMFPubAbility iMFPubAbility;
        ActivityC45651qj activityC45651qj = LJLILLLLZI;
        if (activityC45651qj != null) {
            interfaceC36571c5 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Ja("HOME");
        } else {
            interfaceC36571c5 = null;
        }
        if ((interfaceC36571c5 instanceof InterfaceC225058sP) && (interfaceC225058sP = (InterfaceC225058sP) interfaceC36571c5) != null && (ul = interfaceC225058sP.ul()) != null && (iMFPubAbility = (IMFPubAbility) C55096Ljo.LIZ(ul, IMFPubAbility.class, null)) != null && iMFPubAbility.Kz() == 35) {
            return true;
        }
        return false;
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        InterfaceC54054LJi interfaceC54054LJi;
        String str4;
        ActivityC45651qj activityC45651qj = LJLILLLLZI;
        if (activityC45651qj != null) {
            if (C206928Ae.LIZ()) {
                if (o.LJ(str, "homepage_explore")) {
                    if (LIZ()) {
                        AVExternalServiceImpl.LIZ().publishService().showProgress(activityC45651qj, false);
                        return;
                    }
                    return;
                }
                MainPageFragmentImpl.LJI().LJFF(activityC45651qj);
                return;
            }
            if (o.LJ(str2, "HOME")) {
                MainPageFragmentImpl.LJI().LJFF(activityC45651qj);
            }
            if (!o.LJ(str, "HOME")) {
                return;
            }
            InterfaceC36571c5 Ja = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Ja("HOME");
            if (!(Ja instanceof InterfaceC54054LJi) || (interfaceC54054LJi = (InterfaceC54054LJi) Ja) == null || !interfaceC54054LJi.jg()) {
                return;
            }
            if (o.LJ(str3, "click_button_icon")) {
                if (bundle == null || (str4 = bundle.getString("previousPage", "personal_homepage")) == null) {
                    str4 = "";
                }
                C206978Aj.LIZJ("click_button_icon", str4, null, 12);
            }
            if (!LIZ()) {
                return;
            }
            AVExternalServiceImpl.LIZ().publishService().showProgress(activityC45651qj, false);
        }
    }
}
