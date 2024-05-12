package X;

import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem;
import fjb.a;
import kotlin.jvm.internal.AqS186S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem$onViewCreated$1$1$1", f = "SeriesDraftAdvanceVoucherPriceAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9q0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249049q0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SeriesDraftAdvanceVoucherPriceAssem LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Price> LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Price> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<PricesResponse> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C249049q0(SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem, InterfaceC35811ar<Price> interfaceC35811ar, InterfaceC35811ar<Boolean> interfaceC35811ar2, InterfaceC35811ar<Price> interfaceC35811ar3, InterfaceC35811ar<PricesResponse> interfaceC35811ar4, InterfaceC67352kd<? super C249049q0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = seriesDraftAdvanceVoucherPriceAssem;
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC35811ar2;
        this.LJLJJI = interfaceC35811ar3;
        this.LJLJJL = interfaceC35811ar4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C249049q0(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem = this.LJLIL;
        C8YN.LJII(seriesDraftAdvanceVoucherPriceAssem, seriesDraftAdvanceVoucherPriceAssem.H3(), new TBT() { // from class: X.9pz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C248629pK) obj2).LJLJJI;
            }
        }, null, new AqS186S0100000_4(this.LJLILLLLZI, (InterfaceC35811ar<Price>) 162), 6);
        SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem2 = this.LJLIL;
        C8YN.LJII(seriesDraftAdvanceVoucherPriceAssem2, seriesDraftAdvanceVoucherPriceAssem2.H3(), new TBT() { // from class: X.9py
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C248629pK) obj2).LJLJJLL);
            }
        }, null, new AqS186S0100000_4(this.LJLJI, (InterfaceC35811ar<Price>) 163), 6);
        SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem3 = this.LJLIL;
        C8YN.LJII(seriesDraftAdvanceVoucherPriceAssem3, seriesDraftAdvanceVoucherPriceAssem3.H3(), new TBT() { // from class: X.9q1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C248629pK) obj2).LJLJJL;
            }
        }, null, new AqS186S0100000_4(this.LJLJJI, (InterfaceC35811ar<Price>) 164), 6);
        SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem4 = this.LJLIL;
        C8YN.LJII(seriesDraftAdvanceVoucherPriceAssem4, seriesDraftAdvanceVoucherPriceAssem4.H3(), new TBT() { // from class: X.9q2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C248629pK) obj2).LJLLLL;
            }
        }, null, new AqS186S0100000_4(this.LJLJJL, (InterfaceC35811ar<Price>) 165), 6);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
