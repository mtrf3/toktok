package com.byted.cast.mediacommon.render;

/* loaded from: classes29.dex */
public interface ILatencyListener {
    void onDecodeIn(String str, int i, long j, long j2);

    void onDecoded(String str, int i, long j, long j2);

    void onRenderIn(String str, int i, long j, long j2);

    void onRendered(String str, int i, long j, long j2);
}
