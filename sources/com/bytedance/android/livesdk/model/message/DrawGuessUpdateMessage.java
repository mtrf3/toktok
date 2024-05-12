package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class DrawGuessUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("correct_cnt")
    public long correctCount;

    @InterfaceC65349Pkn("pictionary_id")
    public long roundId;

    public DrawGuessUpdateMessage() {
        this.type = EnumC31509CYf.DRAW_GUESS_UPDATE_MESSAGE;
    }
}
