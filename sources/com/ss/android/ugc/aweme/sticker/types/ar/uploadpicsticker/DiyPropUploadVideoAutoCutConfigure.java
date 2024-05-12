package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import X.C44511HdT;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DiyPropUploadVideoAutoCutConfigure extends F9E implements Parcelable {
    public static final Parcelable.Creator<DiyPropUploadVideoAutoCutConfigure> CREATOR = new C44511HdT();

    @InterfaceC65349Pkn("autoCutHeight")
    public final double autoCutHeight;

    @InterfaceC65349Pkn("autoCutWidth")
    public final double autoCutWidth;

    @InterfaceC65349Pkn("enableAutoCutting")
    public final boolean enableAutoCutting;

    @InterfaceC65349Pkn("maxDuration")
    public final long maxDuration;

    @InterfaceC65349Pkn("maxHeight")
    public final double maxHeight;

    @InterfaceC65349Pkn("maxWidth")
    public final double maxWidth;

    @InterfaceC65349Pkn("minDuration")
    public final long minDuration;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableAutoCutting), Double.valueOf(this.autoCutWidth), Double.valueOf(this.autoCutHeight), Double.valueOf(this.maxWidth), Double.valueOf(this.maxHeight), Long.valueOf(this.minDuration), Long.valueOf(this.maxDuration)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.enableAutoCutting ? 1 : 0);
        parcel.writeDouble(this.autoCutWidth);
        parcel.writeDouble(this.autoCutHeight);
        parcel.writeDouble(this.maxWidth);
        parcel.writeDouble(this.maxHeight);
        parcel.writeLong(this.minDuration);
        parcel.writeLong(this.maxDuration);
    }

    public DiyPropUploadVideoAutoCutConfigure(boolean z, double d, double d2, double d3, double d4, long j, long j2) {
        this.enableAutoCutting = z;
        this.autoCutWidth = d;
        this.autoCutHeight = d2;
        this.maxWidth = d3;
        this.maxHeight = d4;
        this.minDuration = j;
        this.maxDuration = j2;
    }

    public /* synthetic */ DiyPropUploadVideoAutoCutConfigure(boolean z, double d, double d2, double d3, double d4, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, d, d2, d3, d4, j, j2);
    }
}
