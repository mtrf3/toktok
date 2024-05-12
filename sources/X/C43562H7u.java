package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.HDRModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43562H7u implements Parcelable.Creator<HDRModel> {
    @Override // android.os.Parcelable.Creator
    public final HDRModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new HDRModel(z, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final HDRModel[] newArray(int i) {
        return new HDRModel[i];
    }
}
