package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSug;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSugResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.TakoSugWordRequestService$requestSugWord$1$1", f = "TakoSugWordRequestService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71322r2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TakoSugResponse LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<TakoSugResponse, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71322r2(TakoSugResponse takoSugResponse, InterfaceC88472Yns<? super TakoSugResponse, C76800UCe> interfaceC88472Yns, C109544Rq c109544Rq, boolean z, InterfaceC67352kd<? super C71322r2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = takoSugResponse;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = c109544Rq;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71322r2(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        TakoSugResponse takoSugResponse = this.LJLIL;
        TakoSugResponse takoSugResponse2 = null;
        ArrayList arrayList = null;
        if (takoSugResponse != null) {
            List<TakoSug> sugList = takoSugResponse.getSugList();
            if (sugList != null) {
                C109544Rq c109544Rq = this.LJLJI;
                boolean z = this.LJLJJI;
                arrayList = new ArrayList(C32I.LJJL(sugList, 10));
                for (TakoSug takoSug : sugList) {
                    String LIZJ = C93793mB.LIZJ(c109544Rq);
                    takoSug.getClass();
                    takoSug.LIZIZ = LIZJ;
                    takoSug.LIZ = z;
                    arrayList.add(takoSug);
                }
            }
            takoSugResponse2 = TakoSugResponse.copy$default(takoSugResponse, arrayList, null, null, null, 14, null);
        }
        this.LJLILLLLZI.invoke(takoSugResponse2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
