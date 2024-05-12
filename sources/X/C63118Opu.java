package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.StrangerConversation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Opu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63118Opu implements InterfaceC63352Otg<List<C63120Opw>> {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // X.InterfaceC63352Otg
    public final List<C63120Opw> LIZIZ() {
        long j;
        String str;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        int i2;
        long j6;
        long j7;
        long j8;
        long j9;
        C109544Rq c109544Rq;
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerConversationHandler saveStrangerConversation start:");
        LIZ.append(this.LJLIL.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        for (StrangerConversation strangerConversation : this.LJLIL) {
            int i3 = this.LJLILLLLZI;
            C109544Rq c109544Rq2 = null;
            if (strangerConversation != null && !TextUtils.isEmpty(strangerConversation.conversation_id)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMConversationDao saveStrangerConversation:");
                LIZ2.append(strangerConversation.conversation_id);
                LIZ2.append(", inbox:");
                LIZ2.append(i3);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                int i4 = 0;
                C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(strangerConversation.conversation_id, false);
                C63195Or9 LJIJ = C63192Or6.LJIJ(strangerConversation.last_message, true, null, 1);
                if (LJIIIZ == null) {
                    C63322OtC.LJFF("IMConversationDao strangerConversation is new, insert");
                    LJIIIZ = new C63120Opw();
                    LJIIIZ.setConversationId(strangerConversation.conversation_id);
                    Long l = strangerConversation.conversation_short_id;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    LJIIIZ.setConversationShortId(j);
                    LJIIIZ.setConversationType(AbstractC63505Ow9.LIZ);
                    LJIIIZ.setMemberCount(2);
                    ArrayList arrayList2 = new ArrayList();
                    long uid = C63308Osy.LJI().LIZIZ().getUid();
                    arrayList2.add(Long.valueOf(uid));
                    arrayList2.add(Long.valueOf(C120014nN.LIZLLL(strangerConversation.conversation_id)));
                    LJIIIZ.setMemberIds(arrayList2);
                    LJIIIZ.setIsMember(true);
                    LJIIIZ.setInboxType(i3);
                    MessageBody messageBody = strangerConversation.last_message;
                    if (messageBody != null) {
                        java.util.Map<String, String> map = messageBody.ext;
                        if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty(messageBody.ext.get("s:client_message_id"))) {
                            str = messageBody.ext.get("s:client_message_id");
                        } else {
                            str = "";
                        }
                        c109544Rq2 = new C109544Rq();
                        c109544Rq2.setUuid(str);
                        Long l2 = messageBody.server_message_id;
                        if (l2 != null) {
                            j2 = l2.longValue();
                        } else {
                            j2 = 0;
                        }
                        c109544Rq2.setMsgId(j2);
                        c109544Rq2.setSecSender(messageBody.sec_sender);
                        Long l3 = messageBody.sender;
                        if (l3 != null) {
                            j3 = l3.longValue();
                        } else {
                            j3 = 0;
                        }
                        c109544Rq2.setSender(j3);
                        Long l4 = messageBody.create_time;
                        if (l4 != null) {
                            j4 = l4.longValue();
                        } else {
                            j4 = 0;
                        }
                        c109544Rq2.setCreatedAt(j4);
                        Integer num = messageBody.message_type;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        c109544Rq2.setMsgType(i);
                        c109544Rq2.setConversationId(messageBody.conversation_id);
                        Long l5 = messageBody.conversation_short_id;
                        if (l5 != null) {
                            j5 = l5.longValue();
                        } else {
                            j5 = 0;
                        }
                        c109544Rq2.setConversationShortId(j5);
                        Integer num2 = messageBody.conversation_type;
                        if (num2 != null) {
                            i2 = num2.intValue();
                        } else {
                            i2 = 0;
                        }
                        c109544Rq2.setConversationType(i2);
                        c109544Rq2.setContent(messageBody.content);
                        c109544Rq2.setContentPB(messageBody.content_pb);
                        c109544Rq2.setScene(messageBody.scene);
                        C63308Osy.LJI().LIZLLL().getClass();
                        c109544Rq2.setDeleted(0);
                        c109544Rq2.setMsgStatus(5);
                        Long l6 = messageBody.index_in_conversation;
                        if (l6 != null) {
                            j6 = l6.longValue();
                        } else {
                            j6 = 0;
                        }
                        c109544Rq2.setIndex(j6);
                        Long l7 = messageBody.order_in_conversation;
                        if (l7 != null) {
                            j7 = l7.longValue();
                        } else {
                            j7 = 0;
                        }
                        c109544Rq2.setOrderIndex(j7);
                        Long l8 = messageBody.index_in_conversation_v2;
                        if (l8 != null) {
                            j8 = l8.longValue();
                        } else {
                            j8 = 0;
                        }
                        c109544Rq2.setIndexInConversationV2(j8);
                        Integer num3 = messageBody.status;
                        if (num3 != null) {
                            i4 = num3.intValue();
                        }
                        c109544Rq2.setSvrStatus(i4);
                        c109544Rq2.updatePropertyFromServer(messageBody);
                        Long l9 = messageBody.version;
                        if (l9 != null) {
                            j9 = l9.longValue();
                        } else {
                            j9 = 0;
                        }
                        c109544Rq2.setVersion(j9);
                        c109544Rq2.setExt(messageBody.ext);
                        c109544Rq2.setReadStatus(1);
                        c109544Rq2.setSenderInfo(C63081OpJ.LJIILJJIL(messageBody.user_profile));
                    }
                    LJIIIZ.setLastShowMessage(c109544Rq2);
                    LJIIIZ.setLastMessageIndex(c109544Rq2.getIndex());
                    LJIIIZ.setLastMessageOrderIndex(c109544Rq2.getOrderIndex());
                    LJIIIZ.setMaxIndexV2(c109544Rq2.getIndexInConversationV2());
                    Integer num4 = strangerConversation.badge_count;
                    if (num4 != null) {
                        LJIIIZ.setBadgeCount(num4.intValue());
                    }
                    LJIIIZ.setUnreadCount(strangerConversation.unread.intValue());
                    if (C63308Osy.LJI().LIZLLL().LJJZ) {
                        SFS.LJJIJIIJI(LJIIIZ, c109544Rq2.getCreatedAt(), c109544Rq2);
                    }
                    LJIIIZ.setUpdatedTime(c109544Rq2.getCreatedAt());
                    LJIIIZ.setHasMore(true);
                    LJIIIZ.setStranger(true);
                    LJIIIZ.setFiltered(C63119Opv.LIZ(Long.valueOf(uid), strangerConversation.ext));
                    LJIIIZ.setSingleChatMembers(C63081OpJ.LJIILL(strangerConversation.conversation_id, strangerConversation.participants));
                    C63119Opv.LIZIZ(LJIIIZ, strangerConversation);
                    if (LJIJ != null && (c109544Rq = LJIJ.LIZ) != null) {
                        C63119Opv.LIZJ(LJIIIZ, c109544Rq);
                    }
                    C63133Oq9.LJIIZILJ(LJIIIZ);
                } else {
                    C63322OtC.LJFF("IMConversationDao strangerConversation already exist, update");
                    C63119Opv.LIZJ(LJIIIZ, C63150OqQ.LJIIJ(LJIIIZ.getConversationId()));
                    LJIIIZ.setUnreadCount(strangerConversation.unread.intValue());
                    LJIIIZ.setStranger(true);
                    LJIIIZ.setFiltered(C63119Opv.LIZ(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()), strangerConversation.ext));
                    C63119Opv.LIZIZ(LJIIIZ, strangerConversation);
                    C63133Oq9.LJIJJLI(LJIIIZ, true);
                }
                arrayList.add(LJIIIZ);
                if (C63308Osy.LJI().LIZLLL().LJLJJL) {
                    C63139OqF.LIZ(C63139OqF.LIZ);
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("StrangerConversationHandler saveStrangerConversation end:");
        LIZ3.append(arrayList.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        return arrayList;
    }

    public C63118Opu(List list, int i) {
        this.LJLIL = list;
        this.LJLILLLLZI = i;
    }
}
