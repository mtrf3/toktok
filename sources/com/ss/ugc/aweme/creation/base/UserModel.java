package com.ss.ugc.aweme.creation.base;

import X.C41267GHn;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class UserModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<UserModel> CREATOR = new C41267GHn();

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public UserModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.userId);
        parcel.writeString(this.nickname);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public UserModel(String str, String str2) {
        this.userId = str;
        this.nickname = str2;
    }

    public /* synthetic */ UserModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
