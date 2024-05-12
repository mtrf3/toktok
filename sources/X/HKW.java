package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HKW implements Parcelable.Creator<BeautifySegmentInfo> {
    @Override // android.os.Parcelable.Creator
    public final BeautifySegmentInfo createFromParcel(Parcel in) {
        boolean z;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        String readString3 = in.readString();
        String readString4 = in.readString();
        String readString5 = in.readString();
        String readString6 = in.readString();
        String readString7 = in.readString();
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new BeautifySegmentInfo(readString, readString2, readString3, readString4, readString5, readString6, readString7, z);
    }

    @Override // android.os.Parcelable.Creator
    public final BeautifySegmentInfo[] newArray(int i) {
        return new BeautifySegmentInfo[i];
    }
}
