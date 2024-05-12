package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HOg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43990HOg implements Parcelable.Creator<DMCameraModel> {
    @Override // android.os.Parcelable.Creator
    public final DMCameraModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        Boolean valueOf;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf = Boolean.valueOf(z3);
        }
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new DMCameraModel(z, readString, z2, readString2, valueOf, readInt, z4, parcel.readInt(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DMCameraModel[] newArray(int i) {
        return new DMCameraModel[i];
    }
}
