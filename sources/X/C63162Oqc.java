package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Oqc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63162Oqc {
    public static boolean LIZIZ(MessageBody messageBody) {
        Integer num;
        if (messageBody == null || (num = messageBody.message_type) == null) {
            return false;
        }
        EnumC63179Oqt fromValue = EnumC63179Oqt.fromValue(num.intValue());
        if (fromValue != null) {
            switch (C63178Oqs.LIZ[fromValue.ordinal()]) {
                case 1:
                    return false;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                case 14:
                    return true;
            }
        }
        if (messageBody.message_type.intValue() >= EnumC63179Oqt.MESSAGE_TYPE_COMMAND.getValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return false;
        }
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        if (localExt != null && localExt.containsKey("s:send_response_check_code")) {
            return TextUtils.equals(CardStruct.IStatusCode.DEFAULT, localExt.get("s:send_response_check_code"));
        }
        return true;
    }

    public static boolean LIZLLL(C109544Rq c109544Rq) {
        long j;
        boolean z;
        if (c109544Rq == null || c109544Rq.getSvrStatus() != 0) {
            C63322OtC.LJFF("MessageUtils isMsgUnread:false, svrStatus not enable");
            return false;
        }
        if ("true".equals(c109544Rq.getExtValue("s:do_not_increase_unread"))) {
            C63322OtC.LJFF("MessageUtils isMsgUnread:false, has ext s:do_not_increase_unread");
            return false;
        }
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(c109544Rq.getConversationId());
        if (LJIIIZ != null && LJIIIZ.getReadIndex() > 0) {
            j = LJIIIZ.getReadIndex();
        } else {
            String conversationId = c109544Rq.getConversationId();
            j = -1;
            if (!TextUtils.isEmpty(conversationId)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IMConversationDao getConversationReadIndex, cid:");
                LIZ.append(conversationId);
                C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC63132Oq8 interfaceC63132Oq8 = null;
                try {
                    try {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("select ");
                        EnumC63136OqC enumC63136OqC = EnumC63136OqC.COLUMN_READ_INDEX;
                        LIZ2.append(enumC63136OqC.key);
                        LIZ2.append(" from ");
                        LIZ2.append("conversation_list");
                        LIZ2.append(" where ");
                        LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
                        LIZ2.append("=?");
                        interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), new String[]{conversationId});
                        if (interfaceC63132Oq8 != null && interfaceC63132Oq8.moveToFirst()) {
                            j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(enumC63136OqC.key));
                        }
                        C63275OsR.LIZIZ().LJI(currentTimeMillis, "getConversationReadIndex");
                    } catch (Exception e) {
                        C63322OtC.LJ("IMConversationDao getConversationReadIndex ", e);
                        C63337OtR.LJFF(e);
                    }
                } finally {
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                }
            }
        }
        if (c109544Rq.getIndex() > j) {
            z = true;
        } else {
            z = false;
        }
        boolean LJIILJJIL = C115284fk.LJIILIIL().LJIILJJIL(c109544Rq.getConversationId());
        InterfaceC63163Oqd LJIJ = C63308Osy.LJI().LIZIZ().LJIJ();
        if (LJIJ != null) {
            LJIJ.LIZLLL();
        }
        if (LJIILJJIL || c109544Rq.isSelf() || !z) {
            return false;
        }
        return true;
    }

    public static boolean LJ(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getSvrStatus() != 0) {
            C63322OtC.LJFF("MessageUtils isUpdateLastMsg:false, svrStatus not enable");
            return false;
        }
        if (!C63308Osy.LJI().LIZLLL().LJJLIIIJILLIZJL || !"true".equals(c109544Rq.getExtValue("s:do_not_update_last_show_msg"))) {
            return true;
        }
        C63322OtC.LJFF("MessageUtils isUpdateLastMsg:false, has ext s:do_not_update_last_msg");
        return false;
    }

    public static List<C109544Rq> LIZ(String str, List<C109544Rq> list) {
        if (list == null || list.isEmpty() || C115284fk.LJIILIIL().LJIILJJIL(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C109544Rq c109544Rq : list) {
            if (!c109544Rq.isSelf()) {
                arrayList.add(c109544Rq);
            }
        }
        return arrayList;
    }
}
