package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.XTt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84901XTt implements Parcelable.Creator<OpenMusicPanelPerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final OpenMusicPanelPerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return OpenMusicPanelPerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final OpenMusicPanelPerformanceMonitor[] newArray(int i) {
        return new OpenMusicPanelPerformanceMonitor[i];
    }
}
