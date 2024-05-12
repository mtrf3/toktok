package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class GameOCRPingMessage extends CR6 {

    @InterfaceC65349Pkn("confidence")
    public double confidence;

    @InterfaceC65349Pkn("game_fusion_label")
    public String gameFusionLabel;

    @InterfaceC65349Pkn("is_game")
    public boolean isGame;

    @InterfaceC65349Pkn("ping_timestamp")
    public long pingTimestamp;

    @InterfaceC65349Pkn("ping_value")
    public long pingValue;

    public GameOCRPingMessage() {
        this.type = EnumC31509CYf.GAME_O_C_R_PING_MESSAGE;
        this.gameFusionLabel = "";
    }
}
