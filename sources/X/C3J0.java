package X;

import fjb.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$fireSessionUpdateOperation$1", f = "SessionDataMediator.kt", l = {416}, m = "invokeSuspend")
/* renamed from: X.3J0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C81803Iy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3J0(C81803Iy c81803Iy, InterfaceC67352kd<? super C3J0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3J0(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.getClass();
            long j = C3KQ.LIZ().sessionDataMediatorDebounceTimeMs;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.getClass();
        C81803Iy.LIZIZ(null).LIZLLL(EnumC81823Ja.SESSION_MEDIATOR, C3JU.SESSION_UPDATE);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("firePendingOperation: ");
        LIZ.append(this.LJLILLLLZI.LJLLLL.size());
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLILLLLZI.LJLJJLL).entrySet()) {
            C81983Jq c81983Jq = (C81983Jq) entry.getKey();
            C3J9 c3j9 = (C3J9) entry.getValue();
            C81803Iy c81803Iy = this.LJLILLLLZI;
            java.util.Map<String, java.util.Map<Class<?>, InterfaceC81703Io>> map = c81803Iy.LJLLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("buildNewSessionSource : ");
            LIZ2.append(c3j9);
            C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ2));
            java.util.Map<C3JB, List<C3L4>> LIZLLL = c3j9.LIZLLL();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<C3JB, List<C3L4>> entry2 : LIZLLL.entrySet()) {
                C3JB key = entry2.getKey();
                List<C3L4> value = entry2.getValue();
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(value, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(LJJIIZ);
                for (C3L4 c3l4 : value) {
                    linkedHashMap2.put(c3l4.LJFF(), c3l4);
                }
                java.util.Map LJJLIL = C113554cx.LJJLIL(linkedHashMap2);
                for (Map.Entry entry3 : ((LinkedHashMap) map).entrySet()) {
                    Object key2 = entry3.getKey();
                    java.util.Map map2 = (java.util.Map) entry3.getValue();
                    C3L4 c3l42 = (C3L4) ((LinkedHashMap) LJJLIL).get(key2);
                    if (c3l42 != null) {
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC81703Io) it.next()).LIZLLL(c3l42);
                        }
                    }
                }
                linkedHashMap.put(key, ORZ.LLJI(((LinkedHashMap) LJJLIL).values()));
            }
            c81803Iy.LJFF(C3J8.LIZ(linkedHashMap, c3j9.LIZJ, c3j9.LIZLLL), c81983Jq);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("clear size: ");
        LIZ3.append(this.LJLILLLLZI.LJLLLL.size());
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ3));
        Iterator it2 = ((LinkedHashMap) this.LJLILLLLZI.LJLLLL).values().iterator();
        while (it2.hasNext()) {
            ((java.util.Map) it2.next()).clear();
        }
        ((LinkedHashMap) this.LJLILLLLZI.LJLLLL).clear();
        this.LJLILLLLZI.LJLLL = null;
        C81803Iy.LIZIZ(null).LIZIZ(EnumC81823Ja.SESSION_MEDIATOR, C3JU.SESSION_UPDATE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
