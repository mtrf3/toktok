package X;

import fjb.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.3Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79743Ba<T> extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC79813Bh<T> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79743Ba(AbstractC79813Bh<T> abstractC79813Bh, InterfaceC67352kd<? super C79743Ba> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC79813Bh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79743Ba c79743Ba = new C79743Ba(this.LJLJI, interfaceC67352kd);
        c79743Ba.LJLILLLLZI = obj;
        return c79743Ba;
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
            C3CK<? super T> c3ck = (C3CK) this.LJLILLLLZI;
            AbstractC79813Bh<T> abstractC79813Bh = this.LJLJI;
            this.LJLIL = 1;
            if (abstractC79813Bh.collectTo(c3ck, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(obj, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
