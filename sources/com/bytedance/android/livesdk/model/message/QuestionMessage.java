package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public class QuestionMessage extends CR6 {

    @InterfaceC65349Pkn("data")
    public Question question;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        Question question = this.question;
        if (question != null && question.user != null && !TextUtils.isEmpty(question.content)) {
            return true;
        }
        return false;
    }

    public QuestionMessage() {
        this.type = EnumC31509CYf.QUESTION;
    }
}
