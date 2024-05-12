package com.bytedance.android.live.broadcast.model;

import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.util.List;

/* loaded from: classes.dex */
public class PushStreamInfo {

    @InterfaceC65349Pkn("default_quality")
    public Quality defaultQuality;

    @InterfaceC65349Pkn("qualities")
    public List<Quality> qualityList;

    /* loaded from: classes.dex */
    public static class Quality {

        @InterfaceC65349Pkn("default_bitrate")
        public long default_bitrate;

        @InterfaceC65349Pkn("desc")
        public String desc;

        @InterfaceC65349Pkn("fps")
        public long fps;

        @InterfaceC65349Pkn("height")
        public long height;

        @InterfaceC65349Pkn("max_bitrate")
        public long max_bitrate;

        @InterfaceC65349Pkn("min_bitrate")
        public long min_bitrate;

        @InterfaceC65349Pkn("name")
        public String name;

        @InterfaceC65349Pkn("sdk_key")
        public String sdkKey;

        @InterfaceC65349Pkn("width")
        public long width;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Quality{name='");
            Q89.LIZIZ(LIZ, this.name, '\'', ", desc='");
            Q89.LIZIZ(LIZ, this.desc, '\'', ", sdkKey='");
            Q89.LIZIZ(LIZ, this.sdkKey, '\'', ", width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", max_bitrate=");
            LIZ.append(this.max_bitrate);
            LIZ.append(", min_bitrate=");
            LIZ.append(this.min_bitrate);
            LIZ.append(", default_bitrate=");
            LIZ.append(this.default_bitrate);
            LIZ.append(", fps=");
            return C47135Ieh.LIZIZ(LIZ, this.fps, '}', LIZ);
        }
    }
}
