package com.bytedance.android.live.effect.music.entity;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class Album extends F9E {

    @InterfaceC65349Pkn("cover_url")
    public final String cover;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("name")
    public final String name;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id), this.name, this.cover};
    }

    public Album(long j, String name, String cover) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(cover, "cover");
        this.id = j;
        this.name = name;
        this.cover = cover;
    }
}
