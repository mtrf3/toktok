package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;

/* loaded from: classes6.dex */
public final class ActivityQuizUserIdentityMessage extends CR6 {

    @InterfaceC65349Pkn("body")
    public QuizUserIdentityInfo body;

    @InterfaceC65349Pkn("primary_id")
    public String primaryId;

    @InterfaceC65349Pkn("retain_device_id")
    public String retainDeviceId;

    @InterfaceC65349Pkn("timestamp")
    public long timestamp;

    @InterfaceC65349Pkn("version")
    public long version;

    public ActivityQuizUserIdentityMessage() {
        this.type = EnumC31509CYf.ACTIVITY_QUIZ_USER_IDENTITY_MESSAGE;
        this.primaryId = "";
        this.retainDeviceId = "";
    }
}
