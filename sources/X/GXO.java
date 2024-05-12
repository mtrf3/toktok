package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GXO implements Parcelable.Creator<NLEInfoModel> {
    @Override // android.os.Parcelable.Creator
    public final NLEInfoModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new NLEInfoModel(parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final NLEInfoModel[] newArray(int i) {
        return new NLEInfoModel[i];
    }
}
