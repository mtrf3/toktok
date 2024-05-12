package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchModel;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchUser;
import kotlin.jvm.internal.o;

/* renamed from: X.GSy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41564GSy implements Parcelable.Creator<StitchModel> {
    @Override // android.os.Parcelable.Creator
    public final StitchModel createFromParcel(Parcel parcel) {
        StitchUser createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = StitchUser.CREATOR.createFromParcel(parcel);
        }
        return new StitchModel(createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StitchModel[] newArray(int i) {
        return new StitchModel[i];
    }
}
