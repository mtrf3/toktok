package com.kakao.sdk.common.model;

import X.V0N;

/* loaded from: classes12.dex */
public enum ApiErrorCause {
    InternalError(-1),
    IllegalParams(-2),
    UnsupportedApi(-3),
    BlockedAction(-4),
    PermissionDenied(-5),
    DeprecatedApi(-9),
    ApiLimitExceeded(-10),
    NotRegisteredUser(-101),
    AlreadyRegisteredUser(-102),
    AccountDoesNotExist(-103),
    PropertyKeyDoesNotExist(-201),
    AppDoesNotExist(-301),
    InvalidToken(-401),
    InsufficientScope(-402),
    RequiredAgeVerification(-405),
    UnderAgeLimit(-406),
    NotTalkUser(-501),
    NotFriend(-502),
    UserDeviceUnsupported(-504),
    TalkMessageDisabled(-530),
    TalkSendMessageMonthlyLimitExceed(-531),
    TalkSendMessageDailyLimitExceed(-532),
    NotStoryUser(-601),
    StoryImageUploadSizeExceeded(-602),
    TimeOut(-603),
    StoryInvalidScrapUrl(-604),
    StoryInvalidPostId(-605),
    StoryMaxUploadCountExceed(-606),
    DeveloperDoesNotExist(-903),
    UnderMaintenance(-9798),
    Unknown(Integer.MAX_VALUE);

    public final int errorCode;

    public static ApiErrorCause valueOf(String str) {
        return (ApiErrorCause) V0N.LJJJ(ApiErrorCause.class, str);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    ApiErrorCause(int i) {
        this.errorCode = i;
    }
}
