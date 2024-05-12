package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public final class HPA implements HPC {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ PhotoMvAnchorConfig LIZIZ;
    public final /* synthetic */ ShortVideoContext LIZJ;

    public final void LIZ() {
        if (this.LIZ != null) {
            Bundle bundle = new Bundle();
            C45685HwP.LIZIZ(this.LIZ);
            bundle.putInt("key_support_flag", 2);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 35);
            bundle.putSerializable("key_music_model", this.LIZIZ.getMusicModel());
            bundle.putInt("key_choose_scene", 9);
            bundle.putParcelable("key_short_video_context", this.LIZJ);
            bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
            AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(this.LIZIZ.getMusicModel());
            I9T.LJFF(transformMusicModel);
            bundle.putSerializable("aweme_music", transformMusicModel);
            HJ9.LIZLLL(this.LIZ, bundle, 1);
        }
    }

    public HPA(Activity activity, PhotoMvAnchorConfig photoMvAnchorConfig, ShortVideoContext shortVideoContext) {
        this.LIZ = activity;
        this.LIZIZ = photoMvAnchorConfig;
        this.LIZJ = shortVideoContext;
    }
}
