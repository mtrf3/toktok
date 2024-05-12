package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BgY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29414BgY extends CQO<EnvelopePortalMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d__;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        long j;
        Object obj;
        String str;
        Object obj2;
        Text text;
        String str2;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        InterfaceC29405BgP LIZIZ2;
        super.onAttach();
        HashMap hashMap = new HashMap(8);
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ2 = LIZ.LIZIZ()) != null) {
            j = ((C29374Bfu) LIZIZ2).getCurrentUserId();
        } else {
            j = 0;
        }
        hashMap.put("user_id", String.valueOf(j));
        boolean LJLJJL = LJLJJL();
        String str3 = "1";
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (LJLJJL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", obj);
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            str = String.valueOf(interfaceC05190Ih.getId());
        } else {
            str = "";
        }
        EnvelopePortalMessage.PortalInfo portalInfo = ((EnvelopePortalMessage) this.LJIJJLI).portalInfo;
        String str5 = null;
        if (portalInfo != null) {
            str5 = portalInfo.senderId;
        }
        if (!o.LJ(str, str5)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_portal_owner", str3);
        EnvelopePortalMessage.PortalInfo portalInfo2 = ((EnvelopePortalMessage) this.LJIJJLI).portalInfo;
        if (portalInfo2 != null && (str2 = portalInfo2.id) != null) {
            str4 = str2;
        }
        hashMap.put("portal_id", str4);
        hashMap.put("enter_from_merge", BJM.LJFF());
        hashMap.put("enter_method", BJM.LJIIIIZZ());
        hashMap.put("action_type", BJM.LIZLLL());
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        if (commonMessageData == null || (text = commonMessageData.displayText) == null || (obj2 = text.key) == null) {
            obj2 = 0;
        }
        hashMap.put("tips_text", obj2.toString());
        BZI LIZ3 = C28787BRn.LIZ("livesdk_comment_area_portal_message_show");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJJIIJZLJL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29414BgY(EnvelopePortalMessage message) {
        super(message);
        boolean z;
        Text text;
        List<TextPiece> list;
        IHostFrescoHelper iHostFrescoHelper;
        ImageModel imageModel;
        o.LJIIIZ(message, "message");
        IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
        if (iGiftService != null) {
            z = iGiftService.enablePortal();
        } else {
            z = false;
        }
        message.LJLIL = z;
        CommonMessageData commonMessageData = message.baseMessage;
        if (commonMessageData != null && (text = commonMessageData.displayText) != null && (list = text.pieces) != null) {
            for (TextPiece textPiece : list) {
                if (textPiece.type == CXI.IMAGE.getPieceType() && (iHostFrescoHelper = (IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)) != null) {
                    TextPieceImage textPieceImage = textPiece.imageValue;
                    if (textPieceImage != null) {
                        imageModel = textPieceImage.imageModel;
                    } else {
                        imageModel = null;
                    }
                    iHostFrescoHelper.EM(imageModel, new C29415BgZ());
                }
            }
        }
    }
}
