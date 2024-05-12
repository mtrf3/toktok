package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.PayResultPageKt$PayResultPage$2$1", f = "PayResultPage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aL5, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93079aL5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ C92108a5Q LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93079aL5(Boolean bool, C92108a5Q c92108a5Q, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C93079aL5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bool;
        this.LJLILLLLZI = c92108a5Q;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93079aL5(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (o.LJ(this.LJLIL, Boolean.TRUE) && C47261Igj.LJJIJIIJI(EnumC92109a5R.SUCCESS, EnumC92109a5R.PENDING, EnumC92109a5R.FAILED).contains(this.LJLILLLLZI.LIZ)) {
            this.LJLJI.invoke();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
