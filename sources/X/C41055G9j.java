package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import kotlin.jvm.internal.o;

/* renamed from: X.G9j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41055G9j implements Parcelable.Creator<EditPostCheckResult> {
    @Override // android.os.Parcelable.Creator
    public final EditPostCheckResult createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
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
        EditPostPoiChangeType createFromParcel = EditPostPoiChangeType.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new EditPostCheckResult(z, z2, z3, z4, z5, createFromParcel, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final EditPostCheckResult[] newArray(int i) {
        return new EditPostCheckResult[i];
    }
}
