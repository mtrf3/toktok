package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aDG, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92594aDG extends AbstractC65781Prl implements InterfaceC88474Ynu<UIAssem, EnumC92024a44, ConfirmRegisterMobileResponse, String, C76800UCe> {
    public final /* synthetic */ PhoneNumberAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92594aDG(PhoneNumberAssem phoneNumberAssem) {
        super(4);
        this.LJLIL = phoneNumberAssem;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(UIAssem uIAssem, EnumC92024a44 enumC92024a44, ConfirmRegisterMobileResponse confirmRegisterMobileResponse, String str) {
        String str2;
        boolean z;
        View view;
        UIAssem selectSubscribe = uIAssem;
        EnumC92024a44 status = enumC92024a44;
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse2 = confirmRegisterMobileResponse;
        String str3 = str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        int i = C91799a0R.LIZ[status.ordinal()];
        boolean z2 = false;
        View view2 = null;
        if (i != 1) {
            if (i == 2) {
                if (str3 == null) {
                    ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
                    if (LIZ != null) {
                        C26045AKb c26045AKb = new C26045AKb(LIZ);
                        c26045AKb.LJIIIZ(LIZ.getString(R.string.f3f));
                        c26045AKb.LJIIJ();
                    }
                } else if (str3.length() == 0) {
                    ActivityC45651qj LIZ2 = C212428Vi.LIZ(selectSubscribe);
                    if (LIZ2 != null) {
                        C26045AKb c26045AKb2 = new C26045AKb(LIZ2);
                        c26045AKb2.LJIIIZ(LIZ2.getString(R.string.f3g));
                        c26045AKb2.LJIIJ();
                    }
                } else {
                    View containerView = selectSubscribe.getContainerView();
                    if (containerView != null) {
                        view = containerView.findViewById(R.id.fg);
                    } else {
                        view = null;
                    }
                    ((C252949wI) view).LIZIZ(str3);
                }
            }
        } else {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLIL);
            if (LJIIIIZZ != null) {
                PhoneNumberAssem phoneNumberAssem = this.LJLIL;
                if (confirmRegisterMobileResponse2 != null && (str2 = confirmRegisterMobileResponse2.verifyInfo) != null) {
                    C92033a4D.LIZLLL(LJIIIIZZ, str2, "bnpl_activate_phone_number", new IDqS441S0100000_31(phoneNumberAssem, 2));
                }
            }
        }
        View containerView2 = selectSubscribe.getContainerView();
        if (containerView2 != null) {
            view2 = containerView2.findViewById(R.id.fi);
        }
        SY4 sy4 = (SY4) view2;
        EnumC92024a44 enumC92024a442 = EnumC92024a44.LOADING;
        if (status == enumC92024a442) {
            z = true;
        } else {
            z = false;
        }
        sy4.setLoading(z);
        PhoneNumberAssem phoneNumberAssem2 = this.LJLIL;
        if (status == enumC92024a442) {
            z2 = true;
        }
        phoneNumberAssem2.LJLJJI = z2;
        return C76800UCe.LIZ;
    }
}
