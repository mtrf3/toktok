package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager$query$2$2", f = "BehaviourIconManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.an9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94819an9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94820anA LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94819an9(C94820anA c94820anA, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94820anA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C94819an9 c94819an9 = new C94819an9(this.LJLILLLLZI, completion);
        c94819an9.LJLIL = obj;
        return c94819an9;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        this.LJLILLLLZI.LJLJI.queryFetchJob = XKX.LIZIZ(interfaceC70422pa, null, null, new C94818an8(this, null), 3);
        return C76800UCe.LIZ;
    }
}
