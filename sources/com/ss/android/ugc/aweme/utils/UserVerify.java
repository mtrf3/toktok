package com.ss.android.ugc.aweme.utils;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class UserVerify {
    public final UrlModel avatarThumb;
    public final String customVerify;
    public final String enterpriseVerifyReason;
    public final Integer verificationType;

    /* JADX WARN: Multi-variable type inference failed */
    public UserVerify() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Integer getVerificationType() {
        return this.verificationType;
    }

    public UserVerify(UrlModel urlModel, String str, String str2, Integer num) {
        this.avatarThumb = urlModel;
        this.customVerify = str;
        this.enterpriseVerifyReason = str2;
        this.verificationType = num;
    }

    public /* synthetic */ UserVerify(UrlModel urlModel, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? -1 : num);
    }
}
