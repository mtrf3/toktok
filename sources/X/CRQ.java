package X;

import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRQ implements InterfaceC31330CRi<AssetMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(AssetMessage assetMessage, CQQ context) {
        CommonMessageData commonMessageData;
        AssetMessage message = assetMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!message.showMessage || (commonMessageData = message.baseMessage) == null || commonMessageData.displayText == null) {
            CR3.LIZIZ(message, "AssetMessage discarded because show_message field is false or displayText field is empty.");
            return true;
        }
        return false;
    }
}
