package X;

import Y.AObjectS42S0101000_5;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class OW6 extends OW3 {
    public OW6(Activity activity) {
        super(activity);
        this.LIZIZ = activity;
    }

    public final void LIZIZ(String str) {
        Aweme aweme;
        int i;
        int i2;
        boolean z;
        String str2;
        Activity activity = this.LIZIZ;
        if (activity != null && !activity.isFinishing() && C39579Fg7.LIZIZ(str) && (aweme = this.LIZ) != null) {
            Video video = aweme.getVideo();
            if (video != null) {
                i2 = video.getWidth();
                i = video.getHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            C31268COy c31268COy = C31268COy.LJI;
            c31268COy.LIZLLL.setId(this.LIZ.getAid());
            c31268COy.LIZLLL.setVideoPath(str);
            c31268COy.LIZLLL.setWidth(i2);
            c31268COy.LIZLLL.setHeight(i);
            c31268COy.LIZLLL.setSource("video_share");
            c31268COy.LIZLLL.setVolume(0.0f);
            Music music = this.LIZ.getMusic();
            if ((music != null && music.isPgc()) || C4LD.LIZ.LJJ(this.LIZ)) {
                z = true;
            } else {
                z = false;
            }
            c31268COy.LIZLLL.setShouldMute(z);
            Activity activity2 = this.LIZIZ;
            if (C62011OVj.LJFF(activity2, activity2.getPackageName())) {
                Aweme aweme2 = this.LIZ;
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = "";
                }
                CP1 cp1 = new CP1(str2);
                if (!TextUtils.isEmpty("video_share")) {
                    ((HashMap) c31268COy.LJ).put("video_share", cp1);
                }
            } else {
                Activity activity3 = this.LIZIZ;
                if (activity3 instanceof ActivityC86117Xqz) {
                    ((ActivityC86117Xqz) activity3).activityConfiguration(new AObjectS42S0101000_5(3, this, 3));
                }
            }
            if (c31268COy.LIZLLL.isValid() && !c31268COy.LIZ(c31268COy.LIZLLL.getId())) {
                OW7 newBuilder = LiveWallPaperBean.newBuilder();
                newBuilder.LIZ = c31268COy.LIZLLL.getId();
                newBuilder.LIZIZ = c31268COy.LIZLLL.getThumbnailPath();
                newBuilder.LIZJ = c31268COy.LIZLLL.getVideoPath();
                newBuilder.LIZLLL = c31268COy.LIZLLL.getWidth();
                newBuilder.LJ = c31268COy.LIZLLL.getHeight();
                newBuilder.LJFF = c31268COy.LIZLLL.getSource();
                newBuilder.LJI = c31268COy.LIZLLL.getVolume();
                newBuilder.LJIIJ = c31268COy.LIZLLL.isShouldMute();
                ListProtector.add(c31268COy.LIZ, 0, new LiveWallPaperBean(newBuilder));
                c31268COy.LJ();
            }
            Activity activity4 = this.LIZIZ;
            LiveWallPaperBean liveWallPaperBean = c31268COy.LIZLLL;
            Intent intent = new Intent(activity4, (Class<?>) LiveWallPaperPreviewActivity.class);
            intent.putExtra("live_wall_paper", liveWallPaperBean);
            intent.putExtra("hide_more_button", true);
            intent.putExtra("from", "share");
            C16880lQ.LIZJ(activity4, intent);
        }
    }
}
