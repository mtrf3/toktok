package com.ss.android.ugc.aweme.creative.model;

import X.C36433ERp;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GreenScreenInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<GreenScreenInfo> CREATOR = new C36433ERp();

    @InterfaceC65349Pkn("selectedMedia")
    public final String selectedMedia;

    /* JADX WARN: Multi-variable type inference failed */
    public GreenScreenInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.selectedMedia};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.selectedMedia);
    }

    public GreenScreenInfo(String selectedMedia) {
        o.LJIIIZ(selectedMedia, "selectedMedia");
        this.selectedMedia = selectedMedia;
    }

    public /* synthetic */ GreenScreenInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
