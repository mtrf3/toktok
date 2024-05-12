package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$fireSourceDataSingleUpdateOperation$1", f = "SessionDataMediator.kt", l = {545}, m = "invokeSuspend")
/* renamed from: X.3Iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81813Iz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C81803Iy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81813Iz(C81803Iy c81803Iy, InterfaceC67352kd<? super C81813Iz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81813Iz(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3L4 c3l4;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", "sourceDataJob loading start");
            this.LJLILLLLZI.getClass();
            long j = C3KQ.LIZ().sessionDataMediatorDebounceTimeMs;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", "sourceDataJob loading finish");
        this.LJLILLLLZI.getClass();
        C81803Iy.LIZIZ(null).LIZLLL(EnumC81823Ja.SESSION_MEDIATOR, C3JU.SINGLE_SOURCE_DATA_UPDATE);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLILLLLZI.LJLJJLL).entrySet()) {
            C81983Jq c81983Jq = (C81983Jq) entry.getKey();
            C3J9 c3j9 = (C3J9) entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sessionPage: ");
            LIZ.append(c81983Jq);
            LIZ.append(':');
            LIZ.append(c3j9.LIZ().size());
            C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
            java.util.Map<C3JB, List<C3L4>> LIZLLL = c3j9.LIZLLL();
            ArrayList arrayList = new ArrayList(LIZLLL.size());
            for (Map.Entry<C3JB, List<C3L4>> entry2 : LIZLLL.entrySet()) {
                C3JB key = entry2.getKey();
                List<C3L4> value = entry2.getValue();
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(value, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                for (Object obj2 : value) {
                    linkedHashMap.put(((C3L4) obj2).LJFF(), obj2);
                }
                arrayList.add(new OSZ(key, C113554cx.LJJLIL(linkedHashMap)));
            }
            java.util.Map LJJLIL = C113554cx.LJJLIL(C113554cx.LJJLIIIJLJLI(arrayList));
            C34K c34k = new C34K();
            for (C3JI c3ji : ((LinkedHashMap) this.LJLILLLLZI.LJLZ).values()) {
                java.util.Map map = (java.util.Map) ((LinkedHashMap) LJJLIL).get(c3ji.getSessionType());
                if (map == null) {
                    map = new LinkedHashMap();
                }
                C3L4 LIZJ = c3ji.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("handleSessionSourceSingleOperation : ");
                LIZ2.append(c3ji.LIZ());
                C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ2));
                int i2 = C3JE.LIZ[c3ji.LIZ().ordinal()];
                if (i2 != z) {
                    if (i2 != 2) {
                        if (i2 == 3 && (c3l4 = (C3L4) map.remove(LIZJ.LJFF())) != null) {
                            C81803Iy c81803Iy = this.LJLILLLLZI;
                            c34k.element = z;
                            Object value2 = c81803Iy.LJZ.getValue();
                            String LJFF = c3l4.LJFF();
                            o.LJIIIIZZ(LJFF, "removedSession.sessionID");
                            boolean z2 = !map.isEmpty();
                            value2.getClass();
                            C97963su.LIZ(LJFF, z2);
                        }
                    } else {
                        C3L4 LIZJ2 = c3ji.LIZJ();
                        Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI.LJLJLLL).iterator();
                        while (it.hasNext()) {
                            C3JD c3jd = (C3JD) it.next();
                            if (c3jd.LJII() != C39N.INBOX || C3K3.LIZ().LJLJJI) {
                                c3jd.LIZ(LIZJ2);
                            }
                        }
                        if (c81983Jq.LIZLLL.invoke(LIZJ2).booleanValue()) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(LIZJ2.LJ());
                            LIZ3.append(" session in page: ");
                            LIZ3.append(c81983Jq);
                            C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ3));
                            String LJFF2 = LIZJ.LJFF();
                            o.LJIIIIZZ(LJFF2, "newSession.sessionID");
                            map.put(LJFF2, LIZJ2);
                            c34k.element = true;
                        } else if (map.containsKey(LIZJ.LJFF())) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(LIZJ2.LJ());
                            LIZ4.append(" session not in page ");
                            LIZ4.append(c81983Jq);
                            C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ4));
                            map.remove(LIZJ.LJFF());
                            c34k.element = true;
                        }
                    }
                } else if (!c81983Jq.LIZLLL.invoke(c3ji.LIZJ()).booleanValue()) {
                    z = true;
                } else {
                    Iterator it2 = ((CopyOnWriteArrayList) this.LJLILLLLZI.LJLJLLL).iterator();
                    while (it2.hasNext()) {
                        C3JD c3jd2 = (C3JD) it2.next();
                        if (c3jd2.LJII() != C39N.INBOX || C3K3.LIZ().LJLJJI) {
                            c3jd2.LIZ(LIZJ);
                        }
                    }
                    String LJFF3 = LIZJ.LJFF();
                    o.LJIIIIZZ(LJFF3, "newSession.sessionID");
                    map.put(LJFF3, LIZJ);
                    c34k.element = true;
                }
                LJJLIL.put(c3ji.getSessionType(), map);
                z = true;
            }
            if (c34k.element) {
                ArrayList arrayList2 = new ArrayList(LJJLIL.size());
                for (Map.Entry entry3 : ((LinkedHashMap) LJJLIL).entrySet()) {
                    arrayList2.add(new OSZ(entry3.getKey(), ORZ.LLJI(((java.util.Map) entry3.getValue()).values())));
                }
                C3J9 LIZ5 = C3J8.LIZ(C113554cx.LJJLIIIJLJLI(arrayList2), c3j9.LIZJ, c3j9.LIZLLL);
                this.LJLILLLLZI.LJFF(LIZ5, c81983Jq);
                this.LJLILLLLZI.LJI(LIZ5, c81983Jq);
            }
            z = true;
        }
        C81803Iy c81803Iy2 = this.LJLILLLLZI;
        c81803Iy2.getClass();
        c81803Iy2.LJIIJJI(new C3J2(c81803Iy2, null));
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", "sourceDataJob before clear");
        ((LinkedHashMap) this.LJLILLLLZI.LJLZ).clear();
        this.LJLILLLLZI.LJLLLLLL = null;
        C81803Iy.LIZIZ(null).LIZIZ(EnumC81823Ja.SESSION_MEDIATOR, C3JU.SINGLE_SOURCE_DATA_UPDATE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
