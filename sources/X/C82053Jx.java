package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C82053Jx extends TBS implements InterfaceC88472Yns<C63120Opw, IMContact> {
    public C82053Jx(AbstractC113374cf abstractC113374cf) {
        super(1, abstractC113374cf, C82013Jt.class, "convert", "convert(Lcom/bytedance/im/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final IMContact invoke(C63120Opw c63120Opw) {
        IMConversation iMConversation;
        IMUser LJIIJJI;
        C63120Opw p0 = c63120Opw;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        if (p0.isSingleChat()) {
            long j = 0;
            if (C81273Gx.LIZLLL(p0.getConversationId()) <= 0 || (LJIIJJI = C79004UzY.LJIIJJI(p0)) == 0) {
                return null;
            }
            LJIIJJI.setStickTop(p0.isStickTop());
            LJIIJJI.setType(1);
            C109544Rq lastShowMessage = p0.getLastShowMessage();
            if (lastShowMessage != null) {
                j = lastShowMessage.getCreatedAt();
            }
            if (p0.isStickTop()) {
                j = Math.max(j, p0.getUpdatedTime());
            }
            LJIIJJI.setFriendRecTime(j);
            LJIIJJI.setIsRecentContact(1);
            iMConversation = LJIIJJI;
        } else {
            IMConversation iMConversation2 = new IMConversation();
            iMConversation2.setConversationId(p0.getConversationId());
            iMConversation2.setConversationType(p0.getConversationType());
            iMConversation2.setConversationMemberCount(p0.getMemberCount());
            iMConversation2.setStickTop(p0.isStickTop());
            C81093Gf.LIZ().getClass();
            iMConversation2.setConversationAvatar(C3IY.LIZJ(p0));
            C63088OpQ coreInfo = p0.getCoreInfo();
            if (coreInfo != null) {
                iMConversation2.setConversationName(coreInfo.getName());
            }
            iMConversation2.setType(1);
            iMConversation = iMConversation2;
        }
        iMConversation.setIsRecentContact(1);
        return iMConversation;
    }
}
