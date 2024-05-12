package com.kakao.sdk.common.model;

import X.C78966Uyw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthError extends KakaoSdkError implements Parcelable {
    public static final Parcelable.Creator<AuthError> CREATOR = new Creator();
    public final AuthErrorCause reason;
    public final AuthErrorResponse response;
    public final int statusCode;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<AuthError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthError createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AuthError(parcel.readInt(), AuthErrorCause.valueOf(parcel.readString()), AuthErrorResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthError[] newArray(int i) {
            return new AuthError[i];
        }
    }

    public static /* synthetic */ AuthError copy$default(AuthError authError, int i, AuthErrorCause authErrorCause, AuthErrorResponse authErrorResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = authError.statusCode;
        }
        if ((i2 & 2) != 0) {
            authErrorCause = authError.reason;
        }
        if ((i2 & 4) != 0) {
            authErrorResponse = authError.response;
        }
        return authError.copy(i, authErrorCause, authErrorResponse);
    }

    private Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.reason, this.response};
    }

    public final AuthError copy(int i, AuthErrorCause reason, AuthErrorResponse response) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(response, "response");
        return new AuthError(i, reason, response);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthError) {
            return C78966Uyw.LJIIIZ(((AuthError) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C78966Uyw.LJJJLL("AuthError:%s,%s,%s", getObjects());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.statusCode);
        out.writeString(this.reason.name());
        this.response.writeToParcel(out, i);
    }

    public final AuthErrorCause getReason() {
        return this.reason;
    }

    public final AuthErrorResponse getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuthError(int r2, com.kakao.sdk.common.model.AuthErrorCause r3, com.kakao.sdk.common.model.AuthErrorResponse r4) {
        /*
            r1 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = r4.getErrorDescription()
            if (r0 != 0) goto L14
            java.lang.String r0 = r4.getError()
        L14:
            r1.<init>(r0)
            r1.statusCode = r2
            r1.reason = r3
            r1.response = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.common.model.AuthError.<init>(int, com.kakao.sdk.common.model.AuthErrorCause, com.kakao.sdk.common.model.AuthErrorResponse):void");
    }
}
