package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.sugar.audit.model.ConversationApplyNotifyInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Ou6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63378Ou6 implements InterfaceC63343OtX {
    public static volatile C63378Ou6 LIZLLL;
    public volatile Pair<Long, ConversationApplyInfo> LIZIZ;
    public final java.util.Set<InterfaceC63379Ou7> LIZ = new CopyOnWriteArraySet();
    public volatile long LIZJ = 0;

    public static C63378Ou6 LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C63378Ou6.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C63378Ou6();
                }
            }
        }
        return LIZLLL;
    }

    public C63378Ou6() {
        C63291Osh LIZ = C63291Osh.LIZ();
        InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
        LIZ.getClass();
        interfaceC63293Osj.LIZLLL(0L, C63291Osh.LJIIIZ(C63291Osh.LJIIIIZZ(0, "delete_audit_create_time")));
        ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJFF).add(this);
    }

    @Override // X.InterfaceC63343OtX
    public final boolean LIZ(NewMessageNotify newMessageNotify) {
        MessageBody messageBody = newMessageNotify.message;
        if (messageBody.message_type.intValue() == EnumC63179Oqt.MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY.getValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationAuditModel handle:");
            LIZ.append(messageBody.message_type);
            C63322OtC.LIZ(X1D.LIZIZ(LIZ));
            Gson gson = C63682Oz0.LIZ;
            ConversationApplyNotifyInfo conversationApplyNotifyInfo = (ConversationApplyNotifyInfo) GsonProtectorUtils.fromJson(gson, messageBody.content, ConversationApplyNotifyInfo.class);
            if (conversationApplyNotifyInfo == null) {
                return true;
            }
            Long valueOf = Long.valueOf(conversationApplyNotifyInfo.userId);
            Long valueOf2 = Long.valueOf(conversationApplyNotifyInfo.conversationShortId);
            Integer valueOf3 = Integer.valueOf(conversationApplyNotifyInfo.conversationType);
            EnumC115774gX fromValue = EnumC115774gX.fromValue(conversationApplyNotifyInfo.apply_status);
            Long valueOf4 = Long.valueOf(conversationApplyNotifyInfo.applyId);
            Long valueOf5 = Long.valueOf(conversationApplyNotifyInfo.createTime);
            Long valueOf6 = Long.valueOf(conversationApplyNotifyInfo.modifyTime);
            Long valueOf7 = Long.valueOf(conversationApplyNotifyInfo.modifyUser);
            String str = conversationApplyNotifyInfo.secUid;
            Long valueOf8 = Long.valueOf(conversationApplyNotifyInfo.userId);
            String str2 = conversationApplyNotifyInfo.secInviteUid;
            if (conversationApplyNotifyInfo.ext == null) {
                conversationApplyNotifyInfo.ext = new HashMap();
            }
            ConversationApplyInfo conversationApplyInfo = new ConversationApplyInfo(valueOf, valueOf2, valueOf3, fromValue, valueOf4, valueOf5, valueOf6, valueOf7, str, valueOf8, str2, conversationApplyNotifyInfo.ext, conversationApplyNotifyInfo.applyReason);
            if (this.LIZIZ == null) {
                this.LIZIZ = new Pair<>(0L, null);
            }
            long longValue = ((Long) this.LIZIZ.first).longValue();
            ConversationApplyInfo conversationApplyInfo2 = (ConversationApplyInfo) this.LIZIZ.second;
            if (conversationApplyInfo2 != null && conversationApplyInfo.create_time.longValue() > conversationApplyInfo2.create_time.longValue()) {
                this.LIZIZ = new Pair<>(Long.valueOf(longValue), conversationApplyInfo);
                C63291Osh LIZ2 = C63291Osh.LIZ();
                String json = GsonProtectorUtils.toJson(gson, conversationApplyInfo);
                synchronized (LIZ2) {
                    C63291Osh.LIZLLL.putString(C63291Osh.LJIIIIZZ(0, "last_conversation_apply"), json);
                }
            }
            if (((CopyOnWriteArraySet) this.LIZ).isEmpty()) {
                return true;
            }
            Iterator it = ((CopyOnWriteArraySet) this.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC63379Ou7) it.next()).LIZ(conversationApplyInfo);
            }
            return true;
        }
        if (messageBody.message_type.intValue() == EnumC63179Oqt.MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY.getValue()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ConversationAuditModel handle:");
            LIZ3.append(messageBody.message_type);
            C63322OtC.LIZ(X1D.LIZIZ(LIZ3));
            ConversationApplyNotifyInfo conversationApplyNotifyInfo2 = (ConversationApplyNotifyInfo) GsonProtectorUtils.fromJson(C63682Oz0.LIZ, messageBody.content, ConversationApplyNotifyInfo.class);
            if (conversationApplyNotifyInfo2 == null) {
                return true;
            }
            Long valueOf9 = Long.valueOf(conversationApplyNotifyInfo2.userId);
            Long valueOf10 = Long.valueOf(conversationApplyNotifyInfo2.conversationShortId);
            Integer valueOf11 = Integer.valueOf(conversationApplyNotifyInfo2.conversationType);
            EnumC115774gX fromValue2 = EnumC115774gX.fromValue(conversationApplyNotifyInfo2.apply_status);
            Long valueOf12 = Long.valueOf(conversationApplyNotifyInfo2.applyId);
            Long valueOf13 = Long.valueOf(conversationApplyNotifyInfo2.createTime);
            Long valueOf14 = Long.valueOf(conversationApplyNotifyInfo2.modifyTime);
            Long valueOf15 = Long.valueOf(conversationApplyNotifyInfo2.modifyUser);
            String str3 = conversationApplyNotifyInfo2.secUid;
            Long valueOf16 = Long.valueOf(conversationApplyNotifyInfo2.inviteUserId);
            String str4 = conversationApplyNotifyInfo2.secInviteUid;
            if (conversationApplyNotifyInfo2.ext == null) {
                conversationApplyNotifyInfo2.ext = new HashMap();
            }
            ConversationApplyInfo conversationApplyInfo3 = new ConversationApplyInfo(valueOf9, valueOf10, valueOf11, fromValue2, valueOf12, valueOf13, valueOf14, valueOf15, str3, valueOf16, str4, conversationApplyNotifyInfo2.ext, conversationApplyNotifyInfo2.applyReason);
            if (((CopyOnWriteArraySet) this.LIZ).isEmpty()) {
                return true;
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC63379Ou7) it2.next()).LIZIZ(conversationApplyInfo3);
            }
            return true;
        }
        return false;
    }
}
