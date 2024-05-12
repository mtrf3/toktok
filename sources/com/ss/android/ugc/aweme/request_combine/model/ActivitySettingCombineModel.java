package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.kpro.KproActivityResponse;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActivitySettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public KproActivityResponse activitySetting;

    public static /* synthetic */ ActivitySettingCombineModel copy$default(ActivitySettingCombineModel activitySettingCombineModel, KproActivityResponse kproActivityResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            kproActivityResponse = activitySettingCombineModel.activitySetting;
        }
        return activitySettingCombineModel.copy(kproActivityResponse);
    }

    private Object[] getObjects() {
        return new Object[]{this.activitySetting};
    }

    public final ActivitySettingCombineModel copy(KproActivityResponse activitySetting) {
        o.LJIIIZ(activitySetting, "activitySetting");
        return new ActivitySettingCombineModel(activitySetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivitySettingCombineModel) {
            return C78966Uyw.LJIIIZ(((ActivitySettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ActivitySettingCombineModel:%s", getObjects());
    }

    public final KproActivityResponse getActivitySetting() {
        return this.activitySetting;
    }

    public ActivitySettingCombineModel(KproActivityResponse activitySetting) {
        o.LJIIIZ(activitySetting, "activitySetting");
        this.activitySetting = activitySetting;
    }

    public final void setActivitySetting(KproActivityResponse kproActivityResponse) {
        o.LJIIIZ(kproActivityResponse, "<set-?>");
        this.activitySetting = kproActivityResponse;
    }
}
