package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AudioVolumeAdjustModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBC implements Parcelable.Creator<AudioVolumeAdjustModel> {
    @Override // android.os.Parcelable.Creator
    public final AudioVolumeAdjustModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AudioVolumeAdjustModel(parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public final AudioVolumeAdjustModel[] newArray(int i) {
        return new AudioVolumeAdjustModel[i];
    }
}
