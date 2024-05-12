package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HDS implements Parcelable.Creator<EmbaddedWindowInfo> {
    @Override // android.os.Parcelable.Creator
    public final EmbaddedWindowInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EmbaddedWindowInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final EmbaddedWindowInfo[] newArray(int i) {
        return new EmbaddedWindowInfo[i];
    }
}
