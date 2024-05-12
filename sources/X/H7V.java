package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7V implements Parcelable.Creator<StoryEditEtParam> {
    @Override // android.os.Parcelable.Creator
    public final StoryEditEtParam createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new StoryEditEtParam(readString, readString2, readString3, readString4, z, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final StoryEditEtParam[] newArray(int i) {
        return new StoryEditEtParam[i];
    }
}
