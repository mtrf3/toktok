package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Text extends F9E {

    @InterfaceC65349Pkn("alignment")
    public final int alignment;

    @InterfaceC65349Pkn("bg_alpha")
    public final double backgroundAlpha;

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("border_color")
    public final String borderColor;

    @InterfaceC65349Pkn("clip")
    public final Clip clip;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("font_size")
    public final int fontSize;

    @InterfaceC65349Pkn("target_timerange")
    public final TimeRange targetTimeRange;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @InterfaceC65349Pkn("track_index")
    public final int trackIndex;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, Integer.valueOf(this.fontSize), this.targetTimeRange, this.textColor, this.backgroundColor, Double.valueOf(this.backgroundAlpha), this.borderColor, Integer.valueOf(this.alignment), this.clip, Integer.valueOf(this.trackIndex)};
    }

    public Text(String content, int i, TimeRange targetTimeRange, String textColor, String backgroundColor, double d, String borderColor, int i2, Clip clip, int i3) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(targetTimeRange, "targetTimeRange");
        o.LJIIIZ(textColor, "textColor");
        o.LJIIIZ(backgroundColor, "backgroundColor");
        o.LJIIIZ(borderColor, "borderColor");
        o.LJIIIZ(clip, "clip");
        this.content = content;
        this.fontSize = i;
        this.targetTimeRange = targetTimeRange;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.backgroundAlpha = d;
        this.borderColor = borderColor;
        this.alignment = i2;
        this.clip = clip;
        this.trackIndex = i3;
    }
}
