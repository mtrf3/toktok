package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ERn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36431ERn implements Parcelable.Creator<DraftInfo> {
    @Override // android.os.Parcelable.Creator
    public final DraftInfo createFromParcel(Parcel parcel) {
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
        return new DraftInfo(readString, z, z2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DraftInfo[] newArray(int i) {
        return new DraftInfo[i];
    }
}
