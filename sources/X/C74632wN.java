package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.story.onthisday.OnThisDayRequestApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.onthisday.OnThisDayAwemeRepository$sendViewedMemorableVideo$1", f = "OnThisDayAwemeRepository.kt", l = {83}, m = "invokeSuspend")
/* renamed from: X.2wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74632wN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74632wN(String str, InterfaceC67352kd<? super C74632wN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74632wN(this.LJLILLLLZI, interfaceC67352kd);
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
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            OnThisDayRequestApi onThisDayRequestApi = (OnThisDayRequestApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, OnThisDayRequestApi.class);
            String str2 = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (onThisDayRequestApi.sendViewedMemorableView(str2, this) == enumC58928NAu) {
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
