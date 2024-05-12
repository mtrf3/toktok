package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.TtfUkUserRightVH;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.TtfUkUserRightVH$onClick$1", f = "TtfUkUserRightVH.kt", l = {123}, m = "invokeSuspend")
/* renamed from: X.Ajx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27077Ajx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TtfUkUserRightVH LJLILLLLZI;
    public final /* synthetic */ C5H3<PdpViewModel> LJLJI;
    public final /* synthetic */ List<UserRightDetail> LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27077Ajx(TtfUkUserRightVH ttfUkUserRightVH, C5H3<? extends PdpViewModel> c5h3, List<UserRightDetail> list, String str, InterfaceC67352kd<? super C27077Ajx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ttfUkUserRightVH;
        this.LJLJI = c5h3;
        this.LJLJJI = list;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27077Ajx(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC71003Rtn interfaceC71003Rtn;
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
            InterfaceC36571c5 interfaceC36571c5 = this.LJLILLLLZI.LJLIL;
            if ((interfaceC36571c5 instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC36571c5) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70919RsR(), new AqS170S0100000_4(this.LJLILLLLZI, 1143));
            }
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("rights_service");
            PdpViewModel value = this.LJLJI.getValue();
            C27076Ajw c27076Ajw = new C27076Ajw(this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = 1;
            if (value.Nw0(this, c27076Ajw, false) == enumC58928NAu) {
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
