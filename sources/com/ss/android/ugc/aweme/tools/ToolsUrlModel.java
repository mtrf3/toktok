package com.ss.android.ugc.aweme.tools;

import X.C1NE;
import X.C79154V4s;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes14.dex */
public class ToolsUrlModel implements Parcelable {
    public static final Parcelable.Creator<ToolsUrlModel> CREATOR = new C79154V4s();

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.urlList.hashCode() + (this.uri.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolsUrlModel{uri='");
        Q89.LIZIZ(LIZ, this.uri, '\'', ", urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, '}', LIZ);
    }

    public ToolsUrlModel() {
    }

    public ToolsUrlModel(Parcel parcel) {
        this.uri = parcel.readString();
        this.urlList = parcel.createStringArrayList();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToolsUrlModel toolsUrlModel = (ToolsUrlModel) obj;
        if (!this.uri.equals(toolsUrlModel.uri)) {
            return false;
        }
        return this.urlList.equals(toolsUrlModel.urlList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
    }
}
