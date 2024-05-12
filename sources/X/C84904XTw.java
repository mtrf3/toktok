package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.XTw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84904XTw implements Parcelable.Creator<OpenEditMusicPanelPerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final OpenEditMusicPanelPerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return OpenEditMusicPanelPerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final OpenEditMusicPanelPerformanceMonitor[] newArray(int i) {
        return new OpenEditMusicPanelPerformanceMonitor[i];
    }
}
