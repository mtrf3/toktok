package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillHomeData;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS8S1000000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeViewModel$load$2", f = "BillHomeViewModel.kt", l = {104}, m = "invokeSuspend")
/* renamed from: X.aKi, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93056aKi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BillHomeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93056aKi(BillHomeViewModel billHomeViewModel, InterfaceC67352kd<? super C93056aKi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = billHomeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93056aKi(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                this.LJLILLLLZI.LJLJJI = System.currentTimeMillis();
                InterfaceC92249a7h interfaceC92249a7h = (InterfaceC92249a7h) ((InterfaceC214228aw) this.LJLILLLLZI.LJLIL.getValue()).getOperator();
                this.LJLIL = 1;
                obj = interfaceC92249a7h.LJLJJL(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            BaseResponse baseResponse = (BaseResponse) c64797Pbt.LIZIZ;
            if (c64797Pbt.LIZIZ() && baseResponse.LIZ()) {
                BillHomeData billHomeData = (BillHomeData) baseResponse.data;
                C91917a2L c91917a2L = EnumC91918a2M.Companion;
                String value = billHomeData.userBillStatus;
                c91917a2L.getClass();
                o.LJIIIZ(value, "value");
                for (EnumC91918a2M enumC91918a2M : EnumC91918a2M.values()) {
                    if (o.LJ(enumC91918a2M.getValue(), value)) {
                        String LIZIZ = C91934a2c.LIZIZ(billHomeData.availableAmount);
                        String LIZIZ2 = C91934a2c.LIZIZ(billHomeData.limitAmount);
                        C91919a2N c91919a2N = EnumC91920a2O.Companion;
                        String value2 = billHomeData.userStatus;
                        c91919a2N.getClass();
                        o.LJIIIZ(value2, "value");
                        for (EnumC91920a2O enumC91920a2O : EnumC91920a2O.values()) {
                            if (o.LJ(enumC91920a2O.getValue(), value2)) {
                                this.LJLILLLLZI.LJLJI = System.currentTimeMillis();
                                this.LJLILLLLZI.iv0(billHomeData);
                                this.LJLILLLLZI.setState(new C92544aCS(billHomeData, enumC91920a2O, enumC91918a2M, LIZIZ, LIZIZ2));
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            if (c64797Pbt.LIZIZ()) {
                str = ((BaseResponse) c64797Pbt.LIZIZ).errorContent;
            } else {
                str = null;
            }
            this.LJLILLLLZI.setState(new IDqS8S1000000_31(str, 1));
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new IDqS418S0100000_31(e, 13));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
