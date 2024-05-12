package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C63120Opw;
import X.C63124Oq0;
import X.C63133Oq9;
import X.C63134OqA;
import X.C63150OqQ;
import X.C63153OqT;
import X.C63171Oql;
import X.C63192Or6;
import X.C63195Or9;
import X.C63216OrU;
import X.C63219OrX;
import X.C63246Ory;
import X.C63265OsH;
import X.C63308Osy;
import X.C63322OtC;
import X.C63337OtR;
import X.C63462OvS;
import X.C63682Oz0;
import X.C78847Ux1;
import X.C89453Z8v;
import X.EnumC63154OqU;
import X.EnumC63157OqX;
import X.InterfaceC63352Otg;
import X.JBR;
import X.X1D;
import X.YE1;
import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.model.RangeList;
import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IDcS14S1100000_10 implements InterfaceC63352Otg {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 8:
                return LIZIZ$8(this);
            default:
                return null;
        }
    }

    public static final Object LIZIZ$0(IDcS14S1100000_10 iDcS14S1100000_10) {
        try {
            return Boolean.valueOf(C63171Oql.LIZJ(iDcS14S1100000_10.s0, "check_range", C63682Oz0.LIZ.LJIILL((RangeList) iDcS14S1100000_10.l1)));
        } catch (Exception e) {
            C63322OtC.LJ("CheckRangeListStore update rangeList failed", e);
            return Boolean.FALSE;
        }
    }

    public static final Object LIZIZ$1(IDcS14S1100000_10 iDcS14S1100000_10) {
        C109544Rq LJIILJJIL;
        String str = iDcS14S1100000_10.s0;
        Map<String, String> map = (Map) iDcS14S1100000_10.l1;
        if (!TextUtils.isEmpty(str) && (LJIILJJIL = C63150OqQ.LJIILJJIL(str)) != null && !LJIILJJIL.invalid()) {
            String LIZ = C63682Oz0.LIZ(map);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("IMMsgDao updateMessageLocalExt, uuid:");
            LIZ2.append(LJIILJJIL.getUuid());
            LIZ2.append(", localExtStr:");
            LIZ2.append(LIZ);
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
            ContentValues contentValues = new ContentValues();
            String str2 = EnumC63154OqU.COLUMN_LOCAL_INFO.key;
            if (LIZ == null) {
                LIZ = "";
            }
            contentValues.put(str2, LIZ);
            StringBuilder LIZ3 = X1D.LIZ();
            if (C78847Ux1.LJJLIIIJLJLI("msg", contentValues, JBR.LJFF(LIZ3, EnumC63154OqU.COLUMN_MSG_ID.key, "=?", LIZ3), new String[]{LJIILJJIL.getUuid()}) >= 0) {
                LJIILJJIL.setLocalExt(map);
                return LJIILJJIL;
            }
        }
        return null;
    }

    public static final Object LIZIZ$2(IDcS14S1100000_10 iDcS14S1100000_10) {
        try {
            return Boolean.valueOf(C63171Oql.LIZJ(iDcS14S1100000_10.s0, "repaired_range_list", C63682Oz0.LIZ.LJIILL(((RangeList) iDcS14S1100000_10.l1).copy())));
        } catch (Exception e) {
            C63322OtC.LJ("CheckRangeListStore update rangeList failed", e);
            return Boolean.FALSE;
        }
    }

    public static final Object LIZIZ$3(IDcS14S1100000_10 iDcS14S1100000_10) {
        String str = iDcS14S1100000_10.s0;
        C63322OtC.LIZJ("IMMsgPropertyDao collectResendProperties with msg uuid");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" AND p.");
        YE1.LIZLLL(LIZ, EnumC63157OqX.COLUMN_MSG_UUID.key, "='", str, "'");
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C63153OqT.LJ());
        LIZ2.append(LIZIZ);
        Collection<C63219OrX> LIZLLL = C63153OqT.LIZLLL(X1D.LIZIZ(LIZ2));
        if (LIZLLL != null && !LIZLLL.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("triggerResend for single message, size ");
            LIZ3.append(LIZLLL.size());
            LIZ3.append(", ");
            LIZ3.append(LIZLLL);
            C63322OtC.LIZIZ("ModifyMsgPropertyHandler", X1D.LIZIZ(LIZ3));
            for (C63219OrX c63219OrX : LIZLLL) {
                c63219OrX.setResend(true);
                ((C63216OrU) iDcS14S1100000_10.l1).LJIILL(c63219OrX);
            }
            ((C63216OrU) iDcS14S1100000_10.l1).getClass();
            C63216OrU.LJIILJJIL(LIZLLL, true);
            return Boolean.TRUE;
        }
        C63322OtC.LIZIZ("ModifyMsgPropertyHandler", "triggerResend for single message, no record");
        return Boolean.FALSE;
    }

    public static final Object LIZIZ$4(IDcS14S1100000_10 iDcS14S1100000_10) {
        C63322OtC.LJFF("LoadHistoryHandlerpull onRun");
        long LJIIJJI = C63150OqQ.LJIIJJI(iDcS14S1100000_10.s0);
        if (LJIIJJI <= 0) {
            return Long.valueOf(((C63120Opw) iDcS14S1100000_10.l1).getLastMessageIndex());
        }
        return Long.valueOf(LJIIJJI);
    }

    public static final Object LIZIZ$5(IDcS14S1100000_10 iDcS14S1100000_10) {
        int conversationType;
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(iDcS14S1100000_10.s0);
        C63124Oq0.LIZLLL(iDcS14S1100000_10.s0);
        String str = iDcS14S1100000_10.s0;
        if (LJIIIZ == null) {
            conversationType = -1;
        } else {
            conversationType = LJIIIZ.getConversationType();
        }
        C63124Oq0.LJII(conversationType, str, ((C63265OsH) iDcS14S1100000_10.l1).LIZJ);
        return new Pair(C63133Oq9.LJIIIZ(iDcS14S1100000_10.s0, true), ((C63265OsH) iDcS14S1100000_10.l1).LIZJ);
    }

    public static final Object LIZIZ$6(IDcS14S1100000_10 iDcS14S1100000_10) {
        long LJIIIZ = C63150OqQ.LJIIIZ(iDcS14S1100000_10.s0);
        if (LJIIIZ <= 0) {
            return Long.valueOf(((C63120Opw) iDcS14S1100000_10.l1).getMinIndex());
        }
        return Long.valueOf(LJIIIZ);
    }

    public static final Object LIZIZ$7(IDcS14S1100000_10 iDcS14S1100000_10) {
        C63120Opw LJIIIZ;
        long j;
        if (C63308Osy.LJI().LIZLLL().LJLILLLLZI) {
            LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(iDcS14S1100000_10.s0);
            if ((LJIIIZ == null && (LJIIIZ = C63133Oq9.LJIIIZ(iDcS14S1100000_10.s0, false)) == null) || LJIIIZ.getUnreadCount() == 0) {
                return null;
            }
        } else {
            LJIIIZ = C63133Oq9.LJIIIZ(iDcS14S1100000_10.s0, false);
            if (LJIIIZ == null) {
                return null;
            }
            if (LJIIIZ.getLastMessageIndex() <= LJIIIZ.getReadIndex() && LJIIIZ.getUnreadCount() == 0) {
                return null;
            }
        }
        C63308Osy.LJI().LIZLLL().getClass();
        LJIIIZ.setUnreadCount(0L);
        LJIIIZ.setReadIndex(LJIIIZ.getLastMessageIndex());
        LJIIIZ.setReadIndexV2(LJIIIZ.getMaxIndexV2());
        LJIIIZ.setReadBadgeCount(LJIIIZ.getBadgeCount());
        LJIIIZ.setUnreadSelfMentionedMessages(null);
        if (!C63133Oq9.LJIL(LJIIIZ)) {
            return null;
        }
        C63134OqA.LIZJ(iDcS14S1100000_10.s0);
        C63150OqQ.LJIJJLI(iDcS14S1100000_10.s0);
        C63246Ory c63246Ory = (C63246Ory) iDcS14S1100000_10.l1;
        c63246Ory.getClass();
        C109544Rq LJIILL = C63150OqQ.LJIILL(LJIIIZ.getReadIndex(), LJIIIZ.getConversationId());
        if (LJIILL != null) {
            j = LJIILL.getMsgId();
        } else {
            j = 0;
        }
        C63462OvS c63462OvS = new C63462OvS();
        c63462OvS.LIZLLL = LJIIIZ.getConversationId();
        c63462OvS.LJ = Long.valueOf(LJIIIZ.getConversationShortId());
        c63462OvS.LJFF = Integer.valueOf(LJIIIZ.getConversationType());
        c63462OvS.LJI = Long.valueOf(LJIIIZ.getReadIndex());
        c63462OvS.LJIIIZ = Long.valueOf(LJIIIZ.getReadIndexV2());
        c63462OvS.LJIIJ = Integer.valueOf(LJIIIZ.getReadBadgeCount());
        c63462OvS.LJII = Long.valueOf(LJIIIZ.getUnreadCount());
        if (j > 0) {
            c63462OvS.LJIIL = Long.valueOf(j);
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIILLIIL = c63462OvS.build();
        c63246Ory.LJIIJJI(LJIIIZ.getInboxType(), c89453Z8v.build(), null, new Object[0]);
        return LJIIIZ;
    }

    public static final Object LIZIZ$8(IDcS14S1100000_10 iDcS14S1100000_10) {
        C109544Rq c109544Rq;
        C78847Ux1.LJJLIIIJJI("StrangerMsgHandler.saveMsg(String,List,boolean)");
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerMsgHandler saveMsg start, messages:");
            LIZ.append(((List) iDcS14S1100000_10.l1).size());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            long uptimeMillis = SystemClock.uptimeMillis();
            for (MessageBody messageBody : (List) iDcS14S1100000_10.l1) {
                Integer num = messageBody.status;
                if (num == null || num.intValue() != 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("s:get_msg_log_id", iDcS14S1100000_10.s0);
                    C63195Or9 LJIJ = C63192Or6.LJIJ(messageBody, false, hashMap, 1);
                    if (LJIJ != null && (c109544Rq = LJIJ.LIZ) != null) {
                        arrayList.add(c109544Rq);
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("StrangerMsgHandler saveMsg end, list:");
            LIZ2.append(arrayList.size());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", ((List) iDcS14S1100000_10.l1).size());
                jSONObject.put("msg_source", 1);
                C63337OtR.LIZLLL("im_save_msg_list_duration", jSONObject);
            } catch (Exception unused) {
            }
            C78847Ux1.LJIJJLI("StrangerMsgHandler.saveMsg(String,List,boolean)", true);
        } catch (Exception e) {
            C78847Ux1.LJIJJLI("StrangerMsgHandler.saveMsg(String,List,boolean)", false);
            C63322OtC.LJ("LoadHistoryHandler saveMsg", e);
        }
        return arrayList;
    }

    public IDcS14S1100000_10(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
