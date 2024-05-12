package X;

import Y.IDbS399S0100000_10;
import Y.IDcS134S0200000_10;
import Y.IDcS365S0100000_10;
import Y.IDcS407S0100000_10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ora, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63222Ora extends C63220OrY {
    @Override // X.C63220OrY
    public final void LJII() {
        if (LJJIFFI()) {
            C115394fv.LJII().LIZJ(this.LJLIL, new IDcS365S0100000_10(this, 1));
        } else {
            LJIIIIZZ(this.LJLJI, null, "MessageModel.initMessageList.default");
        }
    }

    @Override // X.C63220OrY
    public final void LJIILLIIL() {
        if (!LJJIFFI()) {
            if (C115944go.LIZJ().LIZLLL(this.LJLIL)) {
                C63322OtC.LIZLLL("MessageModel requestHistoryMessage checking now");
            } else {
                RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, new ArrayList(this.LJLILLLLZI), 4), new IDbS399S0100000_10(this, 3), false);
            }
        }
    }

    public final boolean LJJIFFI() {
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLIL);
        if (LJIIIZ != null && LJIIIZ.isStranger()) {
            return true;
        }
        return false;
    }

    public static void LJIJJLI(C63222Ora c63222Ora) {
        c63222Ora.LJIIIIZZ(c63222Ora.LJLJI, null, "MessageModel.initMessageList.default");
    }

    public static void LJIL(C63222Ora c63222Ora) {
        c63222Ora.LJIIIIZZ(c63222Ora.LJLJI, null, "MessageModel.initMessageList.default");
    }

    public C63222Ora(String str, boolean z) {
        super(str, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtendMessageModel constructor, conversationId:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    @Override // X.C63220OrY, X.InterfaceC63226Ore
    public final void K7(int i, String str, List list) {
        C109544Rq c109544Rq;
        if (LJJIFFI() && !C63308Osy.LJI().LIZLLL().LJLJJL) {
            C115394fv LJII = C115394fv.LJII();
            String str2 = this.LJLIL;
            if (this.LJLILLLLZI.isEmpty()) {
                c109544Rq = null;
            } else {
                c109544Rq = this.LJLILLLLZI.get(0);
            }
            C63120Opw LIZLLL = LJII.LIZLLL(str2);
            if (LIZLLL != null && c109544Rq != null) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("StrangerManager updateLastMessage, cid:", str2, ", msgUuid:");
                LIZIZ.append(c109544Rq.getUuid());
                LIZIZ.append(", msgSvrId:");
                LIZIZ.append(c109544Rq.getMsgId());
                LIZIZ.append(", msgIndex:");
                LIZIZ.append(c109544Rq.getIndex());
                LIZIZ.append(", msgOrderIndex:");
                LIZIZ.append(c109544Rq.getOrderIndex());
                C63322OtC.LJFF(X1D.LIZIZ(LIZIZ));
                C63119Opv.LIZJ(LIZLLL, c109544Rq);
            }
        }
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).K7(1, str, list);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.K7(1, str, list);
            }
        }
        C63228Org c63228Org = this.LJZI;
        List<C109544Rq> LIZJ = LIZJ();
        c63228Org.getClass();
        c63228Org.LIZLLL = LIZJ;
        this.LJZI.getClass();
        C63308Osy.LJI().LIZLLL().getClass();
        if (C63308Osy.LJI().LIZLLL != null) {
            RunnableC63345OtZ.LJ(new IDcS407S0100000_10(this, 6), null, false);
        }
    }

    @Override // X.C63220OrY
    public final void LJIIIIZZ(int i, InterfaceC86963bA interfaceC86963bA, String str) {
        if (LJJIFFI()) {
            C115394fv.LJII().LIZJ(this.LJLIL, new C63239Orr(this, i, str, interfaceC86963bA));
        } else {
            super.LJIIIIZZ(i, interfaceC86963bA, str);
        }
    }
}
