package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8Q implements Parcelable.Creator<EditDescMobModel> {
    @Override // android.os.Parcelable.Creator
    public final EditDescMobModel createFromParcel(Parcel parcel) {
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
        return new EditDescMobModel(z, z2, z3, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final EditDescMobModel[] newArray(int i) {
        return new EditDescMobModel[i];
    }
}
