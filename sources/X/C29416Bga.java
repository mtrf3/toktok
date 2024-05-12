package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29416Bga extends CQO<RedEnvelopMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d__;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return null;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29416Bga(RedEnvelopMessage message) {
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
                    iHostFrescoHelper.EM(imageModel, new C29417Bgb());
                }
            }
        }
    }
}
