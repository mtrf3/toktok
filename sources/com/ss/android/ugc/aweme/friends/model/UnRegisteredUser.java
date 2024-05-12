package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class UnRegisteredUser {

    @InterfaceC65349Pkn("invite_status")
    public int inviteStatus;

    @InterfaceC65349Pkn("mobile_id")
    public String mobileId;

    @InterfaceC65349Pkn("remark_name")
    public String remarkName;

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnRegisteredUser) || !TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
            return false;
        }
        return super.equals(obj);
    }
}
