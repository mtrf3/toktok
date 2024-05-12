package com.bytedance.im.core.internal.link.handler;

import X.C0EH;
import X.C109544Rq;
import X.C16880lQ;
import X.C47922IrO;
import X.C63088OpQ;
import X.C63090OpS;
import X.C63112Opo;
import X.C63113Opp;
import X.C63120Opw;
import X.C63127Oq3;
import X.C63131Oq7;
import X.C63133Oq9;
import X.C63134OqA;
import X.C63143OqJ;
import X.C63150OqQ;
import X.C63172Oqm;
import X.C63192Or6;
import X.C63269OsL;
import X.C63291Osh;
import X.C63308Osy;
import X.C63309Osz;
import X.C63322OtC;
import X.C63337OtR;
import X.C63356Otk;
import X.C63577OxJ;
import X.C63682Oz0;
import X.C78847Ux1;
import X.EnumC109604Rw;
import X.EnumC63126Oq2;
import X.EnumC63154OqU;
import X.EnumC63175Oqp;
import X.EnumC63179Oqt;
import X.InterfaceC63132Oq8;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.RunnableC63173Oqn;
import X.X1D;
import X.YE1;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS2S0220000_10;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS46S0100000_10;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.model.SendMessageCheck;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import defpackage.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class CommandMessage {

    @InterfaceC65349Pkn("conv_pull_action")
    public int action;

    @InterfaceC65349Pkn("added_participant")
    public List<Long> addedMembers;

    @InterfaceC65349Pkn("conversation_id")
    public String conversationId;

    @InterfaceC65349Pkn("conversation_type")
    public int conversationType;

    @InterfaceC65349Pkn("conversation_version")
    public long conversationVersion;

    @InterfaceC65349Pkn("group_version")
    public long groupVersion;

    @InterfaceC65349Pkn("inbox_type")
    public int inboxType;

    @InterfaceC65349Pkn("last_message_index")
    public long lastMsgIndex;

    @InterfaceC65349Pkn("last_message_index_v2")
    public long lastMsgIndexV2;

    @InterfaceC65349Pkn("modified_participant")
    public List<Long> modifiedMembers;

    @InterfaceC65349Pkn("message_id")
    public long msgId;

    @InterfaceC65349Pkn("read_badge_count")
    public int readBadgeCount;

    @InterfaceC65349Pkn("read_index")
    public long readIndex;

    @InterfaceC65349Pkn("read_index_v2")
    public long readIndexV2;

    @InterfaceC65349Pkn("removed_participant")
    public List<Long> removedMembers;

    @InterfaceC65349Pkn("command_type")
    public int type;

    @InterfaceC65349Pkn("unread_count")
    public int unreadCount;

    public static CommandMessage LIZJ(MessageBody messageBody) {
        if (messageBody.message_type.intValue() != EnumC63179Oqt.MESSAGE_TYPE_COMMAND.getValue()) {
            return null;
        }
        try {
            return (CommandMessage) GsonProtectorUtils.fromJson(C63682Oz0.LIZ, new JSONObject(messageBody.content).toString(), CommandMessage.class);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void LIZLLL(CommandMessage commandMessage) {
        String str = commandMessage.conversationId;
        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(str, true);
        if (LJIIIZ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommandMessage deleteConversation but conversation null, cid:");
            LIZ.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        C63308Osy.LJI().LIZLLL().getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CommandMessage deleteConversation, cid:");
        LIZ2.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        if (C63133Oq9.LJFF(str)) {
            C63356Otk.LJIIIZ().LJIIJ(new ARunnableS46S0100000_10(LJIIIZ, 24));
        }
        C63269OsL.LJIIJJI(commandMessage.inboxType, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r5.removeMentionMessage(r4.getUuid()) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.bytedance.im.core.internal.link.handler.CommandMessage r11) {
        /*
            X.4fk r1 = X.C115284fk.LJIILIIL()
            java.lang.String r0 = r11.conversationId
            X.Opw r5 = r1.LJIIIZ(r0)
            if (r5 == 0) goto L12
            X.4Rq r0 = r5.getLastShowMessage()
            if (r0 != 0) goto L13
        L12:
            return
        L13:
            long r0 = r11.msgId
            X.4Rq r4 = X.C63150OqQ.LJIILIIL(r0)
            if (r4 != 0) goto L1c
            return
        L1c:
            r3 = 1
            r4.setDeleted(r3)
            X.4Rq r10 = r5.getLastShowMessage()
            java.lang.String r0 = r4.getUuid()
            boolean r9 = X.C63150OqQ.LJI(r0)
            long r7 = r4.getIndex()
            long r1 = r5.getReadIndex()
            r6 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto La0
            long r0 = X.C63133Oq9.LJ(r5)
            long r7 = r5.getUnreadCount()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L9e
            r2 = 1
        L46:
            r5.setUnreadCount(r0)
        L49:
            if (r9 == 0) goto L99
            java.lang.String r1 = r10.getUuid()
            java.lang.String r0 = r4.getUuid()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8e
            java.lang.String r0 = r11.conversationId
            X.4Rq r0 = X.C63150OqQ.LJIIJ(r0)
            r5.setLastShowMessage(r0)
        L62:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "ref_"
            r2.append(r0)
            long r0 = r11.msgId
            r2.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            X.4Rw r0 = X.EnumC109604Rw.DELETED
            LIZ(r1, r0)
            if (r3 == 0) goto L7e
            X.C63133Oq9.LJIJJLI(r5, r6)
        L7e:
            if (r9 == 0) goto L12
            X.Otk r2 = X.C63356Otk.LJIIIZ()
            Y.ARunnableS9S0210000_10 r1 = new Y.ARunnableS9S0210000_10
            r0 = 0
            r1.<init>(r5, r4, r3, r0)
            r2.LJIIJ(r1)
            goto L12
        L8e:
            java.lang.String r0 = r4.getUuid()
            boolean r0 = r5.removeMentionMessage(r0)
            if (r0 == 0) goto L99
            goto L62
        L99:
            if (r2 == 0) goto L9c
            goto L62
        L9c:
            r3 = 0
            goto L62
        L9e:
            r2 = 0
            goto L46
        La0:
            r2 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.link.handler.CommandMessage.LJ(com.bytedance.im.core.internal.link.handler.CommandMessage):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r18.version.longValue() > r13.getVersion()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (LIZIZ("s:invisible", r1, r11) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0409 A[Catch: Exception -> 0x0443, TryCatch #7 {Exception -> 0x0443, blocks: (B:153:0x03b5, B:155:0x03b9, B:157:0x03bf, B:159:0x03cb, B:161:0x0409, B:163:0x0414, B:166:0x042b, B:168:0x0434, B:170:0x0426, B:172:0x03da, B:174:0x03e0, B:176:0x03ec, B:177:0x03f2, B:179:0x03f8, B:180:0x0403), top: B:152:0x03b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153 A[Catch: Exception -> 0x018d, TRY_ENTER, TryCatch #2 {Exception -> 0x018d, blocks: (B:17:0x0064, B:19:0x0068, B:21:0x006e, B:23:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0092, B:30:0x00a2, B:32:0x00b0, B:34:0x00be, B:36:0x00c4, B:40:0x0120, B:42:0x0126, B:43:0x0129, B:45:0x012f, B:46:0x0132, B:48:0x0140, B:52:0x0153, B:55:0x0171, B:57:0x0103, B:59:0x0109, B:63:0x0110, B:66:0x00eb, B:68:0x00f1, B:72:0x00fc), top: B:16:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1 A[Catch: Exception -> 0x018d, TryCatch #2 {Exception -> 0x018d, blocks: (B:17:0x0064, B:19:0x0068, B:21:0x006e, B:23:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0092, B:30:0x00a2, B:32:0x00b0, B:34:0x00be, B:36:0x00c4, B:40:0x0120, B:42:0x0126, B:43:0x0129, B:45:0x012f, B:46:0x0132, B:48:0x0140, B:52:0x0153, B:55:0x0171, B:57:0x0103, B:59:0x0109, B:63:0x0110, B:66:0x00eb, B:68:0x00f1, B:72:0x00fc), top: B:16:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc A[Catch: Exception -> 0x018d, TryCatch #2 {Exception -> 0x018d, blocks: (B:17:0x0064, B:19:0x0068, B:21:0x006e, B:23:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0092, B:30:0x00a2, B:32:0x00b0, B:34:0x00be, B:36:0x00c4, B:40:0x0120, B:42:0x0126, B:43:0x0129, B:45:0x012f, B:46:0x0132, B:48:0x0140, B:52:0x0153, B:55:0x0171, B:57:0x0103, B:59:0x0109, B:63:0x0110, B:66:0x00eb, B:68:0x00f1, B:72:0x00fc), top: B:16:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.bytedance.im.core.proto.MessageBody r18) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.link.handler.CommandMessage.LJI(com.bytedance.im.core.proto.MessageBody):boolean");
    }

    public static void LJIIIIZZ(MessageBody messageBody) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandMessage handleViolative msg = ");
        LIZ.append(messageBody);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        try {
            if (!C63308Osy.LJI().LIZLLL().LJLJJLL) {
                return;
            }
            JSONObject jSONObject = new JSONObject(messageBody.content);
            long optLong = jSONObject.optLong("msg_id");
            JSONObject optJSONObject = jSONObject.optJSONObject("ext");
            HashMap hashMap = new HashMap();
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, (String) optJSONObject.get(next));
                }
            }
            C109544Rq LJIILIIL = C63150OqQ.LJIILIIL(optLong);
            if (LJIILIIL == null) {
                C63322OtC.LJI("CommandMessage handleViolative", "Cannot refresh a message from a message that doesn't exist", null);
                return;
            }
            if (LJIILIIL.isDeleted() || !hashMap.containsKey("a:is_violative") || Objects.equals(hashMap.get("a:is_violative"), LJIILIIL.getExt().get("a:is_violative"))) {
                return;
            }
            HashMap hashMap2 = new HashMap(LJIILIIL.getExt());
            for (Map.Entry entry : hashMap.entrySet()) {
                LJIILIIL.addExt((String) entry.getKey(), (String) entry.getValue());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LJIILIIL);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(LJIILIIL.getUuid(), hashMap2);
            if (C63150OqQ.LJJIII(LJIILIIL.getUuid(), LJIILIIL.getExt())) {
                C63309Osz.LIZLLL().LJIIL(hashMap3, -1, arrayList);
            }
            if (Objects.equals(hashMap.get("a:is_violative"), "true")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ref_");
                LIZ2.append(optLong);
                LIZ(X1D.LIZIZ(LIZ2), EnumC109604Rw.VIOLATIVE);
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ref_");
            LIZ3.append(optLong);
            LIZ(X1D.LIZIZ(LIZ3), EnumC109604Rw.AVAILABLE);
        } catch (Exception e) {
            C63322OtC.LJ("CommandMessage handleViolative", e);
        }
    }

    public static boolean LJIIIZ(MessageBody messageBody) {
        if (messageBody != null && messageBody.message_type.intValue() >= EnumC63179Oqt.MESSAGE_TYPE_COMMAND.getValue()) {
            return true;
        }
        return false;
    }

    public static void LJIIJ(CommandMessage commandMessage) {
        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(commandMessage.conversationId, false);
        if (LJIIIZ == null || commandMessage.readIndex <= LJIIIZ.getReadIndex()) {
            return;
        }
        C63291Osh.LIZ().getClass();
        if (commandMessage.readIndexV2 <= LJIIIZ.getReadIndexV2()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommandMessage markConversationRead readIndexV2 invalid, local:");
            LIZ.append(LJIIIZ.getReadIndexV2());
            LIZ.append(", server:");
            LIZ.append(commandMessage.readIndexV2);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
        }
        LJIIIZ.setReadIndex(commandMessage.readIndex);
        LJIIIZ.setReadIndexV2(commandMessage.readIndexV2);
        LJIIIZ.setReadBadgeCount(commandMessage.readBadgeCount);
        long LJ = C63133Oq9.LJ(LJIIIZ);
        if (LJ < 0) {
            LJ = 0;
        }
        LJIIIZ.setUnreadCount(LJ);
        if (LJ <= 0) {
            C63134OqA.LIZJ(commandMessage.conversationId);
            LJIIIZ.setUnreadSelfMentionedMessages(null);
        } else {
            LJIIIZ.setUnreadSelfMentionedMessages(C63134OqA.LJFF(commandMessage.readIndex, commandMessage.conversationId));
        }
        if (!C63133Oq9.LJIL(LJIIIZ)) {
            return;
        }
        String str = commandMessage.conversationId;
        long j = commandMessage.readIndex;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update msg set ");
        C0EH.LIZLLL(LIZ2, EnumC63154OqU.COLUMN_READ_STATUS.key, "=", 1, " where ");
        YE1.LIZLLL(LIZ2, EnumC63154OqU.COLUMN_CONVERSATION_ID.key, "='", str, "' and ");
        b0.LJ(LIZ2, EnumC63154OqU.COLUMN_INNER_INDEX.key, "<", j);
        C78847Ux1.LJIL(X1D.LIZIZ(LIZ2));
        C63356Otk.LJIIIZ().LJIIJ(new ARunnableS29S0200000_10(commandMessage, LJIIIZ, 9));
    }

    public static void LJIILJJIL(C109544Rq c109544Rq) {
        boolean z;
        boolean z2;
        List<Long> mentionIds;
        if (c109544Rq.isRecalled() && (mentionIds = c109544Rq.getMentionIds()) != null && !mentionIds.isEmpty()) {
            z = C63134OqA.LIZIZ(c109544Rq.getUuid());
        } else {
            z = false;
        }
        boolean z3 = true;
        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(c109544Rq.getConversationId(), true);
        if (LJIIIZ == null || LJIIIZ.getLastShowMessage() == null) {
            return;
        }
        long LJ = C63133Oq9.LJ(LJIIIZ);
        if (LJ != LJIIIZ.getUnreadCount()) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIIIZ.setUnreadCount(LJ);
        if (c109544Rq.getUuid().equals(LJIIIZ.getLastShowMessage().getUuid()) && c109544Rq.getIndex() > LJIIIZ.getLastMessageIndex()) {
            LJIIIZ.setLastShowMessage(c109544Rq);
            LJIIIZ.setLastMessageIndex(c109544Rq.getIndex());
        } else {
            z3 = z2;
        }
        C63133Oq9.LJIJJLI(LJIIIZ, false);
        C63356Otk.LJIIIZ().LJIIJ(new ARunnableS2S0220000_10(c109544Rq, z3, LJIIIZ, z, 0));
    }

    public static void LIZ(String str, EnumC109604Rw enumC109604Rw) {
        ArrayList arrayList = null;
        r3 = null;
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = new ArrayList();
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from message_kv where ");
                    LIZ.append(EnumC63175Oqp.COLUMN_KEY.key);
                    LIZ.append("=?");
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList2.add(new Pair(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63175Oqp.COLUMN_MSG_ID.key)), interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63175Oqp.COLUMN_VALUE.key))));
                    }
                } catch (Exception e) {
                    C63322OtC.LJ("IMMsgKvDaoget", e);
                    C16880lQ.LLLLIIL(e);
                    C63337OtR.LJFF(e);
                }
                C63143OqJ.LIZ(interfaceC63132Oq8);
                arrayList = arrayList2;
            } catch (Throwable th) {
                C63143OqJ.LIZ(interfaceC63132Oq8);
                throw th;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str2 = (String) pair.first;
                String str3 = (String) pair.second;
                try {
                    Gson gson = C63682Oz0.LIZ;
                    C63577OxJ newBuilder2 = ((ReferenceInfo) GsonProtectorUtils.fromJson(gson, str3, ReferenceInfo.class)).newBuilder2();
                    newBuilder2.LJI = enumC109604Rw;
                    ReferenceInfo build = newBuilder2.build();
                    C63172Oqm.LIZLLL(str2, str, GsonProtectorUtils.toJson(gson, build));
                    C109544Rq LJIILJJIL = C63150OqQ.LJIILJJIL(str2);
                    if (LJIILJJIL != null) {
                        LJIILJJIL.setRefMsg(build);
                        arrayList3.add(LJIILJJIL);
                    }
                } catch (s e2) {
                    C63322OtC.LJ("changeRefMsgListStatus json error", e2);
                }
            }
            if (!arrayList3.isEmpty()) {
                C63356Otk.LJIIIZ().LJIIJ(new ARunnableS46S0100000_10(arrayList3, 25));
            }
        }
    }

    public static C63120Opw LJFF(CommandMessage commandMessage, boolean z) {
        int i;
        if (!TextUtils.isEmpty(commandMessage.conversationId)) {
            C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(commandMessage.conversationId, true);
            List<Long> list = commandMessage.removedMembers;
            if (list != null && list.size() > 0) {
                String str = commandMessage.conversationId;
                List<Long> list2 = commandMessage.removedMembers;
                if (TextUtils.isEmpty(str) || list2 == null || list2.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (Long l : list2) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
                        LIZ.append("=? AND ");
                        if (C78847Ux1.LJIJJ("participant", JBR.LJFF(LIZ, EnumC63126Oq2.COLUMN_USER_ID.key, "=?", LIZ), new String[]{str, String.valueOf(l)})) {
                            i++;
                            if (!C63131Oq7.LIZ) {
                                C63127Oq3.LIZ();
                            }
                        }
                    }
                }
                if (LJIIIZ != null && i > 0) {
                    LJIIIZ.setMemberCount(Math.max(0, LJIIIZ.getMemberCount() - i));
                    if (z) {
                        LJIIIZ.setIsMember(false);
                    }
                    C63133Oq9.LJIJJLI(LJIIIZ, false);
                    return LJIIIZ;
                }
                return LJIIIZ;
            }
            return LJIIIZ;
        }
        return null;
    }

    public static void LJII(CommandMessage commandMessage, MessageBody messageBody) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommandMessage handleCommand:");
            LIZ.append(commandMessage.type);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            int i = commandMessage.type;
            if (i == 1) {
                LJIIJ(commandMessage);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    boolean z = false;
                    if (i != 4) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 100) {
                                        return;
                                    }
                                    C63308Osy.LJI().LIZIZ().LJ(commandMessage.action, commandMessage.conversationId);
                                    return;
                                }
                                C63192Or6.LJIILL(commandMessage.conversationId);
                                return;
                            }
                            List<Long> list = commandMessage.removedMembers;
                            if (list != null && list.contains(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()))) {
                                z = true;
                            }
                            C63120Opw LJFF = LJFF(commandMessage, z);
                            if (z) {
                                if (LJFF == null) {
                                    return;
                                }
                                C63356Otk.LJIIIZ().LJIIJ(new ARunnableS37S0100000_1(LJFF, 145));
                                C63308Osy.LJI().LIZLLL().getClass();
                                C63356Otk.LJIIIZ().LJIIJ(new ARunnableS37S0100000_1(LJFF, 146));
                                return;
                            }
                            LJIIL(commandMessage, messageBody, true);
                            C63309Osz.LIZLLL().LJIIIIZZ(LJFF);
                            return;
                        }
                        C63088OpQ LIZLLL = C63112Opo.LIZLLL(commandMessage.conversationId);
                        if (LIZLLL == null || LIZLLL.getVersion() >= commandMessage.groupVersion) {
                            return;
                        }
                        C63269OsL.LIZIZ(commandMessage.inboxType, messageBody);
                        return;
                    }
                    LJIIL(commandMessage, messageBody, false);
                    return;
                }
                LIZLLL(commandMessage);
                return;
            }
            LJ(commandMessage);
        } catch (Exception e) {
            C63337OtR.LJ("CommandMessage ", e);
            C63322OtC.LJ("CommandMessage handleCommand error", e);
        }
    }

    public static boolean LJIIJJI(C109544Rq c109544Rq, String str) {
        SendMessageCheck sendMessageCheck;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            sendMessageCheck = (SendMessageCheck) C63682Oz0.LIZ.LJI(str, SendMessageCheck.class);
        } catch (Exception e) {
            C63322OtC.LJ("CommandMessage updateCheck", e);
        }
        if (sendMessageCheck == null) {
            return false;
        }
        if (sendMessageCheck.checkCode != 0 && !TextUtils.equals(c109544Rq.getLocalExtValue("s:send_response_check_code"), String.valueOf(sendMessageCheck.checkCode))) {
            c109544Rq.addLocalExt("s:send_response_check_code", String.valueOf(sendMessageCheck.checkCode));
            z = true;
        }
        if (!TextUtils.isEmpty(sendMessageCheck.checkMsg) && !TextUtils.equals(c109544Rq.getLocalExtValue("s:send_response_check_msg"), sendMessageCheck.checkMsg)) {
            c109544Rq.addLocalExt("s:send_response_check_msg", sendMessageCheck.checkMsg);
            return true;
        }
        return z;
    }

    public static boolean LIZIZ(String str, String str2, Map map) {
        String str3;
        if (!map.containsKey(str) || (str3 = (String) map.get(str)) == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        return str3.contains(str2);
    }

    public static void LJIIL(CommandMessage commandMessage, MessageBody messageBody, boolean z) {
        C63090OpS LIZJ = C63113Opp.LIZJ(commandMessage.conversationId);
        if (LIZJ != null) {
            if (LIZJ.getVersion() < commandMessage.conversationVersion || z) {
                C63269OsL.LIZIZ(commandMessage.inboxType, messageBody);
                return;
            }
            return;
        }
        C47922IrO.LIZ();
    }

    public static void LJIILIIL(C109544Rq c109544Rq, Map<String, String> map, boolean z) {
        boolean z2;
        boolean z3;
        List<Long> mentionIds;
        if (c109544Rq.isRecalled() && (mentionIds = c109544Rq.getMentionIds()) != null && !mentionIds.isEmpty()) {
            z2 = C63134OqA.LIZIZ(c109544Rq.getUuid());
        } else {
            z2 = false;
        }
        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(c109544Rq.getConversationId(), true);
        if (LJIIIZ == null || LJIIIZ.getLastShowMessage() == null) {
            return;
        }
        long LJ = C63133Oq9.LJ(LJIIIZ);
        if (LJ != LJIIIZ.getUnreadCount()) {
            z3 = true;
        } else {
            z3 = false;
        }
        LJIIIZ.setUnreadCount(LJ);
        if (c109544Rq.getUuid().equals(LJIIIZ.getLastShowMessage().getUuid())) {
            LJIIIZ.setLastShowMessage(c109544Rq);
            z3 = true;
        }
        C63133Oq9.LJIJJLI(LJIIIZ, false);
        C63356Otk.LJIIIZ().LJIIJ(new RunnableC63173Oqn(c109544Rq, map, z, z3, z2, LJIIIZ));
    }
}
