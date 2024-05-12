package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C00F;
import X.InterfaceC65784Pro;

/* loaded from: classes8.dex */
public final class AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$2 INSTANCE = new AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$2();

    public AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        int LIZ = C00F.LIZ(31744, 0, "studio_distribute_author_survey", true);
        if (LIZ == 1 || LIZ == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
