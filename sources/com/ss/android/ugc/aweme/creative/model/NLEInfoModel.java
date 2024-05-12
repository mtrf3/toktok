package com.ss.android.ugc.aweme.creative.model;

import X.GXO;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NLEInfoModel implements Parcelable {
    public static final Parcelable.Creator<NLEInfoModel> CREATOR = new GXO();

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("nle_data_path")
    public String nleDataPath;

    @InterfaceC65349Pkn("nle_data_version")
    public int nleDataVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public NLEInfoModel() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.nleDataPath);
        out.writeInt(this.nleDataVersion);
    }

    public NLEInfoModel(String nleDataPath, int i) {
        o.LJIIIZ(nleDataPath, "nleDataPath");
        this.nleDataPath = nleDataPath;
        this.nleDataVersion = i;
    }

    public /* synthetic */ NLEInfoModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
