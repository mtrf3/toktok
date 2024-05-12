package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.CollectionInfoParcelableForShoot;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBF implements Parcelable.Creator<CollectionInfoParcelableForShoot> {
    @Override // android.os.Parcelable.Creator
    public final CollectionInfoParcelableForShoot createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CollectionInfoParcelableForShoot(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CollectionInfoParcelableForShoot[] newArray(int i) {
        return new CollectionInfoParcelableForShoot[i];
    }
}
