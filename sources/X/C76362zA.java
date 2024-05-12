package X;

import fjb.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.core.GlobalMsgObserver$notifyObservers$1", f = "GlobalMsgObserver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76362zA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC99673vf, C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C76362zA(InterfaceC88472Yns<? super InterfaceC99673vf, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C76362zA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76362zA(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) C99993wB.LJLJI.getValue();
        InterfaceC88472Yns<InterfaceC99673vf, C76800UCe> interfaceC88472Yns = this.LJLIL;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(it.next());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
