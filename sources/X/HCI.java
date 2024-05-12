package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HCI implements Parcelable.Creator<AddYoursModel> {
    @Override // android.os.Parcelable.Creator
    public final AddYoursModel createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
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
        return new AddYoursModel(bool, in.readString(), in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddYoursModel[] newArray(int i) {
        return new AddYoursModel[i];
    }
}
