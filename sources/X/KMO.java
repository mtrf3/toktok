package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrder;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KMO<T> implements Observer {
    public final /* synthetic */ ShoutoutsPlayActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public KMO(ShoutoutsPlayActivity shoutoutsPlayActivity, String str, String str2) {
        this.LJLIL = shoutoutsPlayActivity;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int intValue;
        int intValue2;
        Video video;
        Video video2;
        ShoutoutsOrder shoutoutsOrder = (ShoutoutsOrder) obj;
        this.LJLIL.LJLJJL = new Video();
        ShoutoutsPlayActivity shoutoutsPlayActivity = this.LJLIL;
        Video video3 = shoutoutsPlayActivity.LJLJJL;
        if (video3 != null) {
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setUrlList(C47261Igj.LJJIJ(str));
            videoUrlModel.setSourceId(str);
            videoUrlModel.setUrlKey(str);
            List<String> urlList = videoUrlModel.getUrlList();
            o.LJIIIIZZ(urlList, "urlList");
            videoUrlModel.setUri((String) ORZ.LJLLLL(urlList));
            video3.setPlayAddr(videoUrlModel);
            video3.setDownloadAddr(video3.getPlayAddr());
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(str2);
            urlModel.setUrlList(C47261Igj.LJJIJ(str2));
            video3.setCover(urlModel);
            Aweme aweme = shoutoutsOrder.aweme;
            if (aweme != null && (video2 = aweme.getVideo()) != null) {
                intValue = video2.getWidth();
            } else {
                Integer num = 0;
                intValue = num.intValue();
            }
            video3.setWidth(intValue);
            Aweme aweme2 = shoutoutsOrder.aweme;
            if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                intValue2 = video.getHeight();
            } else {
                Integer num2 = 0;
                intValue2 = num2.intValue();
            }
            video3.setHeight(intValue2);
            video3.setSourceId(str);
            shoutoutsPlayActivity.LLIIIJ();
        }
    }
}
