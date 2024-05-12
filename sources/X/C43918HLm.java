package X;

import fjb.a;
import java.util.concurrent.TimeoutException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.utils.ListenableFutureExtensionKt$asDeferred$3", f = "ListenableFutureExtension.kt", l = {45}, m = "invokeSuspend")
/* renamed from: X.HLm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43918HLm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC43919HLn<Object> LJLJI;
    public final /* synthetic */ C76L<Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43918HLm(long j, InterfaceC43919HLn<Object> interfaceC43919HLn, C76L<Object> c76l, InterfaceC67352kd<? super C43918HLm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC43919HLn;
        this.LJLJJI = c76l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43918HLm(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!this.LJLJI.isCompleted()) {
            this.LJLJJI.cancel(true);
            this.LJLJI.LJJ(new TimeoutException());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
