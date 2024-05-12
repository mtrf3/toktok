package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerGuestCancelEnlargeContent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TZs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74864TZs implements InterfaceC74863TZr {
    public final /* synthetic */ C74861TZp LJLIL;

    public C74864TZs(C74861TZp c74861TZp) {
        this.LJLIL = c74861TZp;
    }

    @Override // X.InterfaceC74863TZr
    public final void s1(LinkScreenChangeMessage message) {
        String str;
        int i;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        Long l;
        FollowInfo followInfo;
        String LIZIZ;
        AbstractC74727TUl LIZ;
        o.LJIIIZ(message, "message");
        int i2 = message.messageType;
        if (i2 == 2) {
            LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = message.enlargeStatusSyn;
            if (linkerEnlargeStatusSynContent != null) {
                this.LJLIL.LIZIZ.LJIIJ(linkerEnlargeStatusSynContent);
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        C74996Tc0 c74996Tc0 = this.LJLIL.LIZ;
        LinkerGuestCancelEnlargeContent linkerGuestCancelEnlargeContent = message.guestCancelEnlarge;
        User user2 = null;
        if (linkerGuestCancelEnlargeContent != null) {
            str = linkerGuestCancelEnlargeContent.cancelLinkmicId;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        boolean z = false;
        if (linkerGuestCancelEnlargeContent != null) {
            i = linkerGuestCancelEnlargeContent.isRejectEnlarge;
        } else {
            C74995Tbz.LJII.getClass();
            i = 0;
        }
        c74996Tc0.getClass();
        C28733BPl.LJIILIIL().LJIIIIZZ(c74996Tc0.LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "onReceiveGuestZoom"), new OSZ("cancelLinkMicId", str), new OSZ("isRejectEnlarge", Integer.valueOf(i))));
        InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) c74996Tc0.LJ.LIZ(c74996Tc0, C74996Tc0.LJFF[0]);
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
            linkPlayerInfo = C76917UGr.LJJIJIIJIL(LIZ, str);
        } else {
            linkPlayerInfo = null;
        }
        C74824TYe c74824TYe = C74824TYe.LIZ;
        if (linkPlayerInfo != null) {
            user = linkPlayerInfo.mUser;
        } else {
            user = null;
        }
        HashMap hashMap = new HashMap();
        DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (user != null && (LIZIZ = C278817o.LIZIZ(user)) != null) {
            str2 = LIZIZ;
        }
        hashMap.put("guest_id", str2);
        if (user != null && (followInfo = user.getFollowInfo()) != null) {
            l = Long.valueOf(followInfo.getFollowStatus());
        } else {
            l = null;
        }
        hashMap.put("anchor_relationship", String.valueOf(l));
        hashMap.put("connected_guest_cnt", String.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())));
        C74824TYe.LIZJ(c74824TYe, hashMap);
        C74824TYe.LIZ(hashMap);
        C74824TYe.LJLL("livesdk_anchor_canceled_enlarge_guest_screen", hashMap);
        Object[] objArr = new Object[1];
        if (linkPlayerInfo != null) {
            user2 = linkPlayerInfo.mUser;
        }
        objArr[0] = C05170If.LIZ(user2);
        C30868C9o.LJI(C15380j0.LJIILL(R.string.nf8, objArr));
        C74995Tbz.LJII.getClass();
        if (i == C74995Tbz.LJIILIIL) {
            z = true;
        }
        c74996Tc0.LJ(str, null, z, false, EnumC74929Tav.FROM_RECEIVE_GUEST_SHRINK_IM);
    }
}
