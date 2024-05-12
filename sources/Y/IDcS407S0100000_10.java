package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C1FJ;
import X.C63081OpJ;
import X.C63088OpQ;
import X.C63112Opo;
import X.C63120Opw;
import X.C63127Oq3;
import X.C63133Oq9;
import X.C63143OqJ;
import X.C63144OqK;
import X.C63150OqQ;
import X.C63153OqT;
import X.C63216OrU;
import X.C63219OrX;
import X.C63220OrY;
import X.C63275OsR;
import X.C63291Osh;
import X.C63294Osk;
import X.C63305Osv;
import X.C63308Osy;
import X.C63312Ot2;
import X.C63322OtC;
import X.C63323OtD;
import X.C63337OtR;
import X.C63356Otk;
import X.C63682Oz0;
import X.C64537PUn;
import X.C78847Ux1;
import X.C79061V1d;
import X.EnumC63114Opq;
import X.EnumC63115Opr;
import X.EnumC63126Oq2;
import X.EnumC63136OqC;
import X.EnumC63154OqU;
import X.InterfaceC63293Osj;
import X.InterfaceC63352Otg;
import X.X1D;
import X.YE1;
import android.content.ContentValues;
import android.util.Pair;
import com.bytedance.im.core.client.RecentLinkConfig;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class IDcS407S0100000_10 implements InterfaceC63352Otg {
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
            case 8:
                return LIZIZ$8(this);
            case 9:
                return LIZIZ$9(this);
            case 10:
                return LIZIZ$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this);
            case 12:
                return LIZIZ$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZIZ$13(this);
            case 14:
                return LIZIZ$14(this);
            case 15:
                return LIZIZ$15(this);
            default:
                return null;
        }
    }

    public static final Object LIZIZ$0(IDcS407S0100000_10 iDcS407S0100000_10) {
        long j;
        int i;
        C63305Osv c63305Osv = (C63305Osv) iDcS407S0100000_10.l0;
        int LIZJ = c63305Osv.LIZJ();
        RecentLinkConfig recentLinkConfig = C63308Osy.LJI().LIZLLL().LJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkModeManager migrateMix, mode:");
        LIZ.append(LIZJ);
        LIZ.append(", config:");
        LIZ.append(recentLinkConfig);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (LIZJ == 0) {
            C63322OtC.LIZLLL("LinkModeManager migrateMix pulled recent on mix mode!!!");
        } else if (!C63308Osy.LJI().LIZLLL().LJZI && recentLinkConfig.enable == 1) {
            C63322OtC.LJFF("LinkModeManager migrateMix config recent");
        } else {
            C63322OtC.LJFF("LinkModeManager migrateMix start to migrate");
            c63305Osv.LIZIZ = true;
            C63323OtD LIZJ2 = C63144OqK.LIZJ("im_link_mode_migrate");
            LIZJ2.LIZ(0, "to_link_mode");
            if (recentLinkConfig != null) {
                j = recentLinkConfig.baseIndexV2;
            } else {
                j = -2;
            }
            LIZJ2.LIZ(Long.valueOf(j), "base_index_v2");
            if (recentLinkConfig != null) {
                i = recentLinkConfig.fallbackStrategy;
            } else {
                i = -2;
            }
            LIZJ2.LIZ(Integer.valueOf(i), "fallback_strategy");
            LIZJ2.LIZLLL();
            if (recentLinkConfig.fallbackStrategy == RecentLinkConfig.FALLBACK_CLEAR) {
                C63322OtC.LJFF("LinkModeManager migrateMixClear start");
                C63308Osy.LJI().LJIIIIZZ();
                C63291Osh.LIZ().getClass();
                C63322OtC.LJFF("SPUtils clear all");
                C63291Osh.LIZLLL.clearAll();
                C63143OqJ.LJII().LIZLLL();
                C63308Osy.LJI().LJII();
                C63322OtC.LJFF("LinkModeManager migrateMixClear end");
            } else {
                C63322OtC.LJFF("LinkModeManager migrateMixNormal start");
                int[] LIZLLL = C63312Ot2.LIZLLL();
                C63291Osh LIZ2 = C63291Osh.LIZ();
                InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                LIZ2.getClass();
                interfaceC63293Osj.putInt(C63291Osh.LJIIIZ("current_link_mode"), 0);
                c63305Osv.LIZLLL = 0;
                for (int i2 : LIZLLL) {
                    C63291Osh.LIZ().getClass();
                    long LIZLLL2 = C63291Osh.LIZLLL(i2);
                    C63291Osh.LIZ().getClass();
                    long LJFF = C63291Osh.LJFF(i2);
                    if (LJFF > 0 && LJFF > LIZLLL2) {
                        C63291Osh.LIZ().getClass();
                        C63291Osh.LJIIJJI(i2, LJFF);
                    }
                    StringBuilder LIZLLL3 = C1FJ.LIZLLL("LinkModeManager migrateMixNormal for inbox:", i2, ", oldCursor:", LIZLLL2);
                    LIZLLL3.append(", cursor:");
                    LIZLLL3.append(LJFF);
                    C63322OtC.LJFF(X1D.LIZIZ(LIZLLL3));
                    C63356Otk.LJIIIZ().getClass();
                    C63356Otk.LJII(i2, 9, null);
                }
                C63322OtC.LJFF("LinkModeManager migrateMixNormal end");
            }
            c63305Osv.LIZJ = true;
            c63305Osv.LIZIZ = false;
            C63322OtC.LJFF("LinkModeManager migrateMix migrate end");
        }
        return null;
    }

    public static final Object LIZIZ$1(IDcS407S0100000_10 iDcS407S0100000_10) {
        if (!C63150OqQ.LJIJI(((C109544Rq) iDcS407S0100000_10.l0).getUuid())) {
            boolean LJJII = C63150OqQ.LJJII(true, (C109544Rq) iDcS407S0100000_10.l0, true);
            C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(((C109544Rq) iDcS407S0100000_10.l0).getConversationId(), true);
            if (LJIIIZ != null) {
                LJIIIZ.setUnreadCount(C63133Oq9.LJ(LJIIIZ));
                LJIIIZ.setUpdatedTime(Math.max(LJIIIZ.getUpdatedTime(), ((C109544Rq) iDcS407S0100000_10.l0).getCreatedAt()));
                LJIIIZ.setLastMessageIndex(Math.max(LJIIIZ.getLastMessageIndex(), ((C109544Rq) iDcS407S0100000_10.l0).getIndex()));
                LJIIIZ.setLastMessageUuid(((C109544Rq) iDcS407S0100000_10.l0).getUuid());
                C63133Oq9.LJIJJLI(LJIIIZ, false);
            }
            if (LJJII) {
                return new Pair(LJIIIZ, (C109544Rq) iDcS407S0100000_10.l0);
            }
        }
        return null;
    }

    public static final Object LIZIZ$10(IDcS407S0100000_10 iDcS407S0100000_10) {
        C63322OtC.LIZJ("IMMsgPropertyDao collectResendProperties");
        Collection<C63219OrX> LIZLLL = C63153OqT.LIZLLL(C63153OqT.LJ());
        if (LIZLLL != null && !LIZLLL.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("triggerResend size ");
            LIZ.append(LIZLLL.size());
            LIZ.append(", ");
            LIZ.append(LIZLLL);
            C63322OtC.LIZIZ("ModifyMsgPropertyHandler", X1D.LIZIZ(LIZ));
            for (C63219OrX c63219OrX : LIZLLL) {
                c63219OrX.setMute(true);
                c63219OrX.setResend(true);
                ((C63216OrU) iDcS407S0100000_10.l0).LJIILL(c63219OrX);
            }
            ((C63216OrU) iDcS407S0100000_10.l0).getClass();
            C63216OrU.LJIILJJIL(LIZLLL, false);
            return Boolean.TRUE;
        }
        C63322OtC.LIZIZ("ModifyMsgPropertyHandler", "triggerResend no record");
        return Boolean.FALSE;
    }

    public static final Object LIZIZ$11(IDcS407S0100000_10 iDcS407S0100000_10) {
        C63088OpQ LIZLLL = C63112Opo.LIZLLL(((ConversationCoreInfo) iDcS407S0100000_10.l0).conversation_id);
        ConversationCoreInfo conversationCoreInfo = (ConversationCoreInfo) iDcS407S0100000_10.l0;
        if (C63112Opo.LJFF(C63081OpJ.LJIIIZ(conversationCoreInfo.conversation_id, LIZLLL, conversationCoreInfo))) {
            return C63133Oq9.LJIIIZ(((ConversationCoreInfo) iDcS407S0100000_10.l0).conversation_id, true);
        }
        return null;
    }

    public static final Object LIZIZ$12(IDcS407S0100000_10 iDcS407S0100000_10) {
        HashMap hashMap = new HashMap(((C109544Rq) ListProtector.get((List) iDcS407S0100000_10.l0, 0)).getLocalExt());
        hashMap.put("s:is_ack_sampling_show", "true");
        C63220OrY.LJIJJ(((C109544Rq) ListProtector.get((List) iDcS407S0100000_10.l0, 0)).getUuid(), hashMap, null);
        return null;
    }

    public static final Object LIZIZ$13(IDcS407S0100000_10 iDcS407S0100000_10) {
        for (C109544Rq c109544Rq : (List) iDcS407S0100000_10.l0) {
            HashMap hashMap = new HashMap(c109544Rq.getLocalExt());
            hashMap.put("s:is_ack_sampling_show", "true");
            C63220OrY.LJIJJ(c109544Rq.getUuid(), hashMap, null);
        }
        return null;
    }

    public static final Object LIZIZ$14(IDcS407S0100000_10 iDcS407S0100000_10) {
        for (C109544Rq c109544Rq : (List) iDcS407S0100000_10.l0) {
            HashMap hashMap = new HashMap(c109544Rq.getLocalExt());
            hashMap.put("s:is_ack_sampling_show", "false");
            C63220OrY.LJIJJ(c109544Rq.getUuid(), hashMap, null);
        }
        return null;
    }

    public static final Object LIZIZ$15(IDcS407S0100000_10 iDcS407S0100000_10) {
        List<String> list = (List) iDcS407S0100000_10.l0;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append('\"');
                sb.append(str);
                sb.append("\",");
            }
            String LJ = C79061V1d.LJ(sb.toString(), 1, 0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delete from conversation_list where ");
            YE1.LIZLLL(LIZ, EnumC63136OqC.COLUMN_ID.key, " in (", LJ, ")");
            if (C78847Ux1.LJIL(X1D.LIZIZ(LIZ))) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("delete from conversation_setting where ");
                YE1.LIZLLL(LIZ2, EnumC63115Opr.COLUMN_ID.key, " in (", LJ, ")");
                C78847Ux1.LJIL(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("delete from conversation_core where ");
                YE1.LIZLLL(LIZ3, EnumC63114Opq.COLUMN_ID.key, " in (", LJ, ")");
                C78847Ux1.LJIL(X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("delete from participant where ");
                YE1.LIZLLL(LIZ4, EnumC63126Oq2.COLUMN_CONVERSATION_ID.key, " in (", LJ, ")");
                C78847Ux1.LJIL(X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("delete from msg where ");
                YE1.LIZLLL(LIZ5, EnumC63154OqU.COLUMN_CONVERSATION_ID.key, " in (", LJ, ")");
                C78847Ux1.LJIL(X1D.LIZIZ(LIZ5));
                C63127Oq3.LIZIZ().getClass();
                C63127Oq3.LIZ();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object LIZIZ$2(IDcS407S0100000_10 iDcS407S0100000_10) {
        if (!C63150OqQ.LJJII(true, (C109544Rq) iDcS407S0100000_10.l0, true)) {
            return null;
        }
        if (C63150OqQ.LJIIIZ(((C109544Rq) iDcS407S0100000_10.l0).getConversationId()) == ((C109544Rq) iDcS407S0100000_10.l0).getIndex()) {
            C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(((C109544Rq) iDcS407S0100000_10.l0).getConversationId());
            if (LJIIIZ != null) {
                LJIIIZ.setLastShowMessage((C109544Rq) iDcS407S0100000_10.l0);
            }
            return new Pair((C109544Rq) iDcS407S0100000_10.l0, LJIIIZ);
        }
        return new Pair((C109544Rq) iDcS407S0100000_10.l0, null);
    }

    public static final Object LIZIZ$3(IDcS407S0100000_10 iDcS407S0100000_10) {
        Map map = (Map) iDcS407S0100000_10.l0;
        if (map == null || map.isEmpty()) {
            return new ArrayList();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMMsgDao batchUpdateMessageLocalExt, size:");
        LIZ.append(map.size());
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        C78847Ux1.LJJLIIIJJI("IMMsgDao batchUpdateMessageLocalExt");
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : map.keySet()) {
                C109544Rq LJIILJJIL = C63150OqQ.LJIILJJIL(str);
                if (LJIILJJIL != null && !LJIILJJIL.invalid()) {
                    Map<String, String> localExt = LJIILJJIL.getLocalExt();
                    localExt.putAll((Map) map.get(str));
                    String LIZ2 = C63682Oz0.LIZ(localExt);
                    ContentValues contentValues = new ContentValues();
                    String str2 = EnumC63154OqU.COLUMN_LOCAL_INFO.key;
                    if (LIZ2 == null) {
                        LIZ2 = "";
                    }
                    contentValues.put(str2, LIZ2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(EnumC63154OqU.COLUMN_MSG_ID.key);
                    LIZ3.append("=?");
                    if (C78847Ux1.LJJLIIIJLJLI("msg", contentValues, X1D.LIZIZ(LIZ3), new String[]{LJIILJJIL.getUuid()}) > 0) {
                        arrayList.add(LJIILJJIL);
                    }
                }
            }
            C78847Ux1.LJIJJLI("IMMsgDao batchUpdateMessageLocalExt", true);
            return arrayList;
        } catch (Exception e) {
            C78847Ux1.LJIJJLI("IMMsgDao batchUpdateMessageLocalExt", false);
            C63337OtR.LJ("IMMsgDao batchUpdateMessageLocalExt", e);
            return arrayList;
        }
    }

    public static final Object LIZIZ$4(IDcS407S0100000_10 iDcS407S0100000_10) {
        C109544Rq LJIILJJIL;
        List<C109544Rq> list = (List) iDcS407S0100000_10.l0;
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMMsgDao batchUpdateMessageContentPbAndLocalExt, size:");
        LIZ.append(list.size());
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        try {
            for (C109544Rq c109544Rq : list) {
                if (c109544Rq.getUuid() != null && (LJIILJJIL = C63150OqQ.LJIILJJIL(c109544Rq.getUuid())) != null && !LJIILJJIL.invalid()) {
                    Map<String, String> localExt = LJIILJJIL.getLocalExt();
                    localExt.putAll(c109544Rq.getLocalExt());
                    String LIZ2 = C63682Oz0.LIZ(localExt);
                    ContentValues contentValues = new ContentValues();
                    String str = EnumC63154OqU.COLUMN_LOCAL_INFO.key;
                    if (LIZ2 == null) {
                        LIZ2 = "";
                    }
                    contentValues.put(str, LIZ2);
                    String str2 = EnumC63154OqU.COLUMN_CONTENT_PB.key;
                    C64537PUn contentPB = c109544Rq.getContentPB();
                    if (contentPB == null) {
                        contentPB = C64537PUn.EMPTY;
                    }
                    contentValues.put(str2, contentPB.toByteArray());
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(EnumC63154OqU.COLUMN_MSG_ID.key);
                    LIZ3.append("=?");
                    if (C78847Ux1.LJJLIIIJLJLI("msg", contentValues, X1D.LIZIZ(LIZ3), new String[]{LJIILJJIL.getUuid()}) > 0) {
                        LJIILJJIL.setContentPB(c109544Rq.getContentPB());
                        arrayList.add(LJIILJJIL);
                    }
                }
            }
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "batchUpdateMessageContentPbAndLocalExt");
            return arrayList;
        } catch (Exception e) {
            C63322OtC.LJ("IMMsgDao updateMessagePbAndExt", e);
            C63337OtR.LJ("IMMsgDao batchUpdateMessageContentPbAndLocalExt", e);
            return arrayList;
        }
    }

    public static final Object LIZIZ$5(IDcS407S0100000_10 iDcS407S0100000_10) {
        C63322OtC.LJFF("MessageModel sortByDescending, onRun");
        Collections.sort((List) iDcS407S0100000_10.l0, C63220OrY.LL);
        return null;
    }

    public static final Object LIZIZ$6(IDcS407S0100000_10 iDcS407S0100000_10) {
        try {
            ((C63220OrY) iDcS407S0100000_10.l0).LJIJI();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object LIZIZ$7(IDcS407S0100000_10 iDcS407S0100000_10) {
        ((Runnable) iDcS407S0100000_10.l0).run();
        return null;
    }

    public static final Object LIZIZ$8(IDcS407S0100000_10 iDcS407S0100000_10) {
        return Boolean.valueOf(C63133Oq9.LJFF(((C63120Opw) iDcS407S0100000_10.l0).getConversationId()));
    }

    public static final Object LIZIZ$9(IDcS407S0100000_10 iDcS407S0100000_10) {
        if (C63308Osy.LJI().LIZLLL().LJLLLL) {
            if (((C63294Osk) iDcS407S0100000_10.l0).LIZJ == 0) {
                return Boolean.valueOf(C63150OqQ.LJJ(C63308Osy.LJI().LIZIZ().getUid()));
            }
            return Boolean.TRUE;
        }
        return Boolean.valueOf(C63150OqQ.LJJ(C63308Osy.LJI().LIZIZ().getUid()));
    }

    public IDcS407S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
