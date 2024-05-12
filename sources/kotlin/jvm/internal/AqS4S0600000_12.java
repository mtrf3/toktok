package kotlin.jvm.internal;

import X.ASL;
import X.AbstractC26082ALm;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C163586bS;
import X.C163596bT;
import X.C173936s9;
import X.C17N;
import X.C1DF;
import X.C1DG;
import X.C27943Axv;
import X.C70414RkI;
import X.C76800UCe;
import X.C79045V0n;
import X.DialogC25756A8y;
import X.InterfaceC73149SnJ;
import X.InterfaceC73150SnK;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC98243tM;
import X.SPH;
import X.TBW;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.model.PrivacyVideoRestrictionModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.VideoPrivacySettingUnFoldFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class AqS4S0600000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S0600000_12 aqS4S0600000_12, Object obj) {
        InterfaceC88471Ynr interfaceC88471Ynr;
        InterfaceC98243tM receiver;
        InterfaceC98243tM receiver2;
        InterfaceC98243tM receiver3;
        AbstractC26082ALm async = (AbstractC26082ALm) obj;
        o.LJIIJ(async, "async");
        if (async instanceof C163596bT) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS4S0600000_12.l3;
            if (interfaceC88472Yns != null && (receiver3 = ((InterfaceC73149SnJ) aqS4S0600000_12.l0).getReceiver()) != null) {
                interfaceC88472Yns.invoke(receiver3);
            }
        } else if (async instanceof C163586bS) {
            InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) aqS4S0600000_12.l4;
            if (interfaceC88471Ynr2 != null && (receiver2 = ((InterfaceC73149SnJ) aqS4S0600000_12.l0).getReceiver()) != null) {
                interfaceC88471Ynr2.invoke(receiver2, ((C163586bS) async).LIZ);
            }
        } else if ((async instanceof C173936s9) && (interfaceC88471Ynr = (InterfaceC88471Ynr) aqS4S0600000_12.l5) != null && (receiver = ((InterfaceC73149SnJ) aqS4S0600000_12.l0).getReceiver()) != null) {
            interfaceC88471Ynr.invoke(receiver, ((C173936s9) async).LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S0600000_12 aqS4S0600000_12, Object obj) {
        String str;
        String str2;
        String str3;
        PrivacyVideoRestrictionModel resp = (PrivacyVideoRestrictionModel) obj;
        o.LJIIIZ(resp, "resp");
        ((DialogC25756A8y) aqS4S0600000_12.l0).dismiss();
        Bundle bundle = (Bundle) aqS4S0600000_12.l1;
        String str4 = null;
        if (bundle != null) {
            str = bundle.getString("tab_name");
        } else {
            str = null;
        }
        Bundle bundle2 = (Bundle) aqS4S0600000_12.l1;
        if (bundle2 != null) {
            str2 = bundle2.getString("enter_from");
        } else {
            str2 = null;
        }
        Bundle bundle3 = (Bundle) aqS4S0600000_12.l1;
        if (bundle3 != null) {
            str3 = bundle3.getString("enter_method");
        } else {
            str3 = null;
        }
        Bundle bundle4 = (Bundle) aqS4S0600000_12.l1;
        if (bundle4 != null) {
            str4 = bundle4.getString("impr_id");
        }
        Bundle LIZJ = AnonymousClass036.LIZJ("tab_name", str, "enter_from", str2);
        LIZJ.putString("enter_method", str3);
        LIZJ.putString("impr_id", str4);
        LIZJ.putSerializable("restriction", resp.getRestriction());
        LIZJ.putSerializable("settings", resp.getSettings());
        VideoPrivacySettingUnFoldFragment videoPrivacySettingUnFoldFragment = new VideoPrivacySettingUnFoldFragment();
        videoPrivacySettingUnFoldFragment.setArguments(LIZJ);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = videoPrivacySettingUnFoldFragment;
        asl.LJI(1);
        asl.LIZ.LJLLLLLL = C17N.LJIILL(410.0d);
        Integer LJI = C79045V0n.LJI(R.attr.c9, (Context) aqS4S0600000_12.l2);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLJL = LJI;
        tuxSheet.LJLILLLLZI = new SPH((PrivacySettingDialogRouter) aqS4S0600000_12.l4, (Aweme) aqS4S0600000_12.l5, videoPrivacySettingUnFoldFragment);
        C1DG.LJII((ActivityC45651qj) aqS4S0600000_12.l3, "it.supportFragmentManager", tuxSheet, "PrivacySettingDialog");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS4S0600000_12 aqS4S0600000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS4S0600000_12.l0).LIZIZ);
        Integer num = (Integer) aqS4S0600000_12.l1;
        if (num != null) {
            sendLog.LIZJ("is_satisfied", Integer.valueOf(num.intValue()));
        }
        Object obj2 = aqS4S0600000_12.l2;
        if (obj2 != null) {
            sendLog.LIZJ("conversion_status", obj2);
        }
        Integer num2 = (Integer) aqS4S0600000_12.l3;
        if (num2 != null) {
            sendLog.LIZJ("is_interact", Integer.valueOf(num2.intValue()));
        }
        Long l = (Long) aqS4S0600000_12.l4;
        if (l != null) {
            sendLog.LIZJ("longstay_time", Long.valueOf(l.longValue()));
        }
        Object obj3 = aqS4S0600000_12.l5;
        if (obj3 != null) {
            sendLog.LIZJ("user_type", obj3);
        }
        C1DF.LIZJ(((C70414RkI) aqS4S0600000_12.l0).LIZIZ, false, sendLog, false, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0600000_12(DialogC25756A8y dialogC25756A8y, Bundle bundle, Context context, ActivityC45651qj activityC45651qj, PrivacySettingDialogRouter privacySettingDialogRouter, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialogC25756A8y;
        this.l1 = bundle;
        this.l2 = context;
        this.l3 = activityC45651qj;
        this.l4 = privacySettingDialogRouter;
        this.l5 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0600000_12(C70414RkI c70414RkI, Integer num, Object obj, Integer num2, Long l, Object obj2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c70414RkI;
        this.l1 = num;
        this.l2 = obj;
        this.l3 = num2;
        this.l4 = l;
        this.l5 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0600000_12(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBW tbw, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC73149SnJ;
        this.l1 = interfaceC73150SnK;
        this.l2 = tbw;
        this.l3 = interfaceC88472Yns;
        this.l4 = interfaceC88471Ynr;
        this.l5 = interfaceC88471Ynr2;
    }
}
