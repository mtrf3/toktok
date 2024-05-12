package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QCf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66609QCf extends C3CU {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

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
        o.LJII(this.LJLILLLLZI, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI;
        C65777Prh.LJ(1, interfaceC88472Yns);
        return interfaceC88472Yns.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66609QCf(InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
        o.LJII(interfaceC67352kd, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }
}
