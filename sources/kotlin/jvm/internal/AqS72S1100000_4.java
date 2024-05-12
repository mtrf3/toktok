package kotlin.jvm.internal;

import X.AbstractC253779xd;
import X.AbstractC65781Prl;
import X.AnonymousClass114;
import X.C36922EeM;
import X.C45804HyK;
import X.C76800UCe;
import X.C78857UxB;
import X.C78983UzD;
import X.InterfaceC65784Pro;
import X.OHT;
import X.Q0C;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem;
import com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS72S1100000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS72S1100000_4 r7) {
        /*
            java.lang.Object r0 = r7.l1
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            java.lang.String r0 = r0.getParamValue()
            if (r0 == 0) goto L21
            int r0 = r0.length()
            if (r0 != 0) goto L8
        L21:
            if (r1 != 0) goto L57
        L23:
            java.util.HashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement>> r6 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LIZIZ
            java.lang.String r5 = r7.s0
            java.lang.Object r0 = r7.l1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            X.SAN r1 = X.SAN.LIZ
            java.lang.String r0 = r0.getElement()
            r1.getClass()
            boolean r0 = X.SAN.LJFF(r0)
            if (r0 == 0) goto L34
            r4.add(r2)
            goto L34
        L54:
            r6.put(r5, r4)
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS72S1100000_4.invoke$0(kotlin.jvm.internal.AqS72S1100000_4):java.lang.Object");
    }

    public static final Object invoke$1(AqS72S1100000_4 aqS72S1100000_4) {
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aqS72S1100000_4.l1;
        String str = aqS72S1100000_4.s0;
        thirdPartyBindingPage.getClass();
        ThirdPartyBindingPage.Dl(str, "need_pwd");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS72S1100000_4 aqS72S1100000_4) {
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aqS72S1100000_4.l1;
        String str = aqS72S1100000_4.s0;
        thirdPartyBindingPage.getClass();
        ThirdPartyBindingPage.Al(str, "need_pwd", "ok");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS72S1100000_4 aqS72S1100000_4) {
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aqS72S1100000_4.l1;
        String str = aqS72S1100000_4.s0;
        thirdPartyBindingPage.getClass();
        ThirdPartyBindingPage.Dl(str, "only_login");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS72S1100000_4 aqS72S1100000_4) {
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aqS72S1100000_4.l1;
        String str = aqS72S1100000_4.s0;
        thirdPartyBindingPage.getClass();
        ThirdPartyBindingPage.Al(str, "only_login", "ok");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS72S1100000_4 aqS72S1100000_4) {
        ((AbstractC253779xd) aqS72S1100000_4.l1).LIZLLL().LJJLIIIJJIZ(new AqS29S1000000_4(aqS72S1100000_4.s0, 40));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS72S1100000_4 aqS72S1100000_4) {
        Activity LJIJJ;
        ProfileEnterpriseBAAssem profileEnterpriseBAAssem = (ProfileEnterpriseBAAssem) aqS72S1100000_4.l1;
        String str = aqS72S1100000_4.s0;
        profileEnterpriseBAAssem.getClass();
        if (!TextUtils.isEmpty(str) && profileEnterpriseBAAssem.getContext() != null) {
            try {
                OHT.LIZ(str, str, profileEnterpriseBAAssem.getContext(), C78857UxB.LJJIIJ(1476399110, "bpea-220"));
            } catch (Q0C e) {
                C78983UzD.LJIIZILJ(e);
                C36922EeM.LIZ(e);
            }
        }
        Context context = ((ProfileEnterpriseBAAssem) aqS72S1100000_4.l1).getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            AnonymousClass114.LIZ(LJIJJ, R.string.ceg);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S1100000_4(AbstractC253779xd abstractC253779xd, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC253779xd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S1100000_4(ProfileEnterpriseBAAssem profileEnterpriseBAAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = profileEnterpriseBAAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S1100000_4(ThirdPartyBindingPage thirdPartyBindingPage, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = thirdPartyBindingPage;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S1100000_4(List list, List<PaymentElement> list2, String str) {
        super(0);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }
}
