package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.F9E;
import X.TA7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EditImage extends F9E implements Parcelable {
    public static final Parcelable.Creator<EditImage> CREATOR = new TA7();
    public final long time;
    public final Uri url;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.url, Long.valueOf(this.time)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.url, i);
        out.writeLong(this.time);
    }

    public EditImage(Uri url, long j) {
        o.LJIIIZ(url, "url");
        this.url = url;
        this.time = j;
    }
}
