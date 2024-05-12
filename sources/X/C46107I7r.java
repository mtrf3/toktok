package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState;
import kotlin.jvm.internal.o;

/* renamed from: X.I7r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46107I7r implements Parcelable.Creator<MultiEditTrimState> {
    @Override // android.os.Parcelable.Creator
    public final MultiEditTrimState createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new MultiEditTrimState(z, parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final MultiEditTrimState[] newArray(int i) {
        return new MultiEditTrimState[i];
    }
}
