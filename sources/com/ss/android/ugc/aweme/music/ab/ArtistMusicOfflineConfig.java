package com.ss.android.ugc.aweme.music.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicOfflineConfig extends F9E {

    @InterfaceC65349Pkn("notice_show_count")
    public final int count;

    @InterfaceC65349Pkn("notice_url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public ArtistMusicOfflineConfig() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.url, Integer.valueOf(this.count)};
    }

    public ArtistMusicOfflineConfig(String url, int i) {
        o.LJIIIZ(url, "url");
        this.url = url;
        this.count = i;
    }

    public /* synthetic */ ArtistMusicOfflineConfig(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
