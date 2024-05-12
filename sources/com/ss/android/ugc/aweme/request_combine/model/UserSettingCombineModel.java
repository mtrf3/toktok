package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UserSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public PushSettings userSetting;

    public static /* synthetic */ UserSettingCombineModel copy$default(UserSettingCombineModel userSettingCombineModel, PushSettings pushSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            pushSettings = userSettingCombineModel.userSetting;
        }
        return userSettingCombineModel.copy(pushSettings);
    }

    private Object[] getObjects() {
        return new Object[]{this.userSetting};
    }

    public final UserSettingCombineModel copy(PushSettings userSetting) {
        o.LJIIIZ(userSetting, "userSetting");
        return new UserSettingCombineModel(userSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserSettingCombineModel) {
            return C78966Uyw.LJIIIZ(((UserSettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("UserSettingCombineModel:%s", getObjects());
    }

    public final PushSettings getUserSetting() {
        return this.userSetting;
    }

    public UserSettingCombineModel(PushSettings userSetting) {
        o.LJIIIZ(userSetting, "userSetting");
        this.userSetting = userSetting;
    }

    public final void setUserSetting(PushSettings pushSettings) {
        o.LJIIIZ(pushSettings, "<set-?>");
        this.userSetting = pushSettings;
    }
}
