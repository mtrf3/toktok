package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelReceiver;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelSender;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortalInfoWithDisplay;
import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BSq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28816BSq implements OnMessageListener {
    public final /* synthetic */ C28817BSr LJLIL;

    public C28816BSq(C28817BSr c28817BSr) {
        this.LJLIL = c28817BSr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        String str2;
        String str3;
        Object obj;
        int i;
        Object obj2;
        ImageModel imageModel;
        ImageModel imageModel2;
        String str4;
        String str5;
        EnvelopPortal4FEModelReceiver envelopPortal4FEModelReceiver;
        String str6;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive message ");
        LIZ.append(C16880lQ.LJLLILLLL(iMessage.getClass()));
        C0NB.LIZIZ("PortalLeaf", X1D.LIZIZ(LIZ));
        C28817BSr c28817BSr = this.LJLIL;
        c28817BSr.getClass();
        if (iMessage instanceof EnvelopePortalMessage) {
            EnvelopePortalMessage envelopePortalMessage = (EnvelopePortalMessage) iMessage;
            boolean LJJI = c28817BSr.LJJI();
            HashMap hashMap = new HashMap(11);
            EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
            String str7 = null;
            if (portalInfo != null) {
                str = portalInfo.id;
            } else {
                str = null;
            }
            String str8 = "";
            if (str == null) {
                str = "";
            }
            hashMap.put("portal_id", str);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            EnvelopePortalMessage.PortalInfo portalInfo2 = envelopePortalMessage.portalInfo;
            if (portalInfo2 != null) {
                str2 = portalInfo2.senderId;
            } else {
                str2 = null;
            }
            String str9 = CardStruct.IStatusCode.DEFAULT;
            if (str2 == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            B83 LIZ2 = B83.LIZ();
            if (LIZ2 == null || (LIZIZ = LIZ2.LIZIZ()) == null || (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) == null) {
                str3 = "";
            } else {
                hashMap.put("user_id", String.valueOf(interfaceC05190Ih.getId()));
                str3 = String.valueOf(interfaceC05190Ih.getId());
            }
            if (o.LJ(str3, str2)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_self_send", obj);
            EnvelopePortalMessage.PortalInfo portalInfo3 = envelopePortalMessage.portalInfo;
            if (portalInfo3 != null) {
                i = portalInfo3.sendAtSecond;
            } else {
                i = 0;
            }
            hashMap.put("duration_from_send", String.valueOf(C31012CFc.LIZIZ() - (i * 1000)));
            if (LJJI) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", obj2);
            hashMap.put("portal_view_type", String.valueOf(envelopePortalMessage.portalView));
            hashMap.put("display", String.valueOf(envelopePortalMessage.portalDisplay));
            EnvelopePortalMessage.PortalInfo portalInfo4 = envelopePortalMessage.portalInfo;
            if (portalInfo4 != null && (str6 = portalInfo4.senderId) != null) {
                str8 = str6;
            }
            hashMap.put("sender_id", str8);
            if (PortalFeatureSetting.INSTANCE.getValue()) {
                str9 = "1";
            }
            hashMap.put("settings_enable", str9);
            BZI LIZ3 = C28787BRn.LIZ("livesdk_portal_msg_receive");
            LIZ3.LJJIFFI(hashMap);
            LIZ3.LJIIZILJ();
            LIZ3.LJJIIJZLJL();
            C0K2.LJFF("ttlive_portal_msg_receive", hashMap, new HashMap(), new HashMap());
            EnvelopePortalMessage.PortalTransTarget portalTransTarget = envelopePortalMessage.portalTransTarget;
            if (portalTransTarget != null) {
                imageModel = portalTransTarget.sendRoomCover;
                if (imageModel == null) {
                    imageModel = portalTransTarget.anchorAvatar;
                }
            } else {
                imageModel = null;
            }
            int i2 = envelopePortalMessage.portalView;
            if (i2 != 1) {
                if (i2 != 2) {
                    C28814BSo.LIZ(envelopePortalMessage, c28817BSr.LJJI(), "msg_data_is_null");
                    return;
                }
                EnvelopPortal4FEModelSender envelopPortal4FEModelSender = new EnvelopPortal4FEModelSender();
                List<EnvelopePortalMessage.PortalInfo> list = envelopPortal4FEModelSender.portalInfos;
                EnvelopePortalMessage.PortalInfo portalInfo5 = envelopePortalMessage.portalInfo;
                o.LJIIIIZZ(portalInfo5, "msg.portalInfo");
                list.add(portalInfo5);
                envelopPortal4FEModelSender.timeDiff = C31012CFc.LIZIZ;
                envelopPortal4FEModelReceiver = envelopPortal4FEModelSender;
            } else {
                EnvelopPortal4FEModelReceiver envelopPortal4FEModelReceiver2 = new EnvelopPortal4FEModelReceiver();
                EnvelopPortalInfoWithDisplay envelopPortalInfoWithDisplay = new EnvelopPortalInfoWithDisplay();
                EnvelopePortalMessage.PortalInfo portalInfo6 = envelopePortalMessage.portalInfo;
                o.LJIIIIZZ(portalInfo6, "msg.portalInfo");
                envelopPortalInfoWithDisplay.portalInfo = portalInfo6;
                EnvelopePortalMessage.PortalTransTarget portalTransTarget2 = envelopePortalMessage.portalTransTarget;
                if (portalTransTarget2 != null) {
                    imageModel2 = portalTransTarget2.anchorAvatar;
                } else {
                    imageModel2 = null;
                }
                envelopPortalInfoWithDisplay.anchorAvatar = imageModel2;
                envelopPortalInfoWithDisplay.display = envelopePortalMessage.portalDisplay;
                if (portalTransTarget2 != null) {
                    str4 = portalTransTarget2.roomId;
                } else {
                    str4 = null;
                }
                envelopPortalInfoWithDisplay.roomId = str4;
                if (portalTransTarget2 != null) {
                    str5 = portalTransTarget2.anchorId;
                } else {
                    str5 = null;
                }
                envelopPortalInfoWithDisplay.anchorId = str5;
                if (portalTransTarget2 != null) {
                    str7 = portalTransTarget2.anchorDisplayId;
                }
                envelopPortalInfoWithDisplay.anchorDisplayId = str7;
                envelopPortal4FEModelReceiver2.portalInfos.add(envelopPortalInfoWithDisplay);
                envelopPortal4FEModelReceiver2.timeDiff = C31012CFc.LIZIZ;
                envelopPortal4FEModelReceiver = envelopPortal4FEModelReceiver2;
            }
            C28817BSr.LJJIFFI(c28817BSr, envelopPortal4FEModelReceiver, imageModel, envelopePortalMessage.portalView, envelopePortalMessage.portalDisplay, envelopePortalMessage, 32);
        }
    }
}
