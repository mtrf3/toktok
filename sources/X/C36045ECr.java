package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.RecImpressRequest;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.log.FeedEcCardProductRecUtil$reportRecProductImpress$2", f = "FeedEcCardProductRecUtil.kt", l = {63}, m = "invokeSuspend")
/* renamed from: X.ECr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36045ECr extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<Object>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ List<RecImpressRequest.RecImpressItem> LJLJI;
    public final /* synthetic */ RecImpressRequest.RecSessionInfo LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36045ECr(String str, List<RecImpressRequest.RecImpressItem> list, RecImpressRequest.RecSessionInfo recSessionInfo, InterfaceC67352kd<? super C36045ECr> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = list;
        this.LJLJJI = recSessionInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36045ECr(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<Object>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            String str = this.LJLILLLLZI;
            List<RecImpressRequest.RecImpressItem> list = this.LJLJI;
            RecImpressRequest.RecSessionInfo recSessionInfo = this.LJLJJI;
            this.LJLIL = 1;
            obj = C36046ECs.LJJJIL(str, null, list, recSessionInfo, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
