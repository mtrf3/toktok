package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.library.LibraryDetailParam;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GHE implements Parcelable.Creator<LibraryDetailParam> {
    @Override // android.os.Parcelable.Creator
    public final LibraryDetailParam createFromParcel(Parcel parcel) {
        Integer valueOf;
        Long valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        Music music = (Music) parcel.readSerializable();
        String readString6 = parcel.readString();
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new LibraryDetailParam(readString, readString2, readString3, readString4, readString5, music, readString6, valueOf, valueOf2, l);
    }

    @Override // android.os.Parcelable.Creator
    public final LibraryDetailParam[] newArray(int i) {
        return new LibraryDetailParam[i];
    }
}
