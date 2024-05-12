package Y;

import X.C63120Opw;
import X.C63192Or6;
import X.C63196OrA;
import X.C63197OrB;
import X.C63199OrD;
import X.C63285Osb;
import X.C63286Osc;
import X.C63291Osh;
import X.C63322OtC;
import X.C63450OvG;
import X.C63623Oy3;
import X.C63685Oz3;
import X.C89453Z8v;
import X.InterfaceC86963bA;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import java.util.List;

/* loaded from: classes11.dex */
public class IDcS136S0200000_10 implements InterfaceC86963bA {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        switch (this.$t) {
            case 0:
                C63322OtC.LJFF("NewMsgNotifyHandler  GetConversationInfo fail");
                return;
            case 1:
                C63322OtC.LJFF("NewMsgNotifyHandler  GetConversationInfo fail");
                return;
            case 2:
                LIZIZ$2(this, c63623Oy3);
                return;
            case 3:
                LIZIZ$3(this, c63623Oy3);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                return;
            case 1:
                onSuccess$1(this, obj);
                return;
            case 2:
                onSuccess$2(this, obj);
                return;
            case 3:
                onSuccess$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void LIZIZ$2(IDcS136S0200000_10 iDcS136S0200000_10, C63623Oy3 c63623Oy3) {
        ((InterfaceC86963bA) iDcS136S0200000_10.l0).LIZIZ(c63623Oy3);
    }

    public static final void LIZIZ$3(IDcS136S0200000_10 iDcS136S0200000_10, C63623Oy3 c63623Oy3) {
        ((InterfaceC86963bA) iDcS136S0200000_10.l0).LIZIZ(c63623Oy3);
    }

    public static final void onSuccess$0(IDcS136S0200000_10 iDcS136S0200000_10, Object obj) {
        C63120Opw c63120Opw = (C63120Opw) obj;
        if (c63120Opw != null && c63120Opw.isReadBadgeCountUpdated()) {
            C63192Or6 c63192Or6 = ((C63199OrD) iDcS136S0200000_10.l1).LJLJI;
            C63196OrA c63196OrA = (C63196OrA) iDcS136S0200000_10.l0;
            c63192Or6.getClass();
            C63192Or6.LJIILLIIL(c63196OrA);
        }
    }

    public static final void onSuccess$1(IDcS136S0200000_10 iDcS136S0200000_10, Object obj) {
        C63120Opw c63120Opw = (C63120Opw) obj;
        if (c63120Opw != null) {
            if (!c63120Opw.isReadBadgeCountUpdated()) {
                C63291Osh.LIZ().getClass();
            }
            C63192Or6 c63192Or6 = ((C63197OrB) iDcS136S0200000_10.l1).LJLJI;
            C63196OrA c63196OrA = (C63196OrA) iDcS136S0200000_10.l0;
            c63192Or6.getClass();
            C63192Or6.LJIILLIIL(c63196OrA);
        }
    }

    public static final void onSuccess$2(IDcS136S0200000_10 iDcS136S0200000_10, Object obj) {
        new C63285Osb((C63120Opw) obj, (InterfaceC86963bA) iDcS136S0200000_10.l0).LJIILIIL((List) iDcS136S0200000_10.l1);
    }

    public static final void onSuccess$3(IDcS136S0200000_10 iDcS136S0200000_10, Object obj) {
        C63286Osc c63286Osc = new C63286Osc((C63120Opw) obj, (InterfaceC86963bA) iDcS136S0200000_10.l0);
        List<MessageIDIndexEntry> list = (List) iDcS136S0200000_10.l1;
        C63450OvG c63450OvG = new C63450OvG();
        c63450OvG.LIZLLL = c63286Osc.LIZJ.getConversationId();
        c63450OvG.LJ = Integer.valueOf(c63286Osc.LIZJ.getConversationType());
        c63450OvG.LJFF = Long.valueOf(c63286Osc.LIZJ.getConversationShortId());
        C63685Oz3.LIZ(list);
        c63450OvG.LJI = list;
        GetMessagesRequestBody build = c63450OvG.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJLIL = build;
        c63286Osc.LJIIJJI(c63286Osc.LIZJ.getInboxType(), c89453Z8v.build(), null, new Object[0]);
    }

    public IDcS136S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
