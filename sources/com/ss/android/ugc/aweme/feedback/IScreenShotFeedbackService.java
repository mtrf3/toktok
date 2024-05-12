package com.ss.android.ugc.aweme.feedback;

import X.ActivityC45651qj;
import X.ESM;
import android.content.Context;

/* loaded from: classes11.dex */
public interface IScreenShotFeedbackService {
    boolean isFeedbackEnable(boolean z);

    void sendShareFeedbackEvent();

    void startUploadScreenShotFeedback(Context context, String str);

    boolean tryShowScreenShotFloatingView(ActivityC45651qj activityC45651qj, String str, String str2, ESM<?> esm);
}
