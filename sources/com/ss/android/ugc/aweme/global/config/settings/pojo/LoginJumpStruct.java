package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class LoginJumpStruct {

    @InterfaceC65349Pkn("jump_type")
    public Integer jumpType;

    @InterfaceC65349Pkn("jump_url")
    public String jumpUrl;

    @InterfaceC65349Pkn("login_platform")
    public Integer loginPlatform;

    public Integer getJumpType() {
        Integer num = this.jumpType;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getJumpUrl() {
        String str = this.jumpUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getLoginPlatform() {
        Integer num = this.loginPlatform;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
