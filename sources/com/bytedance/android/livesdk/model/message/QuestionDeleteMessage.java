package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes6.dex */
public class QuestionDeleteMessage extends CR6 {

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    public QuestionDeleteMessage() {
        this.type = EnumC31509CYf.QUESTION_DELETE_MESSAGE;
    }
}
