package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.SoundSyncOpenAlbumPanelPerformanceMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQF implements Parcelable.Creator<SoundSyncOpenAlbumPanelPerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SoundSyncOpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SoundSyncOpenAlbumPanelPerformanceMonitor[] newArray(int i) {
        return new SoundSyncOpenAlbumPanelPerformanceMonitor[i];
    }
}
