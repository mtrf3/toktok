package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBD implements Parcelable.Creator<LoadMusicAndEffectModel> {
    @Override // android.os.Parcelable.Creator
    public final LoadMusicAndEffectModel createFromParcel(Parcel parcel) {
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
        return new LoadMusicAndEffectModel(z, z2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LoadMusicAndEffectModel[] newArray(int i) {
        return new LoadMusicAndEffectModel[i];
    }
}
