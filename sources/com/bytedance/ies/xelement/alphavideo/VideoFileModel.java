package com.bytedance.ies.xelement.alphavideo;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.Map;

/* loaded from: classes15.dex */
public class VideoFileModel {

    @InterfaceC65349Pkn("landscape")
    public Item landscape;

    @InterfaceC65349Pkn("portrait")
    public Item portrait;

    /* loaded from: classes15.dex */
    public static class Item {

        @InterfaceC65349Pkn("h")
        public int actualHeight;

        @InterfaceC65349Pkn("w")
        public int actualWidth;

        @InterfaceC65349Pkn("align")
        public int align;

        @InterfaceC65349Pkn("aFrame")
        public int[] alphaFrame;

        @InterfaceC65349Pkn("masks")
        public Map<String, Map<String, DataSource.Element>> masks;

        @InterfaceC65349Pkn("path")
        public String path;

        @InterfaceC65349Pkn("rgbFrame")
        public int[] rgbFrame;

        @InterfaceC65349Pkn("f")
        public int totalFrame;

        @InterfaceC65349Pkn("v")
        public int version;

        @InterfaceC65349Pkn("videoH")
        public int videoHeight;

        @InterfaceC65349Pkn("videoW")
        public int videoWidth;
    }
}
