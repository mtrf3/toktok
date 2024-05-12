package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.Hz9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45855Hz9 implements Parcelable.Creator<CameraFirstFramePerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final CameraFirstFramePerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return CameraFirstFramePerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final CameraFirstFramePerformanceMonitor[] newArray(int i) {
        return new CameraFirstFramePerformanceMonitor[i];
    }
}
