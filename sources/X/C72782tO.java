package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$openSku$1", f = "PdpViewModel.kt", l = {2765}, m = "invokeSuspend")
/* renamed from: X.2tO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72782tO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, String, Object, C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C72782tO(PdpViewModel pdpViewModel, boolean z, long j, View view, int i, String str, String str2, InterfaceC88473Ynt<? super Boolean, ? super String, Object, C76800UCe> interfaceC88473Ynt, InterfaceC67352kd<? super C72782tO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = view;
        this.LJLJJLL = i;
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJLLL = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72782tO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            PdpViewModel pdpViewModel = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            C69932RcW c69932RcW = new C69932RcW(pdpViewModel, z, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, null);
            this.LJLIL = 1;
            if (pdpViewModel.Nw0(this, c69932RcW, z) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
