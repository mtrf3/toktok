package com.kakao.sdk.common.model;

import X.C1NE;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiErrorResponse implements Parcelable {
    public static final Parcelable.Creator<ApiErrorResponse> CREATOR = new Creator();
    public final List<String> allowedScopes;
    public final String apiType;
    public final int code;
    public final String msg;
    public final List<String> requiredScopes;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<ApiErrorResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiErrorResponse createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ApiErrorResponse(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiErrorResponse[] newArray(int i) {
            return new ApiErrorResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, int i, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = apiErrorResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = apiErrorResponse.msg;
        }
        if ((i2 & 4) != 0) {
            str2 = apiErrorResponse.apiType;
        }
        if ((i2 & 8) != 0) {
            list = apiErrorResponse.requiredScopes;
        }
        if ((i2 & 16) != 0) {
            list2 = apiErrorResponse.allowedScopes;
        }
        return apiErrorResponse.copy(i, str, str2, list, list2);
    }

    public final ApiErrorResponse copy(int i, String msg, String str, List<String> list, List<String> list2) {
        o.LJIIIZ(msg, "msg");
        return new ApiErrorResponse(i, msg, str, list, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorResponse)) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) obj;
        return this.code == apiErrorResponse.code && o.LJ(this.msg, apiErrorResponse.msg) && o.LJ(this.apiType, apiErrorResponse.apiType) && o.LJ(this.requiredScopes, apiErrorResponse.requiredScopes) && o.LJ(this.allowedScopes, apiErrorResponse.allowedScopes);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.code);
        out.writeString(this.msg);
        out.writeString(this.apiType);
        out.writeStringList(this.requiredScopes);
        out.writeStringList(this.allowedScopes);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.msg, this.code * 31, 31);
        String str = this.apiType;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        List<String> list = this.requiredScopes;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<String> list2 = this.allowedScopes;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApiErrorResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", apiType=");
        LIZ.append((Object) this.apiType);
        LIZ.append(", requiredScopes=");
        LIZ.append(this.requiredScopes);
        LIZ.append(", allowedScopes=");
        return C1NE.LIZIZ(LIZ, this.allowedScopes, ')', LIZ);
    }

    public final List<String> getAllowedScopes() {
        return this.allowedScopes;
    }

    public final String getApiType() {
        return this.apiType;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final List<String> getRequiredScopes() {
        return this.requiredScopes;
    }

    public ApiErrorResponse(int i, String msg, String str, List<String> list, List<String> list2) {
        o.LJIIIZ(msg, "msg");
        this.code = i;
        this.msg = msg;
        this.apiType = str;
        this.requiredScopes = list;
        this.allowedScopes = list2;
    }

    public /* synthetic */ ApiErrorResponse(int i, String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, list, (i2 & 16) == 0 ? list2 : null);
    }
}
