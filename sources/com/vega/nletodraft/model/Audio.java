package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Audio extends F9E {

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("music_id")
    public final String music_id;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("source_timerange")
    public final TimeRange source_timerange;

    @InterfaceC65349Pkn("speed")
    public final float speed;

    @InterfaceC65349Pkn("target_timerange")
    public final TimeRange target_timerange;

    @InterfaceC65349Pkn("track_index")
    public final long track_index;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("volume")
    public final float volume;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.music_id, this.name, this.path, this.source_timerange, Float.valueOf(this.speed), this.target_timerange, this.type, Float.valueOf(this.volume), Long.valueOf(this.duration), Long.valueOf(this.track_index)};
    }

    public Audio(String music_id, String name, String path, TimeRange source_timerange, float f, TimeRange target_timerange, String type, float f2, long j, long j2) {
        o.LJIIIZ(music_id, "music_id");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(source_timerange, "source_timerange");
        o.LJIIIZ(target_timerange, "target_timerange");
        o.LJIIIZ(type, "type");
        this.music_id = music_id;
        this.name = name;
        this.path = path;
        this.source_timerange = source_timerange;
        this.speed = f;
        this.target_timerange = target_timerange;
        this.type = type;
        this.volume = f2;
        this.duration = j;
        this.track_index = j2;
    }
}
