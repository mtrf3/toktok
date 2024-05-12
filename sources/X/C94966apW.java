package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.Tool$compressRes$1$1", f = "Tool.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94966apW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C94967apX LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94966apW(C94967apX c94967apX, C68322mC c68322mC, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c94967apX;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94966apW(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJI.invoke(this.LJLILLLLZI.element);
        return C76800UCe.LIZ;
    }
}
