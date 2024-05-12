package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class DrawGuessEndMessage extends CR6 {

    @InterfaceC65349Pkn("end_type")
    public int endType;

    @InterfaceC65349Pkn("pictionary_type")
    public int pictionaryType;

    @InterfaceC65349Pkn("pictionary_id")
    public long roundId;

    @InterfaceC65349Pkn("word")
    public String word;

    public DrawGuessEndMessage() {
        this.type = EnumC31509CYf.DRAW_GUESS_END_MESSAGE;
        this.word = "";
    }
}
