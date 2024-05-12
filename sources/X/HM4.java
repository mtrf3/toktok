package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HM4 implements Parcelable.Creator<RecordDowngradeModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordDowngradeModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Float valueOf;
        boolean z3;
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
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new RecordDowngradeModel(z, z2, readString, valueOf, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordDowngradeModel[] newArray(int i) {
        return new RecordDowngradeModel[i];
    }
}
