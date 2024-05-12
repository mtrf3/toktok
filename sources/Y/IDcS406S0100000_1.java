package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C120014nN;
import X.C1O1;
import X.C4W5;
import X.C4W7;
import X.C4WS;
import X.C61878OQg;
import X.C63120Opw;
import X.C63124Oq0;
import X.C63133Oq9;
import X.C63150OqQ;
import X.C63308Osy;
import X.C63322OtC;
import X.C63337OtR;
import X.C81913Jj;
import X.C81963Jo;
import X.EnumC109604Rw;
import X.InterfaceC63352Otg;
import X.RunnableC63345OtZ;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IDcS406S0100000_1 implements InterfaceC63352Otg {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC63352Otg
    public final Object LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            case 2:
                return LIZIZ$2(this);
            case 3:
                return LIZIZ$3(this);
            case 4:
                return LIZIZ$4(this);
            case 5:
                return LIZIZ$5(this);
            case 6:
                return LIZIZ$6(this);
            case 7:
                return LIZIZ$7(this);
            default:
                return null;
        }
    }

    public static final Object LIZIZ$0(IDcS406S0100000_1 iDcS406S0100000_1) {
        C63133Oq9.LJIIZILJ((C63120Opw) iDcS406S0100000_1.l0);
        return null;
    }

    public static final Object LIZIZ$1(IDcS406S0100000_1 iDcS406S0100000_1) {
        return Boolean.valueOf(C63133Oq9.LJJ(((C63120Opw) iDcS406S0100000_1.l0).getSortOrder(), ((C63120Opw) iDcS406S0100000_1.l0).getConversationId()));
    }

    public static final Object LIZIZ$2(IDcS406S0100000_1 iDcS406S0100000_1) {
        C81963Jo c81963Jo = new C81963Jo("legacy", 0);
        if (!((CopyOnWriteArraySet) ((C115284fk) iDcS406S0100000_1.l0).LJII).isEmpty()) {
            Iterator it = ((CopyOnWriteArraySet) ((C115284fk) iDcS406S0100000_1.l0).LJII).iterator();
            while (it.hasNext()) {
                ((C4WS) it.next()).LJII();
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long longValue = C63133Oq9.LJIIJ().longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("conversation size ");
        LIZ.append(longValue);
        C63322OtC.LIZIZ("ConversationListModel ", X1D.LIZIZ(LIZ));
        if (longValue <= C63308Osy.LJI().LIZLLL().LJJI) {
            C63322OtC.LIZIZ("ConversationListModel ", "total conversation less than fast load limit, ignore fast load");
            return new C81913Jj(c81963Jo, C61878OQg.INSTANCE, false, Long.MAX_VALUE, 0, false);
        }
        List LJIIJJI = C63133Oq9.LJIIJJI(C63308Osy.LJI().LIZLLL().LJJI);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            C63337OtR.LIZLLL("im_init_conversation_msg_duration", jSONObject);
        } catch (Exception unused) {
        }
        if (LJIIJJI != null) {
            ArrayList arrayList = (ArrayList) LJIIJJI;
            if (arrayList.size() > 0) {
                if (C63308Osy.LJI().LIZLLL().LJIJI) {
                    ((C115284fk) iDcS406S0100000_1.l0).LJIIL((C63120Opw[]) arrayList.toArray(new C63120Opw[0]));
                }
                return new C81913Jj(c81963Jo, LJIIJJI, true, ((C63120Opw) ListProtector.get(LJIIJJI, arrayList.size() - 1)).getSortOrder(), -1, true);
            }
        }
        return new C81913Jj(c81963Jo, C61878OQg.INSTANCE, false, Long.MAX_VALUE, 0, false);
    }

    public static final Object LIZIZ$3(IDcS406S0100000_1 iDcS406S0100000_1) {
        return C63124Oq0.LJFF(((C120014nN) iDcS406S0100000_1.l0).LJLJI);
    }

    public static final Object LIZIZ$4(IDcS406S0100000_1 iDcS406S0100000_1) {
        ((C109544Rq) iDcS406S0100000_1.l0).setMessageStatus(EnumC109604Rw.AVAILABLE);
        ((C109544Rq) iDcS406S0100000_1.l0).setDeleted(0);
        boolean LJJII = C63150OqQ.LJJII(true, (C109544Rq) iDcS406S0100000_1.l0, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandMessage handleMsgVisible,updateMessage to DB result ");
        LIZ.append(LJJII);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        return Boolean.valueOf(LJJII);
    }

    public static final Object LIZIZ$5(IDcS406S0100000_1 iDcS406S0100000_1) {
        return ((C4W7) iDcS406S0100000_1.l0).LIZIZ();
    }

    public static final Object LIZIZ$6(IDcS406S0100000_1 iDcS406S0100000_1) {
        return ((C4W5) iDcS406S0100000_1.l0).LIZ.LIZIZ();
    }

    public static final Object LIZIZ$7(IDcS406S0100000_1 iDcS406S0100000_1) {
        List list = (List) iDcS406S0100000_1.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao markStrangerRead, inbox:");
        LIZ.append(list);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        RunnableC63345OtZ.LJ(new IDcS134S0200000_10(new ArrayList(), list, 12), new C1O1(), false);
        return Boolean.TRUE;
    }

    public IDcS406S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
