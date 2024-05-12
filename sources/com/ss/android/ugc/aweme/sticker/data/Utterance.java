package com.ss.android.ugc.aweme.sticker.data;

import X.C16880lQ;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Utterance implements Serializable {

    @InterfaceC65349Pkn("alignment")
    public int alignment;

    @InterfaceC65349Pkn("bg_color")
    public String bgColor;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("source_height")
    public float srcHeight;

    @InterfaceC65349Pkn("source_width")
    public float srcWidth;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("text_color")
    public String textColor;

    @InterfaceC65349Pkn("text_size")
    public int textSize;

    public int hashCode() {
        long j = 31;
        return (int) ((((this.startTime * j) + C16880lQ.LLJIJIL(this.endTime)) * j) + this.text.hashCode());
    }

    public Utterance() {
        this.text = "";
        this.textColor = "#00FFFFF";
        this.textSize = 22;
        this.bgColor = "#00000000";
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final float getSrcHeight() {
        return this.srcHeight;
    }

    public final float getSrcWidth() {
        return this.srcWidth;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Utterance(Utterance utterance) {
        this();
        o.LJIIIZ(utterance, "utterance");
        this.startTime = utterance.startTime;
        this.endTime = utterance.endTime;
        this.text = utterance.text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.data.Utterance");
        Utterance utterance = (Utterance) obj;
        if (this.startTime == utterance.startTime && this.endTime == utterance.endTime && o.LJ(this.text, utterance.text)) {
            return true;
        }
        return false;
    }

    public final void setAlignment(int i) {
        this.alignment = i;
    }

    public final void setBgColor(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bgColor = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setSrcHeight(float f) {
        this.srcHeight = f;
    }

    public final void setSrcWidth(float f) {
        this.srcWidth = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.text = str;
    }

    public final void setTextColor(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.textColor = str;
    }

    public final void setTextSize(int i) {
        this.textSize = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Utterance(long j, long j2, String str, String str2, String str3, float f, float f2, int i, int i2) {
        this();
        HH1.LIZ(str, "text", str2, "bgColor", str3, "textColor");
        this.startTime = j;
        this.endTime = j2;
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
        this.srcWidth = f;
        this.srcHeight = f2;
        this.textSize = i;
        this.alignment = i2;
    }

    public /* synthetic */ Utterance(long j, long j2, String str, String str2, String str3, float f, float f2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "#00000000" : str2, (i3 & 16) != 0 ? "#00FFFFF" : str3, (i3 & 32) != 0 ? 0.0f : f, (i3 & 64) != 0 ? 0.0f : f2, (i3 & 128) != 0 ? 22 : i, (i3 & 256) != 0 ? 0 : i2);
    }
}
