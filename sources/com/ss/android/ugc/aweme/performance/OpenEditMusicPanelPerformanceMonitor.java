package com.ss.android.ugc.aweme.performance;

import X.C47261Igj;
import X.C84904XTw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class OpenEditMusicPanelPerformanceMonitor implements PerformanceMonitor {
    public static final OpenEditMusicPanelPerformanceMonitor INSTANCE = new OpenEditMusicPanelPerformanceMonitor();
    public static final Parcelable.Creator<OpenEditMusicPanelPerformanceMonitor> CREATOR = new C84904XTw();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getEnterFrom() {
        return "video_edit_page";
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
        return C47261Igj.LJII("panel_opened", "music_data_set");
    }
}
