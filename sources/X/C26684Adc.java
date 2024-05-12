package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.security.PdpSecurityHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SecurityFragment;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.security.PdpSecurityHolder$eventTrackingAndOpen$1$2", f = "PdpSecurityHolder.kt", l = {133}, m = "invokeSuspend")
/* renamed from: X.Adc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26684Adc extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpSecurityHolder LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26684Adc(PdpSecurityHolder pdpSecurityHolder, InterfaceC67352kd<? super C26684Adc> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = pdpSecurityHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26684Adc(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            PdpSecurityHolder pdpSecurityHolder = this.LJLILLLLZI;
            Fragment fragment = pdpSecurityHolder.LJLIL;
            C26671AdP c26671AdP = (C26671AdP) pdpSecurityHolder.getItem();
            this.LJLIL = 1;
            if (fragment == 0 || fragment.getFragmentManager() == null) {
                obj2 = C76800UCe.LIZ;
            } else {
                c26671AdP.getClass();
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                SecurityFragment.LJLILLLLZI = c84654XKg;
                FragmentManager fragmentManager = fragment.getFragmentManager();
                if (fragmentManager != null) {
                    ASL LIZ = C249109q6.LIZ(1);
                    LIZ.LIZ.LJLLLLLL = (int) C27162AlK.LIZJ;
                    SecurityFragment securityFragment = new SecurityFragment();
                    Bundle LIZ2 = C0H1.LIZ("title", null);
                    if (fragment instanceof InterfaceC71003Rtn) {
                        C79234V7u.LJJIJIIJI(LIZ2, (InterfaceC71003Rtn) fragment, new AqS170S0100000_4(c26671AdP, 306));
                    }
                    securityFragment.setArguments(LIZ2);
                    TuxSheet tuxSheet = LIZ.LIZ;
                    tuxSheet.LJLLILLLL = securityFragment;
                    tuxSheet.LJZI = false;
                    tuxSheet.show(fragmentManager, "CommerceSecurityFragment");
                }
                obj2 = c84654XKg.LIZ();
                if (obj2 != enumC58928NAu) {
                    obj2 = C76800UCe.LIZ;
                }
            }
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
