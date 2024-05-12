package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class K09 implements InterfaceC47667InH {
    public final /* synthetic */ VideoPlayActivity LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public K09(VideoPlayActivity videoPlayActivity) {
        this.LJLIL = videoPlayActivity;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        C47689Ind c47689Ind;
        VideoPlayActivity videoPlayActivity = this.LJLIL;
        if (videoPlayActivity.LJLJJLL == null) {
            Video video = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setCodecType(0);
            ArrayList arrayList = new ArrayList();
            ORS.LJJLIIIJJI(arrayList, s.LJLJJLL(videoPlayActivity.LJLJL, new String[]{","}));
            videoUrlModel.setUrlList(arrayList);
            videoUrlModel.setSourceId(videoPlayActivity.LJLJLLL);
            videoUrlModel.setUrlKey(videoPlayActivity.LJLJLLL);
            if (videoUrlModel.getUrlList().size() == 1) {
                List<String> urlList = videoUrlModel.getUrlList();
                o.LJIIIIZZ(urlList, "urlList");
                videoUrlModel.setUri((String) ORZ.LJLLJ(urlList));
            }
            video.setPlayAddr(videoUrlModel);
            if (!ujb.o.LJJJJJL(videoPlayActivity.LJLJLJ)) {
                UrlModel urlModel = new UrlModel();
                ArrayList arrayList2 = new ArrayList();
                ORS.LJJLIIIJJI(arrayList2, s.LJLJJLL(videoPlayActivity.LJLJLJ, new String[]{","}));
                urlModel.setUri((String) ORZ.LJLLLL(arrayList2));
                urlModel.setUrlList(arrayList2);
                video.setCover(urlModel);
            }
            video.setSourceId(videoPlayActivity.LJLJLLL);
            videoPlayActivity.LJLJJLL = video;
        }
        videoPlayActivity.LLFII().LJIIL(videoPlayActivity.LJLJJLL);
        if (videoPlayActivity.LJLLLL <= 0.0f || (c47689Ind = videoPlayActivity.LJLIL) == null) {
            return;
        }
        c47689Ind.setAlpha(0.0f);
    }
}
