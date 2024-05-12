package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import kotlin.jvm.internal.o;

/* renamed from: X.3tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98603tw {
    public final InterfaceC88472Yns<C98593tv, Boolean> LIZ;
    public final InterfaceC88474Ynu<Activity, C98563ts, Integer, Boolean, C76800UCe> LIZIZ;

    public C98603tw(int i) {
        C3U5 c3u5 = new C3U5(C98503tm.LIZ);
        C98633tz startGroupDetail = C98633tz.LJLIL;
        o.LJIIIZ(startGroupDetail, "startGroupDetail");
        this.LIZ = c3u5;
        this.LIZIZ = startGroupDetail;
    }

    public final void LIZIZ(Activity activity, DMNavArg dMNavArg) {
        String conversationId;
        if (dMNavArg == null || (conversationId = dMNavArg.getConversationId()) == null) {
            return;
        }
        Integer messagePreviewEnabled = dMNavArg.getMessagePreviewEnabled();
        if (messagePreviewEnabled == null || messagePreviewEnabled.intValue() != 0) {
            Integer isGroupMemberRequest = dMNavArg.isGroupMemberRequest();
            if (isGroupMemberRequest == null || isGroupMemberRequest.intValue() != 1) {
                IMCriticalFlowKeva.LJI(conversationId);
                if (!o.LJ(dMNavArg.getEnterMethod(), "deeplink_email")) {
                    LIZ(activity, dMNavArg, 0);
                    return;
                } else {
                    XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C98613tx(dMNavArg, this, activity, null), 3);
                    return;
                }
            }
            C98563ts c98563ts = new C98563ts(AnonymousClass629.LIZ("randomUUID().toString()"));
            String conversationId2 = dMNavArg.getConversationId();
            String str = "";
            if (conversationId2 == null) {
                conversationId2 = "";
            }
            c98563ts.setConversationId(conversationId2);
            String enterFrom = dMNavArg.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            c98563ts.setEnterFromForMob(enterFrom);
            String enterMethod = dMNavArg.getEnterMethod();
            if (enterMethod != null) {
                str = enterMethod;
            }
            c98563ts.setEnterMethod(str);
            this.LIZIZ.invoke(activity, c98563ts, 16, Boolean.TRUE);
        }
    }

    public final void LIZ(Activity activity, DMNavArg dMNavArg, int i) {
        int i2;
        C100053wH c100053wH;
        Integer chatType = dMNavArg.getChatType();
        if (chatType == null || chatType.intValue() != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        C98593tv c98593tv = new C98593tv(activity, i2, dMNavArg.getConversationId());
        c98593tv.setEnterFromForMob(dMNavArg.getEnterFrom());
        c98593tv.setEnterMethodForMob(dMNavArg.getEnterMethod());
        c98593tv.setKeepEnterFrom(true);
        c98593tv.setMsgIdFromPush(dMNavArg.getMsgIdFromPush());
        if (dMNavArg.getRefMessageId() == null || dMNavArg.getRefMessageContent() == null || dMNavArg.getRefMessageSenderUid() == null || dMNavArg.getRefMessageType() == null) {
            c100053wH = null;
        } else {
            c100053wH = new C100053wH(dMNavArg.getRefMessageId().longValue(), dMNavArg.getRefMessageType().intValue(), dMNavArg.getRefMessageContent(), dMNavArg.getRefMessageSenderUid().longValue());
        }
        c98593tv.setPushReferenceInfo(c100053wH);
        c98593tv.setUnreadCount(i);
        this.LIZ.invoke(c98593tv);
    }
}
