package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C47261Igj;
import X.C83596WrQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CameraFirstFramePerformanceMonitorV2 implements PerformanceMonitor {
    public static final CameraFirstFramePerformanceMonitorV2 INSTANCE = new CameraFirstFramePerformanceMonitorV2();
    public static final Parcelable.Creator<CameraFirstFramePerformanceMonitorV2> CREATOR = new C83596WrQ();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getEnterFrom() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getType() {
        return "av_camera_open_init";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> LLJJJJ() {
        return C47261Igj.LJII("camera frame available");
    }
}
