package X;

import android.app.Dialog;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS20S2100000_15;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("email_pop_up_dialog")
/* renamed from: X.XkK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85704XkK extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 229;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        if (TextUtils.isEmpty(EmailPopUpSetting.LIZ().addEmailPopupStrings.popupTitle)) {
            str = this.LJLIL.getString(R.string.ehk);
        } else {
            str = EmailPopUpSetting.LIZ().addEmailPopupStrings.popupTitle;
        }
        o.LJIIIIZZ(str, "if (TextUtils.isEmpty(Em…ilPopupStrings.popupTitle");
        if (TextUtils.isEmpty(EmailPopUpSetting.LIZ().addEmailPopupStrings.popupBody)) {
            str2 = this.LJLIL.getString(R.string.ehf);
        } else {
            str2 = EmailPopUpSetting.LIZ().addEmailPopupStrings.popupBody;
        }
        o.LJIIIIZZ(str2, "if (TextUtils.isEmpty(Em…ailPopupStrings.popupBody");
        String string = this.LJLIL.getString(R.string.ehh);
        o.LJIIIIZZ(string, "activity.getString(R.str…dd_email_address_not_now)");
        String string2 = this.LJLIL.getString(R.string.ehe);
        o.LJIIIIZZ(string2, "activity.getString(R.str…og_add_email_address_add)");
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        LIZ.LJFF(str);
        LIZ.LIZIZ(str2);
        LIZ.LIZJ(new AqS181S0100000_15(this, 234));
        LIZ.LJII = true;
        UC0.LIZJ(LIZ, new AqS20S2100000_15(string2, string, this, 1));
        C61851OPf.LIZJ(Integer.valueOf(this.LJLJI));
        Integer valueOf = Integer.valueOf(this.LJLJI);
        Boolean bool = Boolean.FALSE;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", C85707XkN.LIZIZ(valueOf));
        c35936E8m.LIZLLL("enter_method", C85707XkN.LIZ(bool));
        c35936E8m.LIZ(C61851OPf.LIZIZ(valueOf), "show_index");
        FMX.LJIIL("add_email_popup_show", c35936E8m.LIZ);
        return LIZ.LJI().LJ();
    }

    public C85704XkK(int i, ActivityC45651qj activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }
}
