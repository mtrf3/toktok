package Y;

import X.InterfaceC76622U5i;
import X.U7F;
import X.U7T;
import X.U7V;
import X.U9Q;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.InviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes14.dex */
public class ARunnableS2S0501000_13 implements Runnable {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        DSLConfig dSLConfig;
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) this.l1;
        int i = this.i5;
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) this.l2;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) this.l3;
        LinkUser linkUser2 = (LinkUser) this.l4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            InviteContent inviteContent = linkLayerMessage.inviteContent;
            if (inviteContent != null) {
                dSLConfig = inviteContent.dsl;
            } else {
                dSLConfig = null;
            }
            next.LJJLL(u7t, new PermitApplyMessage(linkUser, i, onLineMicInfo, U7V.LJI(dSLConfig), U7V.LJIILL(linkLayerMessage, null), linkUser2));
        }
    }

    public final void LIZ$1() {
        MultiLiveContent multiLiveContent;
        ReplyBizContent replyBizContent;
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) this.l1;
        int i = this.i5;
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) this.l2;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) this.l3;
        LinkUser linkUser2 = (LinkUser) this.l4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            User user = null;
            CustomLinkMessage LJIILL = U7V.LJIILL(linkLayerMessage, null);
            BusinessContent businessContent = linkLayerMessage.bizContent;
            if (businessContent != null && (multiLiveContent = businessContent.multiLiveContent) != null && (replyBizContent = multiLiveContent.replyIMContent) != null) {
                user = replyBizContent.replyUserInfo;
            }
            next.LLILIL(u7t, new ReplyInviteMessage(linkUser, i, onLineMicInfo, LJIILL, user, linkUser2));
        }
    }

    public final void LIZ$2() {
        long j;
        Long userId;
        U7F u7f = (U7F) this.l0;
        LinkUser linkUser = (LinkUser) this.l1;
        if (linkUser != null && (userId = linkUser.getUserId()) != null) {
            j = userId.longValue();
        } else {
            j = 0;
        }
        u7f.LJJIIJ(j);
        U7F u7f2 = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f2.LJIILJJIL;
        LinkUser linkUser2 = (LinkUser) this.l2;
        int i = this.i5;
        LinkerReplyContent linkerReplyContent = (LinkerReplyContent) this.l3;
        LinkMessage linkMessage = (LinkMessage) this.l4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJJLJ(u7f2, new ReplyInviteMessage(linkUser2, i, null, new CustomLinkMessage(u7f2.LJFF, null, new ExtraDataWrapper(null, linkerReplyContent, linkMessage.expireTimestamp, linkMessage)), null, null, 48, null));
        }
        if (this.i5 == 1) {
            if (!((U7F) this.l0).LJJIIZ().LJLLILLLL) {
                ((U7F) this.l0).LJJIIZI().LJJJZ(null);
            }
            if (!((U7F) this.l0).LJJIIZ().LJLLLL) {
                U7F u7f3 = (U7F) this.l0;
                Iterator<InterfaceC76622U5i> it2 = u7f3.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJII(new U9Q(u7f3));
                }
            }
        }
    }

    public static final void run$0(ARunnableS2S0501000_13 aRunnableS2S0501000_13) {
        boolean LIZ;
        try {
            aRunnableS2S0501000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0501000_13 aRunnableS2S0501000_13) {
        boolean LIZ;
        try {
            aRunnableS2S0501000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S0501000_13 aRunnableS2S0501000_13) {
        boolean LIZ;
        try {
            aRunnableS2S0501000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0501000_13(U7F u7f, LinkUser linkUser, LinkUser linkUser2, LinkerReplyContent linkerReplyContent, LinkMessage linkMessage, int i) {
        this.$t = i;
        this.l0 = u7f;
        this.l1 = linkUser;
        this.i5 = 1;
        this.l2 = linkUser2;
        this.l3 = linkerReplyContent;
        this.l4 = linkMessage;
    }

    public ARunnableS2S0501000_13(U7T u7t, LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, LinkLayerMessage linkLayerMessage, LinkUser linkUser2, int i2) {
        this.$t = i2;
        this.l0 = u7t;
        this.l1 = linkUser;
        this.i5 = i;
        this.l2 = onLineMicInfo;
        this.l3 = linkLayerMessage;
        this.l4 = linkUser2;
    }
}
