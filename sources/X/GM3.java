package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;

/* loaded from: classes8.dex */
public final class GM3 extends AbstractC65781Prl implements InterfaceC65784Pro<PublishModel> {
    public final /* synthetic */ TTEPVideoSaveActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GM3(TTEPVideoSaveActivity tTEPVideoSaveActivity) {
        super(0);
        this.LJLIL = tTEPVideoSaveActivity;
    }

    @Override // X.InterfaceC65784Pro
    public final PublishModel invoke() {
        int i;
        Bundle bundle = new Bundle();
        TTEPVideoSaveActivity tTEPVideoSaveActivity = this.LJLIL;
        if (H7R.LJJJJL(tTEPVideoSaveActivity.LIZLLL())) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("pre_publish_type", -1);
        bundle.putInt("video_type", i);
        bundle.putSerializable("extra_video_publish_args", tTEPVideoSaveActivity.LIZLLL());
        bundle.putString("shoot_way", tTEPVideoSaveActivity.LIZLLL().mShootWay);
        bundle.putInt("extra_stick_point_type", 0);
        bundle.putBoolean("enter_record_from_other_platform", false);
        bundle.putBoolean("extra_enter_from_live", false);
        bundle.putBoolean("fromTTEPEffectPreview", true);
        return C43001GuD.LJFF(bundle);
    }
}
