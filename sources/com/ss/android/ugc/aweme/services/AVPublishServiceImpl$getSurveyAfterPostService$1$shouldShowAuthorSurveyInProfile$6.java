package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.GVY;
import X.InterfaceC65784Pro;

/* loaded from: classes8.dex */
public final class AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$6 INSTANCE = new AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$6();

    public AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$6() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (GVY.LIZIZ().getLong(GVY.LJ("key_survey_submit_timestamp"), 0L) > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
