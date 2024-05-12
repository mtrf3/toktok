package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ModfifyFavoriteResponse extends XDH<List<? extends String>> {
    public List<String> data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public ModfifyFavoriteResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModfifyFavoriteResponse copy$default(ModfifyFavoriteResponse modfifyFavoriteResponse, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = modfifyFavoriteResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = modfifyFavoriteResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = modfifyFavoriteResponse.status_code;
        }
        return modfifyFavoriteResponse.copy(list, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    @Override // X.XDH
    public boolean checkValue() {
        return true;
    }

    public final ModfifyFavoriteResponse copy(List<String> list, String str, int i) {
        return new ModfifyFavoriteResponse(list, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModfifyFavoriteResponse) {
            return C78966Uyw.LJIIIZ(((ModfifyFavoriteResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ModfifyFavoriteResponse:%s,%s,%s", getObjects());
    }

    public final List<String> getData() {
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

    @Override // X.XDH
    public List<? extends String> getResponseData() {
        return this.data;
    }

    public final void setData(List<String> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ModfifyFavoriteResponse(List<String> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ ModfifyFavoriteResponse(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
