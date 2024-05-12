package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.NaviContext;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HYD implements Parcelable.Creator<NaviContext> {
    @Override // android.os.Parcelable.Creator
    public final NaviContext createFromParcel(Parcel parcel) {
        Long valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new NaviContext(valueOf, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final NaviContext[] newArray(int i) {
        return new NaviContext[i];
    }
}
