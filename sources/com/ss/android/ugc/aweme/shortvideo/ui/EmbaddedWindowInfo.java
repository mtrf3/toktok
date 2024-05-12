package com.ss.android.ugc.aweme.shortvideo.ui;

import X.HDS;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EmbaddedWindowInfo implements Parcelable {
    public static final HDS CREATOR = new HDS();

    @InterfaceC65349Pkn("e")
    public int end;

    @InterfaceC65349Pkn("h")
    public int height;

    @InterfaceC65349Pkn("s")
    public int start;

    @InterfaceC65349Pkn("w")
    public int width;

    @InterfaceC65349Pkn("x")
    public int x;

    @InterfaceC65349Pkn("y")
    public int y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmbaddedWindowInfo() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbaddedWindowInfo(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.start = parcel.readInt();
        this.end = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public EmbaddedWindowInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.width = i;
        this.height = i2;
        this.x = i3;
        this.y = i4;
        this.start = i5;
        this.end = i6;
    }
}
