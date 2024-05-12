package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43235Gxz implements Parcelable.Creator<DraftInfoModel> {
    @Override // android.os.Parcelable.Creator
    public final DraftInfoModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new DraftInfoModel(z, z2, z3, readLong, readString, z4, z5, parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DraftInfoModel[] newArray(int i) {
        return new DraftInfoModel[i];
    }
}
