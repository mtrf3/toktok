package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AnchorModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HIO implements Parcelable.Creator<AnchorModel> {
    @Override // android.os.Parcelable.Creator
    public final AnchorModel createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        String readString = in.readString();
        String readString2 = in.readString();
        String readString3 = in.readString();
        String readString4 = in.readString();
        String readString5 = in.readString();
        String readString6 = in.readString();
        String readString7 = in.readString();
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return new AnchorModel(readInt, readString, readString2, readString3, readString4, readString5, readString6, readString7, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final AnchorModel[] newArray(int i) {
        return new AnchorModel[i];
    }
}
