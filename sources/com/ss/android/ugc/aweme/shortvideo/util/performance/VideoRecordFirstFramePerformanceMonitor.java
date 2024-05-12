package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C44313HaH;
import X.C47261Igj;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoRecordFirstFramePerformanceMonitor implements PerformanceMonitor {
    public static final VideoRecordFirstFramePerformanceMonitor INSTANCE = new VideoRecordFirstFramePerformanceMonitor();
    public static final Parcelable.Creator<VideoRecordFirstFramePerformanceMonitor> CREATOR = new C44313HaH();

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
        return "av_video_record_init";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> LLJJJJ() {
        return C47261Igj.LJII("PlanC onResume");
    }
}
