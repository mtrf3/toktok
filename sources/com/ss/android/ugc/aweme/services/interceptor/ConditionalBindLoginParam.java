package com.ss.android.ugc.aweme.services.interceptor;

import X.C78685UuP;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class ConditionalBindLoginParam {
    public static final Companion Companion = new Companion();
    public String code;
    public String emailCodeKey;
    public boolean isRegister;
    public String mobile;
    public Map<String, String> originParam;
    public String profileKey;

    public final int getVerifyLogicType() {
        if (C78685UuP.LJJJZ(this.profileKey)) {
            if (this.isRegister) {
                return 2;
            }
            return 4;
        }
        if (this.isRegister) {
            return 1;
        }
        return 3;
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getCode() {
        return this.code;
    }

    public final String getEmailCodeKey() {
        return this.emailCodeKey;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final Map<String, String> getOriginParam() {
        return this.originParam;
    }

    public final String getProfileKey() {
        return this.profileKey;
    }

    public final boolean isRegister() {
        return this.isRegister;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setEmailCodeKey(String str) {
        this.emailCodeKey = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setOriginParam(Map<String, String> map) {
        this.originParam = map;
    }

    public final void setProfileKey(String str) {
        this.profileKey = str;
    }

    public final void setRegister(boolean z) {
        this.isRegister = z;
    }
}
