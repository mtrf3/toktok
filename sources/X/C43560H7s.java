package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.FilterModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43560H7s implements Parcelable.Creator<FilterModel> {
    @Override // android.os.Parcelable.Creator
    public final FilterModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new FilterModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final FilterModel[] newArray(int i) {
        return new FilterModel[i];
    }
}
