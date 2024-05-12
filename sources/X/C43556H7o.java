package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43556H7o implements Parcelable.Creator<FollowUpPublishTrackerModel> {
    @Override // android.os.Parcelable.Creator
    public final FollowUpPublishTrackerModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new FollowUpPublishTrackerModel(readString, readString2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final FollowUpPublishTrackerModel[] newArray(int i) {
        return new FollowUpPublishTrackerModel[i];
    }
}
