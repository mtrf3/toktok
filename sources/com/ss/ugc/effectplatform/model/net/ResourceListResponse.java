package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ResourceListResponse extends XDH<ResourceListModel> {
    public ResourceListModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ResourceListResponse copy$default(ResourceListResponse resourceListResponse, ResourceListModel resourceListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceListModel = resourceListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = resourceListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = resourceListResponse.status_code;
        }
        return resourceListResponse.copy(resourceListModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final ResourceListResponse copy(ResourceListModel resourceListModel, String str, int i) {
        return new ResourceListResponse(resourceListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResourceListResponse) {
            return C78966Uyw.LJIIIZ(((ResourceListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ResourceListResponse:%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel == null || resourceListModel.getResource_list() == null) {
            return false;
        }
        return true;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.XDH
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public ResourceListModel getResponseData() {
        return this.data;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ResourceListResponse(ResourceListModel resourceListModel, String str, int i) {
        this.data = resourceListModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ ResourceListResponse(ResourceListModel resourceListModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : resourceListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
