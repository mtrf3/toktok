package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.DuetLayoutInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class H9X implements Parcelable.Creator<DuetLayoutInfo> {
    @Override // android.os.Parcelable.Creator
    public final DuetLayoutInfo createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new DuetLayoutInfo(in.readInt(), in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final DuetLayoutInfo[] newArray(int i) {
        return new DuetLayoutInfo[i];
    }
}
