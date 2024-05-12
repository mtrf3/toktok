package com.ss.android.ugc.aweme.creative.model;

import X.H8M;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryModel implements Parcelable {
    public static final Parcelable.Creator<LibraryModel> CREATOR = new H8M();

    @InterfaceC65349Pkn("last_library_category")
    public String lastLibraryCategory;

    @InterfaceC65349Pkn("retake_from_library")
    public boolean retakeFromLibrary;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryModel() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.retakeFromLibrary ? 1 : 0);
        out.writeString(this.lastLibraryCategory);
    }

    public LibraryModel(boolean z, String str) {
        this.retakeFromLibrary = z;
        this.lastLibraryCategory = str;
    }

    public /* synthetic */ LibraryModel(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
