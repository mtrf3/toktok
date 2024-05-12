package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class QuestionSlideDownMessage extends CR6 {

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public QuestionSlideDownMessage() {
        this.type = EnumC31509CYf.QUESTION_SLIDE_DOWN_MESSAGE;
    }
}
