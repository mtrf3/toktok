package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* loaded from: classes7.dex */
public class ResourceListResponse extends BaseNetResponse {
    public ResourceListModel data;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel != null && resourceListModel.getResourceList() != null) {
            return true;
        }
        return false;
    }

    public ResourceListModel getData() {
        return this.data;
    }

    public void setData(ResourceListModel resourceListModel) {
        this.data = resourceListModel;
    }
}
