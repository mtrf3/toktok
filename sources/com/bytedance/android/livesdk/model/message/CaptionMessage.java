package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class CaptionMessage extends CR6 {

    @InterfaceC65349Pkn("content")
    public List<CaptionContent> content;

    @InterfaceC65349Pkn("duration_ms")
    public long durationMs;

    @InterfaceC65349Pkn("timestamp_ms")
    public long timestampMs;

    public CaptionMessage() {
        this.type = EnumC31509CYf.CAPTION_MESSAGE;
    }
}
