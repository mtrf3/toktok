package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GW1 implements Parcelable.Creator<PublishFailMsg> {
    @Override // android.os.Parcelable.Creator
    public final PublishFailMsg createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new PublishFailMsg(readString, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final PublishFailMsg[] newArray(int i) {
        return new PublishFailMsg[i];
    }
}
