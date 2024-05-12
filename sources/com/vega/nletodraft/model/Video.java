package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Video extends F9E {

    @InterfaceC65349Pkn("clip")
    public final Clip clip;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("size")
    public final Size size;

    @InterfaceC65349Pkn("source_timerange")
    public final TimeRange source_timerange;

    @InterfaceC65349Pkn("speed")
    public final float speed;

    @InterfaceC65349Pkn("target_timerange")
    public final TimeRange target_timerange;

    @InterfaceC65349Pkn("track_index")
    public final int track_index;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("video_id")
    public final String video_id;

    @InterfaceC65349Pkn("volume")
    public final float volume;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.clip, this.path, this.size, this.source_timerange, Float.valueOf(this.speed), this.target_timerange, this.type, Float.valueOf(this.volume), this.video_id, Long.valueOf(this.duration), Integer.valueOf(this.track_index)};
    }

    public Video(Clip clip, String path, Size size, TimeRange source_timerange, float f, TimeRange target_timerange, String type, float f2, String video_id, long j, int i) {
        o.LJIIIZ(clip, "clip");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(size, "size");
        o.LJIIIZ(source_timerange, "source_timerange");
        o.LJIIIZ(target_timerange, "target_timerange");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(video_id, "video_id");
        this.clip = clip;
        this.path = path;
        this.size = size;
        this.source_timerange = source_timerange;
        this.speed = f;
        this.target_timerange = target_timerange;
        this.type = type;
        this.volume = f2;
        this.video_id = video_id;
        this.duration = j;
        this.track_index = i;
    }
}
