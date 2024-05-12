package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class MusicPerformer implements Serializable {

    @InterfaceC65349Pkn("avatar")
    public MusicAvatar avatar;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("name")
    public String name;

    public final MusicAvatar getAvatar() {
        return this.avatar;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }
}
