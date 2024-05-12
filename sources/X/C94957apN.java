package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.model.Selector$notifySelectCallbacks$1", f = "Selector.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94957apN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C93996aZs LJLIL;
    public final /* synthetic */ C94256ae4 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94957apN(C93996aZs c93996aZs, C94256ae4 c94256ae4, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c93996aZs;
        this.LJLILLLLZI = c94256ae4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94957apN(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ.onPathResult(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
