package com.kakao.sdk.common.model;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ClientError extends KakaoSdkError implements Parcelable {
    public static final Parcelable.Creator<ClientError> CREATOR = new Creator();
    public final String msg;
    public final ClientErrorCause reason;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<ClientError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientError createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ClientError(ClientErrorCause.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientError[] newArray(int i) {
            return new ClientError[i];
        }
    }

    public static /* synthetic */ ClientError copy$default(ClientError clientError, ClientErrorCause clientErrorCause, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            clientErrorCause = clientError.reason;
        }
        if ((i & 2) != 0) {
            str = clientError.getMsg();
        }
        return clientError.copy(clientErrorCause, str);
    }

    public final String component2() {
        return getMsg();
    }

    public final ClientError copy(ClientErrorCause reason, String msg) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(msg, "msg");
        return new ClientError(reason, msg);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientError)) {
            return false;
        }
        ClientError clientError = (ClientError) obj;
        return this.reason == clientError.reason && o.LJ(getMsg(), clientError.getMsg());
    }

    public int hashCode() {
        return getMsg().hashCode() + (this.reason.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientError(reason=");
        LIZ.append(this.reason);
        LIZ.append(", msg=");
        LIZ.append(getMsg());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.reason.name());
        out.writeString(this.msg);
    }

    @Override // com.kakao.sdk.common.model.KakaoSdkError
    public String getMsg() {
        return this.msg;
    }

    public final ClientErrorCause getReason() {
        return this.reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientError(ClientErrorCause reason, String msg) {
        super(msg);
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(msg, "msg");
        this.reason = reason;
        this.msg = msg;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ClientError(com.kakao.sdk.common.model.ClientErrorCause r3, java.lang.String r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L1c
            java.lang.Class r1 = r3.getClass()
            java.lang.String r0 = r3.name()
            java.lang.reflect.Field r1 = r1.getField(r0)
            java.lang.Class<com.kakao.sdk.common.model.Description> r0 = com.kakao.sdk.common.model.Description.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            com.kakao.sdk.common.model.Description r0 = (com.kakao.sdk.common.model.Description) r0
            if (r0 != 0) goto L20
            java.lang.String r4 = "Client-side error"
        L1c:
            r2.<init>(r3, r4)
            return
        L20:
            java.lang.String r4 = r0.value()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.common.model.ClientError.<init>(com.kakao.sdk.common.model.ClientErrorCause, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
