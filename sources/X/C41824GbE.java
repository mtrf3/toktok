package X;

import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* renamed from: X.GbE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41824GbE<T> implements InterfaceC66992k3 {
    public final /* synthetic */ Aweme LJLIL;

    public C41824GbE(Aweme aweme) {
        this.LJLIL = aweme;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<String> interfaceC65052gv) {
        Video video;
        String str;
        VideoUrlModel playAddr;
        List<String> urlList;
        UrlModel playUrl;
        List<String> urlList2;
        C62822Ol8 c62822Ol8 = C44890Hja.LJIILIIL;
        C39579Fg7.LJ((String) c62822Ol8.getValue(), false);
        Music music = this.LJLIL.getMusic();
        if ((music == null || (playUrl = music.getPlayUrl()) == null || (urlList2 = playUrl.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList2)) == null) && ((video = this.LJLIL.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null)) {
            str = "";
        }
        String LIZJ = C38352F3k.LIZJ(str);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LIZJ = LIZJ;
        with.LJ = (String) c62822Ol8.getValue();
        with.LJIIL = new IDDListenerS58S0100000_7((C73578SuE) interfaceC65052gv, 4);
        with.LIZJ();
    }
}
