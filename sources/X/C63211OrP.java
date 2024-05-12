package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.internal.link.handler.CommandMessage;
import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OrP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63211OrP implements InterfaceC63352Otg<java.util.Map<String, List<C109544Rq>>> {
    public final /* synthetic */ MessagesPerUserResponseBody LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C63281OsX LJLJJL;

    @Override // X.InterfaceC63352Otg
    public final java.util.Map<String, List<C109544Rq>> LIZIZ() {
        int i;
        int badgeCount;
        C109544Rq c109544Rq;
        MessagesPerUserResponseBody messagesPerUserResponseBody = this.LJLIL;
        Long l = messagesPerUserResponseBody.next_cursor;
        Long l2 = messagesPerUserResponseBody.next_conversation_version;
        List<MessageBody> LJIJ = C73994T2g.LJIJ(messagesPerUserResponseBody, this.LJLILLLLZI.LJIIIIZZ(), "GetMsgByUserHandler ");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetMsgByUserHandler saveMsg, messages:");
        LIZ.append(LJIJ.size());
        LIZ.append(", hasMore:");
        LIZ.append(this.LJLJI);
        LIZ.append(", nextCursor:");
        LIZ.append(l);
        LIZ.append(", nextVersion:");
        LIZ.append(l2);
        LIZ.append(", seqId:");
        LIZ.append(this.LJLJJI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GetMsgByUserHandler saveMsg, Task onRun, seqId:");
        LIZ2.append(this.LJLJJI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        try {
            C78847Ux1.LJJLIIIJJI("GetMsgByUserHandler.saveMsg(List)");
            long uptimeMillis = SystemClock.uptimeMillis();
            int i2 = 0;
            int i3 = 0;
            for (MessageBody messageBody : LJIJ) {
                if (CommandMessage.LJIIIZ(messageBody)) {
                    i2++;
                } else {
                    i3++;
                }
                if (C115394fv.LJIIIIZZ(messageBody)) {
                    C115394fv.LJII().LJI(this.LJLJJL.LIZJ, messageBody);
                } else {
                    String str = messageBody.conversation_id;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("s:msg_get_by_pull", "1");
                    hashMap2.put("s:get_msg_log_id", this.LJLILLLLZI.LJIIIIZZ());
                    C63195Or9 LJIJ2 = C63192Or6.LJIJ(messageBody, z, hashMap2, 3);
                    if (LJIJ2 != null && (c109544Rq = LJIJ2.LIZ) != null) {
                        if (LJIJ2.LIZIZ && !LJIJ2.LIZJ && !c109544Rq.invalid()) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("GetMsgByUserHandler saveMsg new msg failed, uuid:");
                            LIZ3.append(c109544Rq.getUuid());
                            LIZ3.append(", svrId:");
                            LIZ3.append(c109544Rq.getMsgId());
                            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
                            this.LJLJJL.LJIIZILJ();
                        }
                        if (hashMap.containsKey(str)) {
                            ((List) hashMap.get(str)).add(c109544Rq);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c109544Rq);
                            hashMap.put(str, arrayList2);
                        }
                        arrayList.add(LJIJ2.LIZ);
                        if (this.LJLJJL.LJ != 0) {
                            C63193Or7 LIZ4 = C63198OrC.LIZ(c109544Rq.getMsgId());
                            LIZ4.LIZIZ = c109544Rq.getCreatedAt();
                            C63281OsX c63281OsX = this.LJLJJL;
                            LIZ4.LIZLLL = c63281OsX.LJIJJ;
                            LIZ4.LJII = c63281OsX.LJ;
                            LIZ4.LIZJ = c109544Rq.getCreatedAt();
                            LIZ4.LJ = LIZ4.LIZLLL - LIZ4.LIZIZ;
                            LIZ4.LJIIIZ = false;
                            String LJIIIIZZ = this.LJLJJL.LJIJJLI.LJIIIIZZ();
                            o.LJIIIZ(LJIIIIZZ, "<set-?>");
                            LIZ4.LJIIJ = LJIIIIZZ;
                        }
                    }
                }
                z = false;
            }
            C63281OsX c63281OsX2 = this.LJLJJL;
            c63281OsX2.LJIIIIZZ += i2;
            c63281OsX2.LJII += i3;
            c63281OsX2.LJIIIZ += hashMap.size();
            C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
            C63622Oy2 c63622Oy2 = this.LJLILLLLZI;
            EnumC63359Otn enumC63359Otn = EnumC63359Otn.MSG_RECEIVE_BY_USER;
            LJIIIZ.getClass();
            C63356Otk.LIZJ(c63622Oy2, arrayList, enumC63359Otn);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", LJIJ.size());
                jSONObject.put("msg_source", 3);
                C63337OtR.LIZLLL("im_save_msg_list_duration", jSONObject);
            } catch (Exception unused) {
            }
            this.LJLJJL.LJIILL += SystemClock.uptimeMillis() - uptimeMillis;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            C63281OsX c63281OsX3 = this.LJLJJL;
            MessagesPerUserResponseBody messagesPerUserResponseBody2 = this.LJLIL;
            c63281OsX3.getClass();
            HashMap hashMap3 = new HashMap();
            List<ConversationBadgeCountInfo> list = messagesPerUserResponseBody2.conversation_badge_count;
            if (list != null) {
                for (ConversationBadgeCountInfo conversationBadgeCountInfo : list) {
                    if (conversationBadgeCountInfo != null && !TextUtils.isEmpty(conversationBadgeCountInfo.conversation_id) && conversationBadgeCountInfo.badge_count != null) {
                        hashMap3.put(conversationBadgeCountInfo.conversation_id, conversationBadgeCountInfo);
                    }
                }
            }
            for (String str2 : hashMap.keySet()) {
                List list2 = (List) hashMap.get(str2);
                if (list2 != null && !list2.isEmpty()) {
                    C109544Rq c109544Rq2 = (C109544Rq) ListProtector.get(list2, list2.size() - 1);
                    C63120Opw LJIIIZ2 = C63133Oq9.LJIIIZ(str2, true);
                    if (LJIIIZ2 != null && !LJIIIZ2.isWaitingInfo()) {
                        if (!LJIIIZ2.isReadBadgeCountUpdated()) {
                            C63291Osh.LIZ().getClass();
                        }
                        long unreadCount = LJIIIZ2.getUnreadCount();
                        ConversationBadgeCountInfo conversationBadgeCountInfo2 = (ConversationBadgeCountInfo) hashMap3.get(str2);
                        if (conversationBadgeCountInfo2 != null) {
                            badgeCount = conversationBadgeCountInfo2.badge_count.intValue();
                        } else {
                            badgeCount = LJIIIZ2.getBadgeCount();
                        }
                        C63192Or6.LJIJI(LJIIIZ2, c109544Rq2, Integer.valueOf(badgeCount));
                        this.LJLJJL.LJIIJ = (int) (r1.LJIIJ + (LJIIIZ2.getUnreadCount() - unreadCount));
                    } else {
                        if (LJIIIZ2 == null && c109544Rq2 != null) {
                            ConversationBadgeCountInfo conversationBadgeCountInfo3 = (ConversationBadgeCountInfo) hashMap3.get(str2);
                            if (conversationBadgeCountInfo3 != null) {
                                i = conversationBadgeCountInfo3.badge_count.intValue();
                            } else {
                                i = 0;
                            }
                            C63308Osy.LJI().LIZLLL().getClass();
                            C63120Opw LJIJJ = C63217OrV.LJIJJ(c109544Rq2.getConversationId(), c109544Rq2.getConversationShortId(), c109544Rq2.getCreatedAt(), this.LJLJJL.LIZJ, c109544Rq2.getConversationType(), i);
                            if (LJIJJ != null) {
                                C115284fk.LJIILIIL().LJJII(LJIJJ);
                            }
                        }
                        C63269OsL.LIZ(this.LJLJJL.LIZJ, c109544Rq2);
                    }
                }
            }
            this.LJLJJL.LJIILLIIL += SystemClock.uptimeMillis() - uptimeMillis2;
            C63281OsX c63281OsX4 = this.LJLJJL;
            c63281OsX4.LJIILLIIL(this.LJLIL, c63281OsX4.LJI, "", this.LJLILLLLZI.LJIIIIZZ());
            C78847Ux1.LJIJJLI("GetMsgByUserHandler.saveMsg(List)", true);
        } catch (Exception e) {
            C63322OtC.LJ("GetMsgByUserHandler saveMsg error", e);
            C78847Ux1.LJIJJLI("GetMsgByUserHandler.saveMsg(List)", false);
            this.LJLJJL.LJIIZILJ();
            C63272OsO.LJIIL(3, e);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("exception", e.toString());
            C63275OsR.LIZIZ().LIZLLL(EnumC63665Oyj.COUNTER, "mix_link_msg_handle_fail", hashMap4);
            this.LJLJJL.LJIILLIIL(this.LJLIL, false, e.toString(), this.LJLILLLLZI.LJIIIIZZ());
        }
        C63281OsX c63281OsX5 = this.LJLJJL;
        if (!c63281OsX5.LJI) {
            MessagesPerUserResponseBody messagesPerUserResponseBody3 = this.LJLIL;
            C63291Osh LIZ5 = C63291Osh.LIZ();
            int i4 = c63281OsX5.LIZJ;
            long longValue = messagesPerUserResponseBody3.next_cursor.longValue();
            LIZ5.getClass();
            C63291Osh.LJIIJJI(i4, longValue);
            C63291Osh LIZ6 = C63291Osh.LIZ();
            int i5 = c63281OsX5.LIZJ;
            LIZ6.getClass();
            long LJI = C63291Osh.LJI(i5);
            Long l3 = messagesPerUserResponseBody3.next_conversation_version;
            if (l3 != null && l3.longValue() > LJI) {
                C63291Osh LIZ7 = C63291Osh.LIZ();
                int i6 = c63281OsX5.LIZJ;
                long longValue2 = messagesPerUserResponseBody3.next_conversation_version.longValue();
                LIZ7.getClass();
                C63291Osh.LJIILJJIL(i6, longValue2);
            } else {
                StringBuilder LIZJ = V10.LIZJ("GetMsgByUserHandler updateCursor version invalid, local:", LJI, ", next:");
                LIZJ.append(messagesPerUserResponseBody3.next_conversation_version);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZJ));
            }
            C63291Osh LIZ8 = C63291Osh.LIZ();
            int i7 = c63281OsX5.LIZJ;
            LIZ8.getClass();
            long LIZJ2 = C63291Osh.LIZJ(i7);
            Long l4 = messagesPerUserResponseBody3.next_cmd_index;
            if (l4 != null && l4.longValue() > LIZJ2) {
                C63291Osh LIZ9 = C63291Osh.LIZ();
                int i8 = c63281OsX5.LIZJ;
                long longValue3 = messagesPerUserResponseBody3.next_cmd_index.longValue();
                LIZ9.getClass();
                C63291Osh.LJIIJ(i8, longValue3);
            } else {
                StringBuilder LIZJ3 = V10.LIZJ("GetMsgByUserHandler updateCursor cmd_index invalid, local:", LIZJ2, ", next:");
                LIZJ3.append(messagesPerUserResponseBody3.next_cmd_index);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZJ3));
            }
        }
        return hashMap;
    }

    public C63211OrP(C63281OsX c63281OsX, MessagesPerUserResponseBody messagesPerUserResponseBody, C63622Oy2 c63622Oy2, Boolean bool, long j) {
        this.LJLJJL = c63281OsX;
        this.LJLIL = messagesPerUserResponseBody;
        this.LJLILLLLZI = c63622Oy2;
        this.LJLJI = bool;
        this.LJLJJI = j;
    }
}
