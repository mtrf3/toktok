package com.ss.android.ugc.aweme.dsp.experiment;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicArtistCertificationConfig extends F9E {

    @InterfaceC65349Pkn("artist_certification_landing_url")
    public final String landingUrl;

    @InterfaceC65349Pkn("artist_certification_lynx_preload_channels")
    public final List<String> preloadChannels;

    @InterfaceC65349Pkn("artist_certification_search_input_url")
    public final String searchInputUrl;

    @InterfaceC65349Pkn("artist_certification_status_url")
    public final String statusUrl;

    public MusicArtistCertificationConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicArtistCertificationConfig copy$default(MusicArtistCertificationConfig musicArtistCertificationConfig, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicArtistCertificationConfig.landingUrl;
        }
        if ((i & 2) != 0) {
            str2 = musicArtistCertificationConfig.statusUrl;
        }
        if ((i & 4) != 0) {
            str3 = musicArtistCertificationConfig.searchInputUrl;
        }
        if ((i & 8) != 0) {
            list = musicArtistCertificationConfig.preloadChannels;
        }
        return musicArtistCertificationConfig.copy(str, str2, str3, list);
    }

    public final MusicArtistCertificationConfig copy(String landingUrl, String statusUrl, String searchInputUrl, List<String> preloadChannels) {
        o.LJIIIZ(landingUrl, "landingUrl");
        o.LJIIIZ(statusUrl, "statusUrl");
        o.LJIIIZ(searchInputUrl, "searchInputUrl");
        o.LJIIIZ(preloadChannels, "preloadChannels");
        return new MusicArtistCertificationConfig(landingUrl, statusUrl, searchInputUrl, preloadChannels);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.landingUrl, this.statusUrl, this.searchInputUrl, this.preloadChannels};
    }

    public final String getLandingUrl() {
        return this.landingUrl;
    }

    public final List<String> getPreloadChannels() {
        return this.preloadChannels;
    }

    public final String getSearchInputUrl() {
        return this.searchInputUrl;
    }

    public final String getStatusUrl() {
        return this.statusUrl;
    }

    public MusicArtistCertificationConfig(String landingUrl, String statusUrl, String searchInputUrl, List<String> preloadChannels) {
        o.LJIIIZ(landingUrl, "landingUrl");
        o.LJIIIZ(statusUrl, "statusUrl");
        o.LJIIIZ(searchInputUrl, "searchInputUrl");
        o.LJIIIZ(preloadChannels, "preloadChannels");
        this.landingUrl = landingUrl;
        this.statusUrl = statusUrl;
        this.searchInputUrl = searchInputUrl;
        this.preloadChannels = preloadChannels;
    }

    public MusicArtistCertificationConfig(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C61878OQg.INSTANCE : list);
    }
}
