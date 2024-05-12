package com.ss.android.ugc.aweme.feed.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WarningTag extends F9E implements Serializable {

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("tag_source")
    public int tagSource;

    @InterfaceC65349Pkn("text")
    public Text text;

    public static /* synthetic */ WarningTag copy$default(WarningTag warningTag, Text text, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            text = warningTag.text;
        }
        if ((i2 & 2) != 0) {
            j = warningTag.duration;
        }
        if ((i2 & 4) != 0) {
            i = warningTag.tagSource;
        }
        return warningTag.copy(text, j, i);
    }

    public final WarningTag copy(Text text, long j, int i) {
        o.LJIIIZ(text, "text");
        return new WarningTag(text, j, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, Long.valueOf(this.duration), Integer.valueOf(this.tagSource)};
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getTagSource() {
        return this.tagSource;
    }

    public final Text getText() {
        return this.text;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTagSource(int i) {
        this.tagSource = i;
    }

    public final void setText(Text text) {
        o.LJIIIZ(text, "<set-?>");
        this.text = text;
    }

    public WarningTag(Text text, long j, int i) {
        o.LJIIIZ(text, "text");
        this.text = text;
        this.duration = j;
        this.tagSource = i;
    }

    public /* synthetic */ WarningTag(Text text, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(text, (i2 & 2) != 0 ? -1L : j, (i2 & 4) != 0 ? 0 : i);
    }
}
