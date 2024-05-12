package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GXP implements Parcelable.Creator<AutoCutSoundSyncModel> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutSoundSyncModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AutoCutSoundSyncModel(parcel.readString(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutSoundSyncModel[] newArray(int i) {
        return new AutoCutSoundSyncModel[i];
    }
}
