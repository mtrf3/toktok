package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileRepository$asyncBatchRequestInCo$cellsDeferredMap$1$1", f = "LiveProfileRepository.kt", l = {114}, m = "invokeSuspend")
/* renamed from: X.BQu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28768BQu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Object>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC29482Bhe<?> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28768BQu(AbstractC29482Bhe<?> abstractC29482Bhe, InterfaceC67352kd<? super C28768BQu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC29482Bhe;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28768BQu(this.LJLILLLLZI, interfaceC67352kd);
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
            AbstractC29482Bhe<?> abstractC29482Bhe = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = abstractC29482Bhe.LJIIIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}