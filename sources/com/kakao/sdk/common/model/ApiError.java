package com.kakao.sdk.common.model;

import X.C78966Uyw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiError extends KakaoSdkError implements Parcelable {
    public final ApiErrorCause reason;
    public final ApiErrorResponse response;
    public final int statusCode;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ApiError> CREATOR = new Creator();

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<ApiError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiError createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ApiError(parcel.readInt(), ApiErrorCause.valueOf(parcel.readString()), ApiErrorResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiError[] newArray(int i) {
            return new ApiError[i];
        }
    }

    public static /* synthetic */ ApiError copy$default(ApiError apiError, int i, ApiErrorCause apiErrorCause, ApiErrorResponse apiErrorResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = apiError.statusCode;
        }
        if ((i2 & 2) != 0) {
            apiErrorCause = apiError.reason;
        }
        if ((i2 & 4) != 0) {
            apiErrorResponse = apiError.response;
        }
        return apiError.copy(i, apiErrorCause, apiErrorResponse);
    }

    private Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.reason, this.response};
    }

    public final ApiError copy(int i, ApiErrorCause reason, ApiErrorResponse response) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(response, "response");
        return new ApiError(i, reason, response);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApiError) {
            return C78966Uyw.LJIIIZ(((ApiError) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C78966Uyw.LJJJLL("ApiError:%s,%s,%s", getObjects());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.statusCode);
        out.writeString(this.reason.name());
        this.response.writeToParcel(out, i);
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ApiError fromScopes(List<String> scopes) {
            o.LJIIIZ(scopes, "scopes");
            ApiErrorCause apiErrorCause = ApiErrorCause.InsufficientScope;
            return new ApiError(403, apiErrorCause, new ApiErrorResponse(apiErrorCause.getErrorCode(), "", null, scopes, 0 == true ? 1 : 0, 20, 0 == true ? 1 : 0));
        }
    }

    public final ApiErrorCause getReason() {
        return this.reason;
    }

    public final ApiErrorResponse getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiError(int i, ApiErrorCause reason, ApiErrorResponse response) {
        super(response.getMsg());
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(response, "response");
        this.statusCode = i;
        this.reason = reason;
        this.response = response;
    }
}
