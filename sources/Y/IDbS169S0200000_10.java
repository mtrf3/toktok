package Y;

import X.AbstractC63551Owt;
import X.C109544Rq;
import X.C115284fk;
import X.C63120Opw;
import X.C63220OrY;
import X.C63251Os3;
import X.C63273OsP;
import X.C63309Osz;
import X.C63322OtC;
import X.C63536Owe;
import X.C63622Oy2;
import X.C63623Oy3;
import X.InterfaceC63353Oth;
import X.InterfaceC86963bA;
import X.X1D;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class IDbS169S0200000_10 implements InterfaceC63353Oth {
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
            default:
                return;
        }
    }

    public static final void LIZLLL$0(IDbS169S0200000_10 iDbS169S0200000_10, Object obj) {
        List<C109544Rq> list = (List) obj;
        C63322OtC.LJFF("MessageModel onPerformLoadNewerToEnd onCallback");
        if (list == null) {
            ((C63220OrY) iDbS169S0200000_10.l1).LJLL.set(false);
            return;
        }
        C63220OrY c63220OrY = (C63220OrY) iDbS169S0200000_10.l1;
        c63220OrY.LJLJLLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel onPerformLoadNewerToEnd, result:");
        LIZ.append(list.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        Collections.reverse(list);
        c63220OrY.LJLILLLLZI.addList(list);
        c63220OrY.LJLL.set(false);
        c63220OrY.LJIIZILJ();
        c63220OrY.v0(list, true);
        c63220OrY.LJIILJJIL(c63220OrY.LJLIL);
        InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) iDbS169S0200000_10.l0;
        if (interfaceC86963bA == null) {
            return;
        }
        interfaceC86963bA.onSuccess(null);
    }

    public static final void LIZLLL$1(IDbS169S0200000_10 iDbS169S0200000_10, Object obj) {
        Pair pair = (Pair) obj;
        int i = -3001;
        if (pair != null) {
            if (pair.first != null) {
                C115284fk.LJIILIIL().LJIJI(2, (C63120Opw) pair.first);
            }
            InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) iDbS169S0200000_10.l0;
            if (interfaceC86963bA != null) {
                interfaceC86963bA.onSuccess((C109544Rq) iDbS169S0200000_10.l1);
            }
        } else {
            ((C109544Rq) iDbS169S0200000_10.l1).setMsgStatus(3);
            InterfaceC86963bA interfaceC86963bA2 = (InterfaceC86963bA) iDbS169S0200000_10.l0;
            if (interfaceC86963bA2 != null) {
                interfaceC86963bA2.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-3001)));
            }
        }
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        if (pair != null) {
            i = AbstractC63551Owt.LIZ;
        }
        C109544Rq c109544Rq = (C109544Rq) iDbS169S0200000_10.l1;
        LIZLLL.getClass();
        if (c109544Rq == null || TextUtils.isEmpty(c109544Rq.getConversationId())) {
            return;
        }
        LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63251Os3(i, c109544Rq));
    }

    public static final void LIZLLL$2(IDbS169S0200000_10 iDbS169S0200000_10, Object obj) {
        Map map = (Map) obj;
        if (map != null && ((InterfaceC86963bA) iDbS169S0200000_10.l0) != null) {
            ((Map) iDbS169S0200000_10.l1).putAll(map);
            ((InterfaceC86963bA) iDbS169S0200000_10.l0).onSuccess((Map) iDbS169S0200000_10.l1);
        }
    }

    public static final void LIZLLL$3(IDbS169S0200000_10 iDbS169S0200000_10, Object obj) {
        C63273OsP c63273OsP = (C63273OsP) iDbS169S0200000_10.l1;
        if (c63273OsP.LJIIZILJ) {
            c63273OsP.LJIIZILJ = false;
            c63273OsP.LIZLLL(ListProtector.get((List) iDbS169S0200000_10.l0, r1.size() - 1));
        }
    }

    public static final void LIZLLL$4(IDbS169S0200000_10 iDbS169S0200000_10, Object obj) {
        ((C63536Owe) iDbS169S0200000_10.l1).LJIILJJIL((C109544Rq) iDbS169S0200000_10.l0, ((Boolean) obj).booleanValue());
    }

    public IDbS169S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
