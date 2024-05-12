package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ThirdPlatformLoginSettings {

    @InterfaceC65349Pkn("login_jump")
    public List<LoginJumpStruct> loginJump = new ArrayList();

    @InterfaceC65349Pkn("other_bind_window")
    public List<BindWindowsStruct> otherBindWindow = new ArrayList();

    @InterfaceC65349Pkn("profile_bind_window")
    public List<BindWindowsStruct> profileBindWindow = new ArrayList();

    public List<LoginJumpStruct> getLoginJump() {
        return this.loginJump;
    }

    public List<BindWindowsStruct> getOtherBindWindow() {
        return this.otherBindWindow;
    }

    public List<BindWindowsStruct> getProfileBindWindow() {
        return this.profileBindWindow;
    }
}
