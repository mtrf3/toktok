package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LiveSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public LiveSDKSettingResponse liveSetting;

    public static /* synthetic */ LiveSettingCombineModel copy$default(LiveSettingCombineModel liveSettingCombineModel, LiveSDKSettingResponse liveSDKSettingResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            liveSDKSettingResponse = liveSettingCombineModel.liveSetting;
        }
        return liveSettingCombineModel.copy(liveSDKSettingResponse);
    }

    private Object[] getObjects() {
        return new Object[]{this.liveSetting};
    }

    public final LiveSettingCombineModel copy(LiveSDKSettingResponse liveSetting) {
        o.LJIIIZ(liveSetting, "liveSetting");
        return new LiveSettingCombineModel(liveSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveSettingCombineModel) {
            return C78966Uyw.LJIIIZ(((LiveSettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("LiveSettingCombineModel:%s", getObjects());
    }

    public final LiveSDKSettingResponse getLiveSetting() {
        return this.liveSetting;
    }

    public LiveSettingCombineModel(LiveSDKSettingResponse liveSetting) {
        o.LJIIIZ(liveSetting, "liveSetting");
        this.liveSetting = liveSetting;
    }

    public final void setLiveSetting(LiveSDKSettingResponse liveSDKSettingResponse) {
        o.LJIIIZ(liveSDKSettingResponse, "<set-?>");
        this.liveSetting = liveSDKSettingResponse;
    }
}
