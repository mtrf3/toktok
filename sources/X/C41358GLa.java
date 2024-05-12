package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import kotlin.jvm.internal.o;

/* renamed from: X.GLa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41358GLa implements Parcelable.Creator<ForwardEditPublishData> {
    @Override // android.os.Parcelable.Creator
    public final ForwardEditPublishData createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ForwardEditPublishData(readString, readString2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final ForwardEditPublishData[] newArray(int i) {
        return new ForwardEditPublishData[i];
    }
}
