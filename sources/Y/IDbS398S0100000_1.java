package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C115394fv;
import X.C115934gn;
import X.C120134nZ;
import X.C120304nq;
import X.C3LB;
import X.C47922IrO;
import X.C4W5;
import X.C4W7;
import X.C4W9;
import X.C4WK;
import X.C4WP;
import X.C4WS;
import X.C4ZF;
import X.C63120Opw;
import X.C63308Osy;
import X.C63309Osz;
import X.C63322OtC;
import X.C63508OwC;
import X.C63622Oy2;
import X.C63623Oy3;
import X.C81913Jj;
import X.DIL;
import X.InterfaceC63353Oth;
import X.InterfaceC83423Pe;
import X.InterfaceC86963bA;
import X.X1D;
import android.util.Pair;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class IDbS398S0100000_1 implements InterfaceC63353Oth {
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
            case 12:
                LIZLLL$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZLLL$13(this, obj);
                return;
            default:
                return;
        }
    }

    public IDbS398S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        List<C109544Rq> list = (List) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageBrowserModel loadOlderMessageList onCallback, result:");
        LIZ.append(list.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C115934gn c115934gn = (C115934gn) iDbS398S0100000_1.l0;
        c115934gn.LJLJJLL = false;
        c115934gn.M1(list, true);
    }

    public static final void LIZLLL$1(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        Iterator it = ((ArrayList) iDbS398S0100000_1.l0).iterator();
        while (it.hasNext()) {
            C115284fk.LJIILIIL().LJIILLIIL((C63120Opw) it.next());
        }
    }

    public static final void LIZLLL$10(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        C3LB c3lb = (C3LB) obj;
        if (c3lb == null) {
            C63322OtC.LJFF("StrangerManager loadStrangerBoxFromLocal null");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerManager ");
            LIZ.append(c3lb);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        }
        C115394fv c115394fv = (C115394fv) iDbS398S0100000_1.l0;
        c115394fv.getClass();
        C63322OtC.LJFF("StrangerManager notifyUpdateStrangerBox");
        InterfaceC83423Pe interfaceC83423Pe = c115394fv.LIZIZ;
        if (interfaceC83423Pe != null) {
            interfaceC83423Pe.LIZJ(c3lb);
        }
    }

    public static final void LIZLLL$11(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Iterator<C63120Opw> it = ((C63508OwC) iDbS398S0100000_1.l0).LIZJ.iterator();
            while (it.hasNext()) {
                C115284fk.LJIILIIL().LJIILLIIL(it.next());
            }
            return;
        }
        ((C63508OwC) iDbS398S0100000_1.l0).LIZIZ(C63622Oy2.LIZJ(-3001));
    }

    public static final void LIZLLL$12(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Iterator<C63120Opw> it = ((C120134nZ) iDbS398S0100000_1.l0).LIZJ.iterator();
            while (it.hasNext()) {
                C115284fk.LJIILIIL().LJIJI(3, it.next());
            }
            return;
        }
        ((C120134nZ) iDbS398S0100000_1.l0).LIZIZ(C63622Oy2.LIZJ(-3001));
    }

    public static final void LIZLLL$13(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        ((C120304nq) iDbS398S0100000_1.l0).LIZLLL(obj);
    }

    public static final void LIZLLL$2(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        C81913Jj c81913Jj = (C81913Jj) obj;
        if (!((CopyOnWriteArraySet) ((C115284fk) iDbS398S0100000_1.l0).LJII).isEmpty() && !c81913Jj.LJLILLLLZI.isEmpty()) {
            C63322OtC.LIZIZ("ConversationListModel ", "fastLoad page onCallback");
            Iterator it = ((CopyOnWriteArraySet) ((C115284fk) iDbS398S0100000_1.l0).LJII).iterator();
            while (it.hasNext()) {
                C4WS c4ws = (C4WS) it.next();
                c4ws.LJI();
                c4ws.LJIIJJI(c81913Jj, ((C115284fk) iDbS398S0100000_1.l0).LJIIJ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL$3(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            if (obj2 != null) {
                C63309Osz.LIZLLL().LJIIJJI(Collections.singletonList(obj2));
            }
            if (obj3 != null) {
                C115284fk.LJIILIIL().LJIJJ(false, 2, obj3);
            }
            InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) iDbS398S0100000_1.l0;
            if (interfaceC86963bA != null) {
                interfaceC86963bA.onSuccess(obj2);
                return;
            }
            return;
        }
        InterfaceC86963bA interfaceC86963bA2 = (InterfaceC86963bA) iDbS398S0100000_1.l0;
        if (interfaceC86963bA2 == null) {
            return;
        }
        interfaceC86963bA2.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-3001)));
    }

    public static final void LIZLLL$4(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        C81913Jj c81913Jj = (C81913Jj) obj;
        C47922IrO.LIZ();
        if (!((CopyOnWriteArraySet) ((C115284fk) iDbS398S0100000_1.l0).LJII).isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel preAsync onCallback IConversationPageListObserver next cursor ");
            LIZ.append(c81913Jj.LJLJJI);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            Iterator it = ((CopyOnWriteArraySet) ((C115284fk) iDbS398S0100000_1.l0).LJII).iterator();
            while (it.hasNext()) {
                C4WS c4ws = (C4WS) it.next();
                c4ws.LJI();
                c4ws.LJIIJJI(c81913Jj, ((C115284fk) iDbS398S0100000_1.l0).LJIIJ);
            }
        }
        if (C63308Osy.LJI().LIZLLL().LJIJI && !((CopyOnWriteArraySet) ((C115284fk) iDbS398S0100000_1.l0).LIZLLL).isEmpty()) {
            C63322OtC.LJFF("ConversationListModel preAsync onCallback IConversationListObserver");
            Iterator it2 = ((CopyOnWriteArraySet) ((C115284fk) iDbS398S0100000_1.l0).LIZLLL).iterator();
            while (it2.hasNext()) {
                ((C4WP) it2.next()).dU(((C115284fk) iDbS398S0100000_1.l0).LIZ);
            }
        }
        C4WK.LIZIZ().LIZLLL();
        ((ConcurrentHashMap) ((C115284fk) iDbS398S0100000_1.l0).LJ).remove("preload");
        C4ZF.LIZ().LIZIZ();
    }

    public static final void LIZLLL$5(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        ((InterfaceC86963bA) iDbS398S0100000_1.l0).onSuccess(obj);
    }

    public static final void LIZLLL$6(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        List<C63120Opw> list = (List) obj;
        if (list != null) {
            C4W7 c4w7 = (C4W7) iDbS398S0100000_1.l0;
            c4w7.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerListModel onQueryConversation:");
            DIL.LIZIZ(list, LIZ, ", ");
            LIZ.append(c4w7.LIZLLL);
            LIZ.append(", ");
            LIZ.append(c4w7.LIZ.size());
            LIZ.append(", type: ");
            LIZ.append(c4w7.LJI);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (c4w7.LIZLLL || !c4w7.LIZ.isEmpty()) {
                C63322OtC.LJFF("StrangerListModel onQueryConversation: already refreshed");
                return;
            }
            c4w7.LIZ.clear();
            c4w7.LIZ(list);
            C4W9 c4w9 = c4w7.LIZIZ;
            if (c4w9 == null) {
                return;
            }
            c4w9.nS(list);
        }
    }

    public static final void LIZLLL$7(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        List<C63120Opw> list = (List) obj;
        if (list != null) {
            C4W7 c4w7 = ((C4W5) iDbS398S0100000_1.l0).LIZ;
            c4w7.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerListModel onRefreshConversation:");
            DIL.LIZIZ(list, LIZ, ", type: ");
            LIZ.append(c4w7.LJI);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            c4w7.LIZ.clear();
            c4w7.LIZ(list);
            C4W9 c4w9 = c4w7.LIZIZ;
            if (c4w9 != null) {
                c4w9.kc(list, c4w7.LJ);
            }
            ((C4W5) iDbS398S0100000_1.l0).LIZ.LIZLLL = true;
        }
    }

    public static final void LIZLLL$8(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        List<C63120Opw> list = (List) obj;
        ((C4W7) iDbS398S0100000_1.l0).LIZJ = false;
        if (list != null) {
            C4W7 c4w7 = (C4W7) iDbS398S0100000_1.l0;
            c4w7.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerListModel onLoadMoreConversation:");
            LIZ.append(Integer.valueOf(list.size()));
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            c4w7.LIZ(list);
            C4W9 c4w9 = c4w7.LIZIZ;
            if (c4w9 != null) {
                c4w9.FA(list, c4w7.LJ);
            }
        }
    }

    public static final void LIZLLL$9(IDbS398S0100000_1 iDbS398S0100000_1, Object obj) {
        ((C115394fv) iDbS398S0100000_1.l0).LJIIL((C63120Opw) obj);
    }
}
