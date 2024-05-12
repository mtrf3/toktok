package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$notifyUpdatersTheLatestData$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3J2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81803Iy LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3J2(C81803Iy c81803Iy, InterfaceC67352kd<? super C3J2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3J2(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81803Iy c81803Iy = this.LJLIL;
        Iterator it = ((CopyOnWriteArrayList) c81803Iy.LJLJLJ).iterator();
        while (it.hasNext()) {
            C3J7 c3j7 = (C3J7) it.next();
            if (c3j7.LIZJ() != C39N.INBOX || C3K3.LIZ().LJLJJI) {
                Collection values = ((ConcurrentHashMap) c81803Iy.LJLJJLL).values();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    ORS.LJJLIIIJILLIZJL(((C3J9) it2.next()).LIZ(), arrayList);
                }
                c3j7.LJI(arrayList);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
