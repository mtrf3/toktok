package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.LibraryContext;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJ1 implements Parcelable.Creator<LibraryContext> {
    @Override // android.os.Parcelable.Creator
    public final LibraryContext createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LibraryContext(parcel.readInt(), (LibraryMaterialInfoSv) parcel.readParcelable(LibraryContext.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final LibraryContext[] newArray(int i) {
        return new LibraryContext[i];
    }
}
