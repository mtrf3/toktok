package com.ss.android.ugc.aweme.flow;

import X.X7I;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class PageSession implements Parcelable {
    public static final Parcelable.Creator<PageSession> CREATOR = new X7I();

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
