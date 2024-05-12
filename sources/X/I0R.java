package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I0R implements Parcelable.Creator<OpenAlbumPanelPerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final OpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return OpenAlbumPanelPerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final OpenAlbumPanelPerformanceMonitor[] newArray(int i) {
        return new OpenAlbumPanelPerformanceMonitor[i];
    }
}
