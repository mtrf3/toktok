package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.UGCOpenAlbumPanelPerformanceMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQG implements Parcelable.Creator<UGCOpenAlbumPanelPerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final UGCOpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return UGCOpenAlbumPanelPerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final UGCOpenAlbumPanelPerformanceMonitor[] newArray(int i) {
        return new UGCOpenAlbumPanelPerformanceMonitor[i];
    }
}
