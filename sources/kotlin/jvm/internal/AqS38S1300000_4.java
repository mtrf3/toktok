package kotlin.jvm.internal;

import X.AA5;
import X.AbstractC65781Prl;
import X.C17J;
import X.C237559Tz;
import X.C25763A9f;
import X.C25765A9h;
import X.C27117Akb;
import X.C75792yF;
import X.C76800UCe;
import X.C9XU;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.LFH;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;

/* loaded from: classes5.dex */
public class AqS38S1300000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AqS38S1300000_4 aqS38S1300000_4) {
        USMainOrderInfoVH uSMainOrderInfoVH = (USMainOrderInfoVH) aqS38S1300000_4.l1;
        Context context = ((C27117Akb) aqS38S1300000_4.l2).getContext();
        o.LJIIIIZZ(context, "context");
        uSMainOrderInfoVH.M(context, (LogisticDTO) aqS38S1300000_4.l3, aqS38S1300000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS38S1300000_4 aqS38S1300000_4) {
        Dialog dialog;
        C25765A9h c25765A9h = (C25765A9h) aqS38S1300000_4.l1;
        CustomDialogFragment customDialogFragment = c25765A9h.LJLLILLLL;
        if (customDialogFragment != null) {
            customDialogFragment.LJLJJLL = new AqS135S0200000_4(c25765A9h, (C25765A9h) aqS38S1300000_4.l3, (InterfaceC88472Yns<? super AA5, C76800UCe>) 236);
            if ((!((C25765A9h) aqS38S1300000_4.l1).LIZJ().isFinishing()) && ((dialog = customDialogFragment.getDialog()) == null || !dialog.isShowing())) {
                customDialogFragment.show((FragmentManager) aqS38S1300000_4.l2, aqS38S1300000_4.s0);
                C25765A9h c25765A9h2 = (C25765A9h) aqS38S1300000_4.l1;
                c25765A9h2.getClass();
                if (LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 1) {
                    C9XU.LIZIZ(c25765A9h2.LIZJ(), new C25763A9f(c25765A9h2));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS38S1300000_4 aqS38S1300000_4) {
        String str;
        BizContactInfo bizContactInfo;
        ProfileEnterpriseBAAssem profileEnterpriseBAAssem = (ProfileEnterpriseBAAssem) aqS38S1300000_4.l1;
        C17J.LJJJ(profileEnterpriseBAAssem, profileEnterpriseBAAssem.L7(), "contact");
        BizContactInfo bizContactInfo2 = (BizContactInfo) aqS38S1300000_4.l2;
        if (bizContactInfo2 != null) {
            str = bizContactInfo2.getType();
        } else {
            str = null;
        }
        boolean equals = TextUtils.equals(str, "v2");
        if (!equals && (bizContactInfo = (BizContactInfo) aqS38S1300000_4.l2) != null) {
            bizContactInfo.setText(null);
        }
        new C237559Tz().LJIJI(((ProfileEnterpriseBAAssem) aqS38S1300000_4.l1).getAweme(), ((User) aqS38S1300000_4.l3).getUid(), equals, ((ProfileEnterpriseBAAssem) aqS38S1300000_4.l1).getEnterFrom());
        BAProfilePageServiceImpl.LJIIJJI().LJI(3, ((ProfileEnterpriseBAAssem) aqS38S1300000_4.l1).getContext(), null, aqS38S1300000_4.s0, ((User) aqS38S1300000_4.l3).getUid(), C75792yF.LIZJ((BizContactInfo) aqS38S1300000_4.l2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS38S1300000_4(C25765A9h c25765A9h, C25765A9h c25765A9h2, FragmentManager fragmentManager, String str, InterfaceC88472Yns<? super AA5, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l1 = c25765A9h;
        this.l2 = c25765A9h2;
        this.s0 = fragmentManager;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S1300000_4(USMainOrderInfoVH uSMainOrderInfoVH, C27117Akb c27117Akb, String str, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l1 = uSMainOrderInfoVH;
        this.l2 = c27117Akb;
        this.s0 = str;
        this.l3 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S1300000_4(ProfileEnterpriseBAAssem profileEnterpriseBAAssem, BizContactInfo bizContactInfo, User user, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = profileEnterpriseBAAssem;
        this.l2 = bizContactInfo;
        this.l3 = user;
        this.s0 = str;
    }
}
