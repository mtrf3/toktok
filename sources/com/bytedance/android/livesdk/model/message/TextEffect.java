package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes17.dex */
public class TextEffect {

    @InterfaceC65349Pkn("landscape")
    public Detail landscapeDetail;

    @InterfaceC65349Pkn("portrait")
    public Detail portraitDetail;

    /* loaded from: classes17.dex */
    public static class Detail {

        @InterfaceC65349Pkn("background")
        public ImageModel background;

        @InterfaceC65349Pkn("duration")
        public long duration;

        @InterfaceC65349Pkn("height")
        public int height;

        @InterfaceC65349Pkn("shadow_color")
        public String shadowColor;

        @InterfaceC65349Pkn("shadow_dx")
        public int shadowDx;

        @InterfaceC65349Pkn("shadow_dy")
        public int shadowDy;

        @InterfaceC65349Pkn("shadow_radius")
        public int shadowRadius;

        @InterfaceC65349Pkn("start")
        public long start;

        @InterfaceC65349Pkn("stroke_color")
        public String strokeColor;

        @InterfaceC65349Pkn("stroke_width")
        public int strokeWidth;

        @InterfaceC65349Pkn("text")
        public Text text;

        @InterfaceC65349Pkn("text_font_size")
        public int textFontSize;

        @InterfaceC65349Pkn("width")
        public int width;

        @InterfaceC65349Pkn("x")
        public int x;

        @InterfaceC65349Pkn("y")
        public int y;
    }
}
