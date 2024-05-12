package X;

import Y.ACListenerS49S0200000_15;
import Y.IDDListenerS154S0100000_15;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.CXs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31496CXs implements InterfaceC38216EzE {
    public final /* synthetic */ I18nSettingManageMyAccountActivity LIZ;

    public C31496CXs(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.LIZ = i18nSettingManageMyAccountActivity;
    }

    @Override // X.InterfaceC38216EzE
    public final void LIZ(final boolean z, final boolean z2) {
        final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LIZ;
        i18nSettingManageMyAccountActivity.getClass();
        i18nSettingManageMyAccountActivity.runOnUiThread(new Runnable() { // from class: X.Xla
            @Override // java.lang.Runnable
            public final void run() {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = I18nSettingManageMyAccountActivity.this;
                boolean z3 = z;
                boolean z4 = z2;
                i18nSettingManageMyAccountActivity2.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeAccountManagementPhoneNumber.getValue());
                ArrayList arrayList = new ArrayList();
                C252669vq c252669vq = new C252669vq();
                c252669vq.LIZIZ(i18nSettingManageMyAccountActivity2.getString(R.string.jjm));
                c252669vq.LJ = new ACListenerS49S0200000_15(bundle, i18nSettingManageMyAccountActivity2, 37);
                arrayList.add(c252669vq);
                if (z3) {
                    C252669vq c252669vq2 = new C252669vq();
                    c252669vq2.LIZIZ(i18nSettingManageMyAccountActivity2.getString(R.string.jjl));
                    c252669vq2.LJ = new ACListenerS49S0200000_15(bundle, i18nSettingManageMyAccountActivity2, 38);
                    arrayList.add(c252669vq2);
                }
                if (z4) {
                    C252669vq c252669vq3 = new C252669vq();
                    c252669vq3.LIZIZ(i18nSettingManageMyAccountActivity2.getString(R.string.jjn));
                    c252669vq3.LJ = new ACListenerS49S0200000_15(bundle, i18nSettingManageMyAccountActivity2, 39);
                    arrayList.add(c252669vq3);
                }
                C245319jz c245319jz = new C245319jz();
                c245319jz.LJI(R.string.jjo);
                c245319jz.LJFF(arrayList);
                c245319jz.LIZ.LJLILLLLZI = new IDDListenerS154S0100000_15(i18nSettingManageMyAccountActivity2, 6);
                c245319jz.LIZJ().show(i18nSettingManageMyAccountActivity2.getSupportFragmentManager(), (String) null);
                ShowUnlinkPhoneEmailConfirmPageEvent showUnlinkPhoneEmailConfirmPageEvent = new ShowUnlinkPhoneEmailConfirmPageEvent();
                IMR isEmailVerified = IMR.NULL;
                o.LJIIIZ(isEmailVerified, "isEmailVerified");
                showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
                EnumC85788Xlg actionType = EnumC85788Xlg.CHANGE;
                o.LJIIIZ(actionType, "actionType");
                showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(actionType.getValue(), "action_type");
                EnumC85789Xlh unlinkType = EnumC85789Xlh.PHONE;
                o.LJIIIZ(unlinkType, "unlinkType");
                showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(unlinkType.getValue(), "unlink_type");
                showUnlinkPhoneEmailConfirmPageEvent.LJFF();
            }
        });
    }
}
