package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class CategoryEffectListResponse extends XDH<CategoryPageModel> {
    public CategoryPageModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryEffectListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CategoryEffectListResponse copy$default(CategoryEffectListResponse categoryEffectListResponse, CategoryPageModel categoryPageModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            categoryPageModel = categoryEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = categoryEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = categoryEffectListResponse.status_code;
        }
        return categoryEffectListResponse.copy(categoryPageModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final CategoryEffectListResponse copy(CategoryPageModel categoryPageModel, String str, int i) {
        return new CategoryEffectListResponse(categoryPageModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CategoryEffectListResponse) {
            return C78966Uyw.LJIIIZ(((CategoryEffectListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("CategoryEffectListResponse:%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null || categoryPageModel.getCategory_effects() == null) {
            return false;
        }
        return true;
    }

    public final CategoryPageModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
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
    public CategoryPageModel getResponseData() {
        return this.data;
    }

    public final void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i) {
        this.data = categoryPageModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : categoryPageModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
