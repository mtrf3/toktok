package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPQ extends AbstractC31313CQr<AssetMessage> {
    public static final CPQ LIZJ = new CPQ();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        Text text;
        List<TextPiece> list;
        TextPieceUser textPieceUser;
        BaseMessage t = (BaseMessage) obj;
        o.LJIIIZ(t, "t");
        CommonMessageData commonMessageData = t.baseMessage;
        if (commonMessageData != null && (text = commonMessageData.displayText) != null && (list = text.pieces) != null) {
            for (TextPiece textPiece : list) {
                if (textPiece.type == CXI.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null) {
                    return textPieceUser.user;
                }
            }
        }
        return null;
    }
}
