package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OqQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63150OqQ {
    public static C109544Rq LIZJ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        C64537PUn of;
        C63308Osy.LJI().LIZLLL().getClass();
        boolean z = C63308Osy.LJI().LIZLLL().LJJJJZ;
        C109544Rq c109544Rq = new C109544Rq();
        c109544Rq.setRowId(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex("rowid")));
        c109544Rq.setUuid(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_MSG_ID.key)));
        c109544Rq.setMsgId(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_SERVER_ID.key)));
        c109544Rq.setConversationId(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CONVERSATION_ID.key)));
        c109544Rq.setConversationShortId(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CONVERSATION_SHORT_ID.key)));
        c109544Rq.setConversationType(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CONVERSATION_TYPE.key)));
        c109544Rq.setMsgType(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_MSG_TYPE.key)));
        c109544Rq.setIndex(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_INNER_INDEX.key)));
        c109544Rq.setOrderIndex(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_ORDER_INDEX.key)));
        c109544Rq.setMsgStatus(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_STATUS.key)));
        c109544Rq.setSvrStatus(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_NET_STATUS.key)));
        c109544Rq.setVersion(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_VERSION.key)));
        c109544Rq.setDeleted(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_DELETED.key)));
        c109544Rq.setCreatedAt(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CREATE_TIME.key)));
        c109544Rq.setSender(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_SENDER.key)));
        c109544Rq.setContent(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CONTENT.key)));
        byte[] blob = interfaceC63132Oq8.getBlob(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CONTENT_PB.key));
        if (blob == null) {
            of = C64537PUn.EMPTY;
        } else {
            of = C64537PUn.of(blob);
        }
        c109544Rq.setContentPB(of);
        c109544Rq.setScene(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_SCENE.key)));
        c109544Rq.setExtStr(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_EXT.key)));
        c109544Rq.setLocalExtStr(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_LOCAL_INFO.key)));
        c109544Rq.setReadStatus(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_READ_STATUS.key)));
        c109544Rq.setSecSender(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_SEC_SENDER.key)));
        c109544Rq.setIndexInConversationV2(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_INDEX_IN_CONVERSATION_V2.key)));
        c109544Rq.setConvRankUpdateRule(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_CONV_RANK_UPDATE_RULE.key)));
        if (z) {
            long j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_TABLE_FLAG.key));
            if ((j & 1) == 1) {
                c109544Rq.setAttachments(C117834jr.LIZLLL(c109544Rq.getUuid()));
            }
            if ((j & 2) == 2) {
                c109544Rq.setPropertyItemListMap(C63153OqT.LJFF(c109544Rq.getUuid()));
            }
        } else {
            c109544Rq.setAttachments(C117834jr.LIZLLL(c109544Rq.getUuid()));
            c109544Rq.setPropertyItemListMap(C63153OqT.LJFF(c109544Rq.getUuid()));
        }
        if (c109544Rq.getRefMsgId() > 0) {
            String uuid = c109544Rq.getUuid();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ref_");
            LIZ.append(c109544Rq.getRefMsgId());
            c109544Rq.setRefMsg((ReferenceInfo) GsonProtectorUtils.fromJson(C63682Oz0.LIZ, C63172Oqm.LIZ(uuid, X1D.LIZIZ(LIZ)), ReferenceInfo.class));
        }
        return c109544Rq;
    }

    public static void LJFF(C109544Rq c109544Rq) {
        long j;
        if (c109544Rq == null) {
            return;
        }
        if (c109544Rq.getAttachments() != null && !c109544Rq.getAttachments().isEmpty()) {
            j = 1;
        } else {
            j = 0;
        }
        if (c109544Rq.getPropertyItemListMap() != null && !c109544Rq.getPropertyItemListMap().isEmpty()) {
            j |= 2;
        }
        c109544Rq.setTableFlag(j);
    }

    public static boolean LJI(String uuid) {
        if (TextUtils.isEmpty(uuid)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update msg set ");
        C0EH.LIZLLL(LIZ, EnumC63154OqU.COLUMN_DELETED.key, "=", 1, " where ");
        YE1.LIZLLL(LIZ, EnumC63154OqU.COLUMN_MSG_ID.key, "=\"", uuid, "\"");
        boolean LJIL = C78847Ux1.LJIL(X1D.LIZIZ(LIZ));
        if (LJIL) {
            C63134OqA.LIZIZ(uuid);
            o.LJIIIZ(uuid, "uuid");
            C63127Oq3.LIZIZ().getClass();
            C63127Oq3.LIZ();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("IMMsgDao deleteMsg, uuid:");
        LIZ2.append(uuid);
        LIZ2.append(", result:");
        LIZ2.append(LJIL);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
        return LJIL;
    }

    public static void LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        C78847Ux1.LJIJJ("msg", JBR.LJFF(LIZ, EnumC63154OqU.COLUMN_MSG_TYPE.key, "=?", LIZ), new String[]{str});
        C63275OsR.LIZIZ().LJI(currentTimeMillis, "deleteMsgByType");
    }

    public static long LJIIIIZZ(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" from ");
                LIZ.append("msg");
                LIZ.append(" where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? AND ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(">? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ.append("=? order by ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" asc, ");
                LIZ.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ.append(" asc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, String.valueOf(10000000), String.valueOf(0), String.valueOf(0)});
                if (interfaceC63132Oq8.moveToFirst()) {
                    j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(enumC63154OqU.key));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getFirstShowMsgIndex", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            C63322OtC.LIZJ("IMMsgDao getFirstShowMsgIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    public static long LJIIIZ(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? order by ");
                LIZ.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                LIZ.append(" desc, ");
                LIZ.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ.append(" desc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                if (interfaceC63132Oq8 != null && interfaceC63132Oq8.moveToFirst()) {
                    j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_INNER_INDEX.key));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getLastMsgIndex", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            C63322OtC.LIZJ("IMMsgDao getLastMsgIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    public static C109544Rq LJIIJ(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (C63308Osy.LJI().LIZLLL().LJJLIIIJILLIZJL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_EXT.key);
                LIZ.append(" NOT LIKE ? order by ");
                LIZ.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                LIZ.append(" desc, ");
                LIZ.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ.append(" desc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, String.valueOf(0), String.valueOf(0), "%\"s:do_not_update_last_show_msg\":\"true\"%"});
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("select rowid,* from msg where ");
                LIZ2.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ2.append("=? AND ");
                LIZ2.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ2.append("=? AND ");
                LIZ2.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ2.append("=? order by ");
                LIZ2.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                LIZ2.append(" desc, ");
                LIZ2.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ2.append(" desc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), new String[]{str, String.valueOf(0), String.valueOf(0)});
            }
            try {
            } catch (Exception e) {
                e = e;
                try {
                    C63322OtC.LJ("IMMsgDao getLastShowMsg", e);
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    interfaceC63132Oq82 = interfaceC63132Oq8;
                    C63143OqJ.LIZ(interfaceC63132Oq82);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                interfaceC63132Oq82 = interfaceC63132Oq8;
                C63143OqJ.LIZ(interfaceC63132Oq82);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (interfaceC63132Oq8.moveToFirst()) {
            C109544Rq LIZJ = LIZJ(interfaceC63132Oq8);
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "getLastShowMsg");
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return LIZJ;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return null;
    }

    public static long LJIIJJI(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" from ");
                LIZ.append("msg");
                LIZ.append(" where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? AND ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(">? order by ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" asc, ");
                LIZ.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ.append(" asc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, String.valueOf(10000000)});
                if (interfaceC63132Oq8.moveToFirst()) {
                    j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(enumC63154OqU.key));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getLegalOldestIndex", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            C63322OtC.LIZJ("IMMsgDao getLegalOldestIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    public static long LJIIL(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select max(");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INDEX_IN_CONVERSATION_V2;
                LIZ.append(enumC63154OqU.key);
                LIZ.append(") as ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" from ");
                LIZ.append("msg");
                LIZ.append(" where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                if (interfaceC63132Oq8 != null && interfaceC63132Oq8.moveToFirst()) {
                    j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(enumC63154OqU.key));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getMaxIndexV2", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("IMMsgDao getMaxIndexV2, cid:");
            LIZ2.append(str);
            LIZ2.append(", indexV2:");
            LIZ2.append(j);
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
            return j;
        } catch (Throwable th) {
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x005b: MOVE (r6 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:16777307), block:B:19:0x005b */
    public static C109544Rq LJIILIIL(long j) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_SERVER_ID.key);
                LIZ.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{String.valueOf(j)});
                if (interfaceC63132Oq8 != null) {
                    try {
                        if (interfaceC63132Oq8.moveToFirst()) {
                            C109544Rq LIZJ = LIZJ(interfaceC63132Oq8);
                            C63275OsR.LIZIZ().LJI(currentTimeMillis, "getMsg");
                            C63143OqJ.LIZ(interfaceC63132Oq8);
                            return LIZJ;
                        }
                    } catch (Exception e) {
                        e = e;
                        C63322OtC.LJ("IMMsgDao getMsg", e);
                        C16880lQ.LLLLIIL(e);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return null;
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
        return null;
    }

    public static C109544Rq LJIILJJIL(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select rowid,* from msg where ");
            LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
            LIZ.append("=?");
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
            if (interfaceC63132Oq8 != null) {
                try {
                    try {
                        if (interfaceC63132Oq8.moveToFirst()) {
                            C109544Rq LIZJ = LIZJ(interfaceC63132Oq8);
                            C63275OsR.LIZIZ().LJI(currentTimeMillis, "getMsg");
                            C63143OqJ.LIZ(interfaceC63132Oq8);
                            return LIZJ;
                        }
                    } catch (Exception e) {
                        e = e;
                        C63322OtC.LJ("IMMsgDao getMsg", e);
                        C16880lQ.LLLLIIL(e);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    interfaceC63132Oq82 = interfaceC63132Oq8;
                    C63143OqJ.LIZ(interfaceC63132Oq82);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th2) {
            th = th2;
            C63143OqJ.LIZ(interfaceC63132Oq82);
            throw th;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return null;
    }

    public static long LJIIZILJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
                LIZ.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                if (interfaceC63132Oq8 != null && interfaceC63132Oq8.moveToFirst()) {
                    return interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex("rowid"));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getRowid", e);
                C63337OtR.LJFF(e);
            }
            return -1L;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static boolean LJIJI(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select rowid from msg where ");
            LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
            LIZ.append("=?");
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
            if (interfaceC63132Oq8 != null) {
                if (interfaceC63132Oq8.getCount() > 0) {
                    z = true;
                }
            }
            return z;
        } catch (Exception e) {
            C63322OtC.LJ("IMMsgDao hasLocalMsg", e);
            C16880lQ.LLLLIIL(e);
            C63337OtR.LJFF(e);
            return false;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static boolean LJIJJ(C109544Rq c109544Rq) {
        boolean z = false;
        if (!c109544Rq.invalid()) {
            C63159OqZ.LIZJ().LIZ(c109544Rq);
            long currentTimeMillis = System.currentTimeMillis();
            LJFF(c109544Rq);
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC63154OqU.COLUMN_MSG_ID.key, c109544Rq.getUuid());
            contentValues.put(EnumC63154OqU.COLUMN_SERVER_ID.key, Long.valueOf(c109544Rq.getMsgId()));
            contentValues.put(EnumC63154OqU.COLUMN_CONVERSATION_ID.key, c109544Rq.getConversationId());
            contentValues.put(EnumC63154OqU.COLUMN_CONVERSATION_SHORT_ID.key, Long.valueOf(c109544Rq.getConversationShortId()));
            contentValues.put(EnumC63154OqU.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(c109544Rq.getConversationType()));
            contentValues.put(EnumC63154OqU.COLUMN_MSG_TYPE.key, Integer.valueOf(c109544Rq.getMsgType()));
            contentValues.put(EnumC63154OqU.COLUMN_INNER_INDEX.key, Long.valueOf(c109544Rq.getIndex()));
            contentValues.put(EnumC63154OqU.COLUMN_ORDER_INDEX.key, Long.valueOf(c109544Rq.getOrderIndex()));
            contentValues.put(EnumC63154OqU.COLUMN_STATUS.key, Integer.valueOf(c109544Rq.getMsgStatus()));
            contentValues.put(EnumC63154OqU.COLUMN_NET_STATUS.key, Integer.valueOf(c109544Rq.getSvrStatus()));
            contentValues.put(EnumC63154OqU.COLUMN_VERSION.key, Long.valueOf(c109544Rq.getVersion()));
            contentValues.put(EnumC63154OqU.COLUMN_DELETED.key, Integer.valueOf(c109544Rq.getDeleted()));
            contentValues.put(EnumC63154OqU.COLUMN_CREATE_TIME.key, Long.valueOf(c109544Rq.getCreatedAt()));
            contentValues.put(EnumC63154OqU.COLUMN_SENDER.key, Long.valueOf(c109544Rq.getSender()));
            contentValues.put(EnumC63154OqU.COLUMN_CONTENT.key, c109544Rq.getContent());
            String str = EnumC63154OqU.COLUMN_CONTENT_PB.key;
            C64537PUn contentPB = c109544Rq.getContentPB();
            if (contentPB == null) {
                contentPB = C64537PUn.EMPTY;
            }
            contentValues.put(str, contentPB.toByteArray());
            contentValues.put(EnumC63154OqU.COLUMN_SCENE.key, c109544Rq.getScene());
            contentValues.put(EnumC63154OqU.COLUMN_EXT.key, c109544Rq.getExtStr());
            contentValues.put(EnumC63154OqU.COLUMN_LOCAL_INFO.key, c109544Rq.getLocalExtStr());
            contentValues.put(EnumC63154OqU.COLUMN_READ_STATUS.key, Integer.valueOf(c109544Rq.getReadStatus()));
            contentValues.put(EnumC63154OqU.COLUMN_SEC_SENDER.key, c109544Rq.getSecSender());
            contentValues.put(EnumC63154OqU.COLUMN_PROPERTY_LIST.key, "");
            contentValues.put(EnumC63154OqU.COLUMN_INDEX_IN_CONVERSATION_V2.key, Long.valueOf(c109544Rq.getIndexInConversationV2()));
            contentValues.put(EnumC63154OqU.COLUMN_TABLE_FLAG.key, Long.valueOf(c109544Rq.getTableFlag()));
            contentValues.put(EnumC63154OqU.COLUMN_CONV_RANK_UPDATE_RULE.key, Integer.valueOf(c109544Rq.getConvRankUpdateRule()));
            long LJJIL = C78847Ux1.LJJIL("msg", contentValues);
            c109544Rq.setRowId(LJJIL);
            C63134OqA.LJI(c109544Rq);
            if (LJJIL >= 0) {
                z = true;
                C63308Osy.LJI().LIZLLL().getClass();
                if (c109544Rq.getDeleted() == 0) {
                    C63127Oq3.LIZIZ().getClass();
                    C63127Oq3.LIZ();
                }
            }
            java.util.Map<String, List<C32H>> propertyItemListMap = c109544Rq.getPropertyItemListMap();
            if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                C63153OqT.LJIIIIZZ(c109544Rq);
            }
            if (z && c109544Rq.getAttachments() != null) {
                z = C117834jr.LIZ(c109544Rq.getAttachments());
            }
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "insertMessage");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMMsgDao insertMessage, svrId:");
            LIZ.append(c109544Rq.getMsgId());
            LIZ.append(", uuid:");
            LIZ.append(c109544Rq.getUuid());
            LIZ.append(", result:");
            LIZ.append(z);
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        }
        return z;
    }

    public static void LJIJJLI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update msg set ");
        C0EH.LIZLLL(LIZ, EnumC63154OqU.COLUMN_READ_STATUS.key, "=", 1, " where ");
        YE1.LIZLLL(LIZ, EnumC63154OqU.COLUMN_CONVERSATION_ID.key, "='", str, "'");
        C78847Ux1.LJIL(X1D.LIZIZ(LIZ));
    }

    public static void LJIL(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append('\"');
            sb.append(str);
            sb.append("\",");
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update msg set ");
        C0EH.LIZLLL(LIZ, EnumC63154OqU.COLUMN_READ_STATUS.key, "=", 1, " where ");
        LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
        LIZ.append(" in (");
        LIZ.append(sb2.substring(0, sb2.length() - 1));
        LIZ.append(")");
        C78847Ux1.LJIL(X1D.LIZIZ(LIZ));
    }

    public static boolean LJJ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMMsgDao markUnSendFail, user_id:");
        LIZ.append(j);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update msg set ");
        EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_STATUS;
        C0EH.LIZLLL(LIZ2, enumC63154OqU.key, "=", 3, " where ");
        b0.LJ(LIZ2, EnumC63154OqU.COLUMN_SENDER.key, "='", j);
        LIZ2.append("' AND ");
        C0EH.LIZLLL(LIZ2, enumC63154OqU.key, "<'", 2, "'");
        return C78847Ux1.LJIL(X1D.LIZIZ(LIZ2));
    }

    public static void LJJIIJ(String str) {
        long j;
        if (!C63308Osy.LJI().LIZLLL().LJJJJZ) {
            return;
        }
        if (!((ArrayList) C117834jr.LIZLLL(str)).isEmpty()) {
            j = 1;
        } else {
            j = 0;
        }
        java.util.Map<String, List<C32H>> LJFF = C63153OqT.LJFF(str);
        if (LJFF != null && !LJFF.isEmpty()) {
            j |= 2;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC63154OqU.COLUMN_TABLE_FLAG.key, Long.valueOf(j));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
            LIZ.append("=?");
            C78847Ux1.LJJLIIIJLJLI("msg", contentValues, X1D.LIZIZ(LIZ), new String[]{str});
        } catch (Exception e) {
            C63322OtC.LJ("IMMsgDao updateTableFlag", e);
            C63337OtR.LJFF(e);
        }
    }

    public static void LIZ(InterfaceC63146OqM interfaceC63146OqM, C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return;
        }
        int ordinal = EnumC63154OqU.COLUMN_MSG_ID.ordinal() + 1;
        String uuid = c109544Rq.getUuid();
        if (uuid == null) {
            uuid = "";
        }
        interfaceC63146OqM.LJJII(ordinal, uuid);
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_SERVER_ID.ordinal() + 1, c109544Rq.getMsgId());
        int ordinal2 = EnumC63154OqU.COLUMN_CONVERSATION_ID.ordinal() + 1;
        String conversationId = c109544Rq.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        interfaceC63146OqM.LJJII(ordinal2, conversationId);
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CONVERSATION_SHORT_ID.ordinal() + 1, c109544Rq.getConversationShortId());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CONVERSATION_TYPE.ordinal() + 1, c109544Rq.getConversationType());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_MSG_TYPE.ordinal() + 1, c109544Rq.getMsgType());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_INNER_INDEX.ordinal() + 1, c109544Rq.getIndex());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_ORDER_INDEX.ordinal() + 1, c109544Rq.getOrderIndex());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_STATUS.ordinal() + 1, c109544Rq.getMsgStatus());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_NET_STATUS.ordinal() + 1, c109544Rq.getSvrStatus());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_VERSION.ordinal() + 1, c109544Rq.getVersion());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_DELETED.ordinal() + 1, c109544Rq.getDeleted());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CREATE_TIME.ordinal() + 1, c109544Rq.getCreatedAt());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_SENDER.ordinal() + 1, c109544Rq.getSender());
        int ordinal3 = EnumC63154OqU.COLUMN_CONTENT.ordinal() + 1;
        String content = c109544Rq.getContent();
        if (content == null) {
            content = "";
        }
        interfaceC63146OqM.LJJII(ordinal3, content);
        int ordinal4 = EnumC63154OqU.COLUMN_CONTENT_PB.ordinal() + 1;
        C64537PUn contentPB = c109544Rq.getContentPB();
        if (contentPB == null) {
            contentPB = C64537PUn.EMPTY;
        }
        interfaceC63146OqM.LJJIIZ(ordinal4, contentPB.toByteArray());
        int ordinal5 = EnumC63154OqU.COLUMN_SCENE.ordinal() + 1;
        String scene = c109544Rq.getScene();
        if (scene == null) {
            scene = "";
        }
        interfaceC63146OqM.LJJII(ordinal5, scene);
        int ordinal6 = EnumC63154OqU.COLUMN_EXT.ordinal() + 1;
        String extStr = c109544Rq.getExtStr();
        if (extStr == null) {
            extStr = "";
        }
        interfaceC63146OqM.LJJII(ordinal6, extStr);
        int ordinal7 = EnumC63154OqU.COLUMN_LOCAL_INFO.ordinal() + 1;
        String localExtStr = c109544Rq.getLocalExtStr();
        if (localExtStr == null) {
            localExtStr = "";
        }
        interfaceC63146OqM.LJJII(ordinal7, localExtStr);
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_READ_STATUS.ordinal() + 1, c109544Rq.getReadStatus());
        interfaceC63146OqM.LJJII(EnumC63154OqU.COLUMN_SEC_SENDER.ordinal() + 1, c109544Rq.getSecSender());
        interfaceC63146OqM.LJJII(EnumC63154OqU.COLUMN_PROPERTY_LIST.ordinal() + 1, "");
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_INDEX_IN_CONVERSATION_V2.ordinal() + 1, c109544Rq.getIndexInConversationV2());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_TABLE_FLAG.ordinal() + 1, c109544Rq.getTableFlag());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CONV_RANK_UPDATE_RULE.ordinal() + 1, c109544Rq.getConvRankUpdateRule());
    }

    public static void LIZIZ(InterfaceC63146OqM interfaceC63146OqM, C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return;
        }
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_SERVER_ID.ordinal(), c109544Rq.getMsgId());
        int ordinal = EnumC63154OqU.COLUMN_CONVERSATION_ID.ordinal();
        String conversationId = c109544Rq.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        interfaceC63146OqM.LJJII(ordinal, conversationId);
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CONVERSATION_SHORT_ID.ordinal(), c109544Rq.getConversationShortId());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CONVERSATION_TYPE.ordinal(), c109544Rq.getConversationType());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_MSG_TYPE.ordinal(), c109544Rq.getMsgType());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_INNER_INDEX.ordinal(), c109544Rq.getIndex());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_ORDER_INDEX.ordinal(), c109544Rq.getOrderIndex());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_STATUS.ordinal(), c109544Rq.getMsgStatus());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_NET_STATUS.ordinal(), c109544Rq.getSvrStatus());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_VERSION.ordinal(), c109544Rq.getVersion());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_DELETED.ordinal(), c109544Rq.getDeleted());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CREATE_TIME.ordinal(), c109544Rq.getCreatedAt());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_SENDER.ordinal(), c109544Rq.getSender());
        int ordinal2 = EnumC63154OqU.COLUMN_CONTENT.ordinal();
        String content = c109544Rq.getContent();
        if (content == null) {
            content = "";
        }
        interfaceC63146OqM.LJJII(ordinal2, content);
        int ordinal3 = EnumC63154OqU.COLUMN_CONTENT_PB.ordinal();
        C64537PUn contentPB = c109544Rq.getContentPB();
        if (contentPB == null) {
            contentPB = C64537PUn.EMPTY;
        }
        interfaceC63146OqM.LJJIIZ(ordinal3, contentPB.toByteArray());
        int ordinal4 = EnumC63154OqU.COLUMN_SCENE.ordinal();
        String scene = c109544Rq.getScene();
        if (scene == null) {
            scene = "";
        }
        interfaceC63146OqM.LJJII(ordinal4, scene);
        int ordinal5 = EnumC63154OqU.COLUMN_EXT.ordinal();
        String extStr = c109544Rq.getExtStr();
        if (extStr == null) {
            extStr = "";
        }
        interfaceC63146OqM.LJJII(ordinal5, extStr);
        int ordinal6 = EnumC63154OqU.COLUMN_LOCAL_INFO.ordinal();
        String localExtStr = c109544Rq.getLocalExtStr();
        if (localExtStr == null) {
            localExtStr = "";
        }
        interfaceC63146OqM.LJJII(ordinal6, localExtStr);
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_READ_STATUS.ordinal(), c109544Rq.getReadStatus());
        interfaceC63146OqM.LJJII(EnumC63154OqU.COLUMN_SEC_SENDER.ordinal(), c109544Rq.getSecSender());
        interfaceC63146OqM.LJJII(EnumC63154OqU.COLUMN_PROPERTY_LIST.ordinal(), "");
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_INDEX_IN_CONVERSATION_V2.ordinal(), c109544Rq.getIndexInConversationV2());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_TABLE_FLAG.ordinal(), c109544Rq.getTableFlag());
        interfaceC63146OqM.LJIIIZ(EnumC63154OqU.COLUMN_CONV_RANK_UPDATE_RULE.ordinal(), c109544Rq.getConvRankUpdateRule());
    }

    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.InterfaceC63132Oq8 r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63150OqQ.LIZLLL(X.Oq8, java.util.List):void");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0087: MOVE (r6 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:33554567), block:B:21:0x0087 */
    public static C109544Rq LJIILL(long j, String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        if (j <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                LIZ.append("=? and ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append(" =?  and ");
                LIZ.append(EnumC63154OqU.COLUMN_SERVER_ID.key);
                LIZ.append(" >0 ");
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(j);
                LIZ2.append("");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(LIZIZ, new String[]{X1D.LIZIZ(LIZ2), str});
                try {
                    if (interfaceC63132Oq8.moveToFirst()) {
                        C109544Rq LIZJ = LIZJ(interfaceC63132Oq8);
                        C63275OsR.LIZIZ().LJI(currentTimeMillis, "getMsg");
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return LIZJ;
                    }
                } catch (Exception e) {
                    e = e;
                    C63322OtC.LJ("IMMsgDao getMsg", e);
                    C16880lQ.LLLLIIL(e);
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return null;
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
        return null;
    }

    public static List LJIILLIIL(long j, List list) {
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
                LIZ.append(" in ('");
                LIZ.append(C63312Ot2.LJII("','", list));
                LIZ.append("')  AND ");
                LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                LIZ.append(">? order by ");
                LIZ.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                LIZ.append(" desc, ");
                LIZ.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ.append(" desc");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{String.valueOf(0), String.valueOf(0), String.valueOf(j)});
                if (C63308Osy.LJI().LIZLLL().LJJJJJL && list.size() < 999) {
                    LIZLLL(interfaceC63132Oq8, arrayList);
                } else {
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList.add(LIZJ(interfaceC63132Oq8));
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C63322OtC.LJ("IMMsgDao getMsgList", e);
                C63337OtR.LJFF(e);
            }
            return arrayList;
        } finally {
            C63143OqJ.LIZ(null);
        }
    }

    public static String LJIJ(long j, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (j > 0) {
            sb.append(" update msg set ");
            for (EnumC63154OqU enumC63154OqU : EnumC63154OqU.values()) {
                if (!"msg_uuid".equals(enumC63154OqU.key)) {
                    sb.append(enumC63154OqU.key);
                    sb.append("=?,");
                }
            }
            String sb3 = sb.toString();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(sb3.substring(0, sb3.length() - 1));
            LIZ.append(" where msg_uuid='");
            if (str == null) {
                str = "";
            }
            return JBR.LJFF(LIZ, str, "'", LIZ);
        }
        sb.append(" insert into msg(");
        for (EnumC63154OqU enumC63154OqU2 : EnumC63154OqU.values()) {
            sb.append(enumC63154OqU2.key);
            sb.append(",");
            sb2.append("?,");
        }
        String sb4 = sb.toString();
        String sb5 = sb2.toString();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(sb4.substring(0, sb4.length() - 1));
        LIZ2.append(") values (");
        LIZ2.append(sb5.substring(0, sb5.length() - 1));
        LIZ2.append(");");
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LJJIII(String str, java.util.Map<String, String> map) {
        C109544Rq LJIILJJIL;
        if (TextUtils.isEmpty(str) || (LJIILJJIL = LJIILJJIL(str)) == null || LJIILJJIL.invalid()) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMMsgDao updateMessageExt, uuid:");
        LIZ.append(LJIILJJIL.getUuid());
        LIZ.append(", ext:");
        LIZ.append(LJIILJJIL.getExtStr());
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        ContentValues contentValues = new ContentValues();
        String str2 = EnumC63154OqU.COLUMN_EXT.key;
        String LIZ2 = C63682Oz0.LIZ(map);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        contentValues.put(str2, LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        if (C78847Ux1.LJJLIIIJLJLI("msg", contentValues, JBR.LJFF(LIZ3, EnumC63154OqU.COLUMN_MSG_ID.key, "=?", LIZ3), new String[]{LJIILJJIL.getUuid()}) < 0) {
            return false;
        }
        return true;
    }

    public static int LJ(long j, long j2, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select * from msg where ");
            LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
            LIZ.append("=? AND ");
            EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
            LIZ.append(enumC63154OqU.key);
            LIZ.append("<=? AND ");
            LIZ.append(enumC63154OqU.key);
            LIZ.append(">=?");
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, String.valueOf(j2), String.valueOf(j)});
            return interfaceC63132Oq8.getCount();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            C63322OtC.LJ("IMMsgDao computeMsgCount", e);
            C63337OtR.LJFF(e);
            return -1;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        if (r2 > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJII(boolean r13, X.C109544Rq r14, boolean r15) {
        /*
            java.lang.String r6 = "IMMsgDao.updateMessage"
            r5 = 0
            if (r14 == 0) goto Lb
            boolean r0 = r14.invalid()
            if (r0 == 0) goto Lc
        Lb:
            return r5
        Lc:
            X.OqZ r0 = X.C63159OqZ.LIZJ()
            r0.LIZ(r14)
            long r0 = java.lang.System.currentTimeMillis()
            LJFF(r14)
            r4 = 0
            X.C78847Ux1.LJJLIIIJJI(r6)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            X.Osy r2 = X.C63308Osy.LJI()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            X.4eO r2 = r2.LIZLLL()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            r2.getClass()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            java.lang.String r2 = r14.getUuid()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            long r2 = LJIIZILJ(r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            long r11 = r14.getRowId()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            r9 = 0
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 > 0) goto L42
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto L42
            r14.setRowId(r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
        L42:
            java.lang.String r7 = r14.getUuid()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            java.lang.String r7 = LJIJ(r2, r7)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            X.OqM r4 = X.C78847Ux1.LJIJ(r7)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            r8 = 1
            if (r4 == 0) goto La0
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto L5f
            LIZIZ(r4, r14)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            int r2 = r4.LJIJJLI()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            if (r2 <= 0) goto La0
            goto L6d
        L5f:
            LIZ(r4, r14)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            long r2 = r4.LJIILJJIL()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            r14.setRowId(r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lf9
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto La0
        L6d:
            r3 = 1
            X.Osy r2 = X.C63308Osy.LJI()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            X.4eO r2 = r2.LIZLLL()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            r2.getClass()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            int r2 = r14.getDeleted()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            if (r2 != 0) goto L8d
            X.Oq3 r2 = X.C63127Oq3.LIZIZ()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            r2.getClass()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            X.C63127Oq3.LIZ()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
        L89:
            X.C63134OqA.LJI(r14)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            goto L98
        L8d:
            X.Oq3 r2 = X.C63127Oq3.LIZIZ()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            r2.getClass()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            X.C63127Oq3.LIZ()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            goto L89
        L98:
            if (r13 == 0) goto L9d
            X.C63153OqT.LJIIIIZZ(r14)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
        L9d:
            if (r15 == 0) goto Lb0
            goto La2
        La0:
            r3 = 0
            goto Lb0
        La2:
            java.util.List r2 = r14.getAttachments()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            if (r2 == 0) goto Lb0
            java.util.List r2 = r14.getAttachments()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            boolean r3 = X.C117834jr.LJ(r2)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
        Lb0:
            X.OsR r7 = X.C63275OsR.LIZIZ()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            java.lang.String r2 = "updateMessage"
            r7.LJI(r0, r2)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            X.C78847Ux1.LJIJJLI(r6, r8)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lf9
            goto Lcc
        Lbd:
            r1 = move-exception
            goto Lc1
        Lbf:
            r1 = move-exception
            r3 = 0
        Lc1:
            java.lang.String r0 = "IMMsgDao updateMessage"
            X.C63322OtC.LJ(r0, r1)     // Catch: java.lang.Throwable -> Lf9
            X.C78847Ux1.LJIJJLI(r6, r5)     // Catch: java.lang.Throwable -> Lf9
            X.C63337OtR.LJFF(r1)     // Catch: java.lang.Throwable -> Lf9
        Lcc:
            X.C63143OqJ.LIZIZ(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "IMMsgDao updateMessage end, svrId:"
            r2.<init>(r0)
            long r0 = r14.getMsgId()
            r2.append(r0)
            java.lang.String r0 = ", uuid:"
            r2.append(r0)
            java.lang.String r0 = r14.getUuid()
            r2.append(r0)
            java.lang.String r0 = ", result:"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            X.C63322OtC.LIZJ(r0)
            return r3
        Lf9:
            r0 = move-exception
            X.C63143OqJ.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63150OqQ.LJJII(boolean, X.4Rq, boolean):boolean");
    }

    public static List LJJI(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ.append("=?");
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append(" AND ");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                LIZ2.append(enumC63154OqU.key);
                LIZ2.append(">?");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append(" AND ");
                LIZ3.append(enumC63154OqU.key);
                LIZ3.append("<=?");
                String LIZIZ3 = X1D.LIZIZ(LIZ3);
                int i2 = 0;
                if (iArr != null && iArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        sb.append(iArr[i3]);
                        if (i3 < iArr.length - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LIZIZ3);
                    LIZ4.append(" AND ");
                    LIZ4.append(EnumC63154OqU.COLUMN_MSG_TYPE.key);
                    LIZ4.append(" IN ");
                    LIZ4.append(sb.toString());
                    LIZIZ3 = X1D.LIZIZ(LIZ4);
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ3);
                LIZ5.append(" order by ");
                LIZ5.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                LIZ5.append(" asc, ");
                LIZ5.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ5.append(" asc");
                String LIZIZ4 = X1D.LIZIZ(LIZ5);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(LIZIZ4);
                LIZ6.append(" limit ");
                LIZ6.append(i);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ6), new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j), String.valueOf(Long.MAX_VALUE)});
                if (C63308Osy.LJI().LIZLLL().LJJJJJL) {
                    LIZLLL(interfaceC63132Oq8, arrayList);
                    Collections.reverse(arrayList);
                } else {
                    C109544Rq[] c109544RqArr = new C109544Rq[interfaceC63132Oq8.getCount()];
                    while (interfaceC63132Oq8.moveToNext()) {
                        c109544RqArr[(interfaceC63132Oq8.getCount() - 1) - i2] = LIZJ(interfaceC63132Oq8);
                        i2++;
                    }
                    arrayList.addAll(Arrays.asList(c109544RqArr));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C63322OtC.LJ("IMMsgDao queryNewerMessageList", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("IMMsgDao queryNewerMessageList, cid:");
            LIZ7.append(str);
            LIZ7.append(", startIndex:");
            LIZ7.append(j);
            LIZ7.append(", limit:");
            LIZ7.append(i);
            LIZ7.append(", count:");
            LIZ7.append(arrayList.size());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ7));
            return arrayList;
        } catch (Throwable th) {
            C63143OqJ.LIZ(null);
            throw th;
        }
    }

    public static List LJJIFFI(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ.append("=? AND ");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                LIZ.append(enumC63154OqU.key);
                LIZ.append("<? AND ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(">=?");
                String LIZIZ = X1D.LIZIZ(LIZ);
                if (iArr != null && iArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        sb.append(iArr[i2]);
                        if (i2 < iArr.length - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ);
                    LIZ2.append(" AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_MSG_TYPE.key);
                    LIZ2.append(" IN ");
                    LIZ2.append(sb.toString());
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append(" order by ");
                LIZ3.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                LIZ3.append(" desc, ");
                LIZ3.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                LIZ3.append(" desc limit ");
                LIZ3.append(i);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ3), new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j), String.valueOf(Long.MIN_VALUE)});
                if (C63308Osy.LJI().LIZLLL().LJJJJJL) {
                    LIZLLL(interfaceC63132Oq8, arrayList);
                } else {
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList.add(LIZJ(interfaceC63132Oq8));
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C63322OtC.LJ("IMMsgDao queryOlderMessageList", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("IMMsgDao queryOlderMessageList, cid:");
            LIZ4.append(str);
            LIZ4.append(", index:");
            LIZ4.append(j);
            C0MT.LIZLLL(LIZ4, ", minIndex:", Long.MIN_VALUE, ", limit:");
            LIZ4.append(i);
            LIZ4.append(", count:");
            LIZ4.append(arrayList.size());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ4));
            return arrayList;
        } catch (Throwable th) {
            C63143OqJ.LIZ(null);
            throw th;
        }
    }
}
