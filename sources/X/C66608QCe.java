package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QCe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66608QCe extends C3CU {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                this.LJLIL = 2;
                C141335gf.LIZJ(obj);
                return obj;
            }
            "This coroutine had already completed".toString();
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.LJLIL = 1;
        C141335gf.LIZJ(obj);
        o.LJII(this.LJLILLLLZI, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        InterfaceC88471Ynr interfaceC88471Ynr = this.LJLILLLLZI;
        C65777Prh.LJ(2, interfaceC88471Ynr);
        return interfaceC88471Ynr.invoke(this.LJLJI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66608QCe(InterfaceC67352kd interfaceC67352kd, InterfaceC88471Ynr interfaceC88471Ynr, Object obj) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = obj;
        o.LJII(interfaceC67352kd, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }
}
