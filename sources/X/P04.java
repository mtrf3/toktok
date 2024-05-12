package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.bytedance.im.core.proto.TokenInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P04 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OxL] */
    public static MessageBody LIZ(MessageBody messageBody) {
        ?? newBuilder2 = messageBody.newBuilder2();
        ReferenceInfo referenceInfo = null;
        newBuilder2.LJIIJ = null;
        newBuilder2.LJIL = C64537PUn.EMPTY;
        ReferenceInfo referenceInfo2 = messageBody.reference_info;
        if (referenceInfo2 != null) {
            C63577OxJ newBuilder22 = referenceInfo2.newBuilder2();
            newBuilder22.LJ = null;
            referenceInfo = newBuilder22.build();
        }
        newBuilder2.LJIJJ = referenceInfo;
        return newBuilder2.build();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.P0U] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.YXz] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.P0x] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Owk] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Z8v] */
    public static Request LIZIZ(Request request) {
        TokenInfo tokenInfo;
        RequestBody requestBody;
        ?? newBuilder2;
        SendMessageRequestBody sendMessageRequestBody;
        SendMessageP2PRequestBody sendMessageP2PRequestBody;
        ReferencedMessageInfo referencedMessageInfo;
        ?? newBuilder22;
        if (!C63308Osy.LJI().LIZLLL().LIZLLL) {
            return request;
        }
        TokenInfo tokenInfo2 = request.token_info;
        if (tokenInfo2 != null && (newBuilder22 = tokenInfo2.newBuilder2()) != 0) {
            newBuilder22.LJFF = null;
            tokenInfo = newBuilder22.build();
        } else {
            tokenInfo = null;
        }
        RequestBody requestBody2 = request.body;
        if (requestBody2 != null && (newBuilder2 = requestBody2.newBuilder2()) != 0) {
            SendMessageRequestBody sendMessageRequestBody2 = requestBody2.send_message_body;
            if (sendMessageRequestBody2 != null) {
                ?? newBuilder23 = sendMessageRequestBody2.newBuilder2();
                newBuilder23.LJI = null;
                newBuilder23.LJIILL = C64537PUn.EMPTY;
                ReferencedMessageInfo referencedMessageInfo2 = sendMessageRequestBody2.ref_msg_info;
                if (referencedMessageInfo2 != null) {
                    C63547Owp newBuilder24 = referencedMessageInfo2.newBuilder2();
                    newBuilder24.LJ = null;
                    referencedMessageInfo = newBuilder24.build();
                } else {
                    referencedMessageInfo = null;
                }
                newBuilder23.LJIILIIL = referencedMessageInfo;
                sendMessageRequestBody = newBuilder23.build();
            } else {
                sendMessageRequestBody = null;
            }
            newBuilder2.LIZLLL = sendMessageRequestBody;
            SendMessageP2PRequestBody sendMessageP2PRequestBody2 = requestBody2.send_message_p2p_body;
            if (sendMessageP2PRequestBody2 != null) {
                ?? newBuilder25 = sendMessageP2PRequestBody2.newBuilder2();
                newBuilder25.LJIIJ = null;
                sendMessageP2PRequestBody = newBuilder25.build();
            } else {
                sendMessageP2PRequestBody = null;
            }
            newBuilder2.LJJLIIIJJI = sendMessageP2PRequestBody;
            requestBody = newBuilder2.build();
        } else {
            requestBody = null;
        }
        ?? newBuilder26 = request.newBuilder2();
        newBuilder26.LJIJI = tokenInfo;
        newBuilder26.LJIIJ = requestBody;
        newBuilder26.LJIIL = null;
        newBuilder26.LJIIJJI = null;
        newBuilder26.LJIILIIL = null;
        newBuilder26.LJIILJJIL = null;
        newBuilder26.LJIILL = null;
        newBuilder26.LJI = null;
        return newBuilder26.build();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.OyX] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.P03] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.P14] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.P03] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.P0M] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.P06] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Z8w] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.P0Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.P0O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.P0E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, X.P0I] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, X.P08] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, X.P0G] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, X.P0K] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.P0C, java.lang.Object] */
    public static Response LIZJ(Response response) {
        ?? newBuilder2;
        NewMessageNotify newMessageNotify;
        MessagesPerUserResponseBody messagesPerUserResponseBody;
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody;
        MessagesInConversationResponseBody messagesInConversationResponseBody;
        GetStrangerMessagesResponseBody getStrangerMessagesResponseBody;
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody;
        GetRecentMessageRespBody getRecentMessageRespBody;
        GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody;
        ArrayList arrayList;
        MessageInfo messageInfo;
        MessageBody messageBody;
        ArrayList arrayList2;
        ConversationRecentMessage conversationRecentMessage;
        ArrayList arrayList3;
        MessageBody messageBody2;
        ArrayList arrayList4;
        StrangerConversation strangerConversation;
        MessageBody messageBody3;
        ArrayList arrayList5;
        MessageBody messageBody4;
        ArrayList arrayList6;
        MessageBody messageBody5;
        ArrayList arrayList7;
        MessageBody messageBody6;
        ArrayList arrayList8;
        MessageBody messageBody7;
        MessageBody messageBody8;
        if (!C63308Osy.LJI().LIZLLL().LIZLLL) {
            return response;
        }
        ResponseBody responseBody = response.body;
        ResponseBody responseBody2 = null;
        MessageBody messageBody9 = null;
        MessageInfo messageInfo2 = null;
        GetMessageByIdResponseBody getMessageByIdResponseBody = null;
        responseBody2 = null;
        if (responseBody != null && (newBuilder2 = responseBody.newBuilder2()) != 0) {
            NewMessageNotify newMessageNotify2 = responseBody.has_new_message_notify;
            if (newMessageNotify2 != null) {
                ?? newBuilder22 = newMessageNotify2.newBuilder2();
                MessageBody messageBody10 = newMessageNotify2.message;
                if (messageBody10 != null) {
                    messageBody8 = LIZ(messageBody10);
                } else {
                    messageBody8 = null;
                }
                newBuilder22.LJI = messageBody8;
                newMessageNotify = newBuilder22.build();
            } else {
                newMessageNotify = null;
            }
            newBuilder2.LJIILL = newMessageNotify;
            MessagesPerUserResponseBody messagesPerUserResponseBody2 = responseBody.messages_per_user_body;
            if (messagesPerUserResponseBody2 != null) {
                ?? newBuilder23 = messagesPerUserResponseBody2.newBuilder2();
                List<MessageBody> list = messagesPerUserResponseBody2.messages;
                if (list != null) {
                    arrayList8 = new ArrayList(C32I.LJJL(list, 10));
                    for (MessageBody messageBody11 : list) {
                        if (messageBody11 != null) {
                            messageBody7 = LIZ(messageBody11);
                        } else {
                            messageBody7 = null;
                        }
                        arrayList8.add(messageBody7);
                    }
                } else {
                    arrayList8 = null;
                }
                newBuilder23.getClass();
                C63685Oz3.LIZ(arrayList8);
                newBuilder23.LIZLLL = arrayList8;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                C63685Oz3.LIZ(c61878OQg);
                newBuilder23.LJIIJ = c61878OQg;
                messagesPerUserResponseBody = newBuilder23.build();
            } else {
                messagesPerUserResponseBody = null;
            }
            newBuilder2.LJ = messagesPerUserResponseBody;
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = responseBody.messages_per_user_init_v2_body;
            if (messagesPerUserInitV2ResponseBody2 != null) {
                ?? newBuilder24 = messagesPerUserInitV2ResponseBody2.newBuilder2();
                List<MessageBody> list2 = messagesPerUserInitV2ResponseBody2.messages;
                if (list2 != null) {
                    arrayList7 = new ArrayList(C32I.LJJL(list2, 10));
                    for (MessageBody messageBody12 : list2) {
                        if (messageBody12 != null) {
                            messageBody6 = LIZ(messageBody12);
                        } else {
                            messageBody6 = null;
                        }
                        arrayList7.add(messageBody6);
                    }
                } else {
                    arrayList7 = null;
                }
                newBuilder24.getClass();
                C63685Oz3.LIZ(arrayList7);
                newBuilder24.LIZLLL = arrayList7;
                C61878OQg c61878OQg2 = C61878OQg.INSTANCE;
                C63685Oz3.LIZ(c61878OQg2);
                newBuilder24.LJIIJJI = c61878OQg2;
                messagesPerUserInitV2ResponseBody = newBuilder24.build();
            } else {
                messagesPerUserInitV2ResponseBody = null;
            }
            newBuilder2.LJFF = messagesPerUserInitV2ResponseBody;
            MessagesInConversationResponseBody messagesInConversationResponseBody2 = responseBody.messages_in_conversation_body;
            if (messagesInConversationResponseBody2 != null) {
                ?? newBuilder25 = messagesInConversationResponseBody2.newBuilder2();
                List<MessageBody> list3 = messagesInConversationResponseBody2.messages;
                if (list3 != null) {
                    arrayList6 = new ArrayList(C32I.LJJL(list3, 10));
                    for (MessageBody messageBody13 : list3) {
                        if (messageBody13 != null) {
                            messageBody5 = LIZ(messageBody13);
                        } else {
                            messageBody5 = null;
                        }
                        arrayList6.add(messageBody5);
                    }
                } else {
                    arrayList6 = null;
                }
                newBuilder25.getClass();
                C63685Oz3.LIZ(arrayList6);
                newBuilder25.LIZLLL = arrayList6;
                C61878OQg c61878OQg3 = C61878OQg.INSTANCE;
                C63685Oz3.LIZ(c61878OQg3);
                newBuilder25.LJI = c61878OQg3;
                messagesInConversationResponseBody = newBuilder25.build();
            } else {
                messagesInConversationResponseBody = null;
            }
            newBuilder2.LJIIJ = messagesInConversationResponseBody;
            GetStrangerMessagesResponseBody getStrangerMessagesResponseBody2 = responseBody.get_stranger_messages_body;
            if (getStrangerMessagesResponseBody2 != null) {
                ?? newBuilder26 = getStrangerMessagesResponseBody2.newBuilder2();
                List<MessageBody> list4 = getStrangerMessagesResponseBody2.messages;
                if (list4 != null) {
                    arrayList5 = new ArrayList(C32I.LJJL(list4, 10));
                    for (MessageBody messageBody14 : list4) {
                        if (messageBody14 != null) {
                            messageBody4 = LIZ(messageBody14);
                        } else {
                            messageBody4 = null;
                        }
                        arrayList5.add(messageBody4);
                    }
                } else {
                    arrayList5 = null;
                }
                newBuilder26.getClass();
                C63685Oz3.LIZ(arrayList5);
                newBuilder26.LIZLLL = arrayList5;
                getStrangerMessagesResponseBody = newBuilder26.build();
            } else {
                getStrangerMessagesResponseBody = null;
            }
            newBuilder2.LJJJJ = getStrangerMessagesResponseBody;
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody2 = responseBody.get_stranger_conversation_body;
            if (getStrangerConversationListResponseBody2 != null) {
                ?? newBuilder27 = getStrangerConversationListResponseBody2.newBuilder2();
                List<StrangerConversation> list5 = getStrangerConversationListResponseBody2.conversation_list;
                if (list5 != null) {
                    arrayList4 = new ArrayList(C32I.LJJL(list5, 10));
                    for (StrangerConversation strangerConversation2 : list5) {
                        if (strangerConversation2 != null) {
                            ?? newBuilder28 = strangerConversation2.newBuilder2();
                            MessageBody messageBody15 = strangerConversation2.last_message;
                            if (messageBody15 != null) {
                                messageBody3 = LIZ(messageBody15);
                            } else {
                                messageBody3 = null;
                            }
                            newBuilder28.LJFF = messageBody3;
                            strangerConversation = newBuilder28.build();
                        } else {
                            strangerConversation = null;
                        }
                        arrayList4.add(strangerConversation);
                    }
                } else {
                    arrayList4 = null;
                }
                newBuilder27.getClass();
                C63685Oz3.LIZ(arrayList4);
                newBuilder27.LJI = arrayList4;
                getStrangerConversationListResponseBody = newBuilder27.build();
            } else {
                getStrangerConversationListResponseBody = null;
            }
            newBuilder2.LJJJIL = getStrangerConversationListResponseBody;
            GetRecentMessageRespBody getRecentMessageRespBody2 = responseBody.get_recent_message_body;
            if (getRecentMessageRespBody2 != null) {
                ?? newBuilder29 = getRecentMessageRespBody2.newBuilder2();
                List<ConversationRecentMessage> list6 = getRecentMessageRespBody2.messages;
                if (list6 != null) {
                    arrayList2 = new ArrayList(C32I.LJJL(list6, 10));
                    for (ConversationRecentMessage conversationRecentMessage2 : list6) {
                        if (conversationRecentMessage2 != null) {
                            ?? newBuilder210 = conversationRecentMessage2.newBuilder2();
                            List<MessageBody> list7 = conversationRecentMessage2.messages;
                            if (list7 != null) {
                                arrayList3 = new ArrayList(C32I.LJJL(list7, 10));
                                for (MessageBody messageBody16 : list7) {
                                    if (messageBody16 != null) {
                                        messageBody2 = LIZ(messageBody16);
                                    } else {
                                        messageBody2 = null;
                                    }
                                    arrayList3.add(messageBody2);
                                }
                            } else {
                                arrayList3 = null;
                            }
                            newBuilder210.getClass();
                            C63685Oz3.LIZ(arrayList3);
                            newBuilder210.LJ = arrayList3;
                            conversationRecentMessage = newBuilder210.build();
                        } else {
                            conversationRecentMessage = null;
                        }
                        arrayList2.add(conversationRecentMessage);
                    }
                } else {
                    arrayList2 = null;
                }
                newBuilder29.getClass();
                C63685Oz3.LIZ(arrayList2);
                newBuilder29.LJ = arrayList2;
                getRecentMessageRespBody = newBuilder29.build();
            } else {
                getRecentMessageRespBody = null;
            }
            newBuilder2.LJJLIIIJLLLLLLLZ = getRecentMessageRespBody;
            GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody2 = responseBody.get_message_info_by_index_v2_range_body;
            if (getMessageInfoByIndexV2RangeResponseBody2 != null) {
                ?? newBuilder211 = getMessageInfoByIndexV2RangeResponseBody2.newBuilder2();
                List<MessageInfo> list8 = getMessageInfoByIndexV2RangeResponseBody2.infos;
                if (list8 != null) {
                    arrayList = new ArrayList(C32I.LJJL(list8, 10));
                    for (MessageInfo messageInfo3 : list8) {
                        if (messageInfo3 != null) {
                            ?? newBuilder212 = messageInfo3.newBuilder2();
                            MessageBody messageBody17 = messageInfo3.body;
                            if (messageBody17 != null) {
                                messageBody = LIZ(messageBody17);
                            } else {
                                messageBody = null;
                            }
                            newBuilder212.LJ = messageBody;
                            messageInfo = newBuilder212.build();
                        } else {
                            messageInfo = null;
                        }
                        arrayList.add(messageInfo);
                    }
                } else {
                    arrayList = null;
                }
                newBuilder211.getClass();
                C63685Oz3.LIZ(arrayList);
                newBuilder211.LIZLLL = arrayList;
                getMessageInfoByIndexV2RangeResponseBody = newBuilder211.build();
            } else {
                getMessageInfoByIndexV2RangeResponseBody = null;
            }
            newBuilder2.LJJLIL = getMessageInfoByIndexV2RangeResponseBody;
            GetMessageByIdResponseBody getMessageByIdResponseBody2 = responseBody.get_message_by_id_body;
            if (getMessageByIdResponseBody2 != null) {
                ?? newBuilder213 = getMessageByIdResponseBody2.newBuilder2();
                MessageInfo messageInfo4 = getMessageByIdResponseBody2.msg_info;
                if (messageInfo4 != null) {
                    ?? newBuilder214 = messageInfo4.newBuilder2();
                    MessageBody messageBody18 = messageInfo4.body;
                    if (messageBody18 != null) {
                        messageBody9 = LIZ(messageBody18);
                    }
                    newBuilder214.LJ = messageBody9;
                    messageInfo2 = newBuilder214.build();
                }
                newBuilder213.LIZLLL = messageInfo2;
                getMessageByIdResponseBody = newBuilder213.build();
            }
            newBuilder2.LJIIIZ = getMessageByIdResponseBody;
            responseBody2 = newBuilder2.build();
        }
        ?? newBuilder215 = response.newBuilder2();
        newBuilder215.LJIIIIZZ = responseBody2;
        return newBuilder215.build();
    }

    public static final void LIZLLL(int i, String logBefore, Request request) {
        o.LJIIIZ(logBefore, "logBefore");
        try {
            if (C63312Ot2.LIZIZ(Integer.valueOf(i))) {
                return;
            }
            Request LIZIZ = LIZIZ(request);
            if (logBefore.length() > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PBLogUtils ");
                LIZ.append(logBefore);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PBLogUtils Request : ");
            LIZ2.append(LIZIZ);
            C63322OtC.LJII(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PBLogUtils ");
            LIZ3.append(e);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
        }
    }

    public static final void LJ(int i, String logBefore, Response response) {
        o.LJIIIZ(logBefore, "logBefore");
        o.LJIIIZ(response, "response");
        try {
            if (C63312Ot2.LIZIZ(Integer.valueOf(i))) {
                return;
            }
            Response LIZJ = LIZJ(response);
            if (logBefore.length() > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PBLogUtils ");
                LIZ.append(logBefore);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PBLogUtils Response : ");
            LIZ2.append(LIZJ);
            C63322OtC.LJII(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PBLogUtils ");
            LIZ3.append(e);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
        }
    }
}
