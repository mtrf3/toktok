package X;

import fjb.a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$updateU16Settings$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3J1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81803Iy LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3J1(C81803Iy c81803Iy, InterfaceC67352kd<? super C3J1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3J1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", "updateU16Settings");
        if (AV1.LJIIJJI()) {
            return C76800UCe.LIZ;
        }
        if (C80763Ey.LIZLLL()) {
            for (C81983Jq sessionPage : ((ConcurrentHashMap) this.LJLIL.LJLJJLL).keySet()) {
                C81803Iy c81803Iy = this.LJLIL;
                c81803Iy.getClass();
                o.LJIIIZ(sessionPage, "sessionPage");
                c81803Iy.LJIIJJI(new C37Z(c81803Iy, sessionPage, null));
            }
        } else {
            Iterator it = ((ConcurrentHashMap) this.LJLIL.LJLJJLL).keySet().iterator();
            while (it.hasNext()) {
                this.LJLIL.LJFF(new C3J9(0), (C81983Jq) it.next());
            }
            C81803Iy c81803Iy2 = this.LJLIL;
            c81803Iy2.getClass();
            c81803Iy2.LJIIJJI(new C3J2(c81803Iy2, null));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
