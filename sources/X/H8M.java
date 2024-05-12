package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LibraryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8M implements Parcelable.Creator<LibraryModel> {
    @Override // android.os.Parcelable.Creator
    public final LibraryModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new LibraryModel(z, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LibraryModel[] newArray(int i) {
        return new LibraryModel[i];
    }
}
