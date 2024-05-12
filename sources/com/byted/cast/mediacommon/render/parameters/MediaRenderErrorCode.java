package com.byted.cast.mediacommon.render.parameters;

import com.byted.cast.mediacommon.MediaMonitor;

/* loaded from: classes29.dex */
public class MediaRenderErrorCode {
    public static int MEDIARENDER_DECODE_ERROR = -1002;
    public static int MEDIARENDER_INIT_ERROR = -1001;
    public static int MEDIARENDER_RENDER_ERROR = -1004;
    public static int MEDIARENDER_SURFACE_ERROR = -1003;

    public static void onError(String str, int i, String str2) {
        int i2 = MEDIARENDER_INIT_ERROR;
        if (i == i2) {
            MediaMonitor.onSinkMonitor("MEDIARENDER_INIT_ERROR", i2, str2, str);
            return;
        }
        int i3 = MEDIARENDER_DECODE_ERROR;
        if (i == i3) {
            MediaMonitor.onSinkMonitor("MEDIARENDER_DECODE_ERROR", i3, str2, str);
            return;
        }
        int i4 = MEDIARENDER_SURFACE_ERROR;
        if (i == i4) {
            MediaMonitor.onSinkMonitor("MEDIARENDER_SURFACE_ERROR", i4, str2, str);
            return;
        }
        int i5 = MEDIARENDER_RENDER_ERROR;
        if (i != i5) {
            return;
        }
        MediaMonitor.onSinkMonitor("MEDIARENDER_RENDER_ERROR", i5, str2, str);
    }
}
