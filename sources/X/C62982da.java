package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent$startTimer$1", f = "AwemeCollectionAgent.kt", l = {200}, m = "invokeSuspend")
/* renamed from: X.2da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62982da extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C62982da(InterfaceC67352kd<? super C62982da> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62982da(interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(10000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("is_success", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("collection_request_result", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C62982da(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}