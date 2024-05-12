package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.VolumeInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43555H7n implements Parcelable.Creator<VolumeInfoModel> {
    @Override // android.os.Parcelable.Creator
    public final VolumeInfoModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new VolumeInfoModel(parcel.readFloat(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final VolumeInfoModel[] newArray(int i) {
        return new VolumeInfoModel[i];
    }
}
