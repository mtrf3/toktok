package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* loaded from: classes6.dex */
public final class GiftUnlockMessage extends CR6 {

    @InterfaceC65349Pkn("bubble_text")
    public Text bubbleText;

    @InterfaceC65349Pkn("gifts")
    public List<Gift> gifts;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List<Gift> list = this.gifts;
        if (list != null && !list.isEmpty()) {
            sb.append(", gifts=");
            sb.append(this.gifts);
        }
        if (this.bubbleText != null) {
            sb.append(", bubble_text=");
            sb.append(this.bubbleText);
        }
        return DIX.LIZLLL(sb, 0, 2, "GiftUnlockMessage{", '}');
    }

    public GiftUnlockMessage() {
        this.type = EnumC31509CYf.GIFT_UNLOCK_MESSAGE;
    }
}
