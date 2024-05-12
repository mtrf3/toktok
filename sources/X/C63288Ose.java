package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Ose, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63288Ose extends AbstractC63515OwJ {
    public final int LIZJ;
    public int LIZLLL;
    public String LJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63288Ose(int i) {
        super(EnumC63625Oy5.GET_CMD_MESSAGE.getValue());
        this.LIZJ = i;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.get_cmd_message_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL(int i) {
        if (i != 9 && (C63308Osy.LJI().LIZLLL().LJZI || C63305Osv.LIZIZ().LIZJ() != 1)) {
            C63272OsO.LIZJ(5, i);
        }
        this.LIZLLL = i;
        String LJFF = C63312Ot2.LJFF(i);
        int i2 = this.LIZJ;
        if (((CopyOnWriteArraySet) C63269OsL.LJ).contains(Integer.valueOf(i2))) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("GetCmdMsgByUserHandler pull, source:", LJFF, ", inbox:");
            LIZIZ.append(this.LIZJ);
            LIZIZ.append(", already doing, return");
            C63322OtC.LJFF(X1D.LIZIZ(LIZIZ));
            return;
        }
        C63291Osh LIZ = C63291Osh.LIZ();
        int i3 = this.LIZJ;
        LIZ.getClass();
        LJIILL(C63291Osh.LIZJ(i3), LJFF);
    }

    public final boolean LJIILLIIL(GetCmdMessageRespBody getCmdMessageRespBody) {
        long j;
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LIZJ;
        LIZ.getClass();
        long LJFF = C63291Osh.LJFF(i);
        Long l = getCmdMessageRespBody.next_user_message_cursor;
        long j2 = -1;
        if (l == null || l.longValue() <= LJFF) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("GetCmdMsgByUserHandler updateCursor cursor invalid: cursor:");
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            LIZ2.append(j);
            LIZ2.append(", local:");
            LIZ2.append(LJFF);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        } else {
            C63291Osh LIZ3 = C63291Osh.LIZ();
            int i2 = this.LIZJ;
            long longValue = l.longValue();
            LIZ3.getClass();
            C63291Osh.LJIILIIL(i2, longValue);
        }
        C63291Osh LIZ4 = C63291Osh.LIZ();
        int i3 = this.LIZJ;
        LIZ4.getClass();
        long LIZJ = C63291Osh.LIZJ(i3);
        Long l2 = getCmdMessageRespBody.next_cmd_index;
        if (l2 == null || l2.longValue() <= LIZJ) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("GetCmdMsgByUserHandler updateCursor index invalid, next:");
            if (l2 != null) {
                j2 = l2.longValue();
            }
            LIZ5.append(j2);
            LIZ5.append(", local:");
            LIZ5.append(LIZJ);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ5));
            return false;
        }
        C63291Osh LIZ6 = C63291Osh.LIZ();
        int i4 = this.LIZJ;
        long longValue2 = l2.longValue();
        LIZ6.getClass();
        C63291Osh.LJIIJ(i4, longValue2);
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetCmdMsgByUserHandler handleResponse, seqId:");
        V1I.LIZJ(LIZ, c63622Oy2.LJLIL, ", success:", z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!z) {
            int i = this.LIZJ;
            ((CopyOnWriteArraySet) C63269OsL.LJ).remove(Integer.valueOf(i));
            C63337OtR.LJII(c63622Oy2, false).LIZ();
            return;
        }
        GetCmdMessageRespBody getCmdMessageRespBody = c63622Oy2.LJLJL.body.get_cmd_message_body;
        RunnableC63345OtZ.LIZLLL(new C63290Osg(this, c63622Oy2, getCmdMessageRespBody), new C63289Osf(this, c63622Oy2, getCmdMessageRespBody), C63346Ota.LIZJ());
    }

    public final void LJIILIIL(String str, List list) {
        if (V1B.LJJZZIII(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageBody messageBody = (MessageBody) it.next();
            if (C115394fv.LJIIIIZZ(messageBody)) {
                C115394fv.LJII().LJI(this.LIZJ, messageBody);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("s:get_msg_log_id", str);
                C63192Or6.LJIJ(messageBody, false, hashMap, 5);
            }
        }
    }

    public final void LJIILL(long j, String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("GetCmdMsgByUserHandler pull, source:", str, ", inbox:");
        V10.LJFF(LIZIZ, this.LIZJ, ", index:", j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZIZ));
        this.LJ = str;
        int i = this.LIZJ;
        ((CopyOnWriteArraySet) C63269OsL.LJ).add(Integer.valueOf(i));
        C63464OvU c63464OvU = new C63464OvU();
        c63464OvU.LIZLLL = Long.valueOf(j);
        c63464OvU.LJ = str;
        if (this.LIZLLL == 0) {
            C63308Osy.LJI().LIZIZ().isNewUser();
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJLIL = c63464OvU.build();
        LJIIJJI(this.LIZJ, c89453Z8v.build(), null, new Object[0]);
    }
}
