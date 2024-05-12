package com.ss.android.ugc.aweme.performance;

import X.C47261Igj;
import X.C84901XTt;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class OpenMusicPanelPerformanceMonitor implements PerformanceMonitor {
    public static final OpenMusicPanelPerformanceMonitor INSTANCE = new OpenMusicPanelPerformanceMonitor();
    public static final Parcelable.Creator<OpenMusicPanelPerformanceMonitor> CREATOR = new C84901XTt();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getEnterFrom() {
        return "video_shoot_page";
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getType() {
        return "tool_performance_open_choose_music_panel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> LLJJJJ() {
        return C47261Igj.LJII("animation_finished", "set_music_data");
    }
}
