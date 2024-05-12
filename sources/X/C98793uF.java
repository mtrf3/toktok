package X;

import android.app.Activity;
import android.net.Uri;
import com.google.gson.m;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.3uF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98793uF {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZJ() {
        String LIZ2 = C80763Ey.LIZ(false);
        LIZ2.toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (o.LJ(LIZ2, "-1")) {
            return currentTimeMillis;
        }
        int length = C61845OOz.LIZ(LIZ2, currentTimeMillis).length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j = ((j * 10) + (r6.charAt(i) - '0')) % Long.MAX_VALUE;
        }
        return Math.abs(j);
    }

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (LIZIZ((C109544Rq) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean LIZIZ(C109544Rq message) {
        int msgType;
        o.LJIIIZ(message, "message");
        if (C93793mB.LJIIZILJ(message) || (msgType = message.getMsgType()) == -1 || msgType == 1 || msgType == 15 || msgType == 1026 || msgType == 1037 || msgType == 4000 || msgType == 1022 || msgType == 1023 || msgType == 1030 || msgType == 1031) {
            return false;
        }
        if (message.getMsgStatus() != 5 && message.getMsgStatus() != 2) {
            return false;
        }
        return true;
    }

    public static String LJFF(IMUser iMUser) {
        String shortId;
        if (iMUser == null) {
            return "";
        }
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            shortId = iMUser.getShortId();
            if (shortId == null) {
                shortId = "";
            }
        } else {
            shortId = iMUser.getUniqueId();
            if (shortId == null) {
                return "";
            }
        }
        return shortId;
    }

    public static void LJ(ActivityC45651qj activity, C98803uG c98803uG, List selectMsgList) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(selectMsgList, "selectMsgList");
        String entrance = c98803uG.getEntrance();
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("owner_id", c98803uG.getOwnerId()).appendQueryParameter("report_type", c98803uG.getReportType());
        String enterFrom = c98803uG.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "im";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("enter_from", enterFrom).appendQueryParameter("object_id", c98803uG.getObjectId()).appendQueryParameter("entrance", entrance);
        if (c98803uG.getChatType() == 3) {
            appendQueryParameter2.appendQueryParameter("con_short_id", c98803uG.getConversationId());
            appendQueryParameter2.appendQueryParameter("conversation_name", c98803uG.getConversationName());
        }
        m mVar = new m();
        mVar.LJJIIZ("conversation_id", c98803uG.getConversationId());
        ArrayList arrayList = new ArrayList(C32I.LJJL(selectMsgList, 10));
        Iterator it = selectMsgList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((C109544Rq) it.next()).getMsgId()));
        }
        mVar.LJJIIZ("msg_list", ORZ.LLD(arrayList, ",", null, null, null, 62));
        String uniqueId = c98803uG.getUniqueId();
        if (uniqueId != null) {
            mVar.LJJIIZ("unique_id", uniqueId);
        }
        Boolean isBlocked = c98803uG.isBlocked();
        if (isBlocked != null) {
            mVar.LJJIII(Boolean.valueOf(isBlocked.booleanValue()), "is_blocked");
        }
        appendQueryParameter2.appendQueryParameter("extra", C62070OXq.LIZIZ(mVar));
        a.LJIILLIIL().LIZIZ(activity, appendQueryParameter2);
    }

    public static void LIZLLL(InterfaceC91483iS builder, Activity activity, String str, C109544Rq c109544Rq, int i) {
        boolean z;
        InterfaceC99713vj interfaceC99713vj;
        String str2;
        List<C109544Rq> LJ;
        int i2;
        C109544Rq c109544Rq2 = c109544Rq;
        if ((i & 8) != 0) {
            c109544Rq2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(builder, "builder");
        o.LJIIIZ(activity, "activity");
        C98803uG LIZ2 = builder.LIZ();
        if (LIZ2 == null) {
            return;
        }
        C3F0 c3f0 = new C3F0(c109544Rq2, 2);
        String conversationId = LIZ2.getConversationId();
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(conversationId, "conversationId");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OR(currentTimeMillis, conversationId, str, null), 3);
        String sessionId = LIZ2.getConversationId();
        HashMap<String, List<C109544Rq>> hashMap = C98533tp.LIZ;
        if (hashMap != null) {
            hashMap.remove(sessionId);
        }
        Integer valueOf = Integer.valueOf(LIZ2.getChatType());
        if (C98533tp.LIZIZ == null) {
            C98533tp.LIZIZ = new HashMap<>();
        }
        HashMap<String, Integer> hashMap2 = C98533tp.LIZIZ;
        o.LJI(hashMap2);
        hashMap2.put(sessionId, valueOf);
        if (C115494g5.LIZ()) {
            C99733vl LIZ3 = C98783uE.LIZ();
            LIZ3.getClass();
            o.LJIIIZ(sessionId, "convId");
            interfaceC99713vj = LIZ3.LIZLLL.get(sessionId);
        } else {
            o.LJIIIZ(sessionId, "sessionId");
            interfaceC99713vj = (InterfaceC99713vj) ((LinkedHashMap) C99693vh.LIZ).get(sessionId);
        }
        if (interfaceC99713vj != null && (LJ = interfaceC99713vj.LJ()) != null) {
            C109544Rq c109544Rq3 = c3f0.LIZ;
            if (c109544Rq3 == null) {
                c3f0.LIZIZ = ORZ.LLILLL(LIZ(LJ), 5);
            } else {
                ArrayList arrayList = (ArrayList) LIZ(LJ);
                int indexOf = arrayList.indexOf(c109544Rq3);
                int i3 = indexOf - 2;
                if (i3 < 0) {
                    i2 = Math.min(5, arrayList.size());
                    i3 = 0;
                } else {
                    i2 = indexOf + 2 + 1;
                    if (i2 > arrayList.size()) {
                        i2 = arrayList.size();
                        i3 = Math.max(i2 - 5, 0);
                    }
                }
                c3f0.LIZIZ = arrayList.subList(i3, i2);
            }
        }
        C98533tp.LIZ(sessionId, c3f0.LIZIZ);
        int defaultMsgSelectedNumber = LIZ2.getDefaultMsgSelectedNumber();
        o.LJIIIZ(sessionId, "conversationId");
        if (C98533tp.LIZJ == null) {
            C98533tp.LIZJ = new C0M6<>(10);
        }
        C0M6<String, Integer> c0m6 = C98533tp.LIZJ;
        if (c0m6 != null) {
            c0m6.LIZJ(sessionId, Integer.valueOf(defaultMsgSelectedNumber));
        }
        C98533tp.LIZLLL = LIZ2.isHighRiskConversation();
        C98533tp.LJ = LIZ2.isMediaMsgMasking();
        String ownerId = LIZ2.getOwnerId();
        IMUser iMUser = new IMUser();
        iMUser.setUid(ownerId);
        iMUser.setNickName(LIZ2.getNickName());
        iMUser.setUniqueId(LIZ2.getUniqueId());
        iMUser.setAvatarThumb(LIZ2.getDisplayAvatar());
        Integer followerCount = LIZ2.getFollowerCount();
        if (followerCount != null) {
            iMUser.setFollowerCount(followerCount.intValue());
        }
        Integer followingCount = LIZ2.getFollowingCount();
        if (followingCount != null) {
            iMUser.setFollowingCount(followingCount.intValue());
        }
        Integer followStatus = LIZ2.getFollowStatus();
        if (followStatus != null) {
            iMUser.setFollowStatus(followStatus.intValue());
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJIIL(activity, LIZ2.getConversationId(), iMUser, LIZ2);
        if (!z) {
            return;
        }
        if (LIZ2.getChatType() == 3) {
            str2 = "group_chat";
        } else {
            str2 = "private";
        }
        String conversationId2 = LIZ2.getConversationId();
        C05040Hs.LIZJ(conversationId2, "conversationId", "eventSender").LIZIZ("chat_report_click", HXX.LIZJ("chat_type", str2, "conversation_id", conversationId2));
    }
}
