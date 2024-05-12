package com.ss.android.ugc.aweme.request_combine.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SettingCombineModel extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public SettingCombineDataModel data;

    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public SettingCombineModel(SettingCombineDataModel data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }

    public final void setData(SettingCombineDataModel settingCombineDataModel) {
        o.LJIIIZ(settingCombineDataModel, "<set-?>");
        this.data = settingCombineDataModel;
    }
}
