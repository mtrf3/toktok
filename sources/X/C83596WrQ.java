package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitorV2;
import kotlin.jvm.internal.o;

/* renamed from: X.WrQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83596WrQ implements Parcelable.Creator<CameraFirstFramePerformanceMonitorV2> {
    @Override // android.os.Parcelable.Creator
    public final CameraFirstFramePerformanceMonitorV2 createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return CameraFirstFramePerformanceMonitorV2.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final CameraFirstFramePerformanceMonitorV2[] newArray(int i) {
        return new CameraFirstFramePerformanceMonitorV2[i];
    }
}
