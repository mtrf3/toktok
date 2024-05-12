package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCN implements Parcelable.Creator<InitialMobParams> {
    @Override // android.os.Parcelable.Creator
    public final InitialMobParams createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return new InitialMobParams(readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final InitialMobParams[] newArray(int i) {
        return new InitialMobParams[i];
    }
}
