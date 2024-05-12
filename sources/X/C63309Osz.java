package X;

import Y.ARunnableS14S0101000_10;
import Y.ARunnableS17S0000000_10;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS5S0001000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.Osz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63309Osz {
    public static C63309Osz LJIIJ;
    public static boolean LJIIJJI;
    public InterfaceC63226Ore LIZ;
    public C3E7 LIZIZ;
    public final java.util.Map<String, List<InterfaceC120024nO>> LIZJ = new ConcurrentHashMap();
    public final java.util.Map<String, List<InterfaceC63226Ore>> LIZLLL = new ConcurrentHashMap();
    public final java.util.Map<String, List<InterfaceC63344OtY>> LJ = new ConcurrentHashMap();
    public final java.util.Set<InterfaceC63343OtX> LJFF = new CopyOnWriteArraySet();
    public final java.util.Set<InterfaceC63256Os8> LJI = new CopyOnWriteArraySet();
    public final java.util.Set<C4ZE> LJII = new CopyOnWriteArraySet();
    public final java.util.Set<C3UD> LJIIIIZZ = new CopyOnWriteArraySet();
    public final java.util.Set<Object> LJIIIZ = new CopyOnWriteArraySet();

    public static C63309Osz LIZLLL() {
        if (LJIIJ == null) {
            synchronized (C63309Osz.class) {
                if (LJIIJ == null) {
                    LJIIJ = new C63309Osz();
                }
            }
        }
        return LJIIJ;
    }

    public static void LJI(boolean z) {
        if (z) {
            if (C63324OtE.LIZJ == null) {
                C63322OtC.LIZLLL("WaitDelCon trigger, store null");
            } else if (SystemClock.uptimeMillis() - C63324OtE.LIZIZ <= 30000) {
                C63322OtC.LIZLLL("WaitDelCon trigger, time limit");
            } else {
                C63324OtE.LIZIZ = SystemClock.uptimeMillis();
                java.util.Map<String, DeleteConversationRequest> trigger = C63324OtE.LIZJ.trigger();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("WaitDelCon trigger, map:");
                LIZ.append(trigger.size());
                LIZ.append(", mode:");
                LIZ.append(C63324OtE.LIZ);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                for (Map.Entry<String, DeleteConversationRequest> entry : trigger.entrySet()) {
                    String key = entry.getKey();
                    DeleteConversationRequest value = entry.getValue();
                    if (value == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("WaitDelCon trigger, invalid request, cid:");
                        LIZ2.append(key);
                        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                    } else if (C63269OsL.LJI(value.inboxType, key)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("WaitDelCon trigger, cid:");
                        LIZ3.append(key);
                        LIZ3.append(" conversation waiting to create");
                        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
                    } else {
                        C115284fk.LJIILIIL().LJIIJ(key, new C63327OtH(value, key));
                    }
                }
            }
            if (C63321OtB.LIZJ == null) {
                C63322OtC.LIZLLL("WaitDelCon trigger, store null");
            } else if (SystemClock.uptimeMillis() - C63321OtB.LIZIZ <= 30000) {
                C63322OtC.LIZLLL("WaitDelCon trigger, time limit");
            } else {
                C63321OtB.LIZIZ = SystemClock.uptimeMillis();
                java.util.Map<Long, DeleteMsgRequest> trigger2 = C63321OtB.LIZJ.trigger();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("WaitDelCon trigger, map:");
                LIZ4.append(trigger2.size());
                LIZ4.append(", mode:");
                LIZ4.append(C63321OtB.LIZ);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ4));
                for (Map.Entry<Long, DeleteMsgRequest> entry2 : trigger2.entrySet()) {
                    Long key2 = entry2.getKey();
                    DeleteMsgRequest value2 = entry2.getValue();
                    if (value2 == null) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("WaitDelCon trigger, invalid request, msgId:");
                        LIZ5.append(key2);
                        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ5));
                    } else {
                        C63320OtA c63320OtA = new C63320OtA(null, value2.isStranger);
                        c63320OtA.LJ = true;
                        c63320OtA.LIZJ = value2.isStranger;
                        c63320OtA.LJI = value2.retryTimes.intValue();
                        c63320OtA.LJFF = value2.userDelTime.longValue();
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("DeleteMsgHandlerretryDeleteReq, cid:");
                        LIZ6.append(value2.conversationId);
                        LIZ6.append(", retryTimes:");
                        LIZ6.append(c63320OtA.LJI);
                        LIZ6.append(", userDelTime:");
                        LIZ6.append(c63320OtA.LJFF);
                        C63322OtC.LJFF(X1D.LIZIZ(LIZ6));
                        if (value2.isStranger) {
                            C89453Z8v c89453Z8v = new C89453Z8v();
                            c89453Z8v.LJJJJI = value2.toStrangeMsgReqBody();
                            c63320OtA.LJIIJJI(value2.inboxType.intValue(), c89453Z8v.build(), null, new Object[0]);
                        } else {
                            C89453Z8v c89453Z8v2 = new C89453Z8v();
                            c89453Z8v2.LJJIJIIJI = value2.toMsgReqBody();
                            c63320OtA.LJIIJJI(value2.inboxType.intValue(), c89453Z8v2.build(), null, new Object[0]);
                        }
                    }
                }
            }
            C63310Ot0.LJLJJLL = SystemClock.uptimeMillis();
        }
    }

    public static void LJIILL(int i) {
        long j;
        if (C63308Osy.LJI().LIZLLL().LJLJJL) {
            C63315Ot5.LIZ.getClass();
            C63322OtC.LIZIZ("RepairManagerV2 ", "startRepairAfterInit");
            if (C63308Osy.LJI().LJ && C63314Ot4.LJ()) {
                C63315Ot5.LJ(8);
            }
            if (C63314Ot4.LJFF()) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = C63315Ot5.LJFF.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = C63315Ot5.LJFF.keyAt(i2);
                    if (keyAt != 3 || C63308Osy.LJI().LIZLLL().LJLJJL) {
                        C63315Ot5.LJ.getClass();
                        InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("conversation_check_time");
                        LIZ.append(keyAt);
                        if (currentTimeMillis - interfaceC63293Osj.LIZLLL(0L, X1D.LIZIZ(LIZ)) > C63315Ot5.LIZIZ(keyAt)) {
                            C63291Osh.LIZLLL.LIZIZ(Long.valueOf(currentTimeMillis), KMP.LJ("conversation_check_time", keyAt));
                            C63315Ot5.LIZJ().postDelayed(new ARunnableS5S0001000_10(keyAt, 2), 2000L);
                        }
                    }
                }
            }
        } else {
            if (C63308Osy.LJI().LJ && C63314Ot4.LJ()) {
                C63319Ot9.LJFF = 8;
                C63319Ot9 LIZIZ = C63319Ot9.LIZIZ();
                if (LIZIZ.LIZIZ == null) {
                    ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(LIZIZ, 167);
                    LIZIZ.LIZIZ = aRunnableS46S0100000_10;
                    LIZIZ.LIZ.postDelayed(aRunnableS46S0100000_10, LIZIZ.LIZJ() * 1000);
                }
            }
            if (C63314Ot4.LJFF()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C63291Osh.LIZ().getClass();
                long LIZLLL = currentTimeMillis2 - C63291Osh.LIZLLL.LIZLLL(0L, "conversation_check_time");
                JSONObject jSONObject = C63314Ot4.LJIILIIL;
                if (jSONObject != null) {
                    j = jSONObject.optInt("conversationMsgRepairInterval");
                } else {
                    j = C63314Ot4.LJFF;
                }
                if (LIZLLL > j) {
                    C63291Osh.LIZ().getClass();
                    C63291Osh.LIZLLL.LIZIZ(Long.valueOf(currentTimeMillis2), "conversation_check_time");
                    C63319Ot9.LIZIZ().LIZ.postDelayed(new ARunnableS17S0000000_10(13), 2000L);
                }
            }
        }
        C63383OuB LJFF = C63308Osy.LJI().LJFF();
        XKX.LIZLLL(LJFF.LJIIL, null, null, new AnonymousClass301(LJFF, i, null), 3);
    }

    public final void LIZIZ(int i) {
        int length;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleInitMessageEnd:");
        LIZ.append(i);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C63308Osy.LJI();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) C63269OsL.LJIIJ;
        copyOnWriteArraySet.add(Integer.valueOf(i));
        int[] LIZLLL = C63312Ot2.LIZLLL();
        if (LIZLLL == null) {
            length = 0;
        } else {
            length = LIZLLL.length;
        }
        if (length == copyOnWriteArraySet.size()) {
            C63322OtC.LJFF("all inbox message init end");
            LJIIJJI = true;
        }
        List list = (List) ((ConcurrentHashMap) C63269OsL.LJIIIZ).get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            LJII(i);
        }
        C63308Osy LJI = C63308Osy.LJI();
        if (LJI.LJIIIIZZ) {
            return;
        }
        LJI.LJIIIIZZ = true;
        int i2 = LJI.LIZLLL().LJJJ;
        if (i2 <= 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("IMClient checkRecover version invalid:");
            LIZ2.append(i2);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            return;
        }
        C63291Osh LIZ3 = C63291Osh.LIZ();
        InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
        LIZ3.getClass();
        int i3 = interfaceC63293Osj.getInt(C63291Osh.LJIIIZ("recover_version"));
        if (i2 <= i3) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("IMClient checkRecover already recover, version:");
            LIZ4.append(i2);
            LIZ4.append(", lastVersion:");
            LIZ4.append(i3);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ4));
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("IMClient checkRecover start, version:");
        LIZ5.append(i2);
        LIZ5.append(", lastVersion:");
        LIZ5.append(i3);
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ5));
        C63291Osh.LIZ().getClass();
        C63291Osh.LIZLLL.putInt(C63291Osh.LJIIIZ("recover_version"), i2);
        C63323OtD LIZJ = C63144OqK.LIZJ("im_sdk_recover");
        LIZJ.LIZ(String.valueOf(i2), "version");
        LIZJ.LIZ(String.valueOf(i3), "last_version");
        LIZJ.LJ();
        C63356Otk.LJIIIZ().LJIIJ(new ARunnableS14S0101000_10(i2, LJI, 7));
    }

    public final void LJII(int i) {
        int length;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInitEnd:");
        LIZ.append(i);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (C63308Osy.LJI().LJII != null) {
            C4ZL.LIZIZ();
            C82873Nb.LIZ(i);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) C63269OsL.LJIIJJI;
        copyOnWriteArraySet.add(Integer.valueOf(i));
        int[] LIZLLL = C63312Ot2.LIZLLL();
        if (LIZLLL == null) {
            length = 0;
        } else {
            length = LIZLLL.length;
        }
        if (length == copyOnWriteArraySet.size() && !C63308Osy.LJI().LIZIZ().LJIIIIZZ()) {
            C63322OtC.LJFF("all inbox init end");
            if (C63314Ot4.LJIILJJIL != null) {
                LJIILL(i);
                return;
            }
            C63313Ot3 c63313Ot3 = new C63313Ot3(new C63332OtM(this, i));
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LJJLI = new C63498Ow2().build();
            c63313Ot3.LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(C63120Opw c63120Opw) {
        if (c63120Opw == null || TextUtils.isEmpty(c63120Opw.getConversationId())) {
            return;
        }
        String conversationId = c63120Opw.getConversationId();
        C63331OtL c63331OtL = new C63331OtL(c63120Opw);
        List list = (List) ((ConcurrentHashMap) this.LJ).get(conversationId);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = ListProtector.get(list, i);
            if (obj != null) {
                c63331OtL.invoke(obj);
            }
        }
    }

    public final void LJIIJJI(List<C109544Rq> list) {
        LJIIL(new HashMap(), -1, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, InterfaceC118594l5<InterfaceC120024nO> interfaceC118594l5) {
        List list = (List) ((ConcurrentHashMap) this.LIZJ).get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                interfaceC118594l5.invoke(ListProtector.get(list, i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(String str, InterfaceC118594l5<InterfaceC63226Ore> interfaceC118594l5) {
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                interfaceC118594l5.invoke(it.next());
            }
        }
        InterfaceC63226Ore interfaceC63226Ore = this.LIZ;
        if (interfaceC63226Ore != null) {
            interfaceC118594l5.invoke(interfaceC63226Ore);
        }
    }

    public final boolean LJ(int i, NewMessageNotify newMessageNotify) {
        Iterator it = ((CopyOnWriteArraySet) this.LJFF).iterator();
        while (it.hasNext()) {
            InterfaceC63343OtX interfaceC63343OtX = (InterfaceC63343OtX) it.next();
            if (interfaceC63343OtX != null && interfaceC63343OtX.LIZ(newMessageNotify)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJ(final int i, final C63120Opw c63120Opw) {
        if (c63120Opw == null || TextUtils.isEmpty(c63120Opw.getConversationId())) {
            return;
        }
        LIZ(c63120Opw.getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4nP
            @Override // X.InterfaceC118594l5
            public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                interfaceC120024nO.y9(i, C63120Opw.this);
            }
        });
    }

    public final void LJIILIIL(String str, InterfaceC63344OtY interfaceC63344OtY) {
        List list = (List) ((ConcurrentHashMap) this.LJ).get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(interfaceC63344OtY)) {
            list.add(interfaceC63344OtY);
        }
        ((ConcurrentHashMap) this.LJ).put(str, list);
    }

    public final void LJIILJJIL(String str, InterfaceC63226Ore interfaceC63226Ore) {
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(interfaceC63226Ore)) {
            list.add(interfaceC63226Ore);
        }
        ((ConcurrentHashMap) this.LIZLLL).put(str, list);
    }

    public final void LJIILLIIL(String str, InterfaceC63226Ore interfaceC63226Ore) {
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (list != null) {
            list.remove(interfaceC63226Ore);
            ((ConcurrentHashMap) this.LIZLLL).put(str, list);
        }
    }

    public final void LJFF(List<C109544Rq> list, int i, C107074Id c107074Id) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C109544Rq c109544Rq : list) {
            if (c109544Rq != null && c109544Rq.getSvrStatus() == 0) {
                arrayList.add(c109544Rq);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        LIZJ(((C109544Rq) ListProtector.get(list, 0)).getConversationId(), new C63249Os1(arrayList, i, c107074Id));
    }

    public final void LJIIIZ(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        if (c109544Rq == null || TextUtils.isEmpty(c109544Rq.getConversationId())) {
            return;
        }
        LIZJ(c109544Rq.getConversationId(), new C63244Orw(i, c109544Rq, c63540Owi));
    }

    public final void LJIIL(java.util.Map map, int i, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LIZJ(((C109544Rq) ListProtector.get(list, 0)).getConversationId(), new C63255Os7(list, map, i));
    }
}
