package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CheckPointModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43567H7z implements Parcelable.Creator<CheckPointModel> {
    @Override // android.os.Parcelable.Creator
    public final CheckPointModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new CheckPointModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final CheckPointModel[] newArray(int i) {
        return new CheckPointModel[i];
    }
}
