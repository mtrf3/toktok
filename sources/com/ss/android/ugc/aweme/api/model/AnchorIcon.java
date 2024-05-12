package com.ss.android.ugc.aweme.api.model;

import X.C42742Gq2;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorIcon implements Parcelable {
    public static final Parcelable.Creator<AnchorIcon> CREATOR = new C42742Gq2();

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public ArrayList<String> urlList;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorIcon() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uri);
        out.writeStringList(this.urlList);
    }

    public AnchorIcon(String str, ArrayList<String> arrayList) {
        this.uri = str;
        this.urlList = arrayList;
    }

    public /* synthetic */ AnchorIcon(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : arrayList);
    }
}
