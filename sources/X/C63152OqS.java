package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.OqS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63152OqS implements AnonymousClass329 {
    public static final C63152OqS LIZIZ = new C63152OqS();

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0091: MOVE (r7 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777361), block:B:20:0x0091 */
    public static final C32H LIZ(String conversationId) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        o.LJIIIZ(conversationId, "conversationId");
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from msg_property_new where ");
                LIZ.append(EnumC63157OqX.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? and ");
                LIZ.append(EnumC63157OqX.COLUMN_SENDER.key);
                LIZ.append("!=? order by ");
                LIZ.append(EnumC63157OqX.COLUMN_CREATE_TIME_V2.key);
                LIZ.append(" desc, ");
                LIZ.append(EnumC63157OqX.COLUMN_CREATE_TIME.key);
                LIZ.append(" desc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{conversationId, String.valueOf(C63308Osy.LJI().LIZIZ().getUid())});
                if (interfaceC63132Oq8 != null) {
                    try {
                        if (interfaceC63132Oq8.moveToNext()) {
                            C32H LIZIZ2 = C63153OqT.LIZIZ(interfaceC63132Oq8);
                            C63275OsR.LIZIZ().LJI(currentTimeMillis, "IMMsgPropertyDao getLastMessageProperty");
                            C63143OqJ.LIZ(interfaceC63132Oq8);
                            return LIZIZ2;
                        }
                    } catch (Exception e) {
                        e = e;
                        C63322OtC.LJ("IMMsgPropertyDao getLastMessageProperty", e);
                        C63337OtR.LJ("getLastMessageProperty", e);
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

    public final Object LIZIZ(long j, String conversationId) {
        long uid;
        o.LJIIIZ(conversationId, "conversationId");
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                uid = C63308Osy.LJI().LIZIZ().getUid();
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgPropertyDao getMinimumMessageIndex", e);
                C63337OtR.LJ("getMinimumMessageIndex", e);
            }
            if (uid != -1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from msg_property_new left join msg on msg_property_new.");
                LIZ.append(EnumC63157OqX.COLUMN_MSG_UUID.key);
                LIZ.append("=");
                LIZ.append("msg");
                LIZ.append(".");
                LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
                LIZ.append(" where ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(EnumC63157OqX.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? and ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(EnumC63157OqX.COLUMN_CREATE_TIME_V2.key);
                LIZ.append(">? and ");
                LIZ.append("msg");
                LIZ.append(".");
                LIZ.append(EnumC63154OqU.COLUMN_SENDER.key);
                LIZ.append("=? and ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(EnumC63157OqX.COLUMN_SENDER.key);
                LIZ.append("!=? order by ");
                LIZ.append("msg");
                LIZ.append(".");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" asc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{conversationId, String.valueOf(j), String.valueOf(uid), String.valueOf(uid)});
                if (interfaceC63132Oq8 != null && interfaceC63132Oq8.moveToNext()) {
                    long j3 = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(enumC63154OqU.key));
                    C63275OsR.LIZIZ().LJI(currentTimeMillis, "IMMsgPropertyDao getUnreadMessageProperties");
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    j2 = j3;
                }
            }
            return new Long(j2);
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public final Object LIZJ(long j, String conversationId) {
        long uid;
        o.LJIIIZ(conversationId, "conversationId");
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = 0;
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                uid = C63308Osy.LJI().LIZIZ().getUid();
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgPropertyDao getPropertyCount", e);
                C63337OtR.LJ("getPropertyCount", e);
            }
            if (uid != -1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select distinct + msg_property_new.");
                EnumC63157OqX enumC63157OqX = EnumC63157OqX.COLUMN_MSG_UUID;
                LIZ.append(enumC63157OqX.key);
                LIZ.append(", ");
                LIZ.append(EnumC63157OqX.COLUMN_IDEMPOTENT_ID.key);
                LIZ.append(" from ");
                LIZ.append("msg_property_new");
                LIZ.append(" left join ");
                LIZ.append("msg");
                LIZ.append(" on ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(enumC63157OqX.key);
                LIZ.append("=");
                LIZ.append("msg");
                LIZ.append(".");
                LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
                LIZ.append(" where ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(EnumC63157OqX.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? and ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(EnumC63157OqX.COLUMN_CREATE_TIME_V2.key);
                LIZ.append(">? and ");
                LIZ.append("msg");
                LIZ.append(".");
                LIZ.append(EnumC63154OqU.COLUMN_SENDER.key);
                LIZ.append("=? and ");
                LIZ.append("msg_property_new");
                LIZ.append(".");
                LIZ.append(EnumC63157OqX.COLUMN_SENDER.key);
                LIZ.append("!=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{conversationId, String.valueOf(j), String.valueOf(uid), String.valueOf(uid)});
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "IMMsgPropertyDao getUnreadReactionCount");
                if (interfaceC63132Oq8 != null) {
                    j2 = interfaceC63132Oq8.getCount();
                }
                return new Long(j2);
            }
            return new Long(j2);
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public final Object LIZLLL(long j, String conversationId) {
        long j2;
        o.LJIIIZ(conversationId, "conversationId");
        if (!TextUtils.isEmpty(conversationId)) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from msg where ");
                    LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                    LIZ.append("=? AND ");
                    LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                    LIZ.append("=? AND ");
                    LIZ.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                    LIZ.append(">=? AND ");
                    LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                    LIZ.append("=?");
                    int i = 0;
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{conversationId, String.valueOf(0), String.valueOf(j), String.valueOf(0)});
                    if (interfaceC63132Oq8 != null) {
                        i = interfaceC63132Oq8.getCount();
                    }
                    C63275OsR.LIZIZ().LJI(currentTimeMillis, "computeUnreadMessageReactionCount");
                    j2 = i;
                } catch (Exception e) {
                    C63322OtC.LJ("IMMsgDao computeUnreadMessageReactionCount error", e);
                    C63337OtR.LJ("computeUnreadMessageReactionCount", e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("IMMsgDao computeUnreadMessageReactionCount:0, cid:");
                    LIZ2.append(conversationId);
                    C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
                }
                return new Long(j2);
            } finally {
                C63143OqJ.LIZ(interfaceC63132Oq8);
            }
        }
        j2 = 0;
        return new Long(j2);
    }
}
