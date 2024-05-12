package X;

import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XNc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84728XNc implements InterfaceC84730XNe {
    public final /* synthetic */ FullEpisodeDetailFragment LIZ;

    @Override // X.InterfaceC84730XNe
    public final void LIZ() {
        FullEpisodeDetailFragment fullEpisodeDetailFragment = this.LIZ;
        PodcastInfo podcastInfo = fullEpisodeDetailFragment.LLIIJI;
        if (podcastInfo != null) {
            ServiceConnectionC84731XNf serviceConnectionC84731XNf = fullEpisodeDetailFragment.LJLJL;
            if (serviceConnectionC84731XNf != null) {
                BackgroundAudioService backgroundAudioService = serviceConnectionC84731XNf.LJLJJI;
                if (backgroundAudioService != null) {
                    C84742XNq c84742XNq = backgroundAudioService.LJLJLLL;
                    if (c84742XNq != null) {
                        c84742XNq.LJ.LJ(true);
                        XO0 xo0 = backgroundAudioService.LJLJLJ;
                        if (xo0 != null) {
                            xo0.LIZIZ().LIZ = true;
                            C84742XNq c84742XNq2 = backgroundAudioService.LJLJLLL;
                            if (c84742XNq2 != null) {
                                C01P LIZ = c84742XNq2.LIZ();
                                LIZ.LIZLLL("android.media.metadata.TITLE", podcastInfo.getEpisodeTitle());
                                LIZ.LIZLLL("android.media.metadata.ALBUM", podcastInfo.getEpisodeTitle());
                                StringBuilder sb = new StringBuilder();
                                List<String> episodeAuthors = podcastInfo.getEpisodeAuthors();
                                int i = 0;
                                if (episodeAuthors != null) {
                                    int i2 = 0;
                                    for (String str : episodeAuthors) {
                                        int i3 = i2 + 1;
                                        if (i2 >= 0) {
                                            String str2 = str;
                                            if (i2 == 0) {
                                                sb.append(str2);
                                            } else {
                                                sb.append(",");
                                                sb.append(str2);
                                            }
                                            i2 = i3;
                                        } else {
                                            C47261Igj.LJJJJJ();
                                            throw null;
                                        }
                                    }
                                }
                                LIZ.LIZLLL("android.media.metadata.ARTIST", sb.toString());
                                LIZ.LIZJ(c84742XNq2.LIZIZ.LIZLLL());
                                LIZ.LIZIZ(null, "android.media.metadata.ART");
                                c84742XNq2.LJ.LJ(true);
                                c84742XNq2.LJ.LJI(c84742XNq2.LIZ().LIZ());
                                C84742XNq c84742XNq3 = backgroundAudioService.LJLJLLL;
                                if (c84742XNq3 != null) {
                                    c84742XNq3.LJ();
                                    C84742XNq c84742XNq4 = backgroundAudioService.LJLJLLL;
                                    if (c84742XNq4 != null) {
                                        c84742XNq4.LIZLLL();
                                        XO0 xo02 = backgroundAudioService.LJLJLJ;
                                        if (xo02 != null) {
                                            C84729XNd c84729XNd = new C84729XNd();
                                            c84729XNd.LIZ = Boolean.FALSE;
                                            c84729XNd.LIZIZ = podcastInfo.getEpisodeTitle();
                                            StringBuilder sb2 = new StringBuilder();
                                            List<String> episodeAuthors2 = podcastInfo.getEpisodeAuthors();
                                            if (episodeAuthors2 != null) {
                                                for (String str3 : episodeAuthors2) {
                                                    int i4 = i + 1;
                                                    if (i >= 0) {
                                                        String str4 = str3;
                                                        if (i == 0) {
                                                            sb2.append(str4);
                                                        } else {
                                                            sb2.append(",");
                                                            sb2.append(str4);
                                                        }
                                                        i = i4;
                                                    } else {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    }
                                                }
                                            }
                                            c84729XNd.LIZJ = sb2.toString();
                                            c84729XNd.LIZLLL = podcastInfo.getEpisodeTitle();
                                            c84729XNd.LJ = null;
                                            xo02.LJ(c84729XNd);
                                            xo02.LJIIIZ = c84729XNd;
                                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new XLX(podcastInfo, backgroundAudioService, null), 3);
                                            return;
                                        }
                                        o.LJIJI("xNotificationController");
                                        throw null;
                                    }
                                    o.LJIJI("xAndroidSessionController");
                                    throw null;
                                }
                                o.LJIJI("xAndroidSessionController");
                                throw null;
                            }
                            o.LJIJI("xAndroidSessionController");
                            throw null;
                        }
                        o.LJIJI("xNotificationController");
                        throw null;
                    }
                    o.LJIJI("xAndroidSessionController");
                    throw null;
                }
                return;
            }
            o.LJIJI("backgroundAudioServiceConnection");
            throw null;
        }
    }

    public C84728XNc(FullEpisodeDetailFragment fullEpisodeDetailFragment) {
        this.LIZ = fullEpisodeDetailFragment;
    }
}
