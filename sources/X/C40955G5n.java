package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.zhiliaoapp.musically.R;

/* renamed from: X.G5n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40955G5n implements OnActivityResultCallback {
    public final /* synthetic */ G7M LJLIL;

    public C40955G5n(G7M g7m) {
        this.LJLIL = g7m;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        AI8 textCell;
        String str = null;
        if (i2 == -1 && intent != null) {
            this.LJLIL.LJLJL = (VideoTrendingTopic) intent.getSerializableExtra("video_trending_topic");
            G7M g7m = this.LJLIL;
            G75 g75 = g7m.LJLJJLL;
            if (g75 != null) {
                VideoTrendingTopic videoTrendingTopic = g7m.LJLJL;
                if (videoTrendingTopic != null) {
                    str = videoTrendingTopic.getEventName();
                }
                g75.setTitle(str);
            }
            G75 g752 = this.LJLIL.LJLJJLL;
            if (g752 != null && (textCell = g752.getTextCell()) != null) {
                textCell.setTitleMaxLines(1);
            }
            this.LJLIL.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "trends");
            c188727au.LJIIIZ("anchor_name", "selected_trends");
            FMX.LJIIL("add_label", c188727au.LIZ);
            return;
        }
        G7M g7m2 = this.LJLIL;
        g7m2.LJLJL = null;
        G75 g753 = g7m2.LJLJJLL;
        if (g753 == null) {
            return;
        }
        g753.setTitle(g7m2.getString(R.string.sk3));
    }
}
