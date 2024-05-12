package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ESJ {
    public static final /* synthetic */ int LIZ = 0;

    static {
        ESJ.class.getClassLoader();
    }

    public static Parcelable LIZ(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
