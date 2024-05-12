package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.HQE;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutAnchorOpenAlbumPerformanceMonitor implements PerformanceMonitor {
    public static final AutoCutAnchorOpenAlbumPerformanceMonitor INSTANCE = new AutoCutAnchorOpenAlbumPerformanceMonitor();
    public static final Parcelable.Creator<AutoCutAnchorOpenAlbumPerformanceMonitor> CREATOR = new HQE();

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
        return "tool_performance_open_album_panel_autocut_anchor";
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
