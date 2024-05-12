package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspPreviewManager$performPreview$1", f = "OspPreviewManager.kt", l = {205}, m = "invokeSuspend")
/* renamed from: X.Ad0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26646Ad0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC68342mE<AddressListData> LJLILLLLZI;
    public final /* synthetic */ C26804AfY LJLJI;
    public final /* synthetic */ C27724AuO LJLJJI;
    public final /* synthetic */ C68322mC<C27042AjO> LJLJJL;
    public final /* synthetic */ C28002Ays LJLJJLL;
    public final /* synthetic */ AbstractC73230Soc<Object> LJLJL;
    public final /* synthetic */ OrderSubmitViewModel LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26646Ad0(InterfaceC68342mE<AddressListData> interfaceC68342mE, C26804AfY c26804AfY, C27724AuO c27724AuO, C68322mC<C27042AjO> c68322mC, C28002Ays c28002Ays, AbstractC73230Soc<Object> abstractC73230Soc, OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C26646Ad0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC68342mE;
        this.LJLJI = c26804AfY;
        this.LJLJJI = c27724AuO;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = c28002Ays;
        this.LJLJL = abstractC73230Soc;
        this.LJLJLJ = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26646Ad0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
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
            InterfaceC68342mE<AddressListData> interfaceC68342mE = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C26636Acq.LIZ((AddressListData) obj));
        arrayList.add(this.LJLJI);
        arrayList.add(this.LJLJJI);
        C27042AjO c27042AjO = this.LJLJJL.element;
        if (c27042AjO != null) {
            arrayList.add(c27042AjO);
        }
        arrayList.add(this.LJLJJLL);
        AbstractC73230Soc<Object> abstractC73230Soc = this.LJLJL;
        abstractC73230Soc.getClass();
        C73227SoZ.LIZ(abstractC73230Soc, arrayList);
        this.LJLJLJ.Sw0(-1);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
