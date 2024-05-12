package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.WishListUpdateMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPW extends CQO<WishListUpdateMessage> {
    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return null;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CPW(WishListUpdateMessage message) {
        super(message);
        Text text;
        List<TextPiece> list;
        IHostFrescoHelper iHostFrescoHelper;
        ImageModel imageModel;
        o.LJIIIZ(message, "message");
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
                    iHostFrescoHelper.EM(imageModel, new CPV());
                }
            }
        }
    }
}
