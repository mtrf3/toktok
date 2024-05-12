package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CQ1 extends CQO<GiftCollectionUpdateMessage> implements InterfaceC31379CTf {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d59;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return null;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    public CQ1(GiftCollectionUpdateMessage giftCollectionUpdateMessage) {
        super(giftCollectionUpdateMessage);
    }

    @Override // X.InterfaceC31379CTf
    public final void LJIJJ(InterfaceC31293CPx interfaceC31293CPx) {
        Text text;
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        if (commonMessageData == null || (text = commonMessageData.displayText) == null) {
            return;
        }
        String str = text.defaultPattern;
        if ((text.key == null || C86881Y7x.LIZIZ().LIZ(text.key) == null) && str == null) {
            return;
        }
        for (TextPiece textPiece : text.pieces) {
            if (textPiece.type == CXI.GIFT.getPieceType() && textPiece.giftValue != null) {
                Gift gift = ((GiftCollectionUpdateMessage) this.LJIJJLI).giftCollection.gift;
                if (gift == null) {
                    return;
                } else {
                    ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(gift.image, new CQ0(this, interfaceC31293CPx));
                }
            }
        }
    }
}
