package com.byted.cast.render.render.video;

import android.view.Surface;
import com.byted.cast.render.render.IRender;

/* loaded from: classes29.dex */
public interface IVideoRender extends IRender {
    void config_video_parameters(int i, int i2, int i3, int i4, int i5);

    void isOpenDump(boolean z);

    void setDumpPath(String str);

    void setSurface(Surface surface);
}
