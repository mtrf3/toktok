package X;

import Y.IDcS14S1100000_10;
import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.model.RangeList;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oq9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63133Oq9 {
    public static Long LJIIJ() {
        try {
            return Long.valueOf(C63143OqJ.LJII().LJI().LJJJJI());
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao getConversationCount ");
            LIZ.append(e);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            C63337OtR.LJFF(e);
            return 0L;
        }
    }

    public static ContentValues LIZLLL(C63120Opw c63120Opw) {
        ContentValues contentValues = new ContentValues();
        String str = EnumC63136OqC.COLUMN_ID.key;
        String conversationId = c63120Opw.getConversationId();
        String str2 = "";
        if (conversationId == null) {
            conversationId = "";
        }
        contentValues.put(str, conversationId);
        contentValues.put(EnumC63136OqC.COLUMN_SHORT_ID.key, Long.valueOf(c63120Opw.getConversationShortId()));
        contentValues.put(EnumC63136OqC.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(c63120Opw.getLastMessageIndex()));
        String str3 = EnumC63136OqC.COLUMN_LAST_MSG_UUID.key;
        String lastMessageUuid = c63120Opw.getLastMessageUuid();
        if (lastMessageUuid == null) {
            lastMessageUuid = "";
        }
        contentValues.put(str3, lastMessageUuid);
        contentValues.put(EnumC63136OqC.COLUMN_UPDATE_TIME.key, Long.valueOf(c63120Opw.getUpdatedTime()));
        contentValues.put(EnumC63136OqC.COLUMN_UNREAD_COUNT.key, Long.valueOf(c63120Opw.getUnreadCount()));
        contentValues.put(EnumC63136OqC.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(c63120Opw.getConversationType()));
        contentValues.put(EnumC63136OqC.COLUMN_DRAFT_TIME.key, Long.valueOf(c63120Opw.getDraftTime()));
        String str4 = EnumC63136OqC.COLUMN_DRAFT_CONTENT.key;
        String draftContent = c63120Opw.getDraftContent();
        if (draftContent == null) {
            draftContent = "";
        }
        contentValues.put(str4, draftContent);
        contentValues.put(EnumC63136OqC.COLUMN_MIN_INDEX.key, Long.valueOf(c63120Opw.getMinIndex()));
        String str5 = EnumC63136OqC.COLUMN_LOCAL_INFO.key;
        String localExtStr = c63120Opw.getLocalExtStr();
        if (localExtStr == null) {
            localExtStr = "";
        }
        contentValues.put(str5, localExtStr);
        contentValues.put(EnumC63136OqC.COLUMN_READ_INDEX.key, Long.valueOf(c63120Opw.getReadIndex()));
        contentValues.put(EnumC63136OqC.COLUMN_INBOX.key, Integer.valueOf(c63120Opw.getInboxType()));
        contentValues.put(EnumC63136OqC.COLUMN_IS_MEMBER.key, Integer.valueOf(c63120Opw.isMember() ? 1 : 0));
        contentValues.put(EnumC63136OqC.COLUMN_HAS_MORE.key, Integer.valueOf(c63120Opw.hasMore() ? 1 : 0));
        contentValues.put(EnumC63136OqC.COLUMN_MEMBER_COUNT.key, Integer.valueOf(c63120Opw.getMemberCount()));
        contentValues.put(EnumC63136OqC.COLUMN_STATUS.key, Integer.valueOf(c63120Opw.getStatus()));
        String str6 = EnumC63136OqC.COLUMN_PARTICIPANT.key;
        String memberStr = c63120Opw.getMemberStr();
        if (memberStr != null) {
            str2 = memberStr;
        }
        contentValues.put(str6, str2);
        contentValues.put(EnumC63136OqC.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(c63120Opw.getLastMessageOrderIndex()));
        contentValues.put(EnumC63136OqC.COLUMN_STRANGER.key, Integer.valueOf(c63120Opw.isStranger() ? 1 : 0));
        contentValues.put(EnumC63136OqC.COLUMN_SORT_ORDER.key, Long.valueOf(LJII(c63120Opw)));
        contentValues.put(EnumC63136OqC.COLUMN_MIN_INDEX_V2.key, Long.valueOf(c63120Opw.getMinIndexV2()));
        contentValues.put(EnumC63136OqC.COLUMN_MAX_INDEX_V2.key, Long.valueOf(c63120Opw.getMaxIndexV2()));
        contentValues.put(EnumC63136OqC.COLUMN_READ_INDEX_V2.key, Long.valueOf(c63120Opw.getReadIndexV2()));
        contentValues.put(EnumC63136OqC.COLUMN_BADGE_COUNT.key, Integer.valueOf(c63120Opw.getBadgeCount()));
        contentValues.put(EnumC63136OqC.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(c63120Opw.getReadBadgeCount()));
        contentValues.put(EnumC63136OqC.COLUMN_IS_IN_BOX.key, Integer.valueOf(c63120Opw.isInBox() ? 1 : 0));
        contentValues.put(EnumC63136OqC.COLUMN_STRANGER_REQUEST_FILTERED.key, Integer.valueOf(c63120Opw.isFiltered() ? 1 : 0));
        return contentValues;
    }

    public static long LJ(C63120Opw c63120Opw) {
        String conversationId = c63120Opw.getConversationId();
        long readIndex = c63120Opw.getReadIndex();
        c63120Opw.getMaxIndexV2();
        c63120Opw.getReadBadgeCount();
        c63120Opw.getBadgeCount();
        long j = 0;
        if (TextUtils.isEmpty(conversationId)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao computeUnreadCount cid invalid:");
            LIZ.append(conversationId);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return 0L;
        }
        C63291Osh.LIZ().getClass();
        if (!TextUtils.isEmpty(conversationId)) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("select * from msg where ");
                    LIZ2.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                    LIZ2.append("=? AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_DELETED.key);
                    LIZ2.append("=? AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                    LIZ2.append(">? AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_SENDER.key);
                    LIZ2.append("!=? AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                    LIZ2.append("=? AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_READ_STATUS.key);
                    LIZ2.append("=?");
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), new String[]{conversationId, String.valueOf(0), String.valueOf(readIndex), String.valueOf(C63308Osy.LJI().LIZIZ().getUid()), String.valueOf(0), String.valueOf(0)});
                    int count = interfaceC63132Oq8.getCount();
                    C63275OsR.LIZIZ().LJI(currentTimeMillis, "computeUnreadMsgCount");
                    j = count;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C63322OtC.LIZLLL("IMMsgDao computeUnreadMsgCount error");
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("IMMsgDao computeUnreadMsgCount:0, cid:");
                    LIZ3.append(conversationId);
                    C63322OtC.LIZJ(X1D.LIZIZ(LIZ3));
                }
            } finally {
                C63143OqJ.LIZ(interfaceC63132Oq8);
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("IMConversationDao computeUnreadCount cid: +");
        LIZ4.append(conversationId);
        LIZ4.append(", no recent messages, use readIndex, count:");
        LIZ4.append(j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ4));
        return j;
    }

    public static boolean LJFF(String conId) {
        if (TextUtils.isEmpty(conId)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao deleteConversation:");
        LIZ.append(conId);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        boolean LJIJJ = C78847Ux1.LJIJJ("conversation_list", JBR.LJFF(LIZ2, EnumC63136OqC.COLUMN_ID.key, "=?", LIZ2), new String[]{conId});
        if (LJIJJ) {
            C63141OqH.LIZ(new RangeList(new ArrayList()), conId);
            RangeList rangeList = new RangeList(new ArrayList());
            C63140OqG.LIZ.put(conId, rangeList);
            RunnableC63345OtZ.LIZLLL(new IDcS14S1100000_10(rangeList, conId, 0), null, C63346Ota.LIZIZ());
            StringBuilder LIZ3 = X1D.LIZ();
            boolean LJIJJ2 = C78847Ux1.LJIJJ("msg", JBR.LJFF(LIZ3, EnumC63154OqU.COLUMN_CONVERSATION_ID.key, "=?", LIZ3), new String[]{conId});
            if (LJIJJ2) {
                C63134OqA.LIZJ(conId);
                if (!TextUtils.isEmpty(conId)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    C78847Ux1.LJIJJ("msg_property_new", JBR.LJFF(LIZ4, EnumC63157OqX.COLUMN_CONVERSATION_ID.key, "=?", LIZ4), new String[]{conId});
                }
                o.LJIIIZ(conId, "conId");
                C63127Oq3.LIZIZ().getClass();
                C63127Oq3.LIZ();
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("IMMsgDao forceDeleteAllMsg, cid:");
            LIZ5.append(conId);
            LIZ5.append(", result:");
            LIZ5.append(LJIJJ2);
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ5));
            if (!TextUtils.isEmpty(conId)) {
                StringBuilder LIZ6 = X1D.LIZ();
                C78847Ux1.LJIJJ("conversation_setting", JBR.LJFF(LIZ6, EnumC63115Opr.COLUMN_ID.key, "=?", LIZ6), new String[]{conId});
            }
            if (!TextUtils.isEmpty(conId)) {
                StringBuilder LIZ7 = X1D.LIZ();
                C78847Ux1.LJIJJ("conversation_core", JBR.LJFF(LIZ7, EnumC63114Opq.COLUMN_ID.key, "=?", LIZ7), new String[]{conId});
            }
            C63124Oq0.LIZLLL(conId);
            C63127Oq3.LIZIZ().getClass();
            C63127Oq3.LIZ();
        }
        C63275OsR.LIZIZ().LJI(currentTimeMillis, "deleteConversation");
        return LJIJJ;
    }

    public static boolean LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao dissolveConversation:");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update conversation_list set ");
        C0EH.LIZLLL(LIZ2, EnumC63136OqC.COLUMN_STATUS.key, "=", 1, " where ");
        YE1.LIZLLL(LIZ2, EnumC63136OqC.COLUMN_ID.key, "=\"", str, "\"");
        return C78847Ux1.LJIL(X1D.LIZIZ(LIZ2));
    }

    public static long LJII(C63120Opw c63120Opw) {
        long max;
        if (C63308Osy.LJI().LJFF != null) {
            max = C63308Osy.LJI().LJFF.LIZ(c63120Opw);
        } else {
            max = Math.max(c63120Opw.getUpdatedTime(), c63120Opw.getDraftTime());
            if (c63120Opw.isStickTop()) {
                max = (long) (Math.pow(10.0d, 13.0d) + max);
            }
        }
        if (max <= 0) {
            C63322OtC.LJI("IMConversationDao generateConversationSortOrder, sortOrder abnormal: ", String.valueOf(max), null);
        }
        c63120Opw.setSortOrder(max);
        return max;
    }

    public static List<C63120Opw> LJIIIIZZ(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from conversation_list where ");
                LIZ.append(EnumC63136OqC.COLUMN_STRANGER.key);
                LIZ.append("=");
                LIZ.append(0);
                String LIZIZ = X1D.LIZIZ(LIZ);
                C47922IrO.LIZ();
                if (i != -1) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ);
                    LIZ2.append(" and ");
                    LIZ2.append(EnumC63136OqC.COLUMN_CONVERSATION_TYPE.key);
                    LIZ2.append("=");
                    LIZ2.append(i);
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append(" order by ");
                LIZ3.append(EnumC63136OqC.COLUMN_UPDATE_TIME.key);
                LIZ3.append(" desc;");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ3), null);
                if (C63308Osy.LJI().LIZLLL().LJJIJIIJIL.batchQueryEnable == 0) {
                    if (interfaceC63132Oq8 != null) {
                        while (interfaceC63132Oq8.moveToNext()) {
                            arrayList.add(LIZ(interfaceC63132Oq8, true));
                        }
                    }
                } else {
                    LIZIZ(interfaceC63132Oq8, arrayList, false);
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "getAllConversation");
            } catch (Exception e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("IMConversationDao getAllConversation ");
                LIZ4.append(e);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ4));
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("getAllConversation: size=");
            LIZ5.append(arrayList.size());
            LIZ5.append(", cost=");
            LIZ5.append(System.currentTimeMillis() - currentTimeMillis);
            C63322OtC.LIZIZ("IMConversationDao", X1D.LIZIZ(LIZ5));
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("IMConversationDao getAllConversation, count:");
            LIZ6.append(arrayList.size());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ6));
            return arrayList;
        } catch (Throwable th) {
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    public static List LJIIJJI(int i) {
        C63308Osy.LJI().getClass();
        C63291Osh.LIZ().getClass();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        if (!C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"))) {
            C63322OtC.LIZJ("IMConversationDao getConversationRange failed");
            return null;
        }
        StringBuilder LJ = C7MY.LJ("IMConversationDao getConversationRange:[", 0, ",");
        LJ.append(i);
        LJ.append(")");
        C63322OtC.LIZJ(X1D.LIZIZ(LJ));
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from conversation_list where ");
                LIZ.append(EnumC63136OqC.COLUMN_STRANGER.key);
                LIZ.append("=");
                LIZ.append(0);
                String LIZIZ = X1D.LIZIZ(LIZ);
                C47922IrO.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append(" order by ");
                LIZ2.append(EnumC63136OqC.COLUMN_SORT_ORDER.key);
                LIZ2.append(" desc,");
                LIZ2.append(EnumC63136OqC.COLUMN_SHORT_ID.key);
                LIZ2.append(" desc limit ");
                LIZ2.append(0);
                LIZ2.append(",");
                LIZ2.append(i);
                LIZ2.append(";");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), null);
                if (interfaceC63132Oq8 != null) {
                    ArrayList arrayList = new ArrayList(interfaceC63132Oq8.getCount());
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList.add(LIZ(interfaceC63132Oq8, true));
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("IMConversationDao getConversationRange ");
                LIZ3.append(e);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return new ArrayList();
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static boolean LJIILL(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from conversation_list where ");
                    LIZ.append(EnumC63136OqC.COLUMN_ID.key);
                    LIZ.append("=?");
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                    if (interfaceC63132Oq8.getCount() > 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    C63322OtC.LJ("IMConversationDao hasLocalConversation ", e);
                    C63337OtR.LJFF(e);
                }
                C63143OqJ.LIZ(interfaceC63132Oq8);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMConversationDao hasLocalConversation, cid:");
                LIZ2.append(str);
                LIZ2.append(", result:");
                LIZ2.append(z);
                C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
            } catch (Throwable th) {
                C63143OqJ.LIZ(interfaceC63132Oq8);
                throw th;
            }
        }
        return z;
    }

    public static boolean LJIILLIIL(long j) {
        boolean z = false;
        if (j > 0) {
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from conversation_list where ");
                    LIZ.append(EnumC63136OqC.COLUMN_SHORT_ID.key);
                    LIZ.append("=?");
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{String.valueOf(j)});
                    if (interfaceC63132Oq8.getCount() > 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    C63322OtC.LJ("IMConversationDao hasLocalConversation ", e);
                    C63337OtR.LJFF(e);
                }
                C63143OqJ.LIZ(interfaceC63132Oq8);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMConversationDao hasLocalConversation, conShortId:");
                LIZ2.append(j);
                LIZ2.append(", result:");
                LIZ2.append(z);
                C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
            } catch (Throwable th) {
                C63143OqJ.LIZ(interfaceC63132Oq8);
                throw th;
            }
        }
        return z;
    }

    public static boolean LJIIZILJ(C63120Opw c63120Opw) {
        boolean z = false;
        if (c63120Opw != null && !TextUtils.isEmpty(c63120Opw.getConversationId())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao insertConversation:");
            LIZ.append(c63120Opw.getConversationId());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues LIZLLL = LIZLLL(c63120Opw);
            if (c63120Opw.getCoreInfo() != null) {
                C63112Opo.LJFF(c63120Opw.getCoreInfo());
            }
            if (c63120Opw.getSettingInfo() != null) {
                C63113Opp.LJ(c63120Opw.getSettingInfo());
            }
            if (C78847Ux1.LJJIL("conversation_list", LIZLLL) >= 0) {
                z = true;
                C63127Oq3.LIZIZ().getClass();
                C63127Oq3.LIZ();
            }
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "insertConversation");
        }
        return z;
    }

    public static boolean LJIJ(C63120Opw c63120Opw) {
        boolean z = false;
        if (!TextUtils.isEmpty(c63120Opw.getConversationId())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao insertConversation:");
            LIZ.append(c63120Opw.getConversationId());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues LIZLLL = LIZLLL(c63120Opw);
            if (c63120Opw.getCoreInfo() != null) {
                C63112Opo.LJFF(c63120Opw.getCoreInfo());
            }
            if (c63120Opw.getSettingInfo() != null) {
                C63113Opp.LJ(c63120Opw.getSettingInfo());
            }
            if (!TextUtils.isEmpty("conversation_list")) {
                C63275OsR.LIZIZ().LJIIIIZZ();
                InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
                if (LJI == null) {
                    C63275OsR.LIZIZ().LJII(0, "insertOrReplace", null);
                } else {
                    try {
                        long LJJJJJL = LJI.LJJJJJL(LIZLLL);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("CreateConversationHandler insertOrReplace id = ");
                        LIZ2.append(LJJJJJL);
                        LIZ2.append(" table = ");
                        LIZ2.append("conversation_list");
                        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                        C63275OsR.LIZIZ().getClass();
                        C63275OsR.LJIIIZ("insert");
                        if (LJJJJJL >= 0) {
                            z = true;
                            C63127Oq3.LIZIZ().getClass();
                            C63127Oq3.LIZ();
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("IMDBProxy insertOrReplace, table:");
                        LIZ3.append("conversation_list");
                        LIZ3.append(", nullColumnHack:");
                        LIZ3.append((String) null);
                        C63322OtC.LJ(X1D.LIZIZ(LIZ3), e);
                        C63337OtR.LJFF(e);
                        C63275OsR.LIZIZ().LJII(1, "insertOrReplace", e);
                    }
                }
            }
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "insertConversation");
        }
        return z;
    }

    public static void LJIJJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao transferStrangerConversation:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        try {
            ContentValues contentValues = new ContentValues();
            boolean z = false;
            contentValues.put(EnumC63136OqC.COLUMN_STRANGER.key, (Integer) 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
            LIZ2.append("=?");
            if (C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, X1D.LIZIZ(LIZ2), new String[]{str}) > 0) {
                z = true;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IMConversationDao transferStrangerConversation, result:");
            LIZ3.append(z);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        } catch (Exception e) {
            C63322OtC.LJ("IMConversationDao transferStrangerConversation ", e);
            C63337OtR.LJFF(e);
        }
    }

    public static boolean LJIL(C63120Opw c63120Opw) {
        boolean z = false;
        if (!TextUtils.isEmpty(c63120Opw.getConversationId())) {
            String conversationId = c63120Opw.getConversationId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao updateConversationRead, cid:");
            LIZ.append(conversationId);
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC63136OqC.COLUMN_UNREAD_COUNT.key, Long.valueOf(c63120Opw.getUnreadCount()));
                contentValues.put(EnumC63136OqC.COLUMN_READ_INDEX.key, Long.valueOf(c63120Opw.getReadIndex()));
                contentValues.put(EnumC63136OqC.COLUMN_READ_INDEX_V2.key, Long.valueOf(c63120Opw.getReadIndexV2()));
                contentValues.put(EnumC63136OqC.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(c63120Opw.getReadBadgeCount()));
                java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
                if (c63120Opw.getReadBadgeCount() > 0 && !TextUtils.equals(localExt.get("s:read_badge_count_update"), "1")) {
                    localExt.put("s:read_badge_count_update", "1");
                    contentValues.put(EnumC63136OqC.COLUMN_LOCAL_INFO.key, C63081OpJ.LJIILLIIL(localExt));
                    C63322OtC.LJFF("IMConversationDao updateConversationRead, read badge count updated");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
                LIZ2.append("=?");
                if (C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, X1D.LIZIZ(LIZ2), new String[]{conversationId}) > 0) {
                    z = true;
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateConversationRead");
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationDao updateConversationRead ", e);
                C63337OtR.LJFF(e);
            }
        }
        return z;
    }

    public static void LJJI(C109544Rq c109544Rq) {
        if (c109544Rq == null || TextUtils.isEmpty(c109544Rq.getConversationId())) {
            return;
        }
        String conversationId = c109544Rq.getConversationId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao updateLastMsgToConversation:");
        LIZ.append(conversationId);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC63136OqC.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(c109544Rq.getIndex()));
            contentValues.put(EnumC63136OqC.COLUMN_LAST_MSG_UUID.key, c109544Rq.getUuid());
            contentValues.put(EnumC63136OqC.COLUMN_UPDATE_TIME.key, Long.valueOf(c109544Rq.getCreatedAt()));
            contentValues.put(EnumC63136OqC.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(c109544Rq.getOrderIndex()));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
            LIZ2.append("=?");
            C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, X1D.LIZIZ(LIZ2), new String[]{conversationId});
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateLastMsgToConversation");
        } catch (Exception e) {
            C63322OtC.LJ("IMConversationDao updateLastMsgToConversation ", e);
            C63337OtR.LJFF(e);
        }
    }

    public static void LJJIFFI(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getConversationId() == null || c109544Rq.getConversationId().isEmpty()) {
            return;
        }
        String conversationId = c109544Rq.getConversationId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao updateLastMsgUuidToConversation:");
        LIZ.append(conversationId);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC63136OqC.COLUMN_LAST_MSG_UUID.key, c109544Rq.getUuid());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
            LIZ2.append("=?");
            C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, X1D.LIZIZ(LIZ2), new String[]{conversationId});
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateLastMsgUuidToConversation");
        } catch (Exception e) {
            C63322OtC.LJ("IMConversationDao updateLastMsgUuidToConversation ", e);
            C63337OtR.LJ("IMConversationDao updateLastMsgUuidToConversation ", e);
        }
    }

    public static C63120Opw LIZ(InterfaceC63132Oq8 interfaceC63132Oq8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C63120Opw c63120Opw = new C63120Opw();
        c63120Opw.setConversationId(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_ID.key)));
        c63120Opw.setConversationShortId(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_SHORT_ID.key)));
        c63120Opw.setUpdatedTime(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_UPDATE_TIME.key)));
        c63120Opw.setUnreadCount(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_UNREAD_COUNT.key)));
        c63120Opw.setConversationType(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_CONVERSATION_TYPE.key)));
        c63120Opw.setDraftTime(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_DRAFT_TIME.key)));
        c63120Opw.setDraftContent(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_DRAFT_CONTENT.key)));
        c63120Opw.setMinIndex(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_MIN_INDEX.key)));
        c63120Opw.setLocalExtStr(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_LOCAL_INFO.key)));
        c63120Opw.setReadIndex(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_READ_INDEX.key)));
        c63120Opw.setLastMessageIndex(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_LAST_MSG_INDEX.key)));
        c63120Opw.setLastMessageUuid(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_LAST_MSG_UUID.key)));
        c63120Opw.setInboxType(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_INBOX.key)));
        boolean z6 = false;
        if (interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_IS_MEMBER.key)) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c63120Opw.setIsMember(z2);
        if (interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_HAS_MORE.key)) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        c63120Opw.setHasMore(z3);
        c63120Opw.setMemberCount(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_MEMBER_COUNT.key)));
        c63120Opw.setStatus(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_STATUS.key)));
        c63120Opw.setMemberStr(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_PARTICIPANT.key)));
        c63120Opw.setLastMessageOrderIndex(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_LAST_MSG_ORDER_INDEX.key)));
        if (interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_STRANGER.key)) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        c63120Opw.setStranger(z4);
        if (interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_STRANGER_REQUEST_FILTERED.key)) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        c63120Opw.setFiltered(z5);
        c63120Opw.setSortOrder(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_SORT_ORDER.key)));
        c63120Opw.setMinIndexV2(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_MIN_INDEX_V2.key)));
        c63120Opw.setMaxIndexV2(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_MAX_INDEX_V2.key)));
        c63120Opw.setReadIndexV2(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_READ_INDEX_V2.key)));
        c63120Opw.setBadgeCount(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_BADGE_COUNT.key)));
        c63120Opw.setReadBadgeCount(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_READ_BADGE_COUNT.key)));
        if (interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_IS_IN_BOX.key)) == 1) {
            z6 = true;
        }
        c63120Opw.setInBox(z6);
        if (z) {
            c63120Opw.setMemberIds(C63124Oq0.LJ(c63120Opw.getConversationId()));
            if (c63120Opw.getConversationType() == AbstractC63505Ow9.LIZ) {
                c63120Opw.setSingleChatMembers(C63124Oq0.LJFF(c63120Opw.getConversationId()));
            }
            c63120Opw.setLastShowMessage(C63150OqQ.LJIIJ(c63120Opw.getConversationId()));
            c63120Opw.setCoreInfo(C63112Opo.LIZLLL(c63120Opw.getConversationId()));
            c63120Opw.setSettingInfo(C63113Opp.LIZJ(c63120Opw.getConversationId()));
            c63120Opw.setUnreadSelfMentionedMessages(C63134OqA.LJFF(c63120Opw.getReadIndex(), c63120Opw.getConversationId()));
        }
        return c63120Opw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Oq8] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.Opw] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static C63120Opw LJIIIZ(String str, boolean z) {
        C63120Opw c63120Opw;
        ?? r6 = 0;
        r6 = null;
        r6 = null;
        C63120Opw c63120Opw2 = null;
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao getConversation, cid:");
        LIZ.append(str);
        LIZ.append(", fullInfo:");
        LIZ.append(z);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("select * from conversation_list where ");
                LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
                LIZ2.append("=?");
                InterfaceC63132Oq8 LJJJLZIJ = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), new String[]{str});
                if (LJJJLZIJ != null) {
                    try {
                        if (LJJJLZIJ.moveToFirst()) {
                            c63120Opw2 = LIZ(LJJJLZIJ, z);
                        }
                    } catch (Exception e) {
                        e = e;
                        c63120Opw = c63120Opw2;
                        interfaceC63132Oq8 = LJJJLZIJ;
                        C63322OtC.LJ("IMConversationDao getConversation ", e);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        r6 = c63120Opw;
                        return r6;
                    } catch (Throwable th) {
                        th = th;
                        r6 = LJJJLZIJ;
                        C63143OqJ.LIZ(r6);
                        throw th;
                    }
                }
                C63275OsR LIZIZ = C63275OsR.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getConversation:");
                LIZ3.append(z);
                LIZIZ.LJI(currentTimeMillis, X1D.LIZIZ(LIZ3));
                C63143OqJ.LIZ(LJJJLZIJ);
                r6 = c63120Opw2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            c63120Opw = null;
        }
        return r6;
    }

    public static void LJIJI(long j, String str) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao setConversationTime, cid:");
        LIZ.append(str);
        LIZ.append(", updateTime:");
        LIZ.append(j);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update conversation_list set ");
        b0.LJ(LIZ2, EnumC63136OqC.COLUMN_UPDATE_TIME.key, "=", j);
        LIZ2.append(" where ");
        YE1.LIZLLL(LIZ2, EnumC63136OqC.COLUMN_ID.key, "=\"", str, "\"");
        C78847Ux1.LJIL(X1D.LIZIZ(LIZ2));
    }

    public static boolean LJIJJLI(C63120Opw c63120Opw, boolean z) {
        boolean z2 = false;
        if (c63120Opw != null && !TextUtils.isEmpty(c63120Opw.getConversationId())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao updateConversation:");
            LIZ.append(c63120Opw.getConversationId());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues LIZLLL = LIZLLL(c63120Opw);
                EnumC63136OqC enumC63136OqC = EnumC63136OqC.COLUMN_ID;
                LIZLLL.remove(enumC63136OqC.key);
                if (c63120Opw.getConversationShortId() <= 0) {
                    LIZLLL.remove(EnumC63136OqC.COLUMN_SHORT_ID.key);
                }
                if (!z) {
                    LIZLLL.remove(EnumC63136OqC.COLUMN_STRANGER.key);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(enumC63136OqC.key);
                LIZ2.append("=?");
                if (C78847Ux1.LJJLIIIJLJLI("conversation_list", LIZLLL, X1D.LIZIZ(LIZ2), new String[]{c63120Opw.getConversationId()}) > 0) {
                    z2 = true;
                }
                if (c63120Opw.getCoreInfo() != null) {
                    C63112Opo.LJFF(c63120Opw.getCoreInfo());
                }
                if (c63120Opw.getSettingInfo() != null) {
                    C63113Opp.LJ(c63120Opw.getSettingInfo());
                }
                C63127Oq3.LIZIZ().getClass();
                C63127Oq3.LIZ();
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateConversation");
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationDao updateConversation ", e);
                C63337OtR.LJFF(e);
            }
        }
        return z2;
    }

    public static boolean LJJ(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao setConversationSortOrder");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update conversation_list set ");
        b0.LJ(LIZ2, EnumC63136OqC.COLUMN_SORT_ORDER.key, "=", j);
        LIZ2.append(" where ");
        YE1.LIZLLL(LIZ2, EnumC63136OqC.COLUMN_ID.key, "=\"", str, "\"");
        return C78847Ux1.LJIL(X1D.LIZIZ(LIZ2));
    }

    public static boolean LJJII(String str, java.util.Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao updateLocalExt, cid:");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC63136OqC.COLUMN_LOCAL_INFO.key, C63081OpJ.LJIILLIIL(map));
        StringBuilder LIZ2 = X1D.LIZ();
        if (C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, JBR.LJFF(LIZ2, EnumC63136OqC.COLUMN_ID.key, "=?", LIZ2), new String[]{str}) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06ab A[LOOP:4: B:125:0x06a5->B:127:0x06ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x075a  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.Oq8] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.InterfaceC63132Oq8 r42, java.util.ArrayList r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 2069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63133Oq9.LIZIZ(X.Oq8, java.util.ArrayList, boolean):void");
    }

    public static List LJIILIIL(int i, long j, EnumC97443s4 enumC97443s4) {
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao getStrangerConversations, limit:");
        LIZ.append(i);
        LIZ.append(", maxUpdateTime:");
        LIZ.append(j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("select * from conversation_list where ");
                LIZ2.append(EnumC63136OqC.COLUMN_STRANGER.key);
                LIZ2.append("=");
                LIZ2.append(1);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                if (enumC97443s4 != null && enumC97443s4 != EnumC97443s4.ALL) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZIZ);
                    LIZ3.append(" and ");
                    LIZ3.append(EnumC63136OqC.COLUMN_STRANGER_REQUEST_FILTERED.key);
                    LIZ3.append("=");
                    if (enumC97443s4 == EnumC97443s4.FILTERED) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    LIZ3.append(i2);
                    LIZIZ = X1D.LIZIZ(LIZ3);
                }
                if (j != -1) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LIZIZ);
                    LIZ4.append(" and ");
                    LIZ4.append(EnumC63136OqC.COLUMN_UPDATE_TIME.key);
                    LIZ4.append("<");
                    LIZ4.append(j);
                    LIZIZ = X1D.LIZIZ(LIZ4);
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ);
                LIZ5.append(" order by ");
                LIZ5.append(EnumC63136OqC.COLUMN_UPDATE_TIME.key);
                LIZ5.append(" desc limit ");
                LIZ5.append(i);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ5), null);
                if (interfaceC63132Oq8 != null) {
                    ArrayList arrayList = new ArrayList(interfaceC63132Oq8.getCount());
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList.add(LIZ(interfaceC63132Oq8, true));
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("IMConversationDao getStrangerConversations ");
                LIZ6.append(e);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ6));
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return new ArrayList();
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static List<C63120Opw> LJIILJJIL(int i, EnumC97443s4 enumC97443s4, boolean z) {
        String name;
        ArrayList arrayList;
        InterfaceC63132Oq8 interfaceC63132Oq8;
        Throwable th;
        String LIZIZ;
        StringBuilder LJ = C7MY.LJ("IMConversationDao getConversationIds, inbox:", i, ", stranger:");
        if (enumC97443s4 == null) {
            name = "no";
        } else {
            name = enumC97443s4.name();
        }
        LJ.append(name);
        C63322OtC.LJFF(X1D.LIZIZ(LJ));
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        interfaceC63132Oq82 = null;
        String str = "select * from conversation_list";
        String str2 = " where ";
        if (i != -1) {
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from conversation_list");
                    LIZ.append(" where ");
                    LIZ.append(EnumC63136OqC.COLUMN_INBOX.key);
                    LIZ.append("=");
                    LIZ.append(i);
                    str = X1D.LIZIZ(LIZ);
                    str2 = " and ";
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC63132Oq8 = interfaceC63132Oq82;
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                arrayList = null;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMConversationDao getConversationIds ");
                LIZ2.append(e);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                C63337OtR.LJFF(e);
                C63143OqJ.LIZ(interfaceC63132Oq82);
                return arrayList;
            }
        }
        if (enumC97443s4 == null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append(str2);
            LIZ3.append(EnumC63136OqC.COLUMN_STRANGER.key);
            LIZ3.append("=");
            LIZ3.append(0);
            LIZIZ = X1D.LIZIZ(LIZ3);
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append(str2);
            LIZ4.append(EnumC63136OqC.COLUMN_STRANGER.key);
            LIZ4.append("=");
            LIZ4.append(1);
            LIZIZ = X1D.LIZIZ(LIZ4);
            if (enumC97443s4 == EnumC97443s4.FILTERED) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ);
                LIZ5.append(" and ");
                LIZ5.append(EnumC63136OqC.COLUMN_STRANGER_REQUEST_FILTERED.key);
                LIZ5.append("=");
                LIZ5.append(1);
                LIZIZ = X1D.LIZIZ(LIZ5);
            } else if (enumC97443s4 == EnumC97443s4.REGULAR) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(LIZIZ);
                LIZ6.append(" and ");
                LIZ6.append(EnumC63136OqC.COLUMN_STRANGER_REQUEST_FILTERED.key);
                LIZ6.append("!=");
                LIZ6.append(1);
                LIZIZ = X1D.LIZIZ(LIZ6);
            }
        }
        if (z) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(LIZIZ);
            LIZ7.append(" and ");
            LIZ7.append(EnumC63136OqC.COLUMN_UNREAD_COUNT.key);
            LIZ7.append(">0");
            LIZIZ = X1D.LIZIZ(LIZ7);
        }
        interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(LIZIZ, null);
        if (interfaceC63132Oq8 != null) {
            try {
                try {
                    ArrayList arrayList4 = new ArrayList(interfaceC63132Oq8.getCount());
                    while (interfaceC63132Oq8.moveToNext()) {
                        try {
                            arrayList4.add(LIZ(interfaceC63132Oq8, true));
                        } catch (Exception e2) {
                            e = e2;
                            arrayList2 = arrayList4;
                            arrayList = arrayList2;
                            interfaceC63132Oq82 = interfaceC63132Oq8;
                            StringBuilder LIZ22 = X1D.LIZ();
                            LIZ22.append("IMConversationDao getConversationIds ");
                            LIZ22.append(e);
                            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ22));
                            C63337OtR.LJFF(e);
                            C63143OqJ.LIZ(interfaceC63132Oq82);
                            return arrayList;
                        }
                    }
                    arrayList3 = arrayList4;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th3) {
                th = th3;
                C63143OqJ.LIZ(interfaceC63132Oq8);
                throw th;
            }
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return arrayList3;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00c7: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:67109063), block:B:26:0x00c7 */
    public static List<C63120Opw> LJIIL(long j, long j2, int i, EnumC96103pu enumC96103pu) {
        String str;
        boolean z;
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        C63308Osy.LJI().getClass();
        C63291Osh.LIZ().getClass();
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        if (!C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"))) {
            C63322OtC.LIZJ("IMConversationDao getConversationsWithCategoryInner failed");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZJ = V10.LIZJ("IMConversationDao getConversationsWithCategoryInner maxSortOrder:", j, ", minSortOrder:");
        C06510Nj.LIZIZ(LIZJ, j2, ", limit:", i);
        LIZJ.append(", category:");
        if (enumC96103pu == null) {
            str = "null";
        } else {
            str = enumC96103pu.toString();
        }
        LIZJ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZJ));
        if (enumC96103pu != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            try {
                String LIZJ2 = LIZJ(z, enumC96103pu, j2, j, i);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(LIZJ2, null);
                if (interfaceC63132Oq8 != null) {
                    try {
                        ArrayList arrayList = new ArrayList(interfaceC63132Oq8.getCount());
                        LIZIZ(interfaceC63132Oq8, arrayList, z);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("getConversationWithCategory, size: ");
                        LIZ.append(arrayList.size());
                        LIZ.append(" duration: ");
                        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                        LIZ.append(" sql: ");
                        LIZ.append(LIZJ2);
                        C63322OtC.LIZIZ("IMConversationDao", X1D.LIZIZ(LIZ));
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return arrayList;
                    } catch (Exception e) {
                        e = e;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("getConversationWithCategory ");
                        LIZ2.append(e);
                        C63322OtC.LJI("IMConversationDao", X1D.LIZIZ(LIZ2), null);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return new ArrayList();
                    }
                }
            } catch (Throwable th) {
                th = th;
                interfaceC63132Oq83 = interfaceC63132Oq82;
                C63143OqJ.LIZ(interfaceC63132Oq83);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th2) {
            th = th2;
            C63143OqJ.LIZ(interfaceC63132Oq83);
            throw th;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return new ArrayList();
    }

    public static String LIZJ(boolean z, EnumC96103pu enumC96103pu, long j, long j2, int i) {
        StringBuilder sb = new StringBuilder("select *");
        if (z) {
            sb.append(", conversation_list.");
            sb.append(EnumC63136OqC.COLUMN_ID.key);
            sb.append(" as conversation_id_alias");
        }
        sb.append(" from conversation_list");
        if (z) {
            sb.append(" left join conversation_setting on conversation_list.");
            sb.append(EnumC63136OqC.COLUMN_ID.key);
            sb.append("=conversation_setting.");
            sb.append(EnumC63115Opr.COLUMN_ID.key);
        }
        sb.append(" where ");
        sb.append(EnumC63136OqC.COLUMN_STRANGER.key);
        sb.append("=0");
        if (z) {
            EnumC96103pu enumC96103pu2 = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
            int value = enumC96103pu2.getValue();
            if (enumC96103pu == enumC96103pu2) {
                sb.append(" and (");
                EnumC63115Opr enumC63115Opr = EnumC63115Opr.COLUMN_CATEGORY;
                C0EH.LIZLLL(sb, enumC63115Opr.key, "=", value, " or ");
                sb.append(enumC63115Opr.key);
                sb.append("=0 or ");
                sb.append(enumC63115Opr.key);
                sb.append(" is null)");
            } else {
                sb.append(" and ");
                sb.append(EnumC63115Opr.COLUMN_CATEGORY.key);
                sb.append("=");
                sb.append(enumC96103pu.getValue());
            }
        }
        C47922IrO.LIZ();
        if (j == j2) {
            sb.append(" and ");
            b0.LJ(sb, EnumC63136OqC.COLUMN_SORT_ORDER.key, "=", j);
        } else {
            sb.append(" and ");
            EnumC63136OqC enumC63136OqC = EnumC63136OqC.COLUMN_SORT_ORDER;
            b0.LJ(sb, enumC63136OqC.key, " between ", j);
            C0MT.LIZLLL(sb, " and ", j2, " order by ");
            sb.append(enumC63136OqC.key);
            sb.append(" desc,");
            sb.append(EnumC63136OqC.COLUMN_SHORT_ID.key);
            sb.append(" desc");
        }
        if (i >= 0) {
            sb.append(" limit ");
            sb.append(i);
        }
        sb.append(";");
        return sb.toString();
    }
}
