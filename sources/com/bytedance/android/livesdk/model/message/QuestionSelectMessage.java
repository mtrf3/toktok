package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class QuestionSelectMessage extends CR6 {

    @InterfaceC65349Pkn("data")
    public Question question;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public QuestionSelectMessage() {
        this.type = EnumC31509CYf.QUESTION_SELECT_MESSAGE;
    }
}
