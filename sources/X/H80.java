package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.VEBytevc1Model;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H80 implements Parcelable.Creator<VEBytevc1Model> {
    @Override // android.os.Parcelable.Creator
    public final VEBytevc1Model createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new VEBytevc1Model(z, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final VEBytevc1Model[] newArray(int i) {
        return new VEBytevc1Model[i];
    }
}
