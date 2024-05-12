package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C115394fv;
import X.C120014nN;
import X.C120144na;
import X.C47922IrO;
import X.C4WP;
import X.C4WS;
import X.C61878OQg;
import X.C63089OpR;
import X.C63120Opw;
import X.C63308Osy;
import X.C63320OtA;
import X.C63322OtC;
import X.C63435Ov1;
import X.C63622Oy2;
import X.C81913Jj;
import X.C81963Jo;
import X.InterfaceC63353Oth;
import X.InterfaceC86963bA;
import X.X1D;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDbS168S0200000_1 implements InterfaceC63353Oth {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public IDbS168S0200000_1(C120014nN c120014nN, int i) {
        this.$t = i;
        this.l1 = c120014nN;
        this.l0 = null;
    }

    public static final void LIZLLL$0(IDbS168S0200000_1 iDbS168S0200000_1, Object obj) {
        C63120Opw c63120Opw = (C63120Opw) obj;
        if (c63120Opw != null) {
            if (c63120Opw.isStranger()) {
                C115394fv.LJII().LJIILL(c63120Opw);
            } else {
                C47922IrO.LIZ();
                ((C115284fk) iDbS168S0200000_1.l1).LJIIL(c63120Opw);
            }
        }
        InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) iDbS168S0200000_1.l0;
        if (interfaceC86963bA != null) {
            interfaceC86963bA.onSuccess(c63120Opw);
        }
    }

    public static final void LIZLLL$1(IDbS168S0200000_1 iDbS168S0200000_1, Object obj) {
        C81913Jj c81913Jj = (C81913Jj) obj;
        ((ConcurrentHashMap) ((C115284fk) iDbS168S0200000_1.l1).LJ).remove(((C81963Jo) iDbS168S0200000_1.l0).LJLIL);
        if (!((CopyOnWriteArraySet) ((C115284fk) iDbS168S0200000_1.l1).LJII).isEmpty()) {
            if (c81913Jj == null) {
                C81963Jo originQuery = (C81963Jo) iDbS168S0200000_1.l0;
                o.LJIIIZ(originQuery, "originQuery");
                c81913Jj = new C81913Jj(originQuery, C61878OQg.INSTANCE, true, Long.MAX_VALUE, 0, false);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel asyncRange onCallback IConversationPageListObserver next cursor ");
            LIZ.append(c81913Jj.LJLJJI);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            Iterator it = ((CopyOnWriteArraySet) ((C115284fk) iDbS168S0200000_1.l1).LJII).iterator();
            while (it.hasNext()) {
                C4WS c4ws = (C4WS) it.next();
                try {
                    c4ws.LJI();
                    c4ws.LJIIJJI(c81913Jj, ((C115284fk) iDbS168S0200000_1.l1).LJIIJ);
                } catch (Exception e) {
                    C63322OtC.LJ("call observer error", e);
                }
            }
        }
        if (C63308Osy.LJI().LIZLLL().LJIJI && !((CopyOnWriteArraySet) ((C115284fk) iDbS168S0200000_1.l1).LIZLLL).isEmpty()) {
            C63322OtC.LJFF("ConversationListModel asyncRange onCallback IConversationListObserver");
            Iterator it2 = ((CopyOnWriteArraySet) ((C115284fk) iDbS168S0200000_1.l1).LIZLLL).iterator();
            while (it2.hasNext()) {
                ((C4WP) it2.next()).dU(((C115284fk) iDbS168S0200000_1.l1).LIZ);
            }
        }
    }

    public static final void LIZLLL$2(IDbS168S0200000_1 iDbS168S0200000_1, Object obj) {
        List<C63089OpR> list = (List) obj;
        C120014nN c120014nN = (C120014nN) iDbS168S0200000_1.l1;
        c120014nN.Mi(c120014nN.LJLJI, list);
        InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) iDbS168S0200000_1.l0;
        if (interfaceC86963bA == null) {
            return;
        }
        interfaceC86963bA.onSuccess(list);
    }

    public static final void LIZLLL$3(IDbS168S0200000_1 iDbS168S0200000_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C63435Ov1) iDbS168S0200000_1.l1).LIZLLL(((C63120Opw) iDbS168S0200000_1.l0).getConversationId());
            C115284fk.LJIILIIL().LJIILLIIL((C63120Opw) iDbS168S0200000_1.l0);
        } else {
            ((C63435Ov1) iDbS168S0200000_1.l1).LIZIZ(C63622Oy2.LIZJ(-3001));
        }
    }

    public static final void LIZLLL$4(IDbS168S0200000_1 iDbS168S0200000_1, Object obj) {
        if (obj == null) {
            ((C120144na) iDbS168S0200000_1.l1).LIZIZ((C63622Oy2) iDbS168S0200000_1.l0);
        } else {
            ((C120144na) iDbS168S0200000_1.l1).LIZLLL(obj);
        }
    }

    public static final void LIZLLL$5(IDbS168S0200000_1 iDbS168S0200000_1, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            boolean booleanValue = ((Boolean) pair.first).booleanValue();
            C63120Opw c63120Opw = (C63120Opw) pair.second;
            if (booleanValue) {
                if (c63120Opw != null) {
                    if (c63120Opw.isStranger() && c63120Opw.getLastShowMessage() == null) {
                        C115284fk.LJIILIIL().LJIILLIIL(c63120Opw);
                    } else {
                        C115284fk.LJIILIIL().LJIJI(2, c63120Opw);
                    }
                }
                ((C63320OtA) iDbS168S0200000_1.l1).LIZLLL((C109544Rq) iDbS168S0200000_1.l0);
                return;
            }
            ((C63320OtA) iDbS168S0200000_1.l1).LIZIZ(C63622Oy2.LIZJ(-3001));
        }
    }

    public IDbS168S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
