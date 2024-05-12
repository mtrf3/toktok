package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class DrawGuessExitMessage extends CR6 {

    @InterfaceC65349Pkn("pictionary_type")
    public int pictionaryType;

    @InterfaceC65349Pkn("session_id")
    public long sessionId;

    @InterfaceC65349Pkn("show_statistics")
    public boolean showStats;

    public DrawGuessExitMessage() {
        this.type = EnumC31509CYf.DRAW_GUESS_EXIT_MESSAGE;
    }
}
