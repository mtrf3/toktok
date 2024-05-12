package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCR implements Parcelable.Creator<WWAModel> {
    @Override // android.os.Parcelable.Creator
    public final WWAModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new WWAModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final WWAModel[] newArray(int i) {
        return new WWAModel[i];
    }
}
