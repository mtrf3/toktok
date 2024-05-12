package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9W implements Parcelable.Creator<CreateAnchorInfo> {
    @Override // android.os.Parcelable.Creator
    public final CreateAnchorInfo createFromParcel(Parcel parcel) {
        Long valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new CreateAnchorInfo(readInt, readString, readString2, readString3, readString4, readString5, valueOf, readString6, readString7, readString8, readString9, bool, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final CreateAnchorInfo[] newArray(int i) {
        return new CreateAnchorInfo[i];
    }
}
