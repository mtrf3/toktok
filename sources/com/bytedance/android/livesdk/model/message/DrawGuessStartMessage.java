package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class DrawGuessStartMessage extends CR6 {

    @InterfaceC65349Pkn("data")
    public PictionaryInfo data;

    public DrawGuessStartMessage() {
        this.type = EnumC31509CYf.DRAW_GUESS_START_MESSAGE;
        this.data = new PictionaryInfo();
    }
}
