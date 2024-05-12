package X;

import com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryViewModel;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryViewModel$load$3$1", f = "BNPLEntryViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aM1, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93137aM1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C64797Pbt<BaseResponse<BNPLEntryData>> LJLIL;
    public final /* synthetic */ BNPLEntryViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93137aM1(C64797Pbt<BaseResponse<BNPLEntryData>> c64797Pbt, BNPLEntryViewModel bNPLEntryViewModel, InterfaceC67352kd<? super C93137aM1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c64797Pbt;
        this.LJLILLLLZI = bNPLEntryViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93137aM1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LIZIZ() && this.LJLIL.LIZIZ.LIZ()) {
            String sessionId = this.LJLIL.LIZIZ.data.getSessionId();
            o.LJIIIZ(sessionId, "<set-?>");
            C91826a0s.LIZLLL = sessionId;
            C92006a3m.LIZ = null;
            C64797Pbt<BaseResponse<BNPLEntryData>> c64797Pbt = this.LJLIL;
            BNPLEntryData bNPLEntryData = c64797Pbt.LIZIZ.data;
            if (bNPLEntryData != null) {
                C92006a3m.LIZ = bNPLEntryData;
            }
            this.LJLILLLLZI.setState(new IDqS418S0100000_31(c64797Pbt, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 100));
        } else {
            this.LJLILLLLZI.setState(new IDqS418S0100000_31(this.LJLIL, (C64797Pbt<BaseResponse<ApplyRepaymentResponse>>) 101));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
