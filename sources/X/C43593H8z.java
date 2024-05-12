package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H8z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43593H8z implements Parcelable.Creator<MusicVolumeInfoModel> {
    @Override // android.os.Parcelable.Creator
    public final MusicVolumeInfoModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new MusicVolumeInfoModel(parcel.readString(), parcel.readString(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicVolumeInfoModel[] newArray(int i) {
        return new MusicVolumeInfoModel[i];
    }
}
