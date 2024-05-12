package com.ss.android.ugc.aweme.cutsame;

import X.C45120HnI;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AuthorInfo implements Parcelable {
    public static final Parcelable.Creator<AuthorInfo> CREATOR = new C45120HnI();

    @InterfaceC65349Pkn("avatar_thumb")
    public SimpleImage avatar;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
