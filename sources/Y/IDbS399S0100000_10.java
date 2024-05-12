package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C63120Opw;
import X.C63148OqO;
import X.C63220OrY;
import X.C63225Ord;
import X.C63227Orf;
import X.C63229Orh;
import X.C63253Os5;
import X.C63262OsE;
import X.C63285Osb;
import X.C63294Osk;
import X.C63305Osv;
import X.C63308Osy;
import X.C63309Osz;
import X.C63322OtC;
import X.C63346Ota;
import X.C63356Otk;
import X.C63622Oy2;
import X.C63623Oy3;
import X.InterfaceC63353Oth;
import X.InterfaceC86963bA;
import X.RunnableC63345OtZ;
import X.X1D;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class IDbS399S0100000_10 implements InterfaceC63353Oth {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Object obj) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, obj);
                return;
            case 1:
                LIZLLL$1(this, obj);
                return;
            case 2:
                LIZLLL$2(this, obj);
                return;
            case 3:
                LIZLLL$3(this, obj);
                return;
            case 4:
                LIZLLL$4(this, obj);
                return;
            case 5:
                LIZLLL$5(this, obj);
                return;
            case 6:
                LIZLLL$6(this, obj);
                return;
            case 7:
                LIZLLL$7(this, obj);
                return;
            case 8:
                LIZLLL$8(this, obj);
                return;
            case 9:
                LIZLLL$9(this, obj);
                return;
            case 10:
                LIZLLL$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZLLL$11(this, obj);
                return;
            default:
                return;
        }
    }

    public IDbS399S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        ((C63305Osv) iDbS399S0100000_10.l0).LIZ = false;
    }

    public static final void LIZLLL$1(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            Map<Long, C63148OqO> map = (Map) pair.second;
            if (map == null || map.isEmpty()) {
                InterfaceC86963bA interfaceC86963bA = ((C63227Orf) iDbS399S0100000_10.l0).LIZIZ;
                if (interfaceC86963bA != null) {
                    interfaceC86963bA.onSuccess(new Pair(Collections.emptyList(), Collections.emptyList()));
                }
            } else {
                Iterator<Map.Entry<Long, C63148OqO>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<Long, C63148OqO> next = it.next();
                        if (next != null && next.getValue() != null && next.getValue().LJLJI < 0) {
                            C63227Orf c63227Orf = (C63227Orf) iDbS399S0100000_10.l0;
                            C63220OrY c63220OrY = c63227Orf.LIZJ;
                            String conversationId = c63227Orf.LIZ.getConversationId();
                            C63227Orf c63227Orf2 = (C63227Orf) iDbS399S0100000_10.l0;
                            c63220OrY.LJIJ(conversationId, c63227Orf2.LIZ, c63227Orf2.LIZIZ);
                            break;
                        }
                    } else {
                        C63227Orf c63227Orf3 = (C63227Orf) iDbS399S0100000_10.l0;
                        Pair<List<Long>, List<Long>> LJ = c63227Orf3.LIZJ.LJ(c63227Orf3.LIZ, map);
                        InterfaceC86963bA interfaceC86963bA2 = ((C63227Orf) iDbS399S0100000_10.l0).LIZIZ;
                        if (interfaceC86963bA2 != null) {
                            interfaceC86963bA2.onSuccess(LJ);
                        }
                    }
                }
            }
            if (((Boolean) pair.first).booleanValue()) {
                RunnableC63345OtZ.LIZLLL(new IDcS134S0200000_10(iDbS399S0100000_10, map, 1), null, C63346Ota.LIZ());
                return;
            }
            return;
        }
        InterfaceC86963bA interfaceC86963bA3 = ((C63227Orf) iDbS399S0100000_10.l0).LIZIZ;
        if (interfaceC86963bA3 == null) {
            return;
        }
        interfaceC86963bA3.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-9999)));
    }

    public static final void LIZLLL$10(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        C63308Osy.LJI().LIZIZ().LJIIJ(((C63294Osk) iDbS399S0100000_10.l0).LIZJ, 3);
        ((C63294Osk) iDbS399S0100000_10.l0).LJIILJJIL(C63308Osy.LJI().LIZLLL().LJJII, false);
    }

    public static final void LIZLLL$11(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        List<C109544Rq> list = (List) obj;
        if (list != null && list.size() > 0) {
            ((C63285Osb) iDbS399S0100000_10.l0).LIZLLL(list);
            C63309Osz.LIZLLL().LJIIJJI(list);
        } else {
            ((C63285Osb) iDbS399S0100000_10.l0).LIZLLL(new ArrayList());
        }
    }

    public static final void LIZLLL$2(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            RunnableC63345OtZ.LIZLLL(new IDcS134S0200000_10(iDbS399S0100000_10, pair, 3), null, C63346Ota.LIZ());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r7.isLocal() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r0 = X.C00F.LIZLLL("LoadHistoryHandlerpull pre-check failed, is null: ", r5, " hasMore: ", r3, " isLocal: ");
        r0.append(r6);
        X.C63322OtC.LJFF(X.X1D.LIZIZ(r0));
        r2 = X.C63309Osz.LIZLLL();
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r2.LIZJ(r4, new X.C63254Os6(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL$3(Y.IDbS399S0100000_10 r6, java.lang.Object r7) {
        /*
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "MessageModel requestHistoryMessage onCallback, cid:"
            r1.append(r0)
            java.lang.Object r0 = r6.l0
            X.OrY r0 = (X.C63220OrY) r0
            java.lang.String r0 = r0.LJLIL
            r1.append(r0)
            java.lang.String r0 = ", result:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJFF(r0)
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L7f
            X.Otk r1 = X.C63356Otk.LJIIIZ()
            java.lang.Object r0 = r6.l0
            X.OrY r0 = (X.C63220OrY) r0
            java.lang.String r4 = r0.LJLIL
            r1.getClass()
            X.OsD r3 = new X.OsD
            r3.<init>()
            X.4fk r0 = X.C115284fk.LJIILIIL()
            X.Opw r7 = r0.LJIIIZ(r4)
            if (r7 == 0) goto L51
            boolean r0 = r7.hasMore()
            if (r0 == 0) goto L51
            boolean r0 = r7.isLocal()
            if (r0 == 0) goto L95
        L51:
            r6 = 1
            if (r7 != 0) goto L8c
            r5 = 1
        L55:
            r3 = 0
            if (r7 == 0) goto L8a
        L58:
            boolean r0 = r7.isLocal()
            if (r0 == 0) goto L8a
        L5e:
            java.lang.String r2 = "LoadHistoryHandlerpull pre-check failed, is null: "
            java.lang.String r1 = " hasMore: "
            java.lang.String r0 = " isLocal: "
            java.lang.StringBuilder r0 = X.C00F.LIZLLL(r2, r5, r1, r3, r0)
            r0.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            X.C63322OtC.LJFF(r0)
            X.Osz r2 = X.C63309Osz.LIZLLL()
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L80
        L7f:
            return
        L80:
            X.Os6 r1 = new X.Os6
            r0 = 0
            r1.<init>(r0)
            r2.LIZJ(r4, r1)
            goto L7f
        L8a:
            r6 = 0
            goto L5e
        L8c:
            r5 = 0
            boolean r0 = r7.hasMore()
            if (r0 == 0) goto L55
            r3 = 1
            goto L58
        L95:
            Y.IDcS14S1100000_10 r2 = new Y.IDcS14S1100000_10
            r0 = 4
            r2.<init>(r7, r4, r0)
            X.Or0 r1 = new X.Or0
            r1.<init>(r3, r4, r7)
            java.util.concurrent.Executor r0 = X.C63346Ota.LIZJ()
            X.RunnableC63345OtZ.LIZLLL(r2, r1, r0)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDbS399S0100000_10.LIZLLL$3(Y.IDbS399S0100000_10, java.lang.Object):void");
    }

    public static final void LIZLLL$4(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        Boolean bool = (Boolean) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel requestNewerMessage onCallback, cid:");
        LIZ.append(((C63220OrY) iDbS399S0100000_10.l0).LJLIL);
        LIZ.append(", result:");
        LIZ.append(bool);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (bool.booleanValue()) {
            C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
            String str = ((C63220OrY) iDbS399S0100000_10.l0).LJLIL;
            LJIIIZ.getClass();
            C63225Ord c63225Ord = new C63225Ord();
            C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
            if (LJIIIZ2 == null || LJIIIZ2.isLocal()) {
                C63309Osz LIZLLL = C63309Osz.LIZLLL();
                LIZLLL.getClass();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                LIZLLL.LIZJ(str, new C63253Os5(null));
                return;
            }
            RunnableC63345OtZ.LIZLLL(new IDcS14S1100000_10(LJIIIZ2, str, 6), new C63262OsE(c63225Ord, str, LJIIIZ2), C63346Ota.LIZJ());
        }
    }

    public static final void LIZLLL$5(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        List<C109544Rq> list = (List) obj;
        C63322OtC.LJFF("MessageModel loadOlderMessageList onCallback");
        if (list == null) {
            ((C63220OrY) iDbS399S0100000_10.l0).LJLL.set(false);
            return;
        }
        C63220OrY c63220OrY = (C63220OrY) iDbS399S0100000_10.l0;
        c63220OrY.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel onPerformLoadMore, result:");
        LIZ.append(Integer.valueOf(list.size()));
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        c63220OrY.LJLL.set(false);
        if (list.size() < c63220OrY.LJLJI) {
            C63322OtC.LJFF("MessageModel onProcessLoadMore, less than limit, loadHistory");
            c63220OrY.LJIILLIIL();
        }
        c63220OrY.M1(list, true);
        c63220OrY.LJIILJJIL(c63220OrY.LJLIL);
    }

    public static final void LIZLLL$6(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        if (obj != null) {
            C63309Osz.LIZLLL().LJIIJJI(Collections.singletonList(obj));
            InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) iDbS399S0100000_10.l0;
            if (interfaceC86963bA != null) {
                interfaceC86963bA.onSuccess(obj);
                return;
            }
            return;
        }
        InterfaceC86963bA interfaceC86963bA2 = (InterfaceC86963bA) iDbS399S0100000_10.l0;
        if (interfaceC86963bA2 == null) {
            return;
        }
        interfaceC86963bA2.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-3001)));
    }

    public static final void LIZLLL$7(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            Map<Long, C63148OqO> map = (Map) pair.second;
            if (map == null || map.isEmpty()) {
                InterfaceC86963bA interfaceC86963bA = ((C63229Orh) iDbS399S0100000_10.l0).LIZIZ;
                if (interfaceC86963bA != null) {
                    interfaceC86963bA.onSuccess(new Pair(Collections.emptyList(), Collections.emptyList()));
                }
            } else {
                C63229Orh c63229Orh = (C63229Orh) iDbS399S0100000_10.l0;
                Pair<List<Long>, List<Long>> LJ = c63229Orh.LIZLLL.LJ(c63229Orh.LIZJ, map);
                InterfaceC86963bA interfaceC86963bA2 = ((C63229Orh) iDbS399S0100000_10.l0).LIZIZ;
                if (interfaceC86963bA2 != null) {
                    interfaceC86963bA2.onSuccess(LJ);
                }
            }
            if (((Boolean) pair.first).booleanValue()) {
                RunnableC63345OtZ.LIZLLL(new IDcS134S0200000_10(iDbS399S0100000_10, map, 7), null, C63346Ota.LIZ());
                return;
            }
            return;
        }
        InterfaceC86963bA interfaceC86963bA3 = ((C63229Orh) iDbS399S0100000_10.l0).LIZIZ;
        if (interfaceC86963bA3 == null) {
            return;
        }
        interfaceC86963bA3.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-9999)));
    }

    public static final void LIZLLL$8(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        List<C109544Rq> list = (List) obj;
        if (list == null) {
            ((C63220OrY) iDbS399S0100000_10.l0).LJLL.set(false);
            return;
        }
        int size = list.size();
        C63220OrY c63220OrY = (C63220OrY) iDbS399S0100000_10.l0;
        if (size > c63220OrY.LJLJI) {
            list = list.subList(list.size() - ((C63220OrY) iDbS399S0100000_10.l0).LJLJI, list.size());
            ((C63220OrY) iDbS399S0100000_10.l0).LJLJLLL = false;
        } else {
            c63220OrY.LJLJLLL = true;
        }
        C63322OtC.LJFF("MessageModel loadNewerMessageList onCallback");
        C63220OrY c63220OrY2 = (C63220OrY) iDbS399S0100000_10.l0;
        c63220OrY2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel onPerformLoadNewer, result:");
        LIZ.append(list.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        Collections.reverse(list);
        c63220OrY2.LJLILLLLZI.addList(list);
        c63220OrY2.LJLL.set(false);
        if (list.size() < c63220OrY2.LJLJI) {
            C63322OtC.LJFF("MessageModel onProcessLoadMore, less than limit, loadNewer");
            c63220OrY2.LJIIZILJ();
        }
        c63220OrY2.v0(list, true);
        c63220OrY2.LJIILJJIL(c63220OrY2.LJLIL);
    }

    public static final void LIZLLL$9(IDbS399S0100000_10 iDbS399S0100000_10, Object obj) {
        ((InterfaceC86963bA) iDbS399S0100000_10.l0).onSuccess(null);
    }
}
