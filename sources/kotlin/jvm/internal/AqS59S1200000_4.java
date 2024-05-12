package kotlin.jvm.internal;

import X.A2X;
import X.AV1;
import X.AbstractC65781Prl;
import X.C0NY;
import X.C17J;
import X.C237559Tz;
import X.C26218AQs;
import X.C76800UCe;
import X.C9L8;
import X.InterfaceC65784Pro;
import X.X1D;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem;

/* loaded from: classes5.dex */
public class AqS59S1200000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS59S1200000_4 aqS59S1200000_4) {
        OfflineModeSwitchComponent offlineModeSwitchComponent = (OfflineModeSwitchComponent) aqS59S1200000_4.l1;
        String str = aqS59S1200000_4.s0;
        A2X a2x = (A2X) aqS59S1200000_4.l2;
        if (offlineModeSwitchComponent.getContext() != null) {
            OfflineModeSwitchComponent.LJLJJLL.LIZ(null, "enterOfflineModePage");
            C26218AQs.LIZ("click_offline_mode_toast", str, null, null, null, null, null, null, null, null, null, null, null, null, null, a2x.getMobName(), null, null, null, null, null, null, null, 8355836);
            OfflineModeListVM.LJLJI = System.currentTimeMillis();
            SmartRoute buildRoute = SmartRouter.buildRoute(offlineModeSwitchComponent.getContext(), "aweme://aweme/detail/");
            buildRoute.withParam("event_type", str);
            buildRoute.withParam("enter_method", "click_toast");
            buildRoute.withParam("video_type", 50);
            buildRoute.withParam("video_from", "from_offline_mode");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("offline_mode_video_list_vm_key");
            LIZ.append(OfflineModeListVM.LJLJI);
            buildRoute.withParam("enter_from", X1D.LIZIZ(LIZ));
            C0NY.LIZJ(buildRoute, "refer", "offline_mode_page", "activity_has_activity_options", true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS59S1200000_4 aqS59S1200000_4) {
        String str;
        ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).LJLJJI = C9L8.LIZ(BAProfilePageServiceImpl.LJIIJJI(), ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).getContext(), 4, aqS59S1200000_4.s0, null, null, 48);
        String uid = ((User) aqS59S1200000_4.l2).getUid();
        if (uid != null && !AV1.LJIJI(uid)) {
            User user = (User) aqS59S1200000_4.l2;
            ProfileEnterpriseBAAssem profileEnterpriseBAAssem = (ProfileEnterpriseBAAssem) aqS59S1200000_4.l1;
            String str2 = aqS59S1200000_4.s0;
            C237559Tz c237559Tz = new C237559Tz();
            Aweme aweme = profileEnterpriseBAAssem.getAweme();
            String enterFrom = profileEnterpriseBAAssem.getEnterFrom();
            if (profileEnterpriseBAAssem.LJLJJI) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            if (str2 == null) {
                str2 = "";
            }
            c237559Tz.LJIILL(user, aweme, enterFrom, str, str2);
        }
        ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).C3((User) aqS59S1200000_4.l2, "download_link");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS59S1200000_4 aqS59S1200000_4) {
        ProfileEnterpriseBAAssem profileEnterpriseBAAssem = (ProfileEnterpriseBAAssem) aqS59S1200000_4.l1;
        C17J.LJJJ(profileEnterpriseBAAssem, profileEnterpriseBAAssem.L7(), "email");
        ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).C3((User) aqS59S1200000_4.l2, "email");
        C237559Tz c237559Tz = new C237559Tz();
        User user = (User) aqS59S1200000_4.l2;
        Aweme aweme = ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).getAweme();
        String enterFrom = ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).getEnterFrom();
        String email = aqS59S1200000_4.s0;
        o.LJIIIZ(email, "email");
        c237559Tz.LJIIIZ(user, aweme);
        c237559Tz.LIZJ("enter_from", enterFrom);
        c237559Tz.LIZJ("email", email);
        c237559Tz.LJII("ttelite_BA_email_button_clicked", "to_user_id", "user_id", "item_id");
        C9L8.LIZ(BAProfilePageServiceImpl.LJIIJJI(), ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).getContext(), 2, aqS59S1200000_4.s0, ((ProfileEnterpriseBAAssem) aqS59S1200000_4.l1).getAweme(), null, 48);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS59S1200000_4(com.ss.android.ugc.aweme.profile.model.User r3, com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.l2 = r3
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS59S1200000_4.<init>(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S1200000_4(OfflineModeSwitchComponent offlineModeSwitchComponent, String str, A2X a2x, int i) {
        super(0);
        this.$t = i;
        this.l1 = offlineModeSwitchComponent;
        this.s0 = str;
        this.l2 = a2x;
    }
}
