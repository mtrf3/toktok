package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS407S0100000_10;
import android.text.TextUtils;
import com.bytedance.im.core.proto.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Otl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63357Otl extends AbstractC63515OwJ {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63357Otl() {
        super(EnumC63625Oy5.CLIENT_BATCH_ACK.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && response.body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        Object[] objArr = c63622Oy2.LJLJJL;
        if (objArr.length < 2) {
            return;
        }
        Object obj = objArr[0];
        List list = (List) objArr[1];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientBatchAckHandler");
        LIZ.append(" handleResponse, msgReportType = ");
        LIZ.append(obj);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ClientBatchAckHandler");
            LIZ2.append(" handleResponse, isSuccess = ");
            LIZ2.append(true);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            if (V1B.LJJZZIII(list) || obj == null) {
                return;
            }
            if (obj == EnumC63359Otn.MSG_RECEIVE_BY_WS) {
                RunnableC63345OtZ.LJ(new IDcS407S0100000_10(list, 12), null, false);
            } else if (obj == EnumC63359Otn.MSG_RECEIVE_BY_USER) {
                RunnableC63345OtZ.LJ(new IDcS407S0100000_10(list, 13), null, false);
            } else {
                if (obj != EnumC63359Otn.MSG_SHOW) {
                    return;
                }
                RunnableC63345OtZ.LJ(new IDcS407S0100000_10(list, 14), null, false);
            }
        }
    }

    public final void LJIILIIL(C109544Rq c109544Rq, C63622Oy2 c63622Oy2, EnumC63359Otn enumC63359Otn) {
        long j;
        try {
            EnumC48299IxT fromValue = EnumC48299IxT.fromValue(C48000Ise.LIZ(C63308Osy.LJI().LIZ));
            if (fromValue == null || c109544Rq.getMsgType() > 50000) {
                return;
            }
            String extValue = c109544Rq.getExtValue("s:is_ack_sampling");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ClientBatchAckHandler");
            LIZ.append(" clientBatchAckByWs, isAckSampling = ");
            LIZ.append(extValue);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(extValue) && extValue.equals("true")) {
                C63449OvF c63449OvF = new C63449OvF();
                Response response = c63622Oy2.LJLJL;
                c63449OvF.LJ = response.cmd;
                c63449OvF.LJFF = fromValue;
                Long l = response.start_time_stamp;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                c63449OvF.LIZLLL = Long.valueOf(j);
                c63449OvF.LJI = c63622Oy2.LJLJL.log_id;
                c63449OvF.LJIIIIZZ = Long.valueOf(c109544Rq.getMsgId());
                c63449OvF.LJII = Long.valueOf(System.currentTimeMillis());
                c63449OvF.LJIIIZ = enumC63359Otn;
                arrayList.add(c63449OvF.build());
                C63473Ovd c63473Ovd = new C63473Ovd();
                C63685Oz3.LIZ(arrayList);
                c63473Ovd.LIZLLL = arrayList;
                C89453Z8v c89453Z8v = new C89453Z8v();
                c89453Z8v.LJLI = c63473Ovd.build();
                LJIIJJI(c63622Oy2.LJLJL.inbox_type.intValue(), c89453Z8v.build(), null, enumC63359Otn, Collections.singletonList(c109544Rq));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ClientBatchAckHandler");
            LIZ2.append(" clientBatchAckByWs, no is_ack_sampling or is_ack_sampling is false");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ClientBatchAckHandler");
            LIZ3.append(" clientBatchAckByWs, e = ");
            LIZ3.append(e.toString());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        }
    }
}
