package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui;

import X.C72029SOr;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommentFilterConfig implements Parcelable {
    public static final Parcelable.Creator<CommentFilterConfig> CREATOR = new C72029SOr();

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
