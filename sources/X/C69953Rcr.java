package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.PdpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel$loadProductInfo$1", f = "PdpMainViewModel.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.Rcr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69953Rcr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public PdpMainViewModel LJLIL;
    public C70300RiS LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ PdpMainViewModel LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69953Rcr(boolean z, PdpMainViewModel pdpMainViewModel, boolean z2, InterfaceC67352kd<? super C69953Rcr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = pdpMainViewModel;
        this.LJLJJLL = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69953Rcr(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0076: INVOKE (r5 I:com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel), (r4 I:int) VIRTUAL call: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel.mv0(int):void A[MD:(int):void (m)] (LINE:16777334), block:B:34:0x0076 */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PdpMainViewModel mv0;
        C70300RiS iv0;
        PdpMainViewModel pdpMainViewModel;
        boolean z;
        Integer num;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    iv0 = this.LJLILLLLZI;
                    pdpMainViewModel = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                if (this.LJLJJI) {
                    this.LJLJJL.mv0(0);
                }
                iv0 = this.LJLJJL.iv0();
                pdpMainViewModel = this.LJLJJL;
                boolean z2 = this.LJLJJLL;
                InterfaceC69954Rcs interfaceC69954Rcs = (InterfaceC69954Rcs) pdpMainViewModel.LJLJL.getValue().getOperator();
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLIL = pdpMainViewModel;
                this.LJLILLLLZI = iv0;
                this.LJLJI = 1;
                obj = interfaceC69954Rcs.LJLLILLLL(iv0, z, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            PdpResponse pdpResponse = (PdpResponse) obj;
            if (pdpResponse == null || (num = pdpResponse.code) == null || num.intValue() != 0 || pdpResponse.data == null) {
                pdpMainViewModel.mv0(3);
            } else {
                iv0.LJLJJLL = true;
                pdpMainViewModel.mv0(-1);
                pdpMainViewModel.gv0(pdpResponse.data.dynamicPage);
            }
        } catch (Exception unused) {
            mv0.mv0(3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
