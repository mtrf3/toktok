package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LvProtocol extends F9E {

    @InterfaceC65349Pkn("audios")
    public final List<Audio> audios;

    @InterfaceC65349Pkn("canvas_config")
    public final CanvasConfig canvas_config;

    @InterfaceC65349Pkn("create_time")
    public final long create_time;

    @InterfaceC65349Pkn("texts")
    public final List<Text> texts;

    @InterfaceC65349Pkn("version")
    public final int version;

    @InterfaceC65349Pkn("videos")
    public final List<Video> videos;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.canvas_config, Long.valueOf(this.create_time), Integer.valueOf(this.version), this.videos, this.audios, this.texts};
    }

    public LvProtocol(CanvasConfig canvas_config, long j, int i, List<Video> videos, List<Audio> audios, List<Text> texts) {
        o.LJIIIZ(canvas_config, "canvas_config");
        o.LJIIIZ(videos, "videos");
        o.LJIIIZ(audios, "audios");
        o.LJIIIZ(texts, "texts");
        this.canvas_config = canvas_config;
        this.create_time = j;
        this.version = i;
        this.videos = videos;
        this.audios = audios;
        this.texts = texts;
    }
}
