package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.AutoCutAnchorOpenAlbumPerformanceMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQE implements Parcelable.Creator<AutoCutAnchorOpenAlbumPerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutAnchorOpenAlbumPerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return AutoCutAnchorOpenAlbumPerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutAnchorOpenAlbumPerformanceMonitor[] newArray(int i) {
        return new AutoCutAnchorOpenAlbumPerformanceMonitor[i];
    }
}
