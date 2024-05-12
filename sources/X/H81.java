package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditVideoEnhanceModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H81 implements Parcelable.Creator<EditVideoEnhanceModel> {
    @Override // android.os.Parcelable.Creator
    public final EditVideoEnhanceModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EditVideoEnhanceModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final EditVideoEnhanceModel[] newArray(int i) {
        return new EditVideoEnhanceModel[i];
    }
}
