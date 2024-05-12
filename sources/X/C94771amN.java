package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider$downloadRes$3$1$1", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.amN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94771amN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C94772amO LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94771amN(String str, InterfaceC67352kd interfaceC67352kd, C94772amO c94772amO) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = c94772amO;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94771amN(this.LJLIL, completion, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.LJLJJI.onSuccess(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
