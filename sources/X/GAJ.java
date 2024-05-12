package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAJ implements Parcelable.Creator<LibraryParams> {
    @Override // android.os.Parcelable.Creator
    public final LibraryParams createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        EditVideoSegment editVideoSegment = (EditVideoSegment) parcel.readParcelable(LibraryParams.class.getClassLoader());
        String readString = parcel.readString();
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new LibraryParams(editVideoSegment, readString, valueOf, bool, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final LibraryParams[] newArray(int i) {
        return new LibraryParams[i];
    }
}
