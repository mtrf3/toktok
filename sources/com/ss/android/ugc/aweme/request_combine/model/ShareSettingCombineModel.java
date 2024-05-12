package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShareSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public ShareSettings shareSetting;

    public static /* synthetic */ ShareSettingCombineModel copy$default(ShareSettingCombineModel shareSettingCombineModel, ShareSettings shareSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            shareSettings = shareSettingCombineModel.shareSetting;
        }
        return shareSettingCombineModel.copy(shareSettings);
    }

    private Object[] getObjects() {
        return new Object[]{this.shareSetting};
    }

    public final ShareSettingCombineModel copy(ShareSettings shareSetting) {
        o.LJIIIZ(shareSetting, "shareSetting");
        return new ShareSettingCombineModel(shareSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShareSettingCombineModel) {
            return C78966Uyw.LJIIIZ(((ShareSettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ShareSettingCombineModel:%s", getObjects());
    }

    public final ShareSettings getShareSetting() {
        return this.shareSetting;
    }

    public ShareSettingCombineModel(ShareSettings shareSetting) {
        o.LJIIIZ(shareSetting, "shareSetting");
        this.shareSetting = shareSetting;
    }

    public final void setShareSetting(ShareSettings shareSettings) {
        o.LJIIIZ(shareSettings, "<set-?>");
        this.shareSetting = shareSettings;
    }
}
