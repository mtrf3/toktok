package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.31K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31K implements InterfaceC55617LsD {
    public static final C31K LIZ = new C31K();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(QXJ.LJLIL);

    @Override // X.InterfaceC55617LsD
    public final void LJFF() {
        C106674Gp.LJIIJJI("outer_push", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.4WV, X.2ya] */
    public static void LJIIIZ() {
        C31L c31l = (C31L) LIZIZ.getValue();
        if (c31l != null) {
            c31l.LIZLLL();
        }
        final C31Q c31q = C31Q.LJIILLIIL;
        c31q.getClass();
        if (C31D.LIZIZ()) {
            c31q.LJI().LIZ(new InterfaceC76042ye() { // from class: X.2yU
                @Override // X.InterfaceC76042ye
                public final void LIZ(C112454bB notificationContent, boolean z) {
                    ArrayList arrayList;
                    C109544Rq c109544Rq;
                    o.LJIIIZ(notificationContent, "notificationContent");
                    C31Q c31q2 = C31Q.this;
                    List<C771931f> list = notificationContent.LJIJJ;
                    if (list != null) {
                        arrayList = new ArrayList(C32I.LJJL(list, 10));
                        for (C771931f c771931f : list) {
                            if (c771931f.LIZIZ != 10) {
                                c109544Rq = c771931f.LIZJ;
                            } else {
                                c109544Rq = null;
                            }
                            arrayList.add(c109544Rq);
                        }
                    } else {
                        arrayList = null;
                    }
                    C31Q.LJIILJJIL(c31q2, null, arrayList, 1);
                }
            });
            C3GW c3gw = C3GW.LIZ;
            InterfaceC75962yW interfaceC75962yW = new InterfaceC75962yW() { // from class: X.2yV
                @Override // X.InterfaceC75962yW
                public final void LIZ(List<C771931f> clearedUnitList) {
                    o.LJIIIZ(clearedUnitList, "clearedUnitList");
                    C31Q c31q2 = C31Q.this;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(clearedUnitList, 10));
                    Iterator<C771931f> it = clearedUnitList.iterator();
                    while (true) {
                        C109544Rq c109544Rq = null;
                        if (it.hasNext()) {
                            C771931f next = it.next();
                            if (next.LIZIZ != 10) {
                                c109544Rq = next.LIZJ;
                            }
                            arrayList.add(c109544Rq);
                        } else {
                            C31Q.LJIILJJIL(c31q2, null, arrayList, 1);
                            return;
                        }
                    }
                }
            };
            synchronized (c3gw) {
                ((ArrayList) C3GW.LIZLLL).add(interfaceC75962yW);
            }
        }
        if (C75912yR.LIZ()) {
            XKX.LIZLLL(C48841JEv.LIZ(C31Q.LJIIIIZZ()), null, null, new C31C(((Number) c31q.LIZIZ.getValue()).longValue(), c31q, null), 3);
        }
        ?? r1 = new C76032yd() { // from class: X.2ya
            public boolean LJLIL = true;

            @Override // X.C4WP
            public final void dU(java.util.Map<String, C63120Opw> map) {
                ArrayList arrayList;
                if (this.LJLIL) {
                    int i = 0;
                    this.LJLIL = false;
                    if (map != null) {
                        i = ((ConcurrentHashMap) map).size();
                    }
                    C112464bC.LJ(i, "unread_conversation_reshow", "callback_on_query_conversation");
                    C31Q c31q2 = C31Q.this;
                    if (map != null) {
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
                        arrayList = new ArrayList(concurrentHashMap.size());
                        Iterator it = concurrentHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Map.Entry) it.next()).getValue());
                        }
                    } else {
                        arrayList = null;
                    }
                    c31q2.getClass();
                    XKX.LIZLLL(C48841JEv.LIZ(C31Q.LJIIIIZZ()), null, null, new C75982yY(c31q2, arrayList, null), 3);
                }
            }

            @Override // X.C76032yd, X.InterfaceC120024nO
            public final void y9(int i, C63120Opw c63120Opw) {
                if (i == 3 && c63120Opw != null && c63120Opw.getUnreadCount() == 0) {
                    C31Q.this.getClass();
                    XKX.LIZLLL(C48841JEv.LIZ(C31Q.LJIIIIZZ()), null, null, new C75772yD(c63120Opw, null), 3);
                }
            }
        };
        c31q.LJIIIIZZ = r1;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJFF(r1);
    }

    @Override // X.InterfaceC55617LsD
    public final boolean LIZ() {
        C112444bA LJI = C31Q.LJIILLIIL.LJI();
        LJI.getClass();
        if (C34235Dc7.LIZ()) {
            return C86550Xxy.LIZIZ.LJFF();
        }
        C112424b8 c112424b8 = LJI.LIZJ;
        if (c112424b8 != null) {
            return c112424b8.LIZ;
        }
        return false;
    }

    @Override // X.InterfaceC55617LsD
    public final boolean LIZJ() {
        return C31Q.LJIILLIIL.LJI().LJFF;
    }

    @Override // X.InterfaceC55617LsD
    public final boolean LJ() {
        C31Q.LJIILLIIL.getClass();
        return C3GW.LJIIIIZZ();
    }

    @Override // X.InterfaceC55617LsD
    public final void LJII() {
        C31Q.LJIILLIIL.LIZJ();
        C3GW.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC55617LsD
    public final void LIZIZ(String pushRawString) {
        o.LJIIIZ(pushRawString, "pushRawString");
        C31L c31l = (C31L) LIZIZ.getValue();
        if (c31l != null) {
            c31l.LIZIZ(pushRawString);
        }
    }

    @Override // X.InterfaceC55617LsD
    public final void LIZLLL(boolean z) {
        C80993Fv.LIZ().LIZ.edit().putBoolean("key_mt_inner_push_switch_on", z).apply();
    }

    @Override // X.InterfaceC55617LsD
    public final void LJI(long j, boolean z) {
        C31Q.LJIILLIIL.LJIIJJI(j, z);
    }

    @Override // X.InterfaceC55617LsD
    public final void LJIIIIZZ(int i, Bundle bundle) {
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                C2U8.LIZ(new C31M(0));
                return;
            }
            C31N.LIZ();
            return;
        }
        C31N.LIZ();
    }
}
