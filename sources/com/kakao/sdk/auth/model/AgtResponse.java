package com.kakao.sdk.auth.model;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AgtResponse extends F9E implements Parcelable {
    public static final Parcelable.Creator<AgtResponse> CREATOR = new Creator();
    public final String agt;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<AgtResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgtResponse createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AgtResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgtResponse[] newArray(int i) {
            return new AgtResponse[i];
        }
    }

    public static /* synthetic */ AgtResponse copy$default(AgtResponse agtResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agtResponse.agt;
        }
        return agtResponse.copy(str);
    }

    public final AgtResponse copy(String agt) {
        o.LJIIIZ(agt, "agt");
        return new AgtResponse(agt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.agt};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.agt);
    }

    public final String getAgt() {
        return this.agt;
    }

    public AgtResponse(String agt) {
        o.LJIIIZ(agt, "agt");
        this.agt = agt;
    }
}
