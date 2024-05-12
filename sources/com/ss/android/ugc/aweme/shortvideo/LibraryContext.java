package com.ss.android.ugc.aweme.shortvideo;

import X.HJ1;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryContext implements Parcelable {
    public static final Parcelable.Creator<LibraryContext> CREATOR = new HJ1();
    public int libraryMaterialCount;
    public LibraryMaterialInfoSv libraryMaterialInfo;

    public LibraryContext() {
        this(0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.libraryMaterialCount);
        out.writeParcelable(this.libraryMaterialInfo, i);
    }

    public LibraryContext(int i, LibraryMaterialInfoSv libraryMaterialInfoSv) {
        this.libraryMaterialCount = i;
        this.libraryMaterialInfo = libraryMaterialInfoSv;
    }
}
