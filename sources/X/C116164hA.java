package X;

import Y.AObserverS69S0100000_1;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.SkylightDMModule$extraOperate$2", f = "SkylightDMModule.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4hA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116164hA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C116194hD LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116164hA(C116194hD c116194hD, InterfaceC67352kd<? super C116164hA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c116194hD;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C116164hA(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C116194hD c116194hD = this.LJLIL;
        synchronized (c116194hD) {
            if (!c116194hD.LJIJ) {
                c116194hD.LJIJ = true;
                C34B.LIZIZ("InboxTopVM", "observeMUFActivityStatus");
                ((InterfaceC116174hB) c116194hD.LJIIIIZZ.getValue()).LIZ().observe(c116194hD.LIZLLL, new AObserverS69S0100000_1(c116194hD, 95));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
