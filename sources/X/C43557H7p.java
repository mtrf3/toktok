package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PrePublishEntranceModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43557H7p implements Parcelable.Creator<PrePublishEntranceModel> {
    @Override // android.os.Parcelable.Creator
    public final PrePublishEntranceModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new PrePublishEntranceModel(z, z2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PrePublishEntranceModel[] newArray(int i) {
        return new PrePublishEntranceModel[i];
    }
}
