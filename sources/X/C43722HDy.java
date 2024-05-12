package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.common.BaseShareContext;

/* renamed from: X.HDy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43722HDy extends BaseShareContext {
    public Boolean isFromNewShareSdk() {
        return Boolean.valueOf("TikTok-Open-Android-SDK-Share".equals(this.mSdkName));
    }

    public String getSdkNameForServer() {
        if (isFromNewShareSdk().booleanValue()) {
            return "tiktok_sdk_share";
        }
        return "";
    }

    public C43722HDy(Bundle bundle) {
        super(bundle);
    }
}
