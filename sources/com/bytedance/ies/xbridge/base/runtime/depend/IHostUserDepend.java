package com.bytedance.ies.xbridge.base.runtime.depend;

import X.InterfaceC78617UtJ;
import X.InterfaceC78618UtK;
import android.app.Activity;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public interface IHostUserDepend {
    String getAvatarURL();

    String getBoundEmail();

    String getBoundPhone();

    List<String> getBoundThirdPartyPlatforms();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    UserModelExt getUserModelExt();

    boolean hasLogin();

    void login(Activity activity, InterfaceC78617UtJ interfaceC78617UtJ, Map<String, String> map);

    void login(Activity activity, InterfaceC78617UtJ interfaceC78617UtJ, Map<String, String> map, LoginParamsExt loginParamsExt);

    void logout(Activity activity, InterfaceC78618UtK interfaceC78618UtK, Map<String, String> map);

    /* loaded from: classes14.dex */
    public static final class UserModelExt {
        public String shortID;

        public final String getShortID() {
            return this.shortID;
        }

        public final void setShortID(String str) {
            this.shortID = str;
        }
    }

    /* loaded from: classes15.dex */
    public static final class LoginParamsExt {
        public boolean keepOpen = true;

        public final boolean getKeepOpen() {
            return this.keepOpen;
        }

        public final void setKeepOpen(boolean z) {
            this.keepOpen = z;
        }
    }
}
