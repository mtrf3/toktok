package com.bytedance.android.live.effect.music.entity;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AlbumsResponse extends F9E {

    @InterfaceC65349Pkn("packs")
    public final List<AlbumPack> albumPacks;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.albumPacks};
    }

    public AlbumsResponse(List<AlbumPack> albumPacks) {
        o.LJIIIZ(albumPacks, "albumPacks");
        this.albumPacks = albumPacks;
    }
}
