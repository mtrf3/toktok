package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {92}, m = "invokeSuspend")
/* renamed from: X.3Bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79963Bw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C79973Bx<? extends C76800UCe>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3T4<Object> LJLJI;
    public final /* synthetic */ Object LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79963Bw(C3T4<Object> c3t4, Object obj, InterfaceC67352kd<? super C79963Bw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3t4;
        this.LJLJJI = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79963Bw c79963Bw = new C79963Bw(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c79963Bw.LJLILLLLZI = obj;
        return c79963Bw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        Object c79993Bz;
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
                C3T4<Object> c3t4 = this.LJLJI;
                Object obj2 = this.LJLJJI;
                this.LJLIL = 1;
                if (c3t4.LJIIIZ(obj2, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            c79993Bz = C76800UCe.LIZ;
        } else {
            c79993Bz = new C79993Bz(C3C5.m10exceptionOrNullimpl(LIZ));
        }
        return new C79973Bx(c79993Bz);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C79973Bx<? extends C76800UCe>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
