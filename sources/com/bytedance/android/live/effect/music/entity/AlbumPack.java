package com.bytedance.android.live.effect.music.entity;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AlbumPack extends F9E {

    @InterfaceC65349Pkn("songs")
    public final List<Accompaniment> accompaniments;

    @InterfaceC65349Pkn("collection")
    public final Album album;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("total")
    public final long total;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.album, this.accompaniments, Boolean.valueOf(this.hasMore), Long.valueOf(this.total)};
    }

    public AlbumPack(Album album, List<Accompaniment> accompaniments, boolean z, long j) {
        o.LJIIIZ(album, "album");
        o.LJIIIZ(accompaniments, "accompaniments");
        this.album = album;
        this.accompaniments = accompaniments;
        this.hasMore = z;
        this.total = j;
    }
}
