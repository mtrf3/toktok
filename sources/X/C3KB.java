package X;

import Y.IDcS135S0200000_1;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.3KB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KB implements C3JJ, C3J7, C3JD {
    public final C39H LJLIL;
    public final String LJLILLLLZI;
    public final C39N LJLJI;
    public final C39N LJLJJI;
    public final java.util.Map<String, Long> LJLJJL;
    public final java.util.Map<String, C109544Rq> LJLJJLL;
    public final C3KC LJLJL;

    public C3KB() {
        this(0);
    }

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        ((C4Z2) C96423qQ.LIZ()).LJ(this.LJLJL);
        C42625Go9.LIZJ(this);
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        ((C4Z2) C96423qQ.LIZ()).LJIIIIZZ(this.LJLJL);
        C42625Go9.LIZIZ(this);
    }

    @Override // X.C3J7
    public final C39N LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.C3JD
    public final C39N LJII() {
        return this.LJLJI;
    }

    @Override // X.C3JD
    public final String getTag() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3KC] */
    public C3KB(int i) {
        this.LJLIL = new C39H();
        this.LJLILLLLZI = "SessionRefactor-ReadStatus";
        C39N c39n = C39N.INBOX;
        this.LJLJI = c39n;
        this.LJLJJI = c39n;
        this.LJLJJL = new ConcurrentHashMap();
        this.LJLJJLL = new ConcurrentHashMap();
        this.LJLJL = new C3UD() { // from class: X.3KC
            @Override // X.C3UD
            public final void Lr0(List<C3OG> list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onReadCountChange : ");
                LIZ.append(list);
                C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ));
                C3KB c3kb = C3KB.this;
                if (list == null) {
                    return;
                }
                c3kb.LJIIIIZZ(list);
            }

            @Override // X.C3UD
            public final void gA(Long l, Long l2, String str) {
                C3L5 c3l5;
                long j;
                long longValue = l.longValue();
                long longValue2 = l2.longValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onReadIndexUpdate : ");
                LIZ.append(longValue);
                LIZ.append(' ');
                C62850Ola.LJIIIIZZ(LIZ, longValue2, ' ', str);
                C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ));
                if (str == null || (c3l5 = (C3L5) C771431a.LIZ().LIZJ(str)) == null) {
                    return;
                }
                C109544Rq LJIILJJIL = c3l5.LJIILJJIL();
                String str2 = null;
                if (C54840Lfg.LJJ().LJJLIL() == longValue) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("is self read index! ");
                    C109544Rq LJIILJJIL2 = c3l5.LJIILJJIL();
                    if (LJIILJJIL2 != null) {
                        str2 = LJIILJJIL2.getContent();
                    }
                    LIZ2.append(str2);
                    LIZ2.append(" :");
                    LIZ2.append(c3l5.LJ());
                    C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ2));
                    return;
                }
                EnumC96553qd LJIILIIL = C3L5.LJIILIIL(c3l5, LJIILJJIL, null);
                o.LJIIIIZZ(LJIILIIL, "convertMsgStatus(\n      …  null,\n                )");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("the status of the last msg: ");
                LIZ3.append(c3l5.LJ());
                LIZ3.append(": ");
                LIZ3.append(LJIILIIL);
                C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ3));
                if (LJIILJJIL != null) {
                    j = LJIILJJIL.getIndex();
                } else {
                    j = -1;
                }
                if (longValue2 >= j && LJIILIIL == EnumC96553qd.SUCCESS) {
                    C81843Jc.LIZIZ("SessionRefactor-ReadStatus", "mark seen");
                    LJIILIIL = EnumC96553qd.SEEN;
                }
                ((ConcurrentHashMap) C3KB.this.LJLJJL).put(str, Long.valueOf(longValue2));
                C3KE c3ke = new C3KE(str, LJIILIIL);
                InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns = C3KB.this.LJLIL.LJLILLLLZI;
                if (interfaceC88472Yns == null) {
                    return;
                }
                interfaceC88472Yns.invoke(c3ke);
            }
        };
    }

    @Override // X.C3JD
    public final void LIZ(C3L4 baseSession) {
        long j;
        o.LJIIIZ(baseSession, "baseSession");
        if (!(baseSession instanceof C3L5) || (baseSession instanceof C3L2)) {
            return;
        }
        C3L5 c3l5 = (C3L5) baseSession;
        EnumC96553qd enumC96553qd = c3l5.LLII;
        EnumC96553qd enumC96553qd2 = EnumC96553qd.SEEN;
        if (enumC96553qd == enumC96553qd2) {
            return;
        }
        Long l = (Long) ((ConcurrentHashMap) this.LJLJJL).get(c3l5.LJFF());
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        C109544Rq LJIILJJIL = c3l5.LJIILJJIL();
        if (LJIILJJIL == null) {
            return;
        }
        EnumC96553qd LJIIL = C3L5.LJIIL(LJIILJJIL.getMsgStatus());
        o.LJIIIIZZ(LJIIL, "convertMsgStatus(lastMsg.msgStatus)");
        if (LJIIL != EnumC96553qd.SUCCESS || j < LJIILJJIL.getIndex()) {
            return;
        }
        c3l5.LLII = enumC96553qd2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mark :");
        LIZ.append(baseSession);
        LIZ.append(" as SEEN");
        C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ));
    }

    @Override // X.C3J7
    public final void LIZIZ(InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLJI = interfaceC88472Yns;
    }

    @Override // X.C3JD
    public final void LJ(List<? extends C3L4> list) {
        Iterator<? extends C3L4> it = list.iterator();
        while (it.hasNext()) {
            LIZ(it.next());
        }
    }

    @Override // X.C3J7
    public final void LJFF(InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.C3J7
    public final void LJI(List<? extends C3L4> list) {
        C109544Rq LJIILJJIL;
        C109544Rq LJIILJJIL2;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C3L3) && !(next instanceof C3L2)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof C3L5) {
                arrayList2.add(next2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C3L5 c3l5 = (C3L5) it3.next();
            String LJFF = c3l5.LJFF();
            if (LJFF != null && LJFF.length() != 0) {
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ = C4WC.LIZIZ.LIZ(c3l5.LJFF());
                if (c3l5.LJIILLIIL() && c3l5.LLII != EnumC96553qd.SEEN && LIZ != null && TextUtils.isEmpty(LIZ.getDraftContent()) && c3l5.LJIIIIZZ() == 0 && (LJIILJJIL = c3l5.LJIILJJIL()) != null && !C93793mB.LIZLLL(LJIILJJIL) && (LJIILJJIL2 = c3l5.LJIILJJIL()) != null) {
                    linkedHashSet.add(LJIILJJIL2);
                }
            }
        }
        java.util.Set LLILIL = ORZ.LLILIL(linkedHashSet, ORZ.LLJJ(((ConcurrentHashMap) this.LJLJJLL).values()));
        if (LLILIL.isEmpty()) {
            C81843Jc.LIZIZ("SessionRefactor-ReadStatus", "nothing new");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("needUpdateSet: ");
        LIZ2.append(LLILIL.size());
        C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("doBatchQueryReadStatus: ");
        LIZ3.append(LLILIL.size());
        C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ3));
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJIIJ(new IDcS135S0200000_1(LLILIL, this, 10), ORZ.LLJI(LLILIL));
    }

    public final void LJIIIIZZ(List<? extends C3OG> list) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C3OG c3og : list) {
            String conversationId = c3og.LIZJ;
            C3L5 c3l5 = (C3L5) C771431a.LIZ().LIZJ(conversationId);
            if (c3l5 != null) {
                C109544Rq LJIILJJIL = c3l5.LJIILJJIL();
                EnumC96553qd newMsgStatus = C3L5.LJIILIIL(c3l5, LJIILJJIL, c3og);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("postReadStatusValue: ");
                LIZ.append(c3l5.LJ());
                LIZ.append(": ");
                LIZ.append(newMsgStatus);
                C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ));
                o.LJIIIIZZ(conversationId, "conversationId");
                o.LJIIIIZZ(newMsgStatus, "newMsgStatus");
                linkedHashMap.put(conversationId, newMsgStatus);
                if (newMsgStatus == EnumC96553qd.SEEN) {
                    java.util.Map<String, Long> map = this.LJLJJL;
                    if (LJIILJJIL != null) {
                        ((ConcurrentHashMap) map).put(conversationId, Long.valueOf(LJIILJJIL.getIndex()));
                    }
                }
            }
        }
        final List LLJI = ORZ.LLJI(linkedHashMap.keySet());
        InterfaceC81693In interfaceC81693In = new InterfaceC81693In(LLJI, linkedHashMap) { // from class: X.3KD
            public final Collection<String> LIZ;
            public final java.util.Map<String, EnumC96553qd> LIZIZ;
            public final String LIZJ;

            @Override // X.InterfaceC81703Io
            public final String LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC81693In
            public final Collection<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC81703Io
            public final C3L4 LIZLLL(C3L4 c3l4) {
                if ((c3l4 instanceof C3L3) && !(c3l4 instanceof C3L2)) {
                    C3L5 c3l52 = (C3L5) c3l4;
                    EnumC96553qd enumC96553qd = this.LIZIZ.get(c3l52.LJFF());
                    if (enumC96553qd == null) {
                        return c3l4;
                    }
                    c3l52.LLII = enumC96553qd;
                }
                return c3l4;
            }

            {
                o.LJIIIZ(LLJI, "targetSessionIdList");
                this.LIZ = LLJI;
                this.LIZIZ = linkedHashMap;
                this.LIZJ = "ChatSessionMsgReadStatusDecorator-BatchOperation";
            }
        };
        InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns = this.LJLIL.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(interfaceC81693In);
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReadStatusChanged(C3KF event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReadStatusChanged : ");
        LIZ.append(event);
        C81843Jc.LIZIZ("SessionRefactor-ReadStatus", X1D.LIZIZ(LIZ));
        C3L5 c3l5 = (C3L5) C771431a.LIZ().LIZJ(event.LJLIL);
        if (c3l5 == null || c3l5.LJLJLJ != event.LJLILLLLZI) {
            return;
        }
        EnumC96553qd enumC96553qd = c3l5.LLII;
        EnumC96553qd enumC96553qd2 = EnumC96553qd.SEEN;
        if (enumC96553qd != enumC96553qd2) {
            C3KE c3ke = new C3KE(event.LJLIL, enumC96553qd2);
            InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns = this.LJLIL.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c3ke);
            }
        }
    }
}
