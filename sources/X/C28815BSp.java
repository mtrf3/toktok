package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelReceiver;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortalInfoWithDisplay;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BSp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28815BSp extends AnimatorListenerAdapter {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ InterfaceC28808BSi LJLILLLLZI;
    public final /* synthetic */ C28817BSr LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        String str;
        String str2;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        String str3;
        FollowInfo followInfo;
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL.element) {
            EnvelopePortalMessage.PortalInfo portalInfo = ((EnvelopPortalInfoWithDisplay) ListProtector.get(((EnvelopPortal4FEModelReceiver) this.LJLILLLLZI).portalInfos, 0)).portalInfo;
            boolean LJJI = this.LJLJI.LJJI();
            long j = this.LJLJJI;
            o.LJIIIZ(portalInfo, "portalInfo");
            HashMap hashMap = new HashMap(11);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                User owner = room.getOwner();
                if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str3 = Q4K.LIZJ(followInfo)) == null) {
                    str3 = "";
                }
                hashMap.put("follow_status", str3);
            }
            B83 LIZ = B83.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
            }
            if (LJJI) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", str);
            hashMap.put("delay_time", String.valueOf(System.currentTimeMillis() - (portalInfo.sendAtSecond * 1000)));
            hashMap.put("duration_from_message_receive", String.valueOf(System.currentTimeMillis() - j));
            if (CN1.LIZ(IMicRoomService.class) != null && ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
                str2 = "video_anchor_order";
            } else {
                if (CN1.LIZ(IInteractService.class) != null) {
                    IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                    if (iInteractService.Qe0()) {
                        str2 = "video_anchor_pk";
                    } else if (iInteractService.OB()) {
                        str2 = "video_anchor_connect";
                    } else if (iInteractService.ta0()) {
                        str2 = "video_anchor_guest_connect";
                    }
                }
                str2 = "normal_video_live";
            }
            hashMap.put(WM7.SCENE_SERVICE, str2);
            String str4 = portalInfo.id;
            o.LJIIIIZZ(str4, "portalInfo.id");
            hashMap.put("portal_id", str4);
            hashMap.put("price", String.valueOf(portalInfo.portalDiamonds + portalInfo.envelopeDiamonds));
            hashMap.put("redpacket_money", String.valueOf(portalInfo.envelopeDiamonds));
            hashMap.put("portal_time", String.valueOf(portalInfo.ddlSecond - portalInfo.sendAtSecond));
            BZI LIZ2 = C28787BRn.LIZ("livesdk_portal_icon_show");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
            C0K2.LJFF("ttlive_portal_icon_show", hashMap, new HashMap(), new HashMap());
        }
    }

    public C28815BSp(C34K c34k, InterfaceC28808BSi interfaceC28808BSi, C28817BSr c28817BSr, long j) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = interfaceC28808BSi;
        this.LJLJI = c28817BSr;
        this.LJLJJI = j;
    }
}
