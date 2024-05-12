package X;

import Y.IDcS136S0200000_10;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.NewMessageNotify;

/* renamed from: X.OrB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63197OrB implements InterfaceC63353Oth<C63196OrA> {
    public final /* synthetic */ NewMessageNotify LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C63192Or6 LJLJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(C63196OrA c63196OrA) {
        int i;
        int i2;
        Long l;
        C63193Or7 LIZIZ;
        C63196OrA c63196OrA2 = c63196OrA;
        C63322OtC.LJFF("NewMsgNotifyHandler notifyByUserLink onCallback");
        if (c63196OrA2.LIZIZ) {
            if (C63308Osy.LJI().LIZIZ().LJIJ() != null && this.LJLIL.message != null) {
                C63308Osy.LJI().LIZIZ().LJIJ().LIZIZ();
            }
            C63308Osy.LJI().LJIIL(this.LJLILLLLZI, 2);
            MessageBody messageBody = this.LJLIL.message;
            if (messageBody != null && (l = messageBody.server_message_id) != null && (LIZIZ = C63198OrC.LIZIZ(l.longValue())) != null) {
                C63308Osy.LJI().getClass();
                long LJ = C63308Osy.LJ();
                long j = LJ - LIZIZ.LIZLLL;
                LIZIZ.LJFF = j;
                long j2 = LJ - LIZIZ.LIZJ;
                LIZIZ.LJI = j2;
                LIZIZ.LJIIIIZZ = true;
                C63198OrC.LJ(j, j2, "", this.LJLIL.message.server_message_id.longValue(), this.LJLIL.message.message_type.intValue(), this.LJLIL.conversation_id, LIZIZ.LJIIIIZZ, true, LIZIZ.LJIIJ, false);
            }
        } else if (c63196OrA2.LIZJ && c63196OrA2.LJFF != null) {
            C63120Opw c63120Opw = c63196OrA2.LJI;
            if (c63120Opw != null) {
                if (!c63120Opw.isReadBadgeCountUpdated()) {
                    C63291Osh.LIZ().getClass();
                }
                this.LJLJI.getClass();
                C63192Or6.LJIILLIIL(c63196OrA2);
            } else if (!C63308Osy.LJI().LIZLLL().LJJJZ) {
                C63217OrV c63217OrV = new C63217OrV();
                int i3 = this.LJLILLLLZI;
                C109544Rq c109544Rq = c63196OrA2.LJFF;
                Integer num = this.LJLIL.badge_count;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                c63217OrV.LJIILJJIL(i3, i2, c109544Rq);
            } else {
                C63217OrV c63217OrV2 = new C63217OrV(new IDcS136S0200000_10(c63196OrA2, this, 1));
                int i4 = this.LJLILLLLZI;
                C109544Rq c109544Rq2 = c63196OrA2.LJFF;
                Integer num2 = this.LJLIL.badge_count;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                c63217OrV2.LJIILJJIL(i4, i, c109544Rq2);
            }
        }
        C63269OsL.LIZLLL(false);
    }

    public C63197OrB(int i, C63192Or6 c63192Or6, NewMessageNotify newMessageNotify) {
        this.LJLJI = c63192Or6;
        this.LJLIL = newMessageNotify;
        this.LJLILLLLZI = i;
    }
}
