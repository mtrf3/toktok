package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel$loopForResult$1$2", f = "ReapymentRetViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLo, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93124aLo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ InterfaceC88475Ynv<Integer, Long, EnumC91916a2K, EnumC91995a3b, RepaymentResultInfo, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C64797Pbt<BaseResponse<RepaymentResultInfo>> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93124aLo(C72242sW c72242sW, InterfaceC88475Ynv<? super Integer, ? super Long, ? super EnumC91916a2K, ? super EnumC91995a3b, ? super RepaymentResultInfo, C76800UCe> interfaceC88475Ynv, C76732zl c76732zl, String str, C64797Pbt<BaseResponse<RepaymentResultInfo>> c64797Pbt, InterfaceC67352kd<? super C93124aLo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = interfaceC88475Ynv;
        this.LJLJI = c76732zl;
        this.LJLJJI = str;
        this.LJLJJL = c64797Pbt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93124aLo(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.element;
        InterfaceC88475Ynv<Integer, Long, EnumC91916a2K, EnumC91995a3b, RepaymentResultInfo, C76800UCe> interfaceC88475Ynv = this.LJLILLLLZI;
        Integer num = new Integer(this.LJLJI.element);
        Long l = new Long(currentTimeMillis);
        EnumC91916a2K enumC91916a2K = EnumC91916a2K.SUCCESS;
        C91994a3a c91994a3a = EnumC91995a3b.Companion;
        String value = this.LJLJJI;
        c91994a3a.getClass();
        o.LJIIIZ(value, "value");
        for (EnumC91995a3b enumC91995a3b : EnumC91995a3b.values()) {
            if (o.LJ(enumC91995a3b.getValue(), value)) {
                interfaceC88475Ynv.invoke(num, l, enumC91916a2K, enumC91995a3b, this.LJLJJL.LIZIZ.data);
                return C76800UCe.LIZ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
