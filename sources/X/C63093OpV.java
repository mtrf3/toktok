package X;

import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.OpV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63093OpV implements InterfaceC87283bg {
    public final TermsConsentInfo LJLIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63093OpV)) {
            return false;
        }
        C63093OpV c63093OpV = (C63093OpV) obj;
        return o.LJ(this.LJLIL, c63093OpV.LJLIL) && o.LJ(this.LJLILLLLZI, c63093OpV.LJLILLLLZI) && o.LJ(this.LJLJI, c63093OpV.LJLJI) && o.LJ(this.LJLJJI, c63093OpV.LJLJJI) && o.LJ(this.LJLJJL, c63093OpV.LJLJJL) && o.LJ(this.LJLJJLL, c63093OpV.LJLJJLL);
    }

    public final int hashCode() {
        int hashCode;
        TermsConsentInfo termsConsentInfo = this.LJLIL;
        if (termsConsentInfo == null) {
            hashCode = 0;
        } else {
            hashCode = termsConsentInfo.hashCode();
        }
        return this.LJLJJLL.hashCode() + QZY.LIZIZ(this.LJLJJL, QZY.LIZIZ(this.LJLJJI, QZY.LIZIZ(this.LJLJI, QZY.LIZIZ(this.LJLILLLLZI, hashCode * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TermsConditionsUIData(info=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onCheckAllAction=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onCheckTermsAction=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onCheckPrivacyPolicyAction=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", onCheckNotificationAction=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", onNextAction=");
        return C06540Nm.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C63093OpV(TermsConsentInfo termsConsentInfo, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns4, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = termsConsentInfo;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC88472Yns2;
        this.LJLJJI = interfaceC88472Yns3;
        this.LJLJJL = interfaceC88472Yns4;
        this.LJLJJLL = interfaceC65784Pro;
    }
}
