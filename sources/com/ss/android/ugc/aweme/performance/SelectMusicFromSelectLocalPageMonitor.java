package com.ss.android.ugc.aweme.performance;

import X.X7N;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SelectMusicFromSelectLocalPageMonitor implements PerformanceMonitor {
    public static final SelectMusicFromSelectLocalPageMonitor INSTANCE = new SelectMusicFromSelectLocalPageMonitor();
    public static final Parcelable.Creator<SelectMusicFromSelectLocalPageMonitor> CREATOR = new X7N();

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
        return "tool_performance_use_music_from_select_music_local_page";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> LLJJJJ() {
        return new ArrayList();
    }
}