package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount;

import X.C72030SOs;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivateAccountConfig implements Parcelable {
    public static final Parcelable.Creator<PrivateAccountConfig> CREATOR = new C72030SOs();

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
