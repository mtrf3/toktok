package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.util.performance.VideoRecordFirstFramePerformanceMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.HaH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44313HaH implements Parcelable.Creator<VideoRecordFirstFramePerformanceMonitor> {
    @Override // android.os.Parcelable.Creator
    public final VideoRecordFirstFramePerformanceMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return VideoRecordFirstFramePerformanceMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final VideoRecordFirstFramePerformanceMonitor[] newArray(int i) {
        return new VideoRecordFirstFramePerformanceMonitor[i];
    }
}
