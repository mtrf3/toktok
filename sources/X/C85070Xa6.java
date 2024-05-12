package X;

import android.util.Pair;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import java.util.List;

/* renamed from: X.Xa6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85070Xa6 implements InterfaceC85083XaJ {
    public final PodcastInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public C85076XaC LIZLLL;

    @Override // X.InterfaceC85083XaJ
    public final InterfaceC85087XaN LIZ() {
        List<String> list;
        String str;
        PodcastUrlModel playAddr;
        C85076XaC c85076XaC = this.LIZLLL;
        if (c85076XaC != null) {
            return c85076XaC;
        }
        PodcastInfo podcastInfo = this.LIZ;
        if (podcastInfo != null && (playAddr = podcastInfo.getPlayAddr()) != null) {
            list = playAddr.getUrlList();
        } else {
            list = null;
        }
        String str2 = "";
        if (list == null || (str = (String) ORZ.LJLLLL(list)) == null) {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("id = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", playUri = ");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
        if (C78857UxB.LJJJIL(this.LIZIZ)) {
            String str3 = this.LIZIZ;
            String str4 = this.LIZJ;
            StringBuilder LJFF = C72972SkS.LJFF(str3, '_');
            LJFF.append(h.LJIIIIZZ(str4));
            str2 = X1D.LIZIZ(LJFF);
        }
        return new C85074XaA(str, str2, 60);
    }

    public C85070Xa6(PodcastInfo podcastInfo) {
        String str;
        PodcastUrlModel playAddr;
        List<String> urlList;
        String str2;
        this.LIZ = podcastInfo;
        if (podcastInfo != null) {
            str = podcastInfo.getEpisodeItemId();
        } else {
            str = null;
        }
        this.LIZIZ = String.valueOf(str);
        this.LIZJ = (podcastInfo == null || (playAddr = podcastInfo.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || (str2 = (String) ORZ.LJLLLL(urlList)) == null) ? "" : str2;
        new Pair(0, 0);
        new Pair(0, 0);
        new UrlModel();
        new UrlModel();
    }
}
