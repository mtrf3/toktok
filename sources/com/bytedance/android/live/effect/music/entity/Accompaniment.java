package com.bytedance.android.live.effect.music.entity;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public final class Accompaniment extends F9E {

    @InterfaceC65349Pkn("author")
    public final String author;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("preview_url")
    public final String url;

    @InterfaceC65349Pkn("vid")
    public final String vid;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id), this.title, this.author, this.vid, this.url};
    }

    public Accompaniment(long j, String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "title", str2, "author", str3, "vid", str4, "url");
        this.id = j;
        this.title = str;
        this.author = str2;
        this.vid = str3;
        this.url = str4;
    }
}
