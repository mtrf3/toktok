package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Objects;

/* loaded from: classes14.dex */
public class AuthenticationInfo {

    @InterfaceC65349Pkn("authentication_badge")
    public ImageModel authenticationBadge;

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    public final int hashCode() {
        return Objects.hash(this.customVerify, this.enterpriseVerifyReason, this.authenticationBadge);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationInfo)) {
            return false;
        }
        AuthenticationInfo authenticationInfo = (AuthenticationInfo) obj;
        if (Objects.equals(this.customVerify, authenticationInfo.customVerify) && Objects.equals(this.enterpriseVerifyReason, authenticationInfo.enterpriseVerifyReason) && Objects.equals(this.authenticationBadge, authenticationInfo.authenticationBadge)) {
            return true;
        }
        return false;
    }
}
