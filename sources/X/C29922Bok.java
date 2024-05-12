package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;

/* renamed from: X.Bok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29922Bok extends CQO<AssetMessage> {
    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return null;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        TextPieceUser textPieceUser;
        MESSAGE message = this.LJIJJLI;
        if (message.baseMessage != null && message.baseMessage.displayText != null) {
            for (TextPiece textPiece : message.baseMessage.displayText.pieces) {
                if (textPiece.type == CXI.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null) {
                    return textPieceUser.user;
                }
            }
            return null;
        }
        return null;
    }

    public C29922Bok(AssetMessage assetMessage) {
        super(assetMessage);
    }
}
