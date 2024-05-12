package com.ss.android.ugc.aweme.music.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TikTokMusicCollectInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("added_on_ttmusic")
    public final boolean addedOnTtm;

    @InterfaceC65349Pkn("deep_link")
    public final String deepLink;

    public static /* synthetic */ TikTokMusicCollectInfo copy$default(TikTokMusicCollectInfo tikTokMusicCollectInfo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tikTokMusicCollectInfo.addedOnTtm;
        }
        if ((i & 2) != 0) {
            str = tikTokMusicCollectInfo.deepLink;
        }
        return tikTokMusicCollectInfo.copy(z, str);
    }

    public final TikTokMusicCollectInfo copy(boolean z, String deepLink) {
        o.LJIIIZ(deepLink, "deepLink");
        return new TikTokMusicCollectInfo(z, deepLink);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.addedOnTtm), this.deepLink};
    }

    public final boolean getAddedOnTtm() {
        return this.addedOnTtm;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public TikTokMusicCollectInfo(boolean z, String deepLink) {
        o.LJIIIZ(deepLink, "deepLink");
        this.addedOnTtm = z;
        this.deepLink = deepLink;
    }
}
