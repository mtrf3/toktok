package com.ss.android.ugc.aweme.cutsame;

import X.C45124HnM;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SimpleImage implements Parcelable {
    public static final Parcelable.Creator<SimpleImage> CREATOR = new C45124HnM();

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @InterfaceC65349Pkn("width")
    public int width;

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
