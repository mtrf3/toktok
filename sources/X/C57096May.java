package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import kotlin.jvm.internal.o;

/* renamed from: X.May, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57096May implements Parcelable.Creator<TaskTraceMetric> {
    @Override // android.os.Parcelable.Creator
    public final TaskTraceMetric createFromParcel(Parcel parcel) {
        o.LJIIJ(parcel, "parcel");
        TaskTraceMetric taskTraceMetric = new TaskTraceMetric();
        taskTraceMetric.initTime = parcel.readLong();
        taskTraceMetric.taskExecuteStartTime = parcel.readLong();
        taskTraceMetric.taskExecuteEndTime = parcel.readLong();
        taskTraceMetric.shootStartTime = parcel.readLong();
        taskTraceMetric.shootEndTime = parcel.readLong();
        return taskTraceMetric;
    }

    @Override // android.os.Parcelable.Creator
    public final TaskTraceMetric[] newArray(int i) {
        return new TaskTraceMetric[i];
    }
}
