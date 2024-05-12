package X;

import fjb.a;

/* JADX INFO: Add missing generic type declarations: [R] */
@InterfaceC65848Psq(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.2GO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GO<R> extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super R>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Long, R> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2GO(InterfaceC88472Yns<? super Long, ? extends R> interfaceC88472Yns, InterfaceC67352kd<? super C2GO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2GO(this.LJLILLLLZI, interfaceC67352kd);
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
            if (C1JD.LIZJ(16L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return this.LJLILLLLZI.invoke(new Long(System.nanoTime()));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, Object obj) {
        return ((a) create(interfaceC70422pa, (InterfaceC67352kd) obj)).invokeSuspend(C76800UCe.LIZ);
    }
}
