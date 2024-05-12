package com.ss.android.ugc.aweme.external.router;

import X.C1NE;
import X.C42519GmR;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AssetInfo implements Parcelable {
    public static final Parcelable.Creator<AssetInfo> CREATOR = new C42519GmR();

    @InterfaceC65349Pkn("asset_type")
    public final String type;

    @InterfaceC65349Pkn("urls")
    public final List<String> urls;

    /* JADX WARN: Multi-variable type inference failed */
    public AssetInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetInfo)) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) obj;
        return o.LJ(this.type, assetInfo.type) && o.LJ(this.urls, assetInfo.urls);
    }

    public final int hashCode() {
        String str = this.type;
        return this.urls.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.type);
        out.writeStringList(this.urls);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssetInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", urls=");
        return C1NE.LIZIZ(LIZ, this.urls, ')', LIZ);
    }

    public AssetInfo(String str, List<String> urls) {
        o.LJIIIZ(urls, "urls");
        this.type = str;
        this.urls = urls;
    }

    public /* synthetic */ AssetInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
