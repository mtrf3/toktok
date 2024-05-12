package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class QuestionSwitchMessage extends CR6 {

    @InterfaceC65349Pkn("on")
    public boolean on;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public final Boolean LIZ() {
        return Boolean.valueOf(this.on);
    }

    public QuestionSwitchMessage() {
        this.type = EnumC31509CYf.QUESTION_SWITCH_MESSAGE;
    }
}
