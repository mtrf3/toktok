package Y;

import X.C188727au;
import X.C26045AKb;
import X.C2NU;
import X.C40211FqJ;
import X.C62151OaJ;
import X.C62691Oj1;
import X.C62692Oj2;
import X.C62693Oj3;
import X.C62694Oj4;
import X.C62695Oj5;
import X.C62696Oj6;
import X.C63048Oom;
import X.C63049Oon;
import X.C77266UUc;
import X.C9WG;
import X.FMX;
import X.InterfaceC62173Oaf;
import X.Z8A;
import android.app.Activity;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.business.privateaccount.tip.PrivateAccountTipActivity;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public class IDCListenerS162S0100000_10 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            case 8:
                onClick$8(this, dialogInterface, i);
                return;
            case 9:
                onClick$9(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS162S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        ((C62151OaJ) ((IDeS404S0100000_10) iDCListenerS162S0100000_10.l0).l0).LIZ.P1();
    }

    public static final void onClick$1(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        C40211FqJ.LIZIZ(((C62151OaJ) ((IDeS404S0100000_10) iDCListenerS162S0100000_10.l0).l0).LIZIZ);
    }

    public static final void onClick$2(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        C63049Oon.LIZIZ(System.currentTimeMillis() - ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLJJI, "cancel");
    }

    public static final void onClick$3(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().LIZLLL(Boolean.TRUE);
        PrivateAccountTipActivity privateAccountTipActivity = (PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0;
        if (!privateAccountTipActivity.isDestroyed()) {
            if (!C2NU.LIZ.LIZIZ()) {
                C26045AKb c26045AKb = new C26045AKb(privateAccountTipActivity);
                c26045AKb.LJIIIZ(privateAccountTipActivity.getString(R.string.im9));
                c26045AKb.LJIIJ();
                a.LJIILJJIL().LIZLLL();
                SettingServiceImpl.LIZ().providePushSettingChangePresenter().LJIILL("notify_private_account", 1);
                C63048Oom.LIZJ("privacy_account_setting_confirm", ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLIL);
                C188727au c188727au = new C188727au();
                c188727au.LJ(System.currentTimeMillis() - ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLJJI, "stay_time");
                FMX.LJIIL("tns_privacy_notify_confirm_check", c188727au.LIZ);
                C63049Oon.LIZIZ(System.currentTimeMillis() - ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLJJI, "go_private");
            }
        }
        if (privateAccountTipActivity.LJLILLLLZI == null) {
            C9WG newUserPresenter = Z8A.LIZIZ.newUserPresenter();
            privateAccountTipActivity.LJLILLLLZI = newUserPresenter;
            o.LJI(newUserPresenter);
            newUserPresenter.bindView(privateAccountTipActivity);
        }
        C9WG c9wg = privateAccountTipActivity.LJLILLLLZI;
        o.LJI(c9wg);
        c9wg.updateUserSecret(true);
        privateAccountTipActivity.finish();
        a.LJIILJJIL().LIZLLL();
        SettingServiceImpl.LIZ().providePushSettingChangePresenter().LJIILL("notify_private_account", 1);
        C63048Oom.LIZJ("privacy_account_setting_confirm", ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLIL);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJ(System.currentTimeMillis() - ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLJJI, "stay_time");
        FMX.LJIIL("tns_privacy_notify_confirm_check", c188727au2.LIZ);
        C63049Oon.LIZIZ(System.currentTimeMillis() - ((PrivateAccountTipActivity) iDCListenerS162S0100000_10.l0).LJLJJI, "go_private");
    }

    public static final void onClick$4(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        C40211FqJ.LIZIZ((QRCodePermissionActivity) iDCListenerS162S0100000_10.l0);
        ((QRCodePermissionActivity) iDCListenerS162S0100000_10.l0).finish();
    }

    public static final void onClick$5(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        ((QRCodePermissionActivity) iDCListenerS162S0100000_10.l0).finish();
    }

    public static final void onClick$6(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        C40211FqJ.LIZIZ((Activity) iDCListenerS162S0100000_10.l0);
    }

    public static final void onClick$7(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        if (C77266UUc.LIZIZ.LJJ((Activity) iDCListenerS162S0100000_10.l0)) {
            ((Activity) iDCListenerS162S0100000_10.l0).finish();
        }
    }

    public static final void onClick$8(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        C62694Oj4 c62694Oj4 = (C62694Oj4) iDCListenerS162S0100000_10.l0;
        C62693Oj3 c62693Oj3 = c62694Oj4.LJLJI;
        ((C62696Oj6) ((InterfaceC62173Oaf) c62693Oj3.LJLILLLLZI)).LIZ(c62694Oj4.LJLIL.getAuthorUid());
        dialogInterface.dismiss();
    }

    public static final void onClick$9(IDCListenerS162S0100000_10 iDCListenerS162S0100000_10, DialogInterface dialogInterface, int i) {
        C62691Oj1 c62691Oj1 = (C62691Oj1) iDCListenerS162S0100000_10.l0;
        C62692Oj2 c62692Oj2 = c62691Oj1.LJLJI;
        ((C62695Oj5) ((InterfaceC62173Oaf) c62692Oj2.LJLILLLLZI)).LIZ(c62691Oj1.LJLIL.getAid());
        dialogInterface.dismiss();
    }
}
