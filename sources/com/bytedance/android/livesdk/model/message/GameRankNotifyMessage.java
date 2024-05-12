package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class GameRankNotifyMessage extends CR6 {

    @InterfaceC65349Pkn("msg_type")
    public int msgType;

    @InterfaceC65349Pkn("notify_text")
    public Text notifyText;

    public GameRankNotifyMessage() {
        this.type = EnumC31509CYf.GAME_RANK_NOTIFY_MESSAGE;
    }
}
