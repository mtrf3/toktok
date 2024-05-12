package Y;

import X.AFQ;
import X.AFR;
import X.AFS;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C235079Kl;
import X.C245999l5;
import X.C26175APb;
import X.C2NU;
import X.C39398FdC;
import X.C5S1;
import X.C65352Pkq;
import X.C8IC;
import X.C8VC;
import X.InterfaceC235069Kk;
import X.KMV;
import X.V16;
import X.YFM;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user.UserNavBarMoreAssem;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.aweme.setting.adapter.BlackHolder;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioLinkData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business.BioUserWebSiteComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS158S0100000_4 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    public static final void onClick$12(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialogInterface, int i) {
        BlackHolder.L((BlackHolder) iDCListenerS158S0100000_4.l0, dialogInterface, i);
    }

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
            case 10:
                onClick$10(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, dialogInterface, i);
                return;
            case 12:
                onClick$12(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS158S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Tl().unBindTwitter();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$1(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Tl().unBindTwitter();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$10(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialogInterface, int i) {
        String str;
        ActivityC45651qj LIZ = C212428Vi.LIZ((BioUserWebSiteComponent) iDCListenerS158S0100000_4.l0);
        if (LIZ != null) {
            BioUserWebSiteComponent bioUserWebSiteComponent = (BioUserWebSiteComponent) iDCListenerS158S0100000_4.l0;
            YFM yfm = YFM.LIZIZ;
            BioLinkData bioLinkData = bioUserWebSiteComponent.LJLJJL;
            if (bioLinkData != null) {
                str = bioLinkData.getBioUrl();
            } else {
                str = null;
            }
            yfm.switchToBioUrl(LIZ, str);
        }
    }

    public static final void onClick$11(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialogInterface, int i) {
        KMV kmv;
        if (C2NU.LIZ.LIZIZ()) {
            Bundle bundle = new Bundle();
            AFQ LJFF = AFR.LIZ.LJFF();
            String str = null;
            if (LJFF != null) {
                str = LJFF.getUserId();
            }
            bundle.putString("user_id", str);
            C39398FdC.LIZ.getClass();
            try {
                AppLogNewUtils.LIZJ("log_out", bundle);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            KidsAccountServiceImpl.LJIIIIZZ().LIZIZ();
            Activity activity = ((AFS) iDCListenerS158S0100000_4.l0).LIZ;
            if ((activity instanceof KidsSettingActivity) && (kmv = (KMV) activity) != null) {
                ((C8IC) kmv._$_findCachedViewById(R.id.g94)).setVisibility(0);
            }
            KidsAccountServiceImpl.LJIIIIZZ().logout("user_logout", "user_logout");
            return;
        }
        C5S1 c5s1 = new C5S1(((AFS) iDCListenerS158S0100000_4.l0).LIZ);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public static final void onClick$2(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Tl().unBindTwitter();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$3(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).dm().remove();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$4(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).dm().remove();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$5(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).dm().remove();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$6(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Ml().remove();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$7(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Ml().remove();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$8(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Ml().remove();
        dialog.dismiss();
        ((ProfileEditFragment) iDCListenerS158S0100000_4.l0).Om();
    }

    public static final void onClick$9(IDCListenerS158S0100000_4 iDCListenerS158S0100000_4, DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (i != -2) {
            if (i != -1) {
                User user = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
                if (user != null) {
                    str6 = user.getUid();
                }
                V16.LJFF("cancel", str6, "others_homepage");
                dialogInterface.dismiss();
                return;
            }
            dialogInterface.dismiss();
            UserProfileBlockVM userProfileBlockVM = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUserProfileBlockVM();
            User user2 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
            if (user2 != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            User user3 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
            if (user3 != null) {
                str2 = user3.getSecUid();
            } else {
                str2 = null;
            }
            userProfileBlockVM.gv0(1, str, str2);
            User user4 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
            if (user4 != null) {
                str3 = user4.getUid();
            } else {
                str3 = null;
            }
            V16.LJFF("success", str3, "others_homepage");
            C245999l5.LIZ("confirm");
            C26175APb profileInitData = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getProfileInitData();
            if (profileInitData != null) {
                str4 = profileInitData.LJLJJLL;
            } else {
                str4 = null;
            }
            if (TextUtils.equals(str4, "chat")) {
                User user5 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
                if (user5 != null) {
                    str5 = user5.getUid();
                } else {
                    str5 = null;
                }
                V16.LJFF("chat", str5, "");
            }
            User user6 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
            if (user6 != null && user6.getFollowStatus() == 0) {
                return;
            }
            User user7 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
            if (user7 != null) {
                user7.setFollowStatus(0);
            }
            InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJFF((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
            if (interfaceC235069Kk == null) {
                return;
            }
            C235079Kl.LIZIZ(interfaceC235069Kk, ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser(), null, false, 6);
            return;
        }
        User user8 = ((UserNavBarMoreAssem) iDCListenerS158S0100000_4.l0).getUser();
        if (user8 != null) {
            str6 = user8.getUid();
        }
        V16.LJFF("cancel", str6, "others_homepage");
        C245999l5.LIZ("cancel");
        dialogInterface.dismiss();
    }
}
