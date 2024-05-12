package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes14.dex */
public final class LinkmicUserToastContent extends F9E {

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.userId;
        Long l2 = this.roomId;
        Text text = this.displayText;
        return new Object[]{l, l, l2, l2, text, text};
    }
}
